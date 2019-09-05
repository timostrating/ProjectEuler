import math

MAX = 1000

def diophantine(x, d, y):
    return x**2 - d * y**2

def diophantine_equation_naive(d):
    for x in range(1, 99999999999):
        # print("trying",x)
        for y in range(1, 99999999999):
            v = diophantine(x, d, y)
            if v == 1:
                return x
            if v < 1:
                break


not_found = []
CAP = 10**4

def diophantine_equation(d):
    x = 1
    y = 1

    v = diophantine(x, d, y)
    i = 0
    while v != 1 and i < CAP:
        i += 1
        while v > 1:
            y += 1
            v = diophantine(x, d, y)
            # print(f"{x}^2 - {d} * {y}^2 = 1", "y++", v)
        
        while v < 1:
            x += 1
            v = diophantine(x, d, y)
            # print(f"{x}^2 - {d} * {y}^2 = 1", "x++", v)

    print(f"\t\t{x}^2 - {d} * {y}^2 = 1",)
    if i >= CAP:
        not_found.append(d)
        return 0

    return x




# assert diophantine_equation_naive(2) == diophantine_equation(2)
# assert diophantine_equation_naive(3) == diophantine_equation(3)
# assert diophantine_equation_naive(5) == diophantine_equation(5)
# assert diophantine_equation_naive(6) == diophantine_equation(6)
# assert diophantine_equation_naive(7) == diophantine_equation(7)
# assert diophantine_equation_naive(7) == diophantine_equation(7)


# maximum = (0, -1)
# for i in range(2, MAX+1):
#     if (int(math.sqrt(i))**2 != i):
#         v = diophantine_equation(i)
#         # assert diophantine_equation_naive(i) == vs

#         if v > maximum[1]:
#             maximum = (i, v)
#             print("maximum =", i, v)
#         else:
#             print(i, v)


# print("\n", maximum)
# print(not_found)


# numbers = []
# for i in range(2, MAX+1):
#     if (int(math.sqrt(i))**2 != i):
#         numbers.append(i)

# print(numbers)


numbers = [61, 97, 106, 139, 166, 181, 193, 202, 214, 233, 241, 253, 262, 268, 284, 301, 307, 309, 313, 317, 334, 358, 365, 367, 373, 379, 393, 397, 406, 412, 424, 436, 445, 449, 451, 457, 461, 463, 477, 481, 502, 508, 524, 526, 533, 537, 541, 547, 549, 553, 559, 565, 569, 571, 586, 596, 604, 606, 610, 614, 622, 629, 631, 633, 637, 639, 641, 643, 647, 649, 653, 655, 661, 667, 669, 673, 686, 688, 694, 698, 716, 718, 722, 724, 733, 737, 739, 749, 751, 753, 757, 763, 769, 771, 773, 781, 790, 794, 796, 802, 808, 814, 826, 834, 838, 845, 849, 853, 857, 859, 861, 863, 865, 869, 871, 873, 877, 879, 881, 883, 889, 893, 914, 922, 926, 928, 932, 946, 954, 956, 958, 965, 967, 971, 977, 981, 989, 991, 997, 999]

x = 16884000
while len(numbers) > 100:
    for D in numbers:
        v = x**2 // D
        if x**2 % D == 1 and int(math.sqrt(v))**2 == v:  
            numbers.remove(D)
            print("\n\n We removed: ", D)
            print(numbers)
    x += 1
    if x % 10000 == 0:
        print("\t", x)

print(x)