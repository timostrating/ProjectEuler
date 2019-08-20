import sys
import threading

MAX = 12000
QQQ = 99999999999

results = [QQQ] * (MAX + 1)


################################
##  DO NOT TRUST THE RESULTS  ##
################################


def magic(muls, sums, depth):
    if depth >= MAX:
        return
    
    for i in range(1, MAX // 2**(depth-1)):
        muls_copy = int(str(muls))
        sums_copy = int(str(sums))

        muls_copy *= i
        sums_copy += i
        diff = muls_copy - sums_copy

        if diff == 0:
            if results[depth] > muls_copy:
                results[depth] = muls_copy

        elif diff > 0:
            if depth + diff <= MAX and results[depth + diff] > muls_copy:
                results[depth + diff] = muls_copy
                
        else: # diff < 0
            magic(muls_copy, sums_copy, depth + 1)


def main():
    for i in range(1, (MAX // 2)+1):
        magic(i, i, 2)

    print(results)
    print(sorted(list(set(results))))

    final = set()
    for v in results:
        if v != QQQ:
            final.add(v)
    
    print("\n")
    print(sum(final))


sys.setrecursionlimit(10**7)  # max depth of recursion
threading.stack_size(2**27)   # new thread will get stack of such size
threading.Thread(target=main).start()