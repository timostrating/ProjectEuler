def generate_primes(n): 
    size = n//2
    sieve = [1]*size
    limit = int(n**0.5)
    for i in range(1,limit):
        if sieve[i]:
            val = 2*i+1
            tmp = ((size-1) - i)//val 
            sieve[i+val::val] = [0]*tmp
    return [2] + [i*2+1 for i, v in enumerate(sieve) if v and i>0]


PANDIGITAL_SET = set([1,2,3,4,5,6,7,8,9])
PRIMES = []
for p in generate_primes(98765439):
    if str(p).__contains__("0"):
        continue
    if len(str(p)) == len(set(str(p))):
        PRIMES.append(p)

print("PRIMES GENERATED")


COUNT = 0
def loop(*ps):
    data = set()
    for s in ps:
        for c in str(s):
            data.add(int(c))

    if data == PANDIGITAL_SET:
        global COUNT
        print(ps)
        COUNT += 1

    for p in PRIMES:
        if len(ps) > 0 and ps[-1] <= p:
            break

        new_data = data.copy()
        for c in str(p):
            new_data.add(int(c))
            
        if len(str(p)) + len(data) > len(PANDIGITAL_SET):
            break

        if len(str(p)) + len(data) == len(new_data):
            yield p


for p1 in loop():
    for p2 in loop(p1):
        for p3 in loop(p1,p2):
            for p4 in loop(p1,p2,p3):
                for p5 in loop(p1,p2,p3,p4):
                    for p6 in loop(p1,p2,p3,p4,p5):
                        for p7 in loop(p1,p2,p3,p4,p5,p6):
                            print(p1, p2, p3, p4, p5, p6, p7)

print(COUNT)
                        
"""
Using all of the digits 1 through 9 and concatenating them freely to form decimal integers, different sets can be formed. 
Interestingly with the set {2,5,47,89,631}, all of the elements belonging to it are prime.

How many distinct sets containing each of the digits one through nine exactly once contain only prime elements?
"""