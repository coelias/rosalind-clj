(defn DNA->RNA [s]
  (clojure.string/replace s #"T" "U" ))

(println (DNA->RNA "GATGGAACTTGACTACGTAAATT"))
