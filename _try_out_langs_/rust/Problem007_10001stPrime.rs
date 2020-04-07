fn main() {
    let mut counter: i64 = 0;
    let mut value: i64 = 2;

    while counter < 10001 {
        if is_prim(value) {
            counter += 1;
            println!("Prime {}: {}", counter, value);
        }
        value += 1; 
    }
}

fn is_prim(x: i64) -> bool {
    return (2..x).all(|i| x % i != 0);
}