def cube_digits():
    for a in range(0, 4 +1):
        for b in range(max(1, a+1), 5 +1):
            for c in range(max(2, b+1), 6 +1):
                for d in range(max(3, c+1), 7 +1):
                    for e in range(max(4, d+1), 8 +1):
                        for f in range(max(5, e+1), 9 +1):
                            if 6 in [a,b,c,d,e,f] and 9 not in [a,b,c,d,e,f]:
                                yield (a,b,c,d,e,f, 9)
                            elif 9 in [a,b,c,d,e,f] and 6 not in [a,b,c,d,e,f]:
                                yield (a,b,c,d,e,f, 6)
                            else:
                                yield (a,b,c,d,e,f)


def valid(seta, setb):
    if (0 in seta and 1 in setb) or (1 in seta and 0 in setb):
        if (0 in seta and 4 in setb) or (4 in seta and 0 in setb):
            if (0 in seta and 9 in setb) or (9 in seta and 0 in setb):
                if (1 in seta and 6 in setb) or (6 in seta and 1 in setb):
                    if (2 in seta and 5 in setb) or (5 in seta and 2 in setb):
                        if (3 in seta and 6 in setb) or (6 in seta and 3 in setb):
                            if (4 in seta and 9 in setb) or (9 in seta and 4 in setb):
                                if (6 in seta and 4 in setb) or (4 in seta and 6 in setb):
                                    if (8 in seta and 1 in setb) or (1 in seta and 8 in setb):
                                        return True
    return False
assert valid((0,5,6,7,8,9), (1,2,3,4,8,9))


total = 0
for cube in cube_digits():
    print(cube)
    # for cube2 in cube_digits():
    #     if valid(cube, cube2):
    #         total += 1

print(total)