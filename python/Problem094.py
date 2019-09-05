import math

def valid(a,c):
    side_a = a
    # side_b = "?"
    side_c = (c/2)

    side_b = math.sqrt(side_a **2 - side_c**2)

    return side_b * side_c % 1 < 0.01 or side_b * side_c % 1 > 0.99  # not the best way to do this %1 should be %INT_VALUE


assert valid(5,6)
assert valid(5,4) == False

MAX = 10**9

count = 0
perimeter_sum = 0
for i in range(2, MAX // 3 +5):
    if valid(i, i-1) and i*i*(i-1) < MAX:
        count += 1
        perimeter_sum += i*i*(i-1)
        print(i, i, i-1)
    if valid(i, i+1) and i*i*(i+1) < MAX:
        count += 1
        perimeter_sum += i*i*(i+1)
        print(i, i, i+1)

print(count)