import math

def proper_divisor_sum(n):
    sumation = 1
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            sumation += i + n // i
    return sumation

assert proper_divisor_sum(12496) == 14288
assert proper_divisor_sum(15472) == 14536

MILLION = 10**2

data = []
for i in range(MILLION+1):
    data.append(0)

for n in range(1, MILLION+1):
    if data[n] == 0:
        history = []
        while (n not in history):
            n2 = proper_divisor_sum(n)
            data[n] = n2
            history.append(n)
            n = n2
        print(history)

        # print(n, MILLION)