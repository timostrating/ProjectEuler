#include <iostream>

int main() 
{
    long fn1=1, fn2=1, tmp=0, sum=0;

    while (fn2 <= 4000000) 
    {
        tmp = fn1 + fn2;
        fn1 = fn2;
        fn2 = tmp;
        if (fn1 % 2 == 0)
            sum += fn1;
    }
    std::cout << sum << std::endl;

    return 0;
}