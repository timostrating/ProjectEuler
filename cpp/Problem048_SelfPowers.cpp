#include <iostream>
using namespace std;
#define MAX 10000000000

long powModM(int v, long n, long m)
{
    long sum = v;
    for (int i=1; i < n; i++)
    {
        sum *= v;
        sum %= m;
    }

    return sum;
}

int main() 
{
    long sum=1, i=2;
    do {
        // cout << i << " " << sum << endl;
        sum += powModM(i, i, MAX);
        sum %= MAX;
    } while ( ++i <= 1000);

    cout << sum << endl;
}