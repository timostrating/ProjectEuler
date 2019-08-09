MAX = 100

def gcd(m, n):
    if (n == 0):
        return m
    else:
        return gcd(n, m % n)

assert gcd(9,6) == 3
assert gcd(9,3) == 3

for i in range(1, 9+1):
    print(gcd(9, i))






def is_permutation(a, b):
    if len(str(a)) != len(str(b)):
        return False

    a_array = list(str(a))
    b_array = list(str(b))

    for x in a_array:
        if b_array.__contains__(x) == False:
            return False
        b_array.remove(x)

    return True

assert is_permutation(123, 231)
assert is_permutation(122, 221)
assert is_permutation(12, 221) == False
assert is_permutation(12, 31) == False



    
# def phi(n):
#     return 21

# assert phi(1) == 1
# assert phi(9) == 6

# for n in range(1, MAX):
#     v = phi(n)
#     if is_permutation(v, n):
#         print(n, v)



"""
Euler's Totient function, φ(n) [sometimes called the phi function], 
is used to determine the number of positive numbers less than or equal to n which are relatively prime to n. 
For example, as 1, 2, 4, 5, 7, and 8, are all less than nine and relatively prime to nine, φ(9)=6.
The number 1 is considered to be relatively prime to every positive number, so φ(1)=1.

Interestingly, φ(87109)=79180, and it can be seen that 87109 is a permutation of 79180.

Find the value of n, 1 < n < 107, for which φ(n) is a permutation of n and the ratio n/φ(n) produces a minimum.
"""