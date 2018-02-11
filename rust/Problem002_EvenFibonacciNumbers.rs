const MAX: usize = 4_000_000;

fn main() {  
    let mut x = (1, 1);  // Rust has tuples
    let mut sum = 0;
    
    while x.1 < MAX {
        x = (x.1, x.0 + x.1);

        if x.1 % 2 == 0 {
            println!("{}", x.1);
            sum += x.1
        }
    }

    println!("sum: {}", sum);
}