sum = 0

(3..1000).each do |a| 
    n = 1
    rmax = 0
    x = 0
    y = 0
    while(x + y != 2)
        x = ((a-1)**n) % (a ** 2)
        y = ((a+1)**n) % (a ** 2)
        r = (x + y)  %  (a ** 2)
        if rmax < r
            rmax = r
        end
        # puts "#{n}: \t  #{x} + #{y} % #{a**2} = #{r}"
        n += 1
    end

    sum += rmax
    puts "#{a}: \t #{rmax} \t #{sum}"
end

puts "sum: #{sum}"

# Let r be the remainder when (a−1)n + (a+1)n is divided by a2.
# For example, if a = 7 and n = 3, then r = 42: 63 + 83 = 728 ≡ 42 mod 49. 
# And as n varies, so too will r, but for a = 7 it turns out that rmax = 42.
# For 3 ≤ a ≤ 1000, find ∑ rmax.