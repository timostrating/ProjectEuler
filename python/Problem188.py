v_mod_mil_to_power = {}
v = 1
for power in range(1, 10**7):
    v *= 1777
    v %= 10**20
    w = v % 10**8
    if v_mod_mil_to_power.__contains__(w):
        v_mod_mil_to_power[w].append(power)
    else:
        v_mod_mil_to_power[w] = [power]

    # if (power == 76593):
    #     print(v)
    #     print(0 / 0)

print(v_mod_mil_to_power)