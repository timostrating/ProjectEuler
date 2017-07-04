require "prime"



array = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

(2..20).each do |i|
	i.prime_division.each do |j|
		if array[ j[0] ]  <  j[1]
			array[ j[0] ] = j[1]
		end
	end
end

puts array.inspect



out = 1

(2..20).each do |i|
	(0...array[i]).each do |j|
		out *= i
	end
end

puts out

   # 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   # What is the smallest number that is evenly divisible by all of the numbers from 1 to 20?
