#include <iostream>
#define MAX 1000000
using std::cout;

int main()
{
    int64_t maxI=0, maxChain=0, n=0, count=0;
    int cache[MAX] = {};
    
    for (int i=2; i<MAX; i++) // sum all the values
    {
        n = i;
        count = 0;
        while (n > 1) 
        {
            if (n < MAX && cache[n] != 0) 
            {
                count += cache[n];
                break;
            }
            else
            {
                if (n % 2 == 0) { n = n / 2; }
                else            { n = (n*3) + 1; } // n*3 = n<<1 
                count ++;
            }
        }

        cache[i] = count;
        if (maxChain < count) { maxChain = count; maxI = i; }
    }

    cout << maxI;
    return 0;
}