def factorial(n):
    total = 1
    for i in range(2, n+1):
        total *= i
    return total

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

# def generate_primes(n): 
#     output = [1]
#     nr = 1
#     for i in range(1, n+1):
#         nr *= i
#         output.append(nr % i)
#     return output

def sumS(N):
    output = 0
    primes = generate_primes(N)
    print("Primes Generated")
    primes.remove(2)
    primes.remove(3)
    print("Primes without {2,3}")
    
    cur_factorial_value = 1
    factorial_nr = 0

    length = len(primes)
    for i, p in enumerate(primes):   
        while factorial_nr < p-5:
            factorial_nr += 1
            cur_factorial_value *= factorial_nr

        f1 = cur_factorial_value % p
        f2 = (p-4) * f1
        f3 = (p-3) * f2
        f4 = (p-2) * f3
        f5 = (p-1) * f4

        total = f1 + f2 + f3 + f4 + f5

        output += total % p
        
        if i % 1000 == 0:
            print(i, length, i / length * 100, "%", output)

    return output


# print("\n\n", sumS(100))  # 480
# print("\n\n", sumS(10000))  # 2882332
print("\n\n", sumS(10**8))  