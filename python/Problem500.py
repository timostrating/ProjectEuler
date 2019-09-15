import math

maxi = 1000

# https://en.wikipedia.org/wiki/Euler%27s_totient_function
import fractions

def phi(n):
    amount = 0        
    for k in range(1, n + 1):
        if fractions.gcd(n, k) == 1:
            amount += 1
    return amount

print(phi(123))


def devisors(n):
        divs = 2
        for i in range(2, int(math.sqrt(n)) +1):
                if n % i == 0:
                        print(f"{n} % {i} == 0", f"\t\t{n} % {n//i} == 0")
                        divs += 2
                else:
                        print("nope", i)
        return divs
assert devisors(720) == 30

# for n in range(1, maxi +1):
#         print(f"{n}: \t {devisors(n)}")

# 2**1  2   =>  2!=2
# 2**2  4   =>  3!=6
# 2**3  8   =>  4!=24
# 2**4  16  =>  5!=120
# 2**5  32  =>  6!=720
# 2**6  64  =>  7!=5040

# for i in range(20):
#     print(math.factorial(i))
