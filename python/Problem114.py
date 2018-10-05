auto_minimum_lengthe = 3


def counting_block(parkeerplaatsen, old=""):   # https://projecteuler.net/problem=114
    if parkeerplaatsen < auto_minimum_lengthe: # We gaan recursief niet verder als we minder dan 3 plaatsen vrij hebben want een auto neemt minimaal 3 plaatsen in
        return 0
    
    count = 0
    if old == "":                # Als we nog niet recursief ons zelf hebben aangeroepen hebben dan hebben we nog geen geschiedenis
        parkeerplaatsen += 1  

    for auto_lengte in range(auto_minimum_lengthe, parkeerplaatsen): # Loop alle mogelijke lengtes dus van 3 tot 7 in dit geval
        for ruimte_links in range(parkeerplaatsen - auto_lengte):       # Stel we willen een auto van 3 lang plaatsen dan kan hij op 7 -3 verschillende plekken beginnen
            ruimte_recht = parkeerplaatsen - (ruimte_links + auto_lengte + 1)  # Rechts hebben wij nu nog ruimte vrij namelijk de ruimte die overblijft na ruimte links + 1 (omdat je anders niet weg kan rijden) ingenomen is.

            print("_"*ruimte_links + old, "X"*auto_lengte, "_"*ruimte_recht, sep="")

            count += 1 
            count += counting_block(ruimte_recht, ("_"*ruimte_links) + ("X"*auto_lengte) + "_")  # Roep ons zelf recursief aan en geef de geschidenis door

    if old == "":  # we hebben een lege parkeerplaats
        print("_"*parkeerplaatsen)
        return count + 1
    else:
        return count
            

print(counting_block(7), "mogelijk heden")   # deze zou een antwoord moeten geven als je 50 in vult in plaats van 7