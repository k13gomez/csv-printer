(ns csv-printer.core
  (:gen-class))

(defn -main
  [& args]
  (doseq [line (line-seq (slurp "input.csv"))]
    (println lines)))
