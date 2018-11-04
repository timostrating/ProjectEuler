minimale_auto_lengte = 3

lookup_table = [0] * 51

def counting_block(parkeerplaatsen, geschiedenis=""):   # https://projecteuler.net/problem=114
    if parkeerplaatsen < minimale_auto_lengte: # We gaan recursief niet verder als we minder dan 3 plaatsen vrij hebben want een auto neemt minimaal 3 plaatsen in
        return 0

    if lookup_table[parkeerplaatsen] != 0:
        return lookup_table[parkeerplaatsen]
    
    count = 0
    if geschiedenis == "":                # Als we nog niet recursief ons zelf hebben aangeroepen hebben dan hebben we nog geen geschiedenis
        parkeerplaatsen += 1  

    for auto_lengte in range(minimale_auto_lengte, parkeerplaatsen): # Loop alle mogelijke lengtes dus van 3 tot 7 in dit geval
        for ruimte_links in range(parkeerplaatsen - auto_lengte):       # Stel we willen een auto van 3 lang plaatsen dan kan hij op 7 -3 verschillende plekken beginnen
            ruimte_recht = parkeerplaatsen - (ruimte_links + auto_lengte + 1)  # Rechts hebben wij nu nog ruimte vrij namelijk de ruimte die overblijft na ruimte links + 1 (omdat je anders niet weg kan rijden) ingenomen is.

            # print("_"*ruimte_links + geschiedenis, "X"*auto_lengte, "_"*ruimte_recht, sep="")

            count += 1 
            count += counting_block(ruimte_recht, ("_"*ruimte_links) + ("X"*auto_lengte) + "_")  # Roep ons zelf recursief aan en geef de geschidenis door

    if geschiedenis == "":  # we hebben een lege parkeerplaats
        # print("_"*parkeerplaatsen)
        return count + 1
    else:
        lookup_table[parkeerplaatsen] = count
        # print(count)
        return count
            

print(counting_block(50), "mogelijk heden")   # deze zou een antwoord moeten geven als je 50 in vult in plaats van 7



# count    1           2          3

# 3        8           4          2           
# 4        16          7          4
# 5        32          12         7
# 6        64          21         11
# 7        128         37         17
# 8        256         65         27
# 9        512         114        44
# 10       1024        200        72
# 11       2024        351        117
# 12       4096        616        189
