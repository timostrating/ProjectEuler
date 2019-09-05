import math

MAX = 100
minimal = 9999999999999999999

def isPerfectSquare(n):
    return int(math.sqrt(n)) ** 2 == n

def generatePerfectSquares(n):
    data = []
    for i in range(1, n):
        data.append(i*i)
    return data

print(generatePerfectSquares(1000))