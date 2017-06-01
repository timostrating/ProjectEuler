MAX = 12_000

array = []
(1..MAX).each do |i|
	(1..i).each do |j|
		value = Rational(j, i)
		if(value > Rational(1, 3) && value < Rational(1, 2))
			array << value
		end
	end
end

array.uniq!
puts array.length