import math

MAX = 10**7

def generate_primes(n): 
    size = n//2
    sieve = [1]*size
    limit = int(n**0.5)
    for i in range(1,limit):
        if sieve[i]:
            val = 2*i+1
            tmp = ((size-1) - i)//val 
            sieve[i+val::val] = [0]*tmp
    return [2] + [i*2+1 for i, v in enumerate(sieve) if v and i>0]

PRIMES = generate_primes(MAX)
print("Primes generated")


def gcd(m, n):
    if (n == 0):
        return m
    else:
        return gcd(n, m % n)


def is_permutation(a, b):
    if len(str(a)) != len(str(b)):
        return False

    a_array = list(str(a))
    b_array = list(str(b))

    for x in a_array:
        if b_array.__contains__(x) == False:
            return False
        b_array.remove(x)

    return True


def phi(n):
    if n == 1:
        return 1

    original_n = n
    results = []
    prime_index = 0
    while n > 1:
        p = PRIMES[prime_index]
        if (n % p == 0):
            results.append(p)
            while math.ceil(n / p) == math.floor(n / p):
                n = n // p

        prime_index += 1

    for v in results:
        original_n *= 1 - (1/v)

    return int(original_n)



prime_index = 1

minimal = 999
for n in range(3, MAX, 2):
    if (n < PRIMES[-1] and n == PRIMES[prime_index]):
        prime_index += 1
        continue

    phi_n = phi(n)
    if (minimal > n / phi_n):
        if (is_permutation(phi_n, n)):
            minimal = n / phi_n
            print("New minimal:", minimal, "\t at:",n)


"""
Euler's Totient function, φ(n) [sometimes called the phi function], 
is used to determine the number of positive numbers less than or equal to n which are relatively prime to n. 
For example, as 1, 2, 4, 5, 7, and 8, are all less than nine and relatively prime to nine, φ(9)=6.
The number 1 is considered to be relatively prime to every positive number, so φ(1)=1.

Interestingly, φ(87109)=79180, and it can be seen that 87109 is a permutation of 79180.

Find the value of n, 1 < n < 107, for which φ(n) is a permutation of n and the ratio n/φ(n) produces a minimum.
"""