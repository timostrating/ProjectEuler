def fib n1=1, n2=1, term=2
    return term if n2.to_s.length >= 1000
    return fib(n2, n1 + n2, term+=1)
end

puts fib()