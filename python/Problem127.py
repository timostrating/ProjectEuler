import math

MAX = 1000

def memoize(function):
    from functools import wraps
    cache = {}
    @wraps(function)
    def wrapper(*args):
        if args in cache:
            return cache[args]
        else:
            rv = function(*args)
            cache[args] = rv
            return rv
    return wrapper

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

@memoize
def rad(n):
    total = 1
    for pi in range(n):
        i = PRIMES[pi]
        if n % i == 0:
            total *= i
            while n % i == 0:
                n = n // i
            if n == 1:
                return total
    return total
# assert rad(504) == 42
# assert rad(4320) == 30

RAD = [] * MAX
for i in range(MAX):
    print(i)
    RAD[i] = rad(i)
    

GCD = [[1 for x in range(MAX)] for y in range(MAX)] 
for oldI in range(2, MAX):
    i = oldI
    n = 0
    while i > 1:
        if i % PRIMES[n] == 0:
            for index in range(0, MAX, PRIMES[n]):
                GCD[oldI][index] += 1
            while i % PRIMES[n] == 0:
                i = i // PRIMES[n]
        n += 1

print("GCD generated")
# print(GCD[10])



# total = 0
# count = 0
# for a in range(1, MAX): 
#     for b in range(a, MAX):
#         if a + b >= MAX:
#             break
#         c = a+b
#         if GCD[b][c] == 1 and GCD[a][c] == 1 and GCD[a][b] == 1:
#             if rad(RAD[a] * RAD[b] * RAD[c]) < c:  # rad(a) * rad(b) * rad(c) MAYBE ???
#                 total += c
#                 count += 1
#                 print(count, "\t", a, b, c)
        
# print(total)


# print(rad(1260))
# print(rad(7*4*45))
# print(rad(7), "*", rad(4), "*", rad(45))
# print(rad(rad(7) * rad(4) * rad(45)))