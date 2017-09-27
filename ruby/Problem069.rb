require "prime"


$primes = Prime.take(10).to_a

def phi(n) 
	n_divisors = n.prime_division.map(&:first)
	counter = 0
	# text = ""

	(1..n).each do |i|
		prime_divisors = i.prime_division.map(&:first)

		if ((n_divisors - prime_divisors).length == n_divisors.length)
			counter += 1
			# text += "#{i}, "
		end
	end

	# puts text

	return counter
end



max = 0
maxN = 0

(2..1_000).each do |n|


	v = (n / phi(n)) 
	if (max < v)
		max = v  
		maxN = n
	end
end

puts ""
puts "N: #{maxN} \t max: #{max}"