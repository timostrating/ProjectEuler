import itertools
import random

# rainbow = [].__add__(["RED"]*10).__add__(["ORANGE"]*10).__add__(["YELLOW"]*10).__add__(["GREEN"]*10).__add__(["BLUE"]*10).__add__(["PURPLE"]*10).__add__(["PINK"]*10)

rainbow = [].__add__([1]*10).__add__([2]*10).__add__([3]*10).__add__([4]*10).__add__([5]*10).__add__([6]*10).__add__([7]*10)

count = 0
founds = 0

# for s in itertools.combinations(rainbow, 20):
#     # print(s, len(set(s)))
#     founds += len(set(s))
#     count += 1

#     if count % 10000 == 1:
#         # print(count, founds)
#         print(founds / count)


results = 0
for i in range(100000000):
    data = set()
    for j in range(20):
        data.add(random.randint(1,7))

    results += len(data)
    if (i % 10000 == 1):
        print(results / i)
