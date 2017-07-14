i = 1
number = 1

def get_amount_of_dividers( number ) 
	count = 0
	(1...Math.sqrt(number)).each do |i|
		if (number % i).to_i == 0
			count += 2
		end
	end

	return count
end

while get_amount_of_dividers( number ) < 500
	i += 1
	number += i
end

puts number