var max = 0

for (x in 900..999)
    for (y in 900..999)
        if (isPalindrome(x*y) && max < x*y)
            max = x*y

println(max)


fun isPalindrome(int: Int): Boolean { return isPalindrome(""+int) }
fun isPalindrome(str: String): Boolean {
    return (0 until str.length / 2).none { str[it] != str[str.length - it - 1] }
}