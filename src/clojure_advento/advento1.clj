(ns clojure-advento.advento1
  (:gen-class)
  (require [clojure.string :as str])
  )

(def solve (fn [input] (
                         let [processCharacter (fn [accumulator next-value]
                                                 (if (= next-value \()
                                                   (+ accumulator 1)
                                                   (- accumulator 1)
                                                   )
                                                 )]
                         (reduce processCharacter 0 input)
                         )
             )
  )
