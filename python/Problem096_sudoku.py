sudoku = [
    [0,0,3, 0,2,0, 6,0,0],
    [9,0,0, 3,0,5, 0,0,1],
    [0,0,1, 8,0,6, 4,0,0],

    [0,0,8, 1,0,2, 9,0,0],
    [7,0,0, 0,0,0, 0,0,8],
    [0,0,6, 7,0,8, 2,0,0],

    [0,0,2, 6,0,9, 5,0,0],
    [8,0,0, 2,0,3, 0,0,9],
    [0,0,5, 0,1,0, 3,0,0],
]


def is_valid_horizontal(y, x):
    for i in range(0, 9):
        if i != x and sudoku[y][i] == sudoku[y][x]:
            return False
    return True

def is_valid_vertical(y, x):
    for i in range(0, 9):
        if i != y and sudoku[i][x] == sudoku[y][x]:
            return False
    return True

def is_valid_sqaure(y, x):
    y_ish = y - (y % 3)
    x_ish = x - (x % 3)

    for i in range(0, 3):
        for j in range(0, 3):
            if sudoku[y_ish + i][x_ish + j] == sudoku[y][x]:
                if y_ish + i != y or x_ish + j != x:
                    return False
    return True

def is_valid(y, x):
    return is_valid_horizontal(y, x) and is_valid_vertical(y, x) and is_valid_sqaure(y, x)

def print_sudoku():
    for i in range(9):
        print(sudoku[i])
    print()

def next(y, x):
    if x == 8:
        solve(y+1, 0)
    else:
        solve(y, x+1)

def solve(y, x):
    if y < 9 and sudoku[y][x] != 0:
        next(y, x)
    else:
        if y < 9:
            for v in range(1, 9+1):
                sudoku[y][x] = v
                if is_valid(y, x):
                    print_sudoku()
                    next(y, x)
                sudoku[y][x] = 0
        elif y == 9 and x == 0:
            print_sudoku()
            exit()


if __name__ == "__main__":
    solve(0, 0)