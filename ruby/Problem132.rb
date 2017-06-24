require "prime"


# puts 1_000_000_000.prime_division.map().inspect


# (1..999).each do |i| 
# 	text = ""
# 	i.times { text += "1" }

# 	puts (text.to_i).prime_division.map(&:first).inspect
# end


array = []
(1..6).each do |i|
	text = ""
	(2**i).times { text += "1" }

	value = text.to_i
	(0...array.length).each do |j|
		value /=  array[j]
	end

	array += (value).prime_division.map(&:first)
	puts array.inspect
end

array = []
(1..6).each do |i|
	text = ""
	(5**i).times { text += "1" }

	value = text.to_i
	(0...array.length).each do |j|
		value /=  array[j]
	end

	array += (value).prime_division.map(&:first)
	puts array.inspect
end




# 11              = 11
# 3 * 37          = 111
# 
# 41 * 271        = 11111
# 
# 239 * 4649      = 1111111

