def digitSum(number)
	text = number.to_s 
	sum = 0
	(0...text.length).each do |i|
		sum += text[i].to_i
	end

	return sum
end

array = []

i = 0
(2..200).each do |a|
	has_found_somthing = false
	(2..200).each do |n|
		if (a == digitSum(a ** n))
			i += 1
			puts "#{i}: #{a}^#{n} = #{a**n}"
			array << a**n
			has_found_somthing = true
		end
	end
end

puts "\n\n\n"

array.sort!
puts "#{array[30 -1]}"  # 248155780267521