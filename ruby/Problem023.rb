MAX = 28123

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

def combination_in_list n, list
    (0...list.length).each do |j|
        if list.include?(n / list[j])
            return true
        end
    end

    return false
end


sum = 0
list_abundant = []
(2..MAX).each do |i|
    v = proper_deviders_sum(i)
    if i < v
        list_abundant << i
    end

    if combination_in_list(i, list_abundant) == false
        puts i
        sum += i
    end
end

puts "#{sum}: sum"