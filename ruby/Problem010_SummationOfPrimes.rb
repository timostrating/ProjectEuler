require 'prime'
num = 0; 2_000_000.times {|i| puts num+=i if Prime.prime?(i)}


# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
# Find the sum of all the primes below two million.