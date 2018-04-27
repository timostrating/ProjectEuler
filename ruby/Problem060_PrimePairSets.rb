require "prime"
require "set"
max = 10_000

@primes = Prime.first(max*500);
@primeSet = Hash[@primes.map.with_index.to_a]

puts "primes generated - ready to go"

def concatNumbers(a,b)
    return a*(10 ** Math.log10(b+1).ceil) + b
end

def concatPrime(a, b)
    b1 = @primeSet.include?(concatNumbers(a,b))
    b2 = @primeSet.include?(concatNumbers(b,a))
    return (b1 && b2)
end


# 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71
# X, _  X  _  __  __  __  __  __  __  __

max.times do |i|  
    v1 = @primes[i]
    (max - i).times do |i2|  
        v2 = @primes[i2 +i]
        if(concatPrime(v1, v2))
            (max - i2).times do |i3|  
                v3 = @primes[i3 +i2]
                if(concatPrime(v1, v3) && concatPrime(v2, v3))
                    # puts "#{v1} #{v2} #{v3}"
                    (max - i3).times do |i4|  
                        v4 = @primes[i4 +i3]
                        if(concatPrime(v1, v4) && concatPrime(v2, v4) && concatPrime(v3, v4))
                            puts "#{v1} #{v2} #{v3} #{v4}"
                            (max - i4).times do |i5|  
                                v5 = @primes[i5 +i4]
                                if(concatPrime(v1, v5) && concatPrime(v2, v5) && concatPrime(v3, v5) && concatPrime(v4, v5))
                                    puts "#{v1+v2+v3+v4+v5}: \t #{v1} #{v2} #{v3} #{v4} #{v5} \t\t is prime set"            
                                    return "FOUND"
                                end
                            end
                        end
                    end 
                end
            end 
        end
    end 
end