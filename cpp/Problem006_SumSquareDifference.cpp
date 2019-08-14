#include <iostream>
#define MAX 100
using std::cout;

int main()
{
    long sumOfSquares = 0;
    long squareOfSum = 0;

    for (int i=1; i<=MAX; i++)
    {
        sumOfSquares += i*i;
        squareOfSum += i;
    }
    squareOfSum = squareOfSum * squareOfSum;

    cout << squareOfSum - sumOfSquares;
    return 0;
}