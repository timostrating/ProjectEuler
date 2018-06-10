#lang scheme


(define (factor number)
  (define (*factor divisor number)
    (if (> (* divisor divisor) number)
        (list number)
        (if (= (modulo number divisor) 0)
            (cons divisor (*factor divisor (/ number divisor)))
            (*factor (+ divisor 1) number))))
  (*factor 2 number))
 
(println (factor 8))



(define (smallest_multiple i)
  (smallest_multiple_iner 10 1))

(define (smallest_multiple_iner n i)
  (if (> i 10)
      n
      (smallest_multiple_iner
       (if (= 0 (modulo n i))
           n
           (* n i))
       (+ i 1))))

(println(smallest_multiple 10))


(print 10)(print "-")(println(modulo 10 10))
(print 90)(print "-")(println(modulo 10 9))
(println(modulo 10 8))
(println(modulo 10 7))
(println(modulo 10 6))
(println(modulo 10 5))
(println(modulo 10 4))
(println(modulo 10 3))
(println(modulo 10 2))
