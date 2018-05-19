n = 1
$p3s = []; $p4s = []; $p5s = []; $p6s = []; $p7s = []; $p8s = [] 

(50..150).each do |n| 
    $p3 = n * (n + 1) / 2
    $p3s << "#{$p3}" if $p3 > 1_000 && $p3 < 10_000  # 91
    
    $p4 = n**2
    $p4s << "#{$p4}" if $p4 > 1_000 && $p4 < 10_000  # 50
    
    $p5 = n * (3*n - 1) / 2
    $p5s << "#{$p5}" if $p5 > 1_000 && $p5 < 10_000  # 32

    $p6 = n * (2*n - 1)
    $p6s << "#{$p6}" if $p6 > 1_000 && $p6 < 10_000  # 21

    $p7 = n * (5*n - 3) / 2
    $p7s << "#{$p7}" if $p7 > 1_000 && $p7 < 10_000  # 14

    $p8 = n * (3*n - 2)
    $p8s << "#{$p8}" if $p8 > 1_000 && $p8 < 10_000  # 9
end
 
puts "#{$p3s}\n\n"
puts "#{$p4s}\n\n"
puts "#{$p5s}\n\n"
puts "#{$p6s}\n\n"
puts "#{$p7s}\n\n"
puts "#{$p8s}\n\n"

def get_matching(curvalue) 
    w_index = W(curvalue)

    set = []
    set << $p3s if w_index != 3
    set << $p4s if w_index != 4
    set << $p5s if w_index != 5
    set << $p6s if w_index != 6
    set << $p7s if w_index != 7
    set << $p8s if w_index != 8
    set.flatten!

    return set.select{|x| x.index("#{curvalue[2]}#{curvalue[3]}") == 0}
end

def W(i) 
    return 3 if($p3s.index(i) != nil)
    return 4 if($p4s.index(i) != nil)
    return 5 if($p5s.index(i) != nil)
    return 6 if($p6s.index(i) != nil)
    return 7 if($p7s.index(i) != nil)
    return 8 if($p8s.index(i) != nil)
end

count = 0

$p3s.map { |i| wi = W(i)
    get_matching(i).map{|j| wj = W(j) 
        get_matching(j).map{|k| wk = W(k)            
            get_matching(k).map{|l| wl = W(l)
                get_matching(l).map{|m| wm = W(m)
                    get_matching(m).map{|n| wn = W(n)
                        puts "#{W(i)}:#{i} - #{W(j)}:#{j} - #{W(k)}:#{k} - #{W(l)}:#{l} - #{W(m)}:#{m} - #{W(n)}:#{n} \t\tsum: #{i.to_i + j.to_i + k.to_i + l.to_i + m.to_i + n.to_i} \t\t count: #{count += 1}" if (n[2] == i[0] && n[3] == i[1])
                    } if (i != m  &&  j != m  &&  k != m  &&  l != m)
                } if (i != l  &&  j != l  &&  k != l )
            } if (i != k  &&  j != k)
        } if (i != j) 
    } 
}