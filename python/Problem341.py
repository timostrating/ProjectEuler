a=[0, 1, 2, 2]

for n in range(3, 21):
    a += [n for i in range(1, a[n] + 1)]

print(a[1:])
