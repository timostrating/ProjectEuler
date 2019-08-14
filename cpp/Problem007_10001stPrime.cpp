#include <iostream>
#include <cmath>
#define NR 10001
using std::cout;

bool isPrime(int n) 
{
    if (n <= 1) { return false; }
    if (n == 2) { return true; }
    for (int i=2; i <= int(std::sqrt(n)); i++)
        if (n % i == 0)
            return false;
    return true;
}

int main() 
{
    int counter = 0;
    int n = 1;
    while (counter < NR)
        if (isPrime(++n))
            counter ++;

    cout << n << "\n";
    return 0;
}