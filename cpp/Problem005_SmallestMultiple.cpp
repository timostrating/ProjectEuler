#include <iostream>
#define MAX 20
using std::cout;

int main()
{
    // We simplefy this array towards the array that contains primes and all the dividers
    int data[MAX] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 
    for (int i=1; i<MAX; i++)
        for (int j=1; j<std::min(i, MAX); j++)
            if (data[i] % data[j] == 0)
                data[i] = data[i] / data[j];

    int64_t sum = 1;
    for(int i=0; i<MAX; i++) // The product of the array is now the answer
        sum *= data[i];

    cout << sum << "\n";    
    return 0;
}