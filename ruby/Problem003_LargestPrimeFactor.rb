require 'prime'

(2..Math.sqrt(600851475143)).each do |v|
  puts v  if  600851475143 % v == 0  and  Prime.prime?(v) 
end