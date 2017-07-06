require "prime"


puts 1_000_000_000.prime_division.map().inspect

###################################################################

(1..999).each do |i| 
	text = ""
	i.times { text += "1" }

	puts (text.to_i).prime_division.map(&:first).inspect
end

###################################################################

def prime_division(v)
	array = []
	value = v
	i = 2

	if Prime.prime? v
		return array << v
	end

	while i <= Math.sqrt(value)
		if Prime.prime? i
			if (value / i.to_f).to_i == ((value / i.to_f) + 0.9999999).to_i
				array << i
				value = value / i

				if Prime.prime? value 
					array << value
					return array
				end
				i -= 1
			end
		end

		i += 1
	end

	puts "You World of Tanks m8"
	return array   # ???
end

###################################################################

array = []
(1..6).each do |i|
	text = ""
	(2**i).times { text += "1" }

	value = text.to_i
	(0...array.length).each do |j|
		value /=  array[j]
	end

	array += prime_division(value)
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


###################################################################


11              = 11
3 * 37          = 111

41 * 271        = 11111

239 * 4649      = 1111111

		1 							-
2  		11     						11 										
3  		111     					3, 37 									
2 2  	1111     					11, 101 								
5  		11111     					41, 271 								
2 3  	111111     					3, 7, 11, 13, 37 						
7  		1111111     				239, 4649								
2 2 2  	11111111     				11, 73, 101, 137								
3 3   	111111111    				3, 37, 333667							
2 5 	1111111111     				11, 41, 271, 9091							
11 		11111111111     			21649, 513239							 
2 2 3 	111111111111     			3, 7, 11, 13, 37, 101, 9901				 		
13 		1111111111111     			53, 79, 265371653						 
2 7 	11111111111111     			11, 239, 4649, 909091					 	
3 5 	111111111111111     		3, 31, 37, 41, 271, 2906161				 	
2 2 2 2 1111111111111111     		11, 17, 73, 101, 137, 5882353					
17 		11111111111111111     		2071723, 5363222357						
2 3 3 	111111111111111111     		3, 7, 11, 13, 19, 37, 52579, 333667					
19 		1111111111111111111     	1111111111111111111 					
2 2 5	11111111111111111111     	11, 41, 101, 271, 3541, 9091, 27961 	
3 7 	111111111111111111111     	3, 37, 43, 239, 1933, 4649, 10838689 	
2 11 	1111111111111111111111     	11, 23, 4093, 8779, 21649, 513239 		



 2*5 = 10 
 1 000 000 000