(ns clojure-advento.advento3
  (:gen-class)
  )
(defn move [movement current-pos]
  (case movement
    \> [(+ (nth current-pos 0) 1) (nth current-pos 1)]
    \< [(- (nth current-pos 0) 1) (nth current-pos 1)]
    \^ [(nth current-pos 0) (+ (nth current-pos 1) 1)]
    \v [(nth current-pos 0) (- (nth current-pos 1) 1)]
    current-pos
    )
  )

(defn mark-visited [visited-houses current-pos unprocessed-input]
  (if (empty? unprocessed-input)
    visited-houses
    (
      let [
           movement (first unprocessed-input)
           new-pos (move movement current-pos)
           updated-visited (cons new-pos visited-houses)
           unprocessed (rest unprocessed-input)
           ]
      (recur updated-visited new-pos unprocessed)
      )
    )
  )

(defn solve [input]
  (let [
        current-pos [0 0]
        visited-houses (mark-visited (cons current-pos (seq ())) current-pos input)
        ]
    (count (distinct visited-houses))
    )

  )