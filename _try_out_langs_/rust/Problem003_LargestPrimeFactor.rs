fn main() {
    let mut start_value: i64 = 600851475143;
    let mut i = 2;

    loop {
        if is_prim(i) && start_value % i == 0 {
            start_value = start_value / i;
           
            if is_prim(start_value) {
                println!("{}", start_value);
                break;
            }
        }

        i += 1;
    }
}

fn is_prim(x: i64) -> bool {
    return (2..x).all(|i| x % i != 0);
}