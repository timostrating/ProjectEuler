#lang scheme

(define (is-not-devisible-by<=i i m)
  (cond
   [(= i 1) true]
   [else (cond
          [(= 0 (remainder m i)) false]
          [else (is-not-devisible-by<=i (sub1 i) m)])]))

(define (prime? n)
  (is-not-devisible-by<=i (floor (sqrt n)) n))

(define (prime-sum i sum)
  (if (= i 0)
      sum
    (prime-sum (- i 1) (if (prime? i) (+ sum i ) sum )) ))

(display (prime-sum 2000000 0))
