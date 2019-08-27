#include <iostream>
#include "library/LargeInteger.cpp"
#include "library/LargeInteger.h"
using std::cout;

int main() 
{
    int i = 2;
    InfInt fn1=1, fn2=1, tmp=0;

    while (fn2.getStrValue().length() < 1000) 
    {
        i++;
        tmp = fn1 + fn2;
        fn1 = fn2;
        fn2 = tmp;
    }
    cout << i << std::endl;

    return 0;
}