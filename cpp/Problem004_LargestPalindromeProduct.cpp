#include <iostream>
#define MIN 900
#define MAX 1000
using std::cout;

// if reverse of the number == number it is a palindrome
bool isPalindrome(int num)
{
    int reverse = 0, remainder, temp;
    temp = num; // original number is stored in temp variable
    while( temp != 0)
    {
        remainder = temp % 10;
        reverse = reverse * 10 + remainder;
        temp = temp / 10;
    }

    return (num == reverse);
}

int main()
{
    int max = 0;

    for (int i=MIN; i<MAX; i++)
        for (int j=MIN; j<=std::min(i, MAX); j++) // 90*91 == 91*90  so we block it out by doing  i > j
            if (isPalindrome(i*j)) 
                if (max < i*j)
                    max = i*j;

    cout << max << "\n";
}
