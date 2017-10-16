#lang scheme

(define(! i)
  (if (= i 2)
      1
    (* (- i 2) (! (- i 1)))))

(define (sum-of-digits x)
  (if (= x 0)
      0
    (+ (modulo x 10) (sum-of-digits (/ (- x (modulo x 10)) 10)))))



(display (sum-of-digits (! 100)))

