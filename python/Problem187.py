import math
import sympy

# https://codereview.stackexchange.com/a/194762 
def sieve_of_eratosthenes_naive(limit):
    is_prime = [False] * 2 + [True] * (limit - 1) 
    for n in range(int(limit**0.5 + 1.5)): # stop at ``sqrt(limit)``
        if is_prime[n]:
            for i in range(n*n, limit+1, n):
                is_prime[i] = False
    return [i for i, prime in enumerate(is_prime) if prime]


def sieve_of_eratosthenes(n): 
    size = n//2
    sieve = [1]*size
    limit = int(n**0.5)
    for i in range(1,limit):
        if sieve[i]:
            val = 2*i+1
            tmp = ((size-1) - i)//val 
            sieve[i+val::val] = [0]*tmp
    return [2] + [i*2+1 for i, v in enumerate(sieve) if v and i>0]


def sieve_of_atkin(limit):
    results = [2,3,5]
    sieve = [0] * limit




# sieve_of_eratosthenes_naive(10000000)
sieve_of_eratosthenes(10000000)
# sieve_of_atkin(10000000)


"""

A composite is a number containing at least two prime factors. 
For example, 15 = 3 × 5; 9 = 3 × 3; 12 = 2 × 2 × 3.

There are ten composites below thirty containing precisely two, 
not necessarily distinct, prime factors: 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.

How many composite integers, n < 10^8, have precisely two, 
not necessarily distinct, prime factors?

"""