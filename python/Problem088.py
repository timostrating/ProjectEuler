MAX = 12
LOOPS = 3

def break_now(*n):
    ns = []
    for x in n:
        ns.append(x)
    for x in range(LOOPS):
        ns.append(n[-1])    

    mul = 1
    plus = 0
    for i in range(LOOPS):
        mul *= ns[i]
        plus += ns[i]

    return (mul) - (plus) > MAX - LOOPS


dictionary = {}

for a in range(1, MAX):
    if break_now(a):
            break
    
    for b in range(max(2,a), MAX // 4 + 1):
        if break_now(a, b):
            break

        for c in range(max(2,b), MAX // 2 +1):
            if break_now(a, b, c):
                break

            muls = (a * b * c)
            diff = muls - (a + b + c)
            print(f"{a}*{b}*{c} - {a}+{b}+{c} = {diff}")
            # if diff >= 0:  # Maybe we need this check
            if (LOOPS + diff >= 2 and LOOPS + diff <= MAX):
                if dictionary.__contains__(LOOPS + diff):
                    if dictionary[LOOPS + diff] > muls:
                        dictionary[LOOPS + diff] = muls
                else:
                    dictionary[LOOPS + diff] = muls

count_set = set(dictionary.values())
print(count_set)
print(sum(count_set))