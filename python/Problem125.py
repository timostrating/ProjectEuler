import math

MAX = 10**8
LOOPS = int(math.sqrt(MAX / 2)) + 2

def is_palindrome(n_int):
    n = str(n_int)
    for i in range( len(n) // 2 ):
        if n[i] != n[len(n) -1 -i]:
            return False

    return True


count = 0
count_sum = 0
sumation = 0
i = 1
while i <= LOOPS:
    # print(sumation, f"+{i}^2")

    sumation += i**2
    if sumation < MAX and sumation > 1 and is_palindrome(sumation):
        count += 1
        count_sum += sumation
        print(count, sumation, "?", i)

    sum_copy = int(str(sumation))
    i += 1
    j = 1
    while j < i - 2:
        # print(sumation, f"-{j}^2")
        sumation -= j**2
        j += 1
        if sumation < MAX and is_palindrome(sumation):
            count += 1
            count_sum += sumation
            print(count, sumation, j, i)

    sumation = sum_copy 

print(count_sum)


# 2916867073

"""
The palindromic number 595 is interesting because it can be written as the sum of consecutive squares: 6^2 + 7^2 + 8^2 + 9^2 + 10^2 + 11^2 + 12^2.

There are exactly eleven palindromes below one-thousand that can be written as consecutive square sums, and the sum of these palindromes is 4164. 
Note that 1 = 0^2 + 1^2 has not been included as this problem is concerned with the squares of positive integers.

Find the sum of all the numbers less than 10^8 that are both palindromic and can be written as the sum of consecutive squares.
"""