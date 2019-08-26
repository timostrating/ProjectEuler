darts = [(1,25), (2,25)]
SDT = ["","S","D","T"] 

for i in range(1,20+1):
    darts.append((1, i))
    darts.append((2, i))
    darts.append((3, i))


total = 0
for a in darts:
    if (a[0] != 2):
        continue
    if (a[0]*a[1] >= 100):
        continue
    print(SDT[a[0]] + str(a[1]))
    total += 1

for a in darts:
    for b in darts:
        if (b[0] != 2):
            continue
        if (a[0]*a[1] + b[0]*b[1] >= 100):
            continue
        total += 1
        print(SDT[a[0]] + str(a[1]), SDT[b[0]] + str(b[1]))

map = dict()
for a in darts:
    for b in darts:
        for c in darts:
            if (c[0] != 2):
                continue
            if (a[0]*a[1] > b[0]*b[1]):
                continue
            if (a[0]*a[1] + b[0]*b[1] + c[0]*c[1] >= 100):
                continue

            if (map.__contains__(c[1])):
                if a[0] > b[0]:
                    map[c[1]].add((b,a))
                else:
                    map[c[1]].add((a,b))
            else:
                map[c[1]] = set([(a, b)])
            print(SDT[a[0]] + str(a[1]), SDT[b[0]] + str(b[1]), SDT[c[0]] + str(c[1]),   a[0]*a[1] + b[0]*b[1] + c[0]*c[1])

for a in darts:
    if (a[0] != 2):
        continue
    if map.__contains__(a[1]):
        total += len(map[a[1]])
        
print(total)
