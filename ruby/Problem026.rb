require "prime"


primes = Prime.first(200)
(2...primes.length).each do |i|
    if primes[i] < 1000
        puts "#{primes[i]} \t #{Rational(1,primes[i]).to_f}"
    end
end