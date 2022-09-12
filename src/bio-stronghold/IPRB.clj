(defn prob-dominant [k m n] 
  (let [t (+ k m n)
        single-prob (* (/ 1 t) (/ 1 (dec t)))]
(- 1 (* single-prob  (+ (* k (dec k)) (* m (dec m) 0.25) (* k m) )))
))

(println (prob-dominant 15 27 16))
