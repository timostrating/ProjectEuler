#include <iostream>
#define MAX 1000
using std::cout;
using std::endl;

// Brute-force
int main_old()
{
    int sum = 0;

    for (int i=0; i < MAX; i++)
        if (i % 3 == 0 || i % 5 == 0)
            sum += i;

    cout << sum << endl;

    return 0;
}

// Fast implementation
int sum(int k, int n)
{
    int sum = 0;
    for (int i=1; i <= int((n-1)/k); i++)
        sum += k*i;

    return sum;
}

int main()
{
    // https://en.wikipedia.org/wiki/Inclusion%E2%80%93exclusion_principle
    // sum_3_or_5(n) == sum_3(n) + sum_5(n) - sum_3_and_5(n)
    cout << sum(3, MAX) + sum(5, MAX) - sum(15, MAX);
    return 0;
}
