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


def counting_block(spaces):  
    return counting_block_inner(spaces, spaces)

@memoize
def counting_block_inner(spaces, value_left):  
    if spaces == 1 or spaces == 0:
        return 1   
    
    count = 0
    for nr in range(1, min(spaces, value_left)+1):
        count += counting_block_inner(spaces - nr, nr)
        
    return count


n = 4
v = counting_block(n)
while v % 1000000 != 0:
    n += 1
    v = counting_block(n)
    print(n, v)

print("\n", n, v)