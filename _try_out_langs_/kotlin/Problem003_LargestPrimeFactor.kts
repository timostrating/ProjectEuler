var value = 600851475143

for (i in 1..Long.MAX_VALUE) if (isPrime(i) && value % i == 0L) {
    value /= i

    if (isPrime(value)) {
        println(value)
        break
    }
}

fun isPrime(num: Long): Boolean {
    if (num <= 1L) return false  // important
    if (num == 2L) return true
    return (2..Math.sqrt(num.toDouble()).toInt() + 1).none { num % it == 0L } // it is prime if we end up here
}