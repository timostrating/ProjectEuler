sudoku = [
	[ 0, 0, 3,  0, 2, 0,  6, 0, 0 ],
	[ 9, 0, 0,  3, 0, 5,  0, 0, 1 ],
	[ 0, 0, 1,  8, 0, 6,  4, 0, 0 ],

	[ 0, 0, 8,  1, 0, 2,  9, 0, 0 ],
	[ 7, 0, 0,  0, 0, 0,  0, 0, 8 ],
	[ 0, 0, 6,  7, 0, 8,  2, 0, 0 ],

	[ 0, 0, 2,  6, 0, 9,  5, 0, 0 ],
	[ 8, 0, 0,  2, 0, 3,  0, 0, 9 ],
	[ 0, 0, 5,  0, 1, 0,  3, 0, 0 ]
]


def row_check(sudoku, y, v)
	(0...9).each do |i|
		return false if sudoku[y][i] == v
	end
	return true
end

def col_check(sudoku, x, v)
	(0...9).each do |i|
		return false if sudoku[i][x] == v
	end
	return true
end

def grid_check(sudoku, x, y, v)
	y_i = (x/3).to_i * 3
	x_i = (y/3).to_i * 3

	(x_i...(x_i+3)).each do |x|
		(y_i...(y_i+3)).each do |y|
			return false if sudoku[y][x] == v
		end
	end

	return true
end

def get_next_cell(sudoku)
	(0...9).each do |y|
		(0...9).each do |x|
			if(sudoku[y][x] == 0)
				return x, y
			end
		end
	end

	return false
end

def print_sudoku(sudoku)
	(0...9).each do |y|
		puts "#{sudoku[y]}"
	end
	puts ""
end

def SolveSudoku(sudoku)
	pos = get_next_cell(sudoku)
	if (pos == false)
		return true 
	end

	x = pos[0]
	y = pos[1]

	(1..9).each do |v|
		puts "x: #{x}  y: #{y}  v:#{v}"

		if (row_check(sudoku, y, v) && col_check(sudoku, x, v) && grid_check(sudoku, x, y, v))
			sudoku[y][x] = v

			print_sudoku(sudoku)

			# if(y == 1)
			# 	0/0
			# end

			if (SolveSudoku(sudoku))
				return true
			end

			sudoku[y][x] = 0
		end
	end

	return false  # this triggers backtracking
end	


if(SolveSudoku(sudoku))
	print_sudoku(sudoku)
else 	
	puts "____#{sudoku}"
end

# y = 0
# x = 1
# v = 4

# puts (row_check(sudoku, y, v))
# puts (col_check(sudoku, x, v))
# puts (grid_check(sudoku, x, y, v))
# puts "------ +"
# puts (row_check(sudoku, y, v) && col_check(sudoku, x, v) && grid_check(sudoku, x, y, v))


#   | 4 8 3 | 9 2 1 | 6 5 7 |
#   | 9 6 7 | 3 4 5 | 8 2 1 |
#   | 2 5 1 | 8 7 6 | 4 9 3 |
#   |-------+-------+-------|
#   | 5 4 8 | 1 3 2 | 9 7 6 |
#   | 7 2 9 | 5 6 4 | 1 3 8 |
#   | 1 3 6 | 7 9 8 | 2 4 5 |
#   |-------+-------+-------|
#   | 3 7 2 | 6 8 9 | 5 1 4 |
#   | 8 1 4 | 2 5 3 | 7 6 9 |
#   | 6 9 5 | 4 1 7 | 3 8 2 |