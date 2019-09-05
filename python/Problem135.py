dictionary = dict()

MAX = 100000
tens = 0

for x in range(MAX):
    for n in range(1, x//2):
        y = x - n
        z = x - n - n

        v = x**2 - y**2 - z**2

        if v <= 0:
            continue
            
        if v > 10**6:
            break

        # print(x, n, v)

        if dictionary.__contains__(v):
            if dictionary[v] == 9:
                tens += 1
                print(x, tens, "--")
            if dictionary[v] == 10:
                tens -= 1
                print(x, tens, "++")
            dictionary[v] += 1
        else:
            dictionary[v] = 1


print(tens)