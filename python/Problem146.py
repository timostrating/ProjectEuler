import math

MAX = 1000000

# def generate_primes(n): 
#     size = n//2
#     sieve = [1]*size
#     limit = int(n**0.5)
#     for i in range(1,limit):
#         if sieve[i]:
#             val = 2*i+1
#             tmp = ((size-1) - i)//val 
#             sieve[i+val::val] = [0]*tmp
#     return [2] + [i*2+1 for i, v in enumerate(sieve) if v and i>0]


def isPrime(num):
    if num <= 1:
        return False
    if num == 2:
        return True
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False

    return True

total = 0
for n in range(MAX):
    n2 = n**2
    if isPrime(n2 + 1) and isPrime(n2 + 3) and isPrime(n2 + 7) and isPrime(n2 + 9) and isPrime(n2 + 13) and isPrime(n2 + 27):
        total += n
        print(n)