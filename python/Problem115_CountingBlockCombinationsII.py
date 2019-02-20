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



@memoize
def counting_block(m, n, first_time=True):  
    if n < m: # less than 3 spots has no solution
        return 0

    count = 0
    if first_time == True:  # first time running
        n += 1  

    for auto_lengte in range(m, n): # Loop posible car lenths
        for space_left in range(n - auto_lengte):         # loop posible start positions
            space_right = n - (space_left + auto_lengte + 1)   # calculate the space that is left
            count += 1 + counting_block(m, space_right, False)                    # recursive call

    return count + 1 if first_time == True else count


value = 0
i = 50
while value < 1_000_000:
    i += 1
    value = counting_block(10, i)

print(i, value)