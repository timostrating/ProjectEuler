# import random

# def play():
#     sum_a = 0
#     for i in range(9):
#         sum_a = random.randint(1, 4)

#     sum_b = 0
#     for i in range(6):
#         sum_b = random.randint(1, 6)
    
#     return sum_a > sum_b

# i = 0
# wins = 0
# while (i <= 1000000000):
#     if(play()):
#         wins += 1
    
#     i += 1
#     if(i % 10000 == 0):
#         print(wins / i)

# print("wins", wins)
# print("i", i)


from decimal import *


# count = 0
# array = []
# for i in range(9 * 4 +1):
#     array.append(0)

# for a in range(1, 4+1):
#     for b in range(1, 4+1):
#         for c in range(1, 4+1):
#             for d in range(1, 4+1):
#                 for e in range(1, 4+1):
#                     for f in range(1, 4+1):
#                         for g in range(1, 4+1):
#                             for h in range(1, 4+1):
#                                 for i in range(1, 4+1):
#                                     total = a+b+c+d+e+f+g+h+i
#                                     array[total] += 1
#                                     count += 1
                                
# print(array, len(array), count)


# count_2 = 0
# array_2 = []
# for i in range(6 * 6 +1):
#     array_2.append(0)

# for a in range(1, 6+1):
#     for b in range(1, 6+1):
#         for c in range(1, 6+1):
#             for d in range(1, 6+1):
#                 for e in range(1, 6+1):
#                     for f in range(1, 6+1):
#                         total = a+b+c+d+e+f
#                         array_2[total] += 1
#                         count_2 += 1
                                
# print(array_2, len(array_2), count_2)



count = 4                 # 262144
array = [0, 1, 2, 1]   # [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 45, 165, 486, 1206, 2598, 4950, 8451, 13051, 18351, 23607, 27876, 30276, 30276, 27876, 23607, 18351, 13051, 8451, 4950, 2598, 1206, 486, 165, 45, 9, 1]
count_2 = 4               # 46656
array_2 = [1, 1, 1, 1]    # [0, 0, 0, 0, 0, 0, 1, 6, 21, 56, 126, 252, 456, 756, 1161, 1666, 2247, 2856, 3431, 3906, 4221, 4332, 4221, 3906, 3431, 2856, 2247, 1666, 1161, 756, 456, 252, 126, 56, 21, 6, 1]

change_win = Decimal(0.0)
change_draw = Decimal(0.0)
change_loss = Decimal(0.0)

for i in range(len(array)):
    for j in range(len(array_2)):
        if i > j:
            change_win += (Decimal(array[i]) / count) * (Decimal(array_2[j]) / count_2)
        if i == j:
            change_draw += (Decimal(array[i]) / count) * (Decimal(array_2[j]) / count_2)
        if i < j:
            change_loss += (Decimal(array[i]) / count) * (Decimal(array_2[j]) / count_2)    

print("")
print(f"change_win = {change_win}")
print(f"change_draw = {change_draw}")
print(f"change_loss = {change_loss}")
print("")
print(f"total = {change_win + change_draw + change_loss}")


