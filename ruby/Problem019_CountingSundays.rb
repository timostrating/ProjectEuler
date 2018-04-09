require 'date'
 
start = Date.new(1901, 1, 1)
endd = Date.new(2000, 12, 31)
c = 0
while start < endd do
  c += 1 if start.wday == 0
  start = start >> 1
end
puts c