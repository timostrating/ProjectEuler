#  a b c d
#  e f g h
#  i j k l
#  m n o p

count = 0
for a in range(0, 10):                                                                                                      # A
    for b in range(0, 10):                                                                                                  # B
        for c in range(0, 10):                                                                                              # C
            for d in range(0, 10):                                                                                          # D
                row_sum = a + b + c + d
                print(a*1000 + b *100 + c*10 + d, 10**4)

                for e in range(0, 10):                                                                                      # E
                    if row_sum >= a + e:
                        for i in range(0, 10):                                                                              # I
                            if row_sum >= a + e + i:
                                for m in range(0, 10):                                                                      # M
                                    if row_sum == a + e + i + m:
                                        for g in range(0, 10):                                                              # G
                                            for j in range(0, 10):                                                          # J
                                                if row_sum == d + g + j + m:
                                                    for f in range(0, 10):                                                  # F
                                                        for n in range(0, 10):                                              # N
                                                            if row_sum == b + f + j + n:
                                                                for h in range(0, 10):                                      # H
                                                                    if row_sum == e + f + g + h:
                                                                        for k in range(0, 10):                              # K
                                                                            for p in range(0, 10):                          # P
                                                                                if row_sum == a + f + k + p:
                                                                                    for o in range(0, 10):                  # O
                                                                                        if row_sum == c + g + k + o and row_sum == m + n + o + p:
                                                                                            for l in range(0, 10):          # L
                                                                                                if row_sum == d + h + l + p and row_sum == i + j + k + l:
                                                                                                    count += 1


print("\n\n\n")
print(count)

