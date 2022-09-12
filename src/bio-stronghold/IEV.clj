(defn expected-offspring [& args]
  (let [ps [1 1 1 0.75 0.5 0]]
    (apply + (map * args ps (repeat 2)))
))

(println (expected-offspring 19439 16708 16627 18013 17298 19925))
