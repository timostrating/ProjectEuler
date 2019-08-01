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

min_car_length = 2

@memoize
def total_posibilities(places):
    if places < min_car_length:
        return 0
    
    if places == min_car_length:
        return 1

    count = 0
    for car_length in range(2, 4+1):
        for space_left in range(places - car_length + 1):
            space_right = places - (space_left + car_length)
            count += 1 + total_posibilities(space_right)
    return count

print(1 + total_posibilities(50))