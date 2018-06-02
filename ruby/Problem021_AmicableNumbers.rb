require "prime"

MAX = 10000

def proper_deviders_sum input
    sum = 1

    (2..Math.sqrt(input)).each do |i|
        if input % i == 0
            sum += i
            sum += input / i
        end
    end

    return sum
end


sum = 0
(1...MAX).each do |i|
    v1 = proper_deviders_sum(i)
    v2 = proper_deviders_sum(v1)

    if (i == v2 && v2 != v1)
        sum += i
    end

end

puts "sum: #{sum}"
