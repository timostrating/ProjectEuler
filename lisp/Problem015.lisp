#lang scheme

(define (path-ways n) (path-ways-inner 0 n n))
(define (path-ways-inner sum x y)
  (if (or (= x 0) (= y 0))
     1
     (+ (path-ways-inner sum (- x 1) y ) (path-ways-inner sum x (- y 1))) ))

(display (path-ways 30))
