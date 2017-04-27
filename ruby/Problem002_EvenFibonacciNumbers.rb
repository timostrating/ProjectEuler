first = second = third = 1
total = 0

while third < 4_000_000 
	third = first + second
	first = second
	second = third

	total += second  if second % 2 == 0
end

puts total