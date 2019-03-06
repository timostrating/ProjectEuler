import itertools

def subsets(): # This is still taking a lot of memory and does not work as a generators
    perms = itertools.dropwhile(lambda x: sum(x) != 9, itertools.permutations(range(99999), 3)) 
    for i in perms:
        yield i

count = 0
for s in subsets():
    count += 1
    print(s)
    if count > 9:
        0 / 0

# 9	4,2,3; 5,3,1; 6,1,2
# 9	4,3,2; 6,2,1; 5,1,3
# 10	2,3,5; 4,5,1; 6,1,3
# 10	2,5,3; 6,3,1; 4,1,5
# 11	1,4,6; 3,6,2; 5,2,4
# 11	1,6,4; 5,4,2; 3,2,6
# 12	1,5,6; 2,6,4; 3,4,5
# 12	1,6,5; 3,5,4; 2,4,6