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
    total = n
    primes = generate_primes(int(math.sqrt(n)) + 1)
    print(f"Primes up to {int(math.sqrt(n)) + 1} recieved from god, it are {len(primes)} numbers ")
    correct = True

    sqrs = []
    for p in primes:
        to_end = n // (p*p)
        total -= to_end
        

        sum_sqrs = 0
        if (correct):
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

        if sum_sqrs == 0 and p != 2:
            correct = False 
            
        # print(p, "=", [to_end, sum_sqrs])
        sqrs.append(p*p)
        total += sum_sqrs
    
    return total


print(squarefree_below_fast(50000))
# print(squarefree_below(2**30))
print(squarefree_below_naive(50000))


# 4
# 9
# 25