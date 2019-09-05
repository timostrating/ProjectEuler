#lang scheme


(define (fib n)
  (fib-iter 1 0 n 0))

(define (fib-iter a b count sum)
  (if (< count 0)
      sum
      (fib-iter (+ a b) a (- count b) (if (= 0 (modulo b 2))
                                          sum
                                          (+ sum b))
                )))


(display (fib 4000000))