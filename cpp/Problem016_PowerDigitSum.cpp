#include <iostream>
#include "library/LargeInteger.cpp"
#include "library/LargeInteger.h"
using std::cout;

int main()
{
    InfInt testInt = InfInt(2);
    for (int i=1; i<1000; i++)
        testInt *= 2;

    int sum = 0;
    for(char c : testInt.getStrValue())
        sum += (c - '0');

    cout << sum;
    return 0;
}