(ns clojure-advento.advento5
  (:gen-class)
  (use [clojure.string :only (split includes?)])
  )

(defn has-repeated-letters? [word]
  (if (>= 1 (count word))
    false
    (or (= (first word) (nth word 1)) (recur (rest word)))
    )
  )

(defn count-reps [word candidates]
  (letfn [(count-appareances [substring] (count (re-seq (re-pattern substring) word)))]
    (reduce + (map count-appareances candidates))
    )
  )

(defn is-valid-word [word]
  (and (has-repeated-letters? word)
       (>= (count-reps word (list "a" "e" "i" "o" "u")) 3)
       (= (count-reps word (list "ab" "cd" "pq" "xy")) 0)
       )
  )

(defn solve [input]
  (count (filter is-valid-word (split input #"\n")))
  )