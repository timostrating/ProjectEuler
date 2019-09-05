# Using all of the digits 1 through 9 and concatenating them freely to form decimal integers, different sets can be formed. 
# Interestingly with the set {2,5,47,89,631}, all of the elements belonging to it are prime.

# How many distinct sets containing each of the digits one through nine exactly once contain only prime elements?

require 'prime'

primes = []
Prime.each(987654321) do |prime|
    if (prime.to_s.include? "0") == false
        if prime.to_s.split("").uniq.length == prime.to_s.split("").length
            primes << prime
        end
    end
end

puts "primes"