import math

def divisors_naive(n):
    total = 0
    for number in range(n):
        count = 0
        for i in range(1, int(math.sqrt(number)) +1):
            if (number / i == number // i):
                # print(f"{number} is devidable by {i} and {number // i}")
                
                count += 2
                if (i == number // i):
                    count -= 1

            if (count > 8):
                break
        if (count == 8):
            total += 1
            print(number)

    return total

# print("\t\t", divisors_naive(100))
print("\t\t", divisors_naive(1000))
# print("\t\t", divisors_naive(10**6))



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


def divisors(n):
    primes = generate_primes(n) # we do not need so many primes
    count = 0

    for p1 in primes:
        for p2 in primes:
            if p1 != p2 and p1 < p2:
                v = p1 ** 3 * p2
                if v < n:
                    print(v, p1, p2)
                    count += 1
            
                for p3 in primes:
                    if p1 != p3 and p2 != p3 and p1 < p3 and p2 < p3:
                        v = p1 * p2 * p3
                        if v < n:
                            print(v, p1, p2, p3)
                            count += 1         

    return count


# print("\t\t", divisors(100))
print("\t\t", divisors(1000))
# print("\t\t", divisors(10**6))
# print("\t\t", divisors(10**12))
