require 'prime'

def combinations(items)
  return [] unless items.any?
  prefix = items[0]
  suffixes = combinations(items[1..-1])
  [[prefix]] + suffixes + suffixes.map {|item| [prefix] + item }
end





# (5..12).each do |d|
# 	out = 0
# 	(1..(d-1)).each do |n|
# 		if (Rational(n, d).denominator == d)
# 			out += 1
# 		end  
# 	end
	
# 	if Rational(out, d-1) < Rational(15499, 94744)
# 		puts "----------------------------------"
# 		puts "#{d} _ #{Rational(out, d-1)}"
# 		puts "----------------------------------\n\n"
# 		return
# 	else
# 		puts "#{d} _ #{Rational(out, d-1)}"
# 	end
# end



# d = 12
# 	out = 0
# 	(1..(d-1)).each do |n|
# 		puts Rational(n, d)
# 		if (Rational(n, d).denominator == d)
# 			out += 1
# 		end  
# 	end
	
# 	if Rational(out, d-1) < Rational(15499, 94744)
# 		puts "----------------------------------"
# 		puts "#{d} _ #{Rational(out, d-1)}"
# 		puts "----------------------------------\n\n"
# 		# return
# 	else
# 		puts "#{d} _ #{Rational(out, d-1)}"
# 	end


# puts "\n\n\n\n"

LOWEST = [[0, 100]]

def R(i)
	total = 0
	minus = 0
	map =  i.prime_division.map(&:first)
	com = combinations(map)

	(0...com.length).each do |j|           # [2], [3], [5], [2,3], [3,5], [3,5], [2,3,5]
		if map.length > j 
			total += (i / map[j]) -1
			# puts "(#{i} / #{map[j]}) -1 = #{(i/map[j]) -1}"
		else 
			value = 1
			((0)...com[j].length).each do |k|
				value *= com[j][k]
			end
			minus = (com[j].length % 2 == 0)? minus + ((i / value) -1) : minus - ((i / value) -1)
			# puts "\t\t (#{i} / (#{value})) -1 = #{(i / value) -1}"
		end
	end

	# puts "\t\t\t\t#{i}:  #{total} - #{minus} = #{total-minus}"

	n = i - (total - minus) - 1
	d = i -1

	percentage = 100 / d.to_f * n
	if LOWEST.last.last > percentage
		LOWEST << [i, percentage]
	end

	return Rational(n, d)
end


MAX = 900_000_000
d = 0
while d < MAX
	d += 2 * 3 * 5 * 7 * 11 * 13 * 17
	if R(d) < Rational(15499, 94744)
	# puts R(d)

	# if d > 1_000_00
		puts "----------------------------------"
		puts "#{LOWEST}"
		puts "----------------------------------\n\n"
		return
	else
		puts "nope"
	end
end



# 6, 12, 18, 24, 30, 60, 90, 120, 150, 180, 210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 4620, 6930, 9240, 11550, 13860, 16170, 18480, 20790, 23100, 25410, 27720, 30030, 60060, 90090, 


#                                                                                                 1/2
#                                                                                           1/3   2/3
#                                                                                     1/4   2x4   3/4
#                                                                               1/5   2/5   3/5   4/5
#                                                                         1/6   2x6   3x6   4x6   5/6
#                                                                   1/7   2/7   3/7   4/7   5/7   6/7
#                                                             1/8   2x8   3/8   4x8   5/8   6x8   7/8
#                                                        1/9  2/9   3x9   4/9   5/9   6x9   7/9   8/9
#                                                 1/10  2x10  3/10  4x10  5x10  6x10  7/10  8x10  9/10
#                                           1/11  2/11  3/11  4/11  5/11  6/11  7/11  8/11  9/11 10/11
#                                     1/12  2x12  3x12  4x12  5/12  6x12  7/12  8x12  9x12 10x12 11/12
#                               1/13  2/13  3/13  4/13  5/13  6/13  7/13  8/13  9/13 10/13 11/13 12/13
#                         1/14  2x14  3/14  4x14  5/14  6x14  7x14  8x14  9/14 10x14 11/14 12x14 13/14
#                   1/15  2/15  3x15  4/15  5x15  6/15  7/15  8/15  9x15 10x15 11/15 12x15 13/15 14/15
#             1/16  2x16  3/16  4x16  5/16  6x16  7/16  8x16  9/16 10x16 11/16 12x16 13/16 14x16 15/16
#       1/17  2/17  3/17  4/17  5/17  6/17  7/17  8/17  9/17 10/17 11/17 12/17 13/17 14/17 15/17 16/17
# 1/18  2x18  3x18  4x18  5/18  6x18  7/18  8x18  9x18 10x18 11/18 12x18 13/18 14x18 15/18 16x18 17/18




# A positive fraction whose numerator is less than its denominator is called a proper fraction.
# For any denominator, d, there will be d−1 proper fractions; for example, with d = 12:
# 1/12 , 2/12 , 3/12 , 4/12 , 5/12 , 6/12 , 7/12 , 8/12 , 9/12 , 10/12 , 11/12 .

# We shall call a fraction that cannot be cancelled down a resilient fraction.
# Furthermore we shall define the resilience of a denominator, R(d), to be the ratio of its proper fractions that are resilient; for example, R(12) = 4/11 .
# In fact, d = 12 is the smallest denominator having a resilience R(d) < 4/10 .

# Find the smallest denominator d, having a resilience R(d) < 15499/94744 .