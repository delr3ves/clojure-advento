(ns clojure-advento.advento4
  (:gen-class)
  (:require [digest :as digest])
  )

(defn find-number [input number current-hash]
  (if (.startsWith current-hash "00000")
    number
    (let [next (+ number 1)]
      (recur input next (digest/md5 (str input next))))
    )
  )

(defn solve [input]
  (find-number input 0 "")
  )