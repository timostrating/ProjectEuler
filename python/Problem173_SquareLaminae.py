MAX = 1000000

size = 3
total = 0

while size < MAX * 10:
    i = size - 2
    while i >= 1:
        tiles = size**2 - i**2
        if tiles > MAX:
            break
        else:
            total += 1
            i -= 2

    size += 1

print(total)