MAX = 10
maximum = 0
for a in range(1, MAX +1):
	for b in range(1, MAX +1):
		for c in range(1, MAX +1):
			for d in range(1, MAX +1):
				for e in range(1, MAX +1):
					if a not in [b,c,d,e]  and  b not in [a,c,d,e]  and  c not in [a,b,d,e]  and  d not in [a,b,c,e]  and  e not in [a,b,c,d]:
						for total in range(9, 50+1):
							v1 = total - (a + b)
							v2 = total - (b + c)
							v3 = total - (c + d)
							v4 = total - (d + e)
							v5 = total - (e + a)
							v = set([v1, v2, v3, v4, v5])
							
							if v1 > 0 and v1 <= MAX  and  v2 > 0 and v2 <= MAX  and  v3 > 0 and v3 <= MAX  and  v4 > 0 and v4 <= MAX  and  v5 > 0 and v5 <= MAX:
								if v1 < v2 and v1 < v3 and v1 < v4 and v1 < v5:
									if len(v) == 5  and  a not in v  and  b not in v  and  c not in v  and  d not in v  and  e not in v:
										string = f"{v1}{a}{b}{v2}{b}{c}{v3}{c}{d}{v4}{d}{e}{v5}{e}{a}"
										if len(string) == 16:
											out = int(string)
											if maximum < out:
												maximum = out
										# print(f"{total}\t{v1},{a},{b}; {v2},{b},{c}; {v3},{c},{a}")

print(maximum)

# 9		4,2,3; 5,3,1; 6,1,2
# 9		4,3,2; 6,2,1; 5,1,3
# 10	2,3,5; 4,5,1; 6,1,3
# 10	2,5,3; 6,3,1; 4,1,5
# 11	1,4,6; 3,6,2; 5,2,4
# 11	1,6,4; 5,4,2; 3,2,6
# 12	1,5,6; 2,6,4; 3,4,5
# 12	1,6,5; 3,5,4; 2,4,6