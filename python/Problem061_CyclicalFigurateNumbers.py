items = [{},{},{},{},{},{}]
dicts = [{},{},{},{},{},{}]

""" SETUP """
def append_if(i, n, v):
    if(v > 1000 and v < 10_000):
        a = f"{v}"[:2]; b = f"{v}"[2:]
        try:
            a = int(a); b = int(b)
            if(len(str(a)) == 2 and len(str(b)) == 2):
                if (items[i].__contains__(a)):
                    items[i][a].append(b)
                else:
                    items[i][a] = [b]
            dicts[i][v] = n
        except:
            pass


for n in range(1, 250):
    append_if(0, n, int(n*(n+1)/2))       # Triangle	 	P3,n=n(n+1)/2	 	1, 3, 6, 10, 15, ... 
    append_if(1, n, int(n**2))            # Square	 	    P4,n=n2	 	        1, 4, 9, 16, 25, ... 
    append_if(2, n, int(n*(3*n-1)/2))     # Pentagonal	 	P5,n=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
    append_if(3, n, int(n*(2*n-1)))       # Hexagonal	 	P6,n=n(2n−1)	 	1, 6, 15, 28, 45, ...
    append_if(4, n, int(n*(5*n-3)/2))     # Heptagonal	 	P7,n=n(5n−3)/2	 	1, 7, 18, 34, 55, ...
    append_if(5, n, int(n*(3*n-2)))       # Octagonal	 	P8,n=n(3n−2)	 	1, 8, 21, 40, 65, ...



""" SEARCH """
def search(value=13, visited=[0], history = ""):
    if (len(visited) == 6):  # IF we can not go deeper
        if (int(history[:2]) == int(history[len(history)-2:])): # IF our history is looping
            print(history)
        return

    for i in range(1,6):
        if i not in visited and items[i].__contains__(value):
            new_visited = visited[:]
            new_visited.append(i)
            for new_value in items[i][value]:
                search(new_value, new_visited, history + " " + str(value)  + str(new_value))

for key_0, values_0 in items[0].items():
    for value_0 in values_0:
        search(value_0, [0], str(key_0) + str(value_0))