(defn fib [k n]
  (let [s [1 1]]
    (-> (iterate #(vector (second %) (+ (second %) (* n (first %)))) s)
    (nth  (dec k))
    first)))

(println (fib 31 2))
