#include <iostream>
using std::cout;
using std::endl;

int main() 
{
    int64_t fn1=1, fn2=1, tmp=0, sum=0;

    while (fn2 <= 4000000) 
    {
        tmp = fn1 + fn2;
        fn1 = fn2;
        fn2 = tmp;
        if (fn1 % 2 == 0)
            sum += fn1;
    }
    cout << sum << endl;

    return 0;
}