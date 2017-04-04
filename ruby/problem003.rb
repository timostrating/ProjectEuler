
highest = 1

(2..13194).each do |v|
  highest = v if 13195 % v == 0
end

puts highest

# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?