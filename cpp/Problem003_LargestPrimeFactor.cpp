#include <iostream>
using std::cout;

int main()
{
    int64_t v = 600851475143;
    int i = 1;

    while (v > 1)
    {
        i++;
        if (v % i == 0)
            v /= i;
    }

    cout << i;
    return 0;
}