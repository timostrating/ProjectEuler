#include <iostream>
using std::cout;

int main ()
{
    float daysInYear = 365.25;
    float amountOfYears = 100.0;

    float changeIsSunday = 1.0 / 7.0;
    float changeIsFirstDayOfTheMonth = 1.0 / (daysInYear / 12.0);

    cout << int(daysInYear * amountOfYears * changeIsSunday * changeIsFirstDayOfTheMonth);
    return 0;
}