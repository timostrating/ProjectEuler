#include <iostream>
#include <cmath>
using std::cout;

int main()
{
    int value=1, i=1, divisors=0;

    while (divisors < 500)
    {
        value += ++i;

        divisors = 2;
        for (int i=2; i<std::sqrt(value); i++)
            if (value % i == 0)
                divisors += 2;
    }
    
    cout << value;
    
    return 0;
}