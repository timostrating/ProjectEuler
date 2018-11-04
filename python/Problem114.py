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



min_car_lenth = 3

@memoize
def counting_block(spaces, first_time=True):  
    if spaces < min_car_lenth: # less than 3 spots has no solution
        return 0

    count = 0
    if first_time == True:  # first time running
        spaces += 1  

    for auto_lengte in range(min_car_lenth, spaces): # Loop posible car lenths
        for space_left in range(spaces - auto_lengte):         # loop posible start positions
            spaceright = spaces - (space_left + auto_lengte + 1)   # calculate the space that is left
            count += 1 + counting_block(spaceright, False)                    # recursive call

    return count + 1 if first_time == True else count



print(counting_block(50))



# count    1           2          3

# 3        8           4          2           
# 4        16          7          4
# 5        32          12         7
# 6        64          21         11
# 7        128         37         17
# 8        256         65         27
# 9        512         114        44
# 10       1024        200        72
# 11       2024        351        117
# 12       4096        616        189
