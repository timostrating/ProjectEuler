import math

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


def squarefree_below_naive(n):
    digits = []
    for i in range(n):
        digits.append(i+1)

    primes = generate_primes(int(math.sqrt(n)) + 1)
    print(f"Primes up to {int(math.sqrt(n)) + 1} recieved from god, it are {len(primes)} numbers ")

    for p in primes:
        sqr_p = p * p
        i = sqr_p
        count = [0, 0]
        while i <= n:
            # print("Removed", i, "\t", p)
            count[0] += 1
            if digits.__contains__(i):
                digits.remove(i)
            else:
                count[1] += 1
                # print("^^^ dingen ???")
            i += sqr_p

        # print("\t\t\t", p, "=", count)

    # print(digits)
    return len(digits)


def squarefree_below(n):
    total = n
    primes = generate_primes(int(math.sqrt(n)) + 1)
    print(f"Primes up to {int(math.sqrt(n)) + 1} recieved from god, it are {len(primes)} numbers ")

    sqrs = []
    for p in primes:
        to_end = n // (p*p)
        total -= to_end


        sum_sqrs = 0
        for sq in sqrs:
            sum_sqrs += to_end // sq
            for sq2 in sqrs:
                if sq > sq2:
                    correction = to_end // (sq * sq2)
                    # print(sq, sq2, correction) 
                    sum_sqrs -= correction
                else:
                    # print("BREACK", sq, sq2)
                    break

        # print(p, "=", [to_end, sum_sqrs])
        sqrs.append(p*p)
        total += sum_sqrs
    return total



def squarefree_below_fast(n):
    primes = generate_primes(int(math.sqrt(n)) + 1)
    print(f"Primes up to {int(math.sqrt(n)) + 1} recieved from god, it are {len(primes)} numbers ")

    sqrs = []
    tmp = 2
    while tmp ** 2 < n:
        sqrs.append(tmp**2)
        tmp += 1

    total = n
    for p in primes:
        total -= n // p**2

    return total

print(squarefree_below_fast(50))
print(squarefree_below(50))
print(squarefree_below_naive(50))


# 2  4    50//4 = 12   4,8,12,16,20,24,28,32,36,40,44,48
# 3  9    50//9 = 5    9,18,27,36,45
# 5  25   50//25 = 2
# 7  49   


"""
 1,  2,  3,  4,  5,  6,  7,  8,  9,
11, 12, 13, 14, 15, 16, 17, 18, 19,
21, 22, 23, 24, 25, 26, 27, 28, 29,
31, 32, 33, 34, 35, 36, 37, 38, 39,
41, 42, 43, 44, 45, 46, 47, 48, 49,
"""

