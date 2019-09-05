


for m in range(1, 10):
    for n in range(1, m):
        a = m**2 - n**2
        b = 2*m*n
        c = m**2 + n**2
        if (a**2 + b**2 == c** + 1):
            print(a, b, c)
    