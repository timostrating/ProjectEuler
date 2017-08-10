def magic( n ) 
	sum = 0
	((n-1)..(n*2)).each do |x| 
		if (1 == (Rational(1, n) - Rational(1, x)).numerator)
			sum += 1
		end
	end

	return sum
end


# puts magic(1260)

(4..999_999).each do |x| 
	value = magic(x)
	puts "#{x} - #{value}"

	if value > 1000
		puts "___#{x}___ - #{value}"
		return
	end
end