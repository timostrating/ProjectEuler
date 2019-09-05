var (n1, n2, n3, sum) = arrayOf(1, 1, 0, 0)

while (n3 < 4_000_000) {
    n3 = n1 + n2
    n1 = n2
    n2 = n3

    if (n3 % 2 == 0)
        sum += n3
}

println(sum)
