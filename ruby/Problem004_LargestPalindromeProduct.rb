highest = 0

(0..999).each do |i| 
	(0..999).each do |j| 
		v = i * j
		highest = v  if  highest < v  and  v.to_s.reverse == v.to_s
	end
end

puts highest