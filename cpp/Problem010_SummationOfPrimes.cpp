#include <iostream>
#include <cmath>
#define MAX 2000000
using std::cout;

bool isPrime(int64_t n) 
{
    if (n <= 1) { return false; }
    if (n == 2) { return true; }
    for (int64_t i=2; i <= int64_t(std::sqrt(n)); i++)
        if (n % i == 0)
            return false;
    return true;
}


int main()
{
    int64_t sum = 0;
    for (int64_t i=1; i<MAX; i++)
        if (isPrime(i))
            sum += i;

    cout << sum;            
    return 0;
}