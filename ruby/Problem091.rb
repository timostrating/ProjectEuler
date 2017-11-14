count = 0
MAX = 50

count += MAX * MAX * 3;   # This caculates the majority of triagles
(1..(MAX / 2).floor).each do |i|
    count += i
end

puts count;




*  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X  *  X
*  *  X  *  X  *  X  *  X
*  X  *  X  *  X  *  X
*  *  X  *  X  *  X
*  X  *  X  *  X
*  *  X  *  X
*  X  *  X
*  *  X
*  X
*