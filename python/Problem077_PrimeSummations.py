def memoize(function):
    from functools import wraps
    cache = {}
    @wraps(function)
    def wrapper(*args):
        if args in cache:
            return cache[args]
        else:
            rv = function(*args)
            cache[args] = rv
            return rv
    return wrapper

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


PRIMES = generate_primes(5000)

@memoize
def counting_block(spaces, value_left):  
    if spaces == 0:
        return 1   

    count = 0
    i = 0
    while PRIMES[i] <= min(spaces, value_left):
        count += counting_block(spaces - PRIMES[i], PRIMES[i])
        i += 1

    return count


n = 10
while counting_block(n, n) < 5000:
    n += 1
    
print(n)