(ns clojure-advento.advento2
  (:gen-class)
  (require [clojure.string :as str])
  )
(defn solve-item [dimensions]
  (let [
        sides (map read-string (str/split dimensions #"x")),
        side1 (* (nth sides 0) (nth sides 1)),
        side2 (* (nth sides 0) (nth sides 2)),
        side3 (* (nth sides 1) (nth sides 2)),
        biggest-size (min side1 side2 side3)
        ]
    (+ (* side1 2) (* side3 2) (* side2 2) biggest-size)
    )
  )

(defn solve [input]
  (let [process-item
    (fn [acc dimensions]
      (+ (solve-item dimensions) acc)
      )
    ]
  (reduce process-item 0 (str/split-lines input))
  )
  )