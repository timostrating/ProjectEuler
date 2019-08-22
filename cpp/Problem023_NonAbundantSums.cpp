#include <iostream>
#include <cmath>
#include <vector>
#define MAX 28123
using std::cout;

int d(int a)
{
    int b = 1;
    for (int i=2; i<=int(std::sqrt(a)); i++)
        if (a % i == 0)
            b += i + int(a/i);
        
    if (pow(int(std::sqrt(a)), 2) == a)
        b -= int(std::sqrt(a));
    
    return b;
}

int main ()
{
    std::vector<int> abundantNumbers;

    for (int i=1; i <= MAX; i++)
        if (d(i) > i)
            abundantNumbers.push_back(i);

    bool cache[MAX+1] = {};
    for (int i=0; i<abundantNumbers.size(); i++)
        for (int j=0; j<=i; j++)
        {
            if (abundantNumbers.at(i) + abundantNumbers.at(j) > MAX)
                break;
            
            cache[abundantNumbers.at(i) + abundantNumbers.at(j)] = true;
        }
    
    long sum = 0;    
    for (int i=0; i<=MAX; i++)
        if (!cache[i])
            sum += i;

    cout << sum;    
    return 0;
}