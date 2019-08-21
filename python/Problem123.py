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


MAX = 10**6
P = generate_primes(MAX)
P.insert(0,0)
print("PRIMES GENERATED")


n = 3
r = 0
while r < 10**10:
    n += 2
    r = ((P[n] - 1)**n  +  (P[n] + 1)**n)   %   P[n]**2
    # print((P[n] - 1)**n, "+", (P[n] + 1)**n, "%", P[n]**2, "==", r)
    if n % 1000 == 1:
        print(n, r)


print(n)