import math

def is_palindrome(n_int):
    n = str(n_int)
    for i in range( len(n) // 2 ):
        if n[i] != n[len(n) -1 -i]:
            return False

    return True

assert is_palindrome(5229225)

MAX = 1000000000
A = int(MAX ** (1/2.0)); B = int(MAX ** (1/3.0))
print(A, B)

data = dict()
results = []


for a in range(A):
    for b in range(B):
        v = a**2 + b**3
        if is_palindrome(v):
            if data.__contains__(v) == False:
                data[v] = 0

            data[v] += 1
            if data[v] == 4:
                results.append(v)
                print(f"maybe {a}**2 + {b}**3 = {v}")
            if data[v] == 5:
                results.remove(v)

results = sorted(results)
print(results)
print(results[0] + results[1] + results[2] + results[3] + results[4])
