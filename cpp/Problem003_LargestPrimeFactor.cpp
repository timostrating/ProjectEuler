#include <iostream>

int main()
{
    long v = 600851475143;
    int i = 1;

    while (v > 1)
    {
        i++;
        if (v % i == 0)
            v /= i;
    }

    std::cout << i << std::endl;
    return 0;
}