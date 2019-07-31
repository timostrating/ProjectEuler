dictionary = {}
def factorial_ending_slow(n):
    fac = 1
    for i in range(2, n+1):
        fac *= i
        p = -1
        while (f"{fac}"[p] == "0"):
            p -= 1
        fac = fac // (10**((p+1) * -1))
        fac %= 10**10
        if i > 8:
            if dictionary.__contains__(fac % 10**5):
                dictionary[fac % 10**5].append(i)
            else:
                dictionary[fac % 10**5] = [i]
    return fac % 10**5


# print(factorial_ending_slow(100000))
# print(dictionary)


def factorial_ending(n):
    fac = 1
    for i in range(2, n+1):
        if i % 10000000 == 0:
            print((i / n) * 100, "%")
        fac *= i

        p = -1
        while (f"{fac}"[p] == "0"):
            p -= 1
        fac = fac // (10**((p+1) * -1))

        fac %= 10**5
    return fac


# for i in range(9, 100):
#     print(i, factorial_ending(i))

print(factorial_ending(10**12))