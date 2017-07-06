count = 0
cur_value = 1

while cur_value < 22_786_974_071
    text = cur_value.to_s

    (0...text.length).each do |i| 
        if text[i] == "1"
            count += 1
        end
    end

    if cur_value < count
        puts " <\t\t\t #{cur_value}"
    elsif cur_value > count
        puts "\t\t >\t #{cur_value}"
    else
        puts "\t= \t\t #{cur_value}"
    end

    cur_value += 1
end

puts total













 # Note that f(n,1) never equals 3.
 # So the first two solutions of the equation f(n,1)=n are n=0 and n=1. The
 # next solution is n=199981.

 # In the same manner the function f(n,d) gives the total number of digits d
 # that have been written down after the number n has been written.
 # In fact, for every digit d 0, 0 is the first solution of the equation
 # f(n,d)=n.

 # Let s(d) be the sum of all the solutions for which f(n,d)=n.
 # You are given that s(1)=22786974071.

 # Find s(d) for 1 d 9.