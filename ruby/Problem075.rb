# thanks for the mathematical explenation 3Blue1Brown - https://www.youtube.com/watch?v=QJYmyhnaaek
require "prime"

$primes = Prime.take(10_000);
2
def canBeSimplefied(a, b, c) 
	max = Math.sqrt( (((a < b)? b : a) < c )? c : ((a < b)? b : a) )
	(0...$primes.length).each do |i|
		if (a % $primes[i] == 0  and  b % $primes[i] == 0  and  b % $primes[i] == 0)
			return true
		end

		if ($primes[i] > max)
			return false
		end
	end

	return false
end


MAX = 2_000_000
count = 0

array = [MAX+1]
(0..MAX).each do |i|
	array[i] = 0
end


(1..999).each do |u|
	((u+1)...999).each do |v|
		a = (u**2 - v**2).abs
		b = (2*u*v).abs
		c = (u**2 + v**2).abs

		length = a + b + c

		if length <= MAX
			if (canBeSimplefied(a,b,c) == false)
				array[length] += 1
				puts "#{a + b + c} cm \t #{u}\t #{v}\t\t (#{a}, #{b}, #{c})}"
				count += 1
			end
		end
	end
end

count2 = 0
(0..MAX).each do |i|
	if (array[i] == 1)
		count2 += 1
	end
end

puts "\n\n#{count} \t #{count2}" # 259195