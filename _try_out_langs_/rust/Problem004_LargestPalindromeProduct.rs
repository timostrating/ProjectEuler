fn main() {
    let mut max = 0;
    for a in 900..1000 {
        for b in 900..1000 {
            let v = a*b;
            if is_palindrome(v) && v > max {
                max = v;
            }
        }
    }
    println!("{}", max);
}

fn is_palindrome(v: i32) -> bool {
    let mut reverse = 0;
    let mut tmp = v;

    while tmp > 0 {
        reverse *= 10;
        reverse += tmp % 10;
        tmp /= 10;
    }

    // println!("{} == {}", v, reverse);
    return v == reverse;
}