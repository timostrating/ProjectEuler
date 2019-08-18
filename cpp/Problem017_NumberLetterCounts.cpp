#include <iostream>
#include <string>
using std::cout;

std::string numberToString(int n) 
{
    if (n >= 1000) // only works for numbers below 1000
        throw std::invalid_argument("n must be betweeen 1 and 999");
    
    std::string firsts[] = {"", "one", "two", "three", "four", "five", "six", "zeven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    std::string tens[] = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    std::string value = "";

    if (n > 99) // Hunderds
    { 
        value += firsts[n / 100] + "hundred";
        n %= 100;
        if (n > 0) { value += "and"; } // if there is text after the hundered it requires "and"
    }
    if (n < 20) { return value + firsts[n]; } // special cases
    if (n < 100) // any number below 100 that is not special
    { 
        value += tens[n / 10];
        value += firsts[n % 10];
    }

    return value;
}

int main()
{
    int sum = 0;
    for (int i=1; i<1000; i++)
        sum += numberToString(i).length();

    sum += std::string("oneThousand").length();
    cout << sum << "\n";    
    return 0;
}