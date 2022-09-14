(defn read-fasta [fname]
  (let [data (clojure.string/split-lines (slurp fname))
        fasta-parser (fn fapa [[f & rst]]
                        (let [[l r] (split-with #(not= (first %) \>) rst)]
                        (cons (vector f (apply str l)) 
                              (when (seq r)
                              (lazy-seq (fapa r)))))) ]
        (fasta-parser data)))

(defn gc% [dna]
   (let [f (frequencies (clojure.string/lower-case dna))
         gc (+ (get f \g 0) (get f \c 0))]
        (double (/ gc (count dna)))))


(->> (read-fasta "f")
  (map #(vector (first %) (gc% (second %))))
  (sort-by second)
  last
  println)
