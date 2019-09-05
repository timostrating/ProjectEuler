# import math
import sympy

primes = list(sympy.sieve.primerange(0, 10**5))

# def M_naive(n):
#     v = 0
#     for a in range(n):
#         # print("{}={}".format((a**2) % n, a % n, end=" "))
#         if a**2 % n == a % n:
#             v = a**2 % n
#     return v

def M(n):   
    v = 0
    for a in range(n):
        print("{}={}".format((a**2) % n, a % n), end=" ")
        if a**2 % n == a % n:
            v = a**2 % n
    return v

# print(M(6))
# total = 0
for n in range(1, 10**2 +1):
    print(n, end=": ")
    print("Highest", M(n), sympy.isprime(n))
    print("")
#     total += M(n)
# print(total)

# for size in range(6, 7):
#     print(size)
#     for a in range(size):
#         print("{}={}".format((a**2) % size, a % size, end=" "))
#     print("\n")

"""

If we calculate a**2 mod 6 for 0 ≤ a ≤ 5 we get: 0,1,4,3,4,1.

The largest value of a such that a**2 ≡ a mod 6 is 4.
Let's call M(n) the largest value of a < n such that a**2 ≡ a (mod n).
So M(6) = 4.

Find ∑M(n) for 1 ≤ n ≤ 10**7.

"""