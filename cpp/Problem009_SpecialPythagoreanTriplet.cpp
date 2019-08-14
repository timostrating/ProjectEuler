#include <iostream>
#define MAX 500
using std::cout;

int main()
{
    for (int b=1; b<MAX; b++)
        for (int a=1; a<b; a++) // a < b
        {
            int c = 1000 - a - b;
            if (b < c and a*a + b*b == c*c)  // a<b<c and a^2 + b^2 = c^2
            {
                cout << a * b * c;
                return 0;
            }
        }
            
    return 0;
}