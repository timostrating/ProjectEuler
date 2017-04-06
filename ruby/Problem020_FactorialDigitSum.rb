value = 1
ans = 0

(1..100).each { |v| value *= v }

text = value.to_s
(1..text.length).each do |i|
	ans += text[i].to_i
end

puts ans