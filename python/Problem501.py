import math

def divisors_naive(n):
    total = 0
    nums = []
    for number in range(n):
        count = 0
        for i in range(1, int(math.sqrt(number)) +1):
            if (number / i == number // i):
                # print(f"{number} is devidable by {i} and {number // i}")
                
                count += 2
                if (i == number // i):
                    count -= 1

            if (count > 8):
                break
        if (count == 8):
            total += 1
            # print(number)
            nums.append(number)

    return total

# print("\t\t", divisors_naive(100))
# print("\t\t", divisors_naive(1000))
# print("\t\t", divisors_naive(10000))
# print("\t\t", divisors_naive(10**6))



def generate_primes(n): 
    size = n//2
    sieve = [1]*size
    limit = int(n**0.5)
    for i in range(1,limit):
        if sieve[i]:
            val = 2*i+1
            tmp = ((size-1) - i)//val 
            sieve[i+val::val] = [0]*tmp
    return [2] + [i*2+1 for i, v in enumerate(sieve) if v and i>0]


def divisors(n):
    primes = generate_primes((n // 6) +1) # Large Prime * LOWEST PRIME * SECOND LOWEST PIRME  ==>  Large Pprime * (3*2)  ==>  max prime needed < ciel(n / 6) 
    count = 0
    print("Primes generated", len(primes), primes[-1])

    for p1 in primes:   # PRIME^3 * PRIME
        if p1 ** 3 > n:
            break

        for p2 in primes:
            if p1 != p2:
                v = p1 ** 3 * p2
                if v < n:
                    # print(v, p1,"^ 3 ", p2)
                    count += 1
                elif v > n:
                    break

    print("First set done")
    for p1 in primes:   # PRIME * PRIME * PRIME
        for p2 in primes:
            if p1 * p2 > n: # or p1 >= p2:
                break
            for p3 in primes:
                v = p1 * p2 * p3
                if v > n: # or p2 >= p3:
                    break
                
                if p1 < p2 and p2 < p3 and p1 != p2 and p1 != p3 and p2 != p3:
                    if v < n:
                        # print(v, p1, p2, p3)
                        count += 1    
    print("Second set done")

    i = 0               # PRIME^7
    p = primes[i]
    while p ** 7 < n: 
        count += 1
        i += 1
        p = primes[i]
    print("Last set done")

    return count


# print("\t\t", divisors(100))
# print("\t\t", divisors(1000))
# print("\t\t", divisors(10000))
# print("\t\t", divisors(10**6))
print("\t\t", divisors(10**10))
# print("\t\t", divisors(10**12))

# for i in range(100, 10000):
#     a = divisors_naive(i)
#     b = divisors(i)
#     print("\t\t", i, a, b, a == b)
#     assert a == b

# 54  2*3*3
# 128 2*2*2*2*2*2*2
# 250 2*5*5*5
# 375 3*5*5*5
# 686 3*7*7*7

# a = [24, 30, 40, 42, 54, 56, 66, 70, 78, 88, 102, 104, 105, 110, 114, 128, 130, 135, 136, 138, 152, 154, 165, 170, 174, 182, 184, 186, 189, 190, 195, 222, 230, 231, 232, 238, 246, 248, 250, 255, 258, 266, 273, 282, 285, 286, 290, 296, 297, 310, 318, 322, 328, 344, 345, 351, 354, 357, 366, 370, 374, 375, 376, 385, 399, 402, 406, 410, 418, 424, 426, 429, 430, 434, 435, 438, 442, 455, 459, 465, 470, 472, 474, 483, 488, 494, 498, 506, 513, 518, 530, 534, 536, 555, 561, 568, 574, 582, 584, 590, 595, 598, 602, 606, 609, 610, 615, 618, 621, 627, 632, 638, 642, 645, 646, 651, 654, 658, 663, 664, 665, 670, 678, 682, 686, 705, 710, 712, 715, 730, 741, 742, 754, 759, 762, 776, 777, 782, 783, 786, 790, 795, 805, 806, 808, 814, 822, 824, 826, 830, 834, 837, 854, 856, 861, 872, 874, 875, 885, 890, 894, 897, 902, 903, 904, 906, 915, 935, 938, 942, 946, 957, 962, 969, 970, 978, 986, 987, 994, 999]
# b = [24, 30, 42, 66, 78, 102, 114, 138, 174, 186, 222, 246, 258, 282, 318, 354, 366, 402, 426, 438, 474, 498, 534, 582, 606, 618, 642, 654, 678, 762, 786, 822, 834, 894, 906, 942, 978, 40, 70, 110, 130, 170, 190, 230, 290, 310, 370, 410, 430, 470, 530, 590, 610, 670, 710, 730, 790, 830, 890, 970, 56, 154, 182, 238, 266, 322, 406, 434, 518, 574, 602, 658, 742, 826, 854, 938, 994, 88, 286, 374, 418, 506, 638, 682, 814, 902, 946, 104, 442, 494, 598, 754, 806, 962, 136, 646, 782, 986, 152, 874, 184, 232, 248, 296, 328, 344, 376, 424, 472, 488, 536, 568, 584, 632, 664, 712, 776, 808, 824, 856, 872, 904, 54, 135, 105, 165, 195, 255, 285, 345, 435, 465, 555, 615, 645, 705, 795, 885, 915, 189, 231, 273, 357, 399, 483, 609, 651, 777, 861, 903, 987, 297, 429, 561, 627, 759, 957, 351, 663, 741, 897, 459, 969, 513, 621, 783, 837, 999, 250, 375, 875, 385, 455, 595, 665, 805, 715, 935, 686]

# for x in b:
#     a.remove(x)

# print(a)
