import math

# maxi = 6000
# points = [0] * maxi

# for n in range(1, maxi +1):
#     i = n
#     while i < maxi:
#         points[i] += 1
#         i += n

# print(points)


# 2**1  2   =>  2!=2
# 2**2  4   =>  3!=6
# 2**3  8   =>  4!=24
# 2**4  16  =>  5!=120
# 2**5  32  =>  6!=720
# 2**6  64  =>  7!=5040

# for i in range(20):
#     print(math.factorial(i))


def magic(number):
	count = 0
	for i in range(1, int(math.sqrt(number)) +1):
		if (number / i == number // i):
			# print(f"{number} is devidable by {i} and {number // i}")
			
			count += 2
			if (i == number // i):
				count -= 1

	return count


for i in range(200):
	print(i, magic(i))

# print(magic(30))