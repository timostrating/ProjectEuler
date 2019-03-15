import math
import sympy

# https://codereview.stackexchange.com/a/194762  # simple Sieve of Eratosthenes 
# def primes_upto(limit):
#     is_prime = [False] * 2 + [True] * (limit - 1) 
#     for n in range(int(limit**0.5 + 1.5)): # stop at ``sqrt(limit)``
#         if is_prime[n]:
#             for i in range(n*n, limit+1, n):
#                 is_prime[i] = False
#     return [i for i, prime in enumerate(is_prime) if prime]


maxi = 10**5
points = []

# primes = primes_upto(int(maxi / 2) + 1)
primes = list(sympy.sieve.primerange(0, int(maxi / 2) + 1))
print("PRIMES", len(primes))

sum = 0
for i, p1 in enumerate(primes):
    for p2 in primes[i::]:
        if p1 * p2 < maxi:
            # print(p1, p2, "=", p1*p2)
            sum += 1
        else:
            # print(".", end="")
            break

# print("")
print("Totaal", sum)

"""

A composite is a number containing at least two prime factors. 
For example, 15 = 3 × 5; 9 = 3 × 3; 12 = 2 × 2 × 3.

There are ten composites below thirty containing precisely two, 
not necessarily distinct, prime factors: 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.

How many composite integers, n < 108, have precisely two, 
not necessarily distinct, prime factors?

"""





maxi = 10**5
points = []

primes = list(sympy.sieve.primerange(0, int(maxi / 2) + 1))
print("PRIMES", len(primes)) #, primes)
size = len(primes)

sum = 0
for i, p1 in enumerate(primes):
    j = size -1
    p2 = primes[j]
    while p1 * p2 > maxi:
        j -= 1
        p2 = primes[j]
    # print(p1, p2, " => ", i, j)
    if p1 <= p2:
        sum += i + j

print(sum)