#include <iostream>


#define NTH_BIT(n, k) ((n & ( 1 << k )) >> k)

// We only garantie a correct implementation for interger values
long pow_mod_n(long base, long power, long n, long value = 1, long index = 32)
{
    if (index == -1) return value % n; // if we looked at all bits return value, 

    value = (value * value) % n;
    if (NTH_BIT(power, index)) value = (value * base) % n; // if bit is 1, multiply by the base  (%n)
    
    return pow_mod_n(base, power, n, value, --index); // next bit
}

int p(int L, int n) 
{
    int iteration = 1;
    while(n > 0) 
    {
        iteration ++;
        long v = pow_mod_n(2, iteration, 1000000000L);
        std::cout << "\t"<< iteration << ": " << v << "\n";
        while (v > 10) 
            if((v /= 10) == L)
                n--;

    }
    return iteration;
}

int main(int argc, char *argv[])
{
    std::cout << p(12, 1) << "\n";
    std::cout << p(12, 2) << "\n";

    return 0;
}