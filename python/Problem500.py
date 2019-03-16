import math

maxi = 6000
points = [0] * maxi

for n in range(1, maxi +1):
    i = n
    while i < maxi:
        points[i] += 1
        i += n

print(points)
print(points[2])
print(points[6])
print(points[24])
print(points[120])
print(points[720])  # WRONG
print(points[5040]) # WRONG

# 2**1  2   =>  2!=2
# 2**2  4   =>  3!=6
# 2**3  8   =>  4!=24
# 2**4  16  =>  5!=120
# 2**5  32  =>  6!=720
# 2**6  64  =>  7!=5040

# for i in range(20):
#     print(math.factorial(i))