#include <iostream>
#include <cmath>
#define MAX 10000
using std::cout;

int d(int a)
{
    int b = 1;
    for (int i=2; i<=int(std::sqrt(a)); i++)
        if (a % i == 0)
            b += i + int(a/i);
    return b;
}

int main()
{
    int cache[MAX] = {};
    int sum = 0;
    int a = 1;
    while (a++ < MAX)
    {
        if (cache[a] != 0)
            continue;
        
        int b = d(a);
        if (a != b and d(b) == a)
        {
            sum += a + b;
            cache[b] = 999;
        }
            
    }

    cout << sum;
    return 0;
}