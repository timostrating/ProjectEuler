cur = 0

class Integer
  def !
    (1..self).inject(:*) || 1
  end
end


# (0..10).each do |i|
# 	cur += Rational(1, !(i) ) /
# 	puts "#{cur} += #{Rational(1, !(i) )}"
# end


def e_inner(i, max, array)
	if (i == max)
		return Rational(2, array[i])
	else
		return Rational(2 + e_inner(i+=1, max, array), array[i])
	end
end

def e(max)
	array = [1,2, 1, 1,4,1, 1,6,1]
	return 1+ e_inner(0, max, array)
end

puts e(1)
puts e(2)
puts e(3)
puts e(4)
puts e(5)
puts e(6)
puts e(7)




# 2/1 		
# 3/1 		+ 1/1
# 8/3		+ 1/2
# 11/4		+ 1/12
# 19/7		- 1/28
# 87/32		+ 1/224
# 106/39
# 193/71
# 1264/465
# 1457/536