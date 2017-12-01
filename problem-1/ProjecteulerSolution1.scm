(define z 0)
(define (modY x y)	(= 0 (modulo x y))	)

(define (loop n)
		(cond
			(	(modY n 3) (set! z (+ z n))	)
			(	(modY n 5) (set! z (+ z n))	)
		)
		(cond
			(	(< n 999) (loop(+ n 1))	)
			(	z	)
		)
)
