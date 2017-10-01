require "prime"

def diophantine_reciprocals( n ) 
	sum = 0
	((n-1)..(n*2)).each do |x| 
		if (1 == (Rational(1, n) - Rational(1, x)).numerator)
			sum += 1
		end
	end

	return sum
end

# puts diophantine_reciprocals(2)  			# 2
# puts diophantine_reciprocals(6)  			# 2 * 3
# puts diophantine_reciprocals(30)  		# 2 * 3 * 5
# puts diophantine_reciprocals(210)  		# 2 * 3 * 5 * 7
# puts diophantine_reciprocals(2310)  		# 2 * 3 * 5 * 7 * 11
# puts diophantine_reciprocals(30030)  		# 2 * 3 * 5 * 7 * 11 * 13
# puts diophantine_reciprocals(510510)  	# 2 * 3 * 5 * 7 * 11 * 13 * 17  <-- this exceeds 1000
# puts diophantine_reciprocals(9699690) 	# 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19

 
# (2000..510510).each do |x|
# (510510 -1).downto(0) do |x|
	
plus = 2 * 3 * 5 * 7 * 11
x = plus
while (true)
	if (x % plus == 0)
		value = diophantine_reciprocals(x)
		puts "#{x} - #{value}"

		if value > 1000
			puts "___#{x}___ - #{value}"
			return
		end
	end

	x += plus
end




# puts "#{510408.prime_division}"  	# 510408 - 221			[2, 3], [3, 3], [17, 1], [139, 1]
# puts "#{510407.prime_division}"  	# 510407 - 5			[157, 1], [3251, 1]  
# puts "#{510406.prime_division}"  	# 510406 - 41			[2, 1], [13, 1], [67, 1], [293, 1] 
# puts "#{510405.prime_division}"  	# 510405 - 41			[3, 1], [5, 1], [7, 1], [4861, 1] 
# puts "#{510404.prime_division}"  	# 510404 - 8			[2, 2], [127601, 1]  
# puts "#{510403.prime_division}"  	# 510403 - 2			[510403, 1]  
# puts "#{510402.prime_division}"  	# 510402 - 41			[2, 1], [3, 1], [257, 1], [331, 1] 
# puts "#{510401.prime_division}"  	# 510401 - 2			[510401, 1]  
# puts "#{510400.prime_division}"  	# 510400 - 293			[2, 6], [5, 2], [11, 1], [29, 1]
# puts "#{510399.prime_division}"  	# 510399 - 8			[3, 2], [56711, 1]  
# puts "#{510398.prime_division}"  	# 510398 - 14			[2, 1], [7, 1], [36457, 1] 
# puts "#{510397.prime_division}"  	# 510397 - 5			[19, 1], [26863, 1]  
# puts "#{510396.prime_division}"  	# 510396 - 23			[2, 2], [3, 1], [42533, 1] 
# puts "#{510395.prime_division}"  	# 510395 - 5			[5, 1], [102079, 1]  