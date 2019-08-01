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
def total_posibilities(places, car_length):
    if places < car_length:
        return 0
    
    if places == car_length:
        return 1

    count = 0
    for space_left in range(places - car_length + 1):
        space_right = places - (space_left + car_length)
        count += 1 + total_posibilities(space_right, car_length)
    return count

print(total_posibilities(50, 2) + total_posibilities(50, 3) + total_posibilities(50, 4))