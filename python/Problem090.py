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


total = 0
for cube in cube_digits():
    for cube2 in cube_digits():
        print(cube, cube2)
        total += 1

print("")
print(total)