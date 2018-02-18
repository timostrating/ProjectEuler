num = 0;  i = 1;
While[Length[Divisors[num]] < 500, num += i;  i += 1];
Print[num]