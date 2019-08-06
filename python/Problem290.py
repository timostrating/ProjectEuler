def digit_sum(n):
    total = 0
    for c in str(n):
        total += int(c)
    return total


count = 0
for n in range(0, 10**3):
    a = digit_sum(n)
    b = digit_sum(137*n)
    print(n, a, b, end="")
    if (a == b):
        count += 1
        print(" \t JHEEE", end="")
    print()

print(count)


# 2
# 4 
# 33
# 306
# 2902
# 27955
# 271523
# 2636394