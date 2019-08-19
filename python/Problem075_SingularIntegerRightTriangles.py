
def gcd(m, n):
    if (n == 0):
        return m
    else:
        return gcd(n, m % n)


L = 1500000
triangles = [0] * (L+1)

for m in range(1, L, 2):
    for n in range(1, m, 2):
        if gcd(m, n) != 1:
            continue

        if m*n > L:
            break
        
        # https://en.wikipedia.org/wiki/Pythagorean_triple
        a = m*n                  # m**2 - n**2
        b = (m**2 - n**2) // 2   # 2*m*n
        c = (m**2 + n**2) // 2   # m**2 + n**2
        
        i = 1
        perimeter = a + b + c
        while perimeter <= L:
            # print(a,b,c, "\t X ",i, "==",  perimeter)
            triangles[perimeter] += 1

            i += 1
            perimeter = i * (a + b + c)


total = 0
for t in triangles:
    if t == 1:
        total += 1

print(total)