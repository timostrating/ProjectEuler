require "prime"


primes = Prime.take(50)
max = 1_000_000;  number = 1;  i = 0

while (number < max)
	number *= primes[i]
	i += 1
end

puts number / primes[i-1]









###################
## _The_Old_Way_ ##
###################

# $primes = Prime.take(10).to_a

# def phi(n) 
# 	n_divisors = n.prime_division.map(&:first)
# 	counter = 0
# 	text = ""

# 	(1..n).each do |i|
# 		prime_divisors = i.prime_division.map(&:first)

# 		if ((n_divisors - prime_divisors).length == n_divisors.length)  # <-- this is a realy slow way of doing this
# 			counter += 1
# 			text += "#{i}, "s
# 		end
# 	end

# 	puts "#{n} \t #{counter} \t #{n / counter.to_f} \t #{text}" 

# 	return counter
# end



# max = 0
# maxN = 0

# (2..30).each do |n|
# 	v = (n / phi(n)) 
# 	if (max < v)
# 		max = v  
# 		maxN = n
# 	end
# end

# puts ""
# puts "N: #{maxN} \t max: #{max}"