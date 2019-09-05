from math import *


def step(n, top, bottom, i=0):
    if i >= 5:
        return
    i += 1

    print("23 -", int(sqrt(23)) ** 2, "=", 23 - int(sqrt(23)) ** 2)
    print("sqrt(23) +", int(sqrt(23)))

    step(n, 1, -4, i)


step(23, 1, -4)

# print("sqrt(23) -", int(sqrt(23)))
# print("23 -", int(sqrt(23)) ** 2, "=", 23 - int(sqrt(23)) ** 2)
# print("sqrt(23) +", int(sqrt(23)))