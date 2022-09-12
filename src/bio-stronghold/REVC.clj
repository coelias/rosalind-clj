(defn dna->complement [s]
 (->> s
   (map {\A \T \C \G \G \C \T \A})
   (reverse)
   (apply str)))

(println (dna->complement "AAAACCCGGT"))
