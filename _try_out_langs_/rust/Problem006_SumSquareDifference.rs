fn main() {
    let mut sum_of_squares : i64 = 0;
    let mut square_of_sum : i64 = 0;
    for a in 1..=100 {
        square_of_sum += a;
        sum_of_squares += (a as i64).pow(2);
    }
    square_of_sum = square_of_sum.pow(2);

    println!("{}", square_of_sum - sum_of_squares);
}