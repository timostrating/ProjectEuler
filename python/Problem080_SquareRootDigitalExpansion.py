import math

def estimate_sqrt(val):
    i = 0
    v = int(str(math.sqrt(val) * 10**7 // 10**4).replace(".0", ""))
    value = val * 10**(len(str(v*v))-1) 
    if val > 10:
        value = value // 10
    while i < 100:
        i += 1
        v *= 10
        value *= 100
        for n in range(10):
            v += 1
            # print(i, v, v * v, value)
            if v * v > value:
                v -= 1
                break
    
    count = 0
    string = str(v)
    print(val, math.sqrt(val), v)
    for i in range(100):
        count += int(string[i])

    return count



# estimate_sqrt(11)
total = 0
for i in range(1, 100+1):
    if len(str(math.sqrt(i))) > 5:
        total += estimate_sqrt(i)

print(total)