from decimal import *

count = 4**9  # 262144
array = [0] * (9 * 4 +1)  # [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 45, 165, 486, 1206, 2598, 4950, 8451, 13051, 18351, 23607, 27876, 30276, 30276, 27876, 23607, 18351, 13051, 8451, 4950, 2598, 1206, 486, 165, 45, 9, 1]

for a in range(1, 4+1):
    for b in range(1, 4+1):
        for c in range(1, 4+1):
            for d in range(1, 4+1):
                for e in range(1, 4+1):
                    for f in range(1, 4+1):
                        for g in range(1, 4+1):
                            for h in range(1, 4+1):
                                for i in range(1, 4+1):
                                    array[a+b+c+d+e+f+g+h+i] += 1

count_2 = 6**6  # 46656
array_2 = [0] * (6 * 6 +1)  # [0, 0, 0, 0, 0, 0, 1, 6, 21, 56, 126, 252, 456, 756, 1161, 1666, 2247, 2856, 3431, 3906, 4221, 4332, 4221, 3906, 3431, 2856, 2247, 1666, 1161, 756, 456, 252, 126, 56, 21, 6, 1]

for a in range(1, 6+1):
    for b in range(1, 6+1):
        for c in range(1, 6+1):
            for d in range(1, 6+1):
                for e in range(1, 6+1):
                    for f in range(1, 6+1):
                        array_2[a+b+c+d+e+f] += 1

change_win = Decimal(0.0)

for i in range(len(array)):
    for j in range(len(array_2)):
        if i > j:
            change_win += (Decimal(array[i]) / count) * (Decimal(array_2[j]) / count_2)

print(f"\n change_win = {change_win}")
