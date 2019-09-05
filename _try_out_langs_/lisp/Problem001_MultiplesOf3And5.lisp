#lang scheme 

(define main
  (lambda (n count)
    (if (<= n 0)
        count
        (main (- n 1) (+ count (if
                                (or (= 0 (modulo (- n 1) 5))
                                    (= 0 (modulo (- n 1) 3)))
                                (- n 1)
                                0))) )
    )
  )

(display (main 1000 0))
