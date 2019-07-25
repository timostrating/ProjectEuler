import itertools

OPERATIONS = ["+", "-", "*", "/"]

def maximum_arithmetic_expression_size(n=[1,2,3,4]):
    results = set()
    for s in itertools.permutations(itertools.chain(range(4), range(4), range(4)), 3):
        for m in itertools.permutations(range(4), 4):
            strings = (
                f"{n[m[0]]}  {OPERATIONS[s[0]]}  {n[m[1]]}  {OPERATIONS[s[1]]}  {n[m[2]]}  {OPERATIONS[s[2]]}  {n[m[3]]}",      # "1+2+3+4"
                f"({n[m[0]]}  {OPERATIONS[s[0]]}  {n[m[1]]})  {OPERATIONS[s[1]]}  {n[m[2]]}  {OPERATIONS[s[2]]}  {n[m[3]]}",    # "(1+2)+3+4"
                f"({n[m[0]]}  {OPERATIONS[s[0]]}  {n[m[1]]}  {OPERATIONS[s[1]]}  {n[m[2]]})  {OPERATIONS[s[2]]}  {n[m[3]]}",    # "(1+2+3)+4"
                f"(({n[m[0]]}  {OPERATIONS[s[0]]}  {n[m[1]]})  {OPERATIONS[s[1]]}  {n[m[2]]})  {OPERATIONS[s[2]]}  {n[m[3]]}",  # "((1+2)+3)+4"
                f"({n[m[0]]}  {OPERATIONS[s[0]]}  ({n[m[1]]}  {OPERATIONS[s[1]]}  {n[m[2]]}))  {OPERATIONS[s[2]]}  {n[m[3]]}",  # "(1+(2+3))+4"
                f"{n[m[0]]}  {OPERATIONS[s[0]]}  ({n[m[1]]}  {OPERATIONS[s[1]]}  {n[m[2]]})  {OPERATIONS[s[2]]}  {n[m[3]]}",    # "1+(2+3)+4"
                f"{n[m[0]]}  {OPERATIONS[s[0]]}  ({n[m[1]]}  {OPERATIONS[s[1]]}  {n[m[2]]}  {OPERATIONS[s[2]]}  {n[m[3]]})",    # "1+(2+3+4)"
                f"{n[m[0]]}  {OPERATIONS[s[0]]}  (({n[m[1]]}  {OPERATIONS[s[1]]}  {n[m[2]]})  {OPERATIONS[s[2]]}  {n[m[3]]})",  # "1+((2+3)+4)"
                f"{n[m[0]]}  {OPERATIONS[s[0]]}  ({n[m[1]]}  {OPERATIONS[s[1]]}  ({n[m[2]]}  {OPERATIONS[s[2]]}  {n[m[3]]}))",  # "1+(2+(3+4))"
                f"{n[m[0]]}  {OPERATIONS[s[0]]}  {n[m[1]]}  {OPERATIONS[s[1]]}  ({n[m[2]]}  {OPERATIONS[s[2]]}  {n[m[3]]})",    # "1+2+(3+4)"
                f"({n[m[0]]}  {OPERATIONS[s[0]]}  {n[m[1]]})  {OPERATIONS[s[1]]}  ({n[m[2]]}  {OPERATIONS[s[2]]}  {n[m[3]]})",  # "(1+2)+(3+4)"
            )

            for string in strings:
                try:
                    value = str(eval(string))
                    if value.endswith(".0"):
                        value = value.replace(".0", "")
                    if (value.__contains__(".") == False and value.__contains__("-") == False):
                        results.add(int(value))
                except:
                    pass

    
    i = 1
    while i in results:
        i += 1

    print(i-1, results)
    return i-1



high_score = ("TMP", 0)
MAX = 10

for a in range(1, MAX):
    for b in range(1, MAX):
        if a < b:
            for c in range(1, MAX):
                if b < c:
                    for d in range(1, MAX):
                        if c < d:
                            v = maximum_arithmetic_expression_size([a,b,c,d])
                            if (v > high_score[1]):
                                high_score = (f"{a} {b} {c} {d}", v)
                                print(f"\n\n\nNEW HIGH SCORE {high_score} \n\n\n")
                            else:
                                print("Sorry", f"{a} {b} {c} {d} \n")

# print(maximum_arithmetic_expression_size( [1, 3, 5, 8] ))
