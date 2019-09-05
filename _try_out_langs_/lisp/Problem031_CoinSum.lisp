#lang scheme

(define (coin-sum amout)
  (cc amout 8))
(define (cc amount kinds-of-coins)
  (cond ((= amount 0) 1)
        ((or (< amount 0) (= kinds-of-coins 0)) 0)
        (else (+ (cc amount
                     (- kinds-of-coins 1))
                 (cc (- amount
                        (first-denomination kinds-of-coins))
                     kinds-of-coins)))))
(define (first-denomination coin)
  (cond ((= coin 1) 1)
        ((= coin 2) 2)
        ((= coin 3) 5)
        ((= coin 4) 10)
        ((= coin 5) 20)
        ((= coin 6) 50)
        ((= coin 7) 100)
        ((= coin 8) 200) ))

(display (coin-sum 200))