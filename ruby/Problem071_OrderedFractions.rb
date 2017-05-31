MAX = 1_000_000

array = []
(MAX).downto(1) do |i|
	(1..i).each do |j|
		value = Rational(j, i)
		break  if (value > Rational(3,7))
		array << value  if (value > Rational(2,5))
	end

	array.uniq!
	array.sort!
	array = array[(array.length/2)..array.length]
	puts array.inspect
	puts "----------------"
end