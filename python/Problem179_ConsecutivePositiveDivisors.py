import math

maxi = 20  # 10**3
points = [0] * maxi

for n in range(1, maxi +1):
    i = n
    while i < maxi:
        points[i] += 1
        i += n

sum = 0
for i in range(len(points) - 1):
    if points[i] == points[i + 1]:
        sum += 1

print(points)
print(sum)