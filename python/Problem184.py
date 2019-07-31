SIZE = 2

def valid_tiangle(p1x,p1y, p2x,p2y, p3x,p3y):
    if (p1x == p2x and p1y == p2y) or (p2x == p3x and p2y == p3y) or (p1x == p3x and p1y == p3y):
        return False
    return not ((p1x == p2x and p1x == p3x) or (p1y == p2y and p1y == p3y))

def sign(p1x,p1y, p2x,p2y, p3x,p3y):
    return (p1x - p3x) * (p2y - p3y) - (p2x - p3x) * (p1y - p3y)

def CenterInTriangle(ptx,pty, v1x,v1y, v2x,v2y, v3x,v3y):
    d1=0.0; d2=0.0; d3=0.0
    has_neg=False; has_pos=False

    d1 = sign(ptx,pty, v1x,v1y, v2x,v2y)
    d2 = sign(ptx,pty, v2x,v2y, v3x,v3y)
    d3 = sign(ptx,pty, v3x,v3y, v1x,v1y)


    has_neg = (d1 < 0) or (d2 < 0) or (d3 < 0)
    has_pos = (d1 > 0) or (d2 > 0) or (d3 > 0)

    print("\nCenterInTriangle")
    print(p1x,p1y, "  ", p2x,p2y, "  ", p3x,p3y)
    print(d1, d2, d3)
    print(not (has_neg and has_pos))

    return not (has_neg and has_pos)


count = 0
for p1x in range(-SIZE+1, SIZE+1):
    for p1y in range(-SIZE+1, SIZE+1):
        if p1x**2 + p1y**2 < SIZE**2:

            for p2x in range(-SIZE+1, SIZE+1):
                for p2y in range(-SIZE+1, SIZE+1):
                    if p2x**2 + p2y**2 < SIZE**2:

                        for p3x in range(-SIZE+1, SIZE+1):
                            for p3y in range(-SIZE+1, SIZE+1):
                                if p3x**2 + p3y**2 < SIZE**2:
                                    if valid_tiangle(p1x,p1y, p2x,p2y, p3x,p3y):
                                        if CenterInTriangle(-0.1, -0.1, p1x,p1y, p2x,p2y, p3x,p3y) and CenterInTriangle(0.1, 0.1, p1x,p1y, p2x,p2y, p3x,p3y):
                                            print(p1x,p1y, "  ", p2x,p2y, "  ", p3x,p3y)




    
#                                             count += 1
# print(count)