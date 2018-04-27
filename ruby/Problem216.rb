require "prime"

def t(n) {
    return Prime.prime?( 2 * n**2 - 1)
}


total = 0
(0..100).each do |n|
    if Prime.prime?
        puts n
        
        if t(n)
            total += 1
        else 
            puts "RAAR"
        end
    end
end

puts total