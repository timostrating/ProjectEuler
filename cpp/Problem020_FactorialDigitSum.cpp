#include <iostream>
#include "library/LargeInteger.cpp"
#include "library/LargeInteger.h"
#define MAX 100 
using std::cout;

int main()
{
    InfInt testInt = InfInt(1);
    for (int i=2; i<=MAX; i++)
        testInt *= i;
    
    int sum = 0;
    for(char c : testInt.getStrValue())
        sum += c - '0';

    // cout << testInt << std::endl;
    cout << sum << std::endl;
    return 0;
}