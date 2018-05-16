#   GO   A1  CC1  A2  T1  R1  B1  CH1  B2   B3  JAIL
#   H2                                          C1
#   T2                                          U1
#   H1                                          C2
#   CH3                                         C3
#   R4                                          R2
#   G3                                          D1
#   CC3                                         CC2
#   G2                                          D2
#   G1                                          D3
#   G2J  F3  U2   F2  F1  R3  E3  E2   CH2  E1  FP

#   GO, JAIL, GRJ, FP
#   R1,  R2,  R3,  R4       railway
#   CC1, CC2, CC3 
#   CH1, CH2, CH3
#   T1,  T2
#   U1,  U2

#   A1,  A2 
#   B1,  B2,  B3
#   C1,  C2,  C3
#   D1,  D2,  D3
#   E1,  E2,  E3
#   F1,  F2,  F3
#   G1,  G2,  G3
#   H1,  H2



# * Community Chest (2/16 cards):

# 1. Advance to GO
# 2. Go to JAIL


# * Chance (10/16 cards):

# 1. Advance to GO
# 2. Go to JAIL
# 3. Go to C1
# 4. Go to E3
# 5. Go to H2
# 6. Go to R1
# 7. Go to next R
# 8. Go to next R
# 9. Go to next U
# 10. Go back 3 squares



MAX = 100_000
DICE_SIDES = 4
BOARD_SIZE = 40

board = ["GO", "A1", "CC1", "A2", "T1", "R1", "B1", "CH1", "B2", "B3", "JAIL", "C1", "U1", "C2", "C3", "R2", "D1", "CC2", "D2", "D3", "FP", "E1", "CH2", "E2", "E3", "R3", "F1", "F2", "U2", "F3", "GRJ", "G1", "G2", "CC3", "G3", "R4", "CH3", "H1", "T1", "H2"]
chance = ["GO", "JAIL", "C1", "E3", "H2", "R1", "next R", "next R", "next U", "Go back 3 squares", "", "", "", "", "", ""]
communityCest = ["GO", "JAIL", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
scores = Array.new(40) { 0 }

# puts board.index("GO")
# puts board.select{|x| x.index("CC") != nil}
cc1_index = board.index("CC1"); cc2_index = board.index("CC2"); cc3_index = board.index("CC3");
ch1_index = board.index("CH1"); ch2_index = board.index("CH2"); ch3_index = board.index("CH3");
grj_index = board.index("GRJ")
jail_index = board.index("JAIL")

index = 0
chance.shuffle!
communityCest.shuffle!

(0...MAX).each do
    scores[index] += 1;

    index += ((1 + Random.rand(DICE_SIDES)) + (1 + Random.rand(DICE_SIDES)))
    index %= BOARD_SIZE

    if index == grj_index
        index = jail_index;
    elsif (index == cc1_index || index == cc2_index || index == cc3_index) 
        new_index = board.index(chance[0])
        card = chance.shift
        chance.push card    

        if new_index != nil
            index = new_index
        end
    elsif (index == ch1_index || index == ch2_index || index == ch3_index) 
        new_index = board.index(communityCest[0])
        card = communityCest.shift
        communityCest.push card    

        if new_index != nil
            index = new_index
        end
    end
end


puts "#{scores}"
scores.map! {|n| n = n / MAX.to_f }
endscores = scores.sort
endscores.each {|v| i=scores.index(v); puts "#{i}: \t "+"#{board[i]}: \t #{v}" }