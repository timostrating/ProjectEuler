def x_inner(i, j)
  if(i == j)
    return Rational(1, ((i % 3 == 1)? ((i / 3).floor + 1) * 2 : 1))
  else
    return Rational(1, ((i % 3 == 1)? ((i / 3).floor + 1) * 2 : 1)  + x_inner(i += 1, j))
  end
end

def x(j)
  return 2 + x_inner(0, (j-2))
end

def xn(j)
  sum = 0
  text = x(j).numerator.to_s
  (0..text.length).each do |i|
    sum += text[i].to_i
  end
  return sum
end

puts xn(100)
