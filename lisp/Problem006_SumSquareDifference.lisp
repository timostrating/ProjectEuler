#lang scheme

(define (square x) (* x x))

(define (sum_square_difference limit) (sum_square_difference_inner limit 0 0))
(define (sum_square_difference_inner limit a b)
  (if (= limit 0)
      (- (square b) a)
    (sum_square_difference_inner (- limit 1)
                                 (+ (square limit) a)
                                 (+ limit b))))

(display (sum_square_difference 100))
