import math


# def valid_right_sided_triangle_naive(p1x,p1y, p2x,p2y):
#     a = math.sqrt(p1x**2 + p1y**2)
#     b = math.sqrt(p2x**2 + p2y**2)
#     c = math.sqrt((p1x-p2x)**2 + (p1y-p2y)**2)

#     array = [a,b,c]
#     a,b,c = sorted(array)
#     print(a,b,c)
#     return abs(a**2 + b**2 - c**2) < 0.0001


def valid_right_sided_triangle(p1x,p1y, p2x,p2y):
    a = p1x**2 + p1y**2
    b = p2x**2 + p2y**2
    c = (p1x-p2x)**2 + (p1y-p2y)**2
    a,b,c = sorted([a,b,c])
    return abs(a+b - c) < 0.0001


MAX = 50
count = 0

for p1y in range(MAX + 1):
    for p1x in range(MAX + 1):

        for p2y in range(MAX + 1):
            for p2x in range(MAX + 1):
                if (p1y == 0 and p1x == 0) or (p2y == 0 and p2x == 0):
                    continue
                if (p1y * (MAX+1) + p1x  <  p2y * (MAX+1) + p2x):
                    if valid_right_sided_triangle(p1x,p1y, p2x,p2y):
                        count += 1
                        print(f"({p1y},{p1x}) ({p2y},{p2x})")           

print(count)