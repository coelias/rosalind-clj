(defn nucleotide-count [s]
 (let [x (frequencies s)]
   (map #(get x % 0) "ACGT")))

(println (nucleotide-count "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"))
