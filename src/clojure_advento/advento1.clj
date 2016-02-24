(ns clojure-advento.advento1
  (:gen-class)
  )

(defn solve [input]
  (let [processCharacter
        (fn [accumulator next-value]
          (if (= next-value \()
            (+ accumulator 1)
            (- accumulator 1)
            )
          )]
    (reduce processCharacter 0 input)
    )
  )

