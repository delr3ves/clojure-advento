(ns clojure-advento.advento4
  (:gen-class)
  (:require [digest :as digest])
  )

(defn find-number [input number current-hash]
  (if (.startsWith current-hash "00000")
    (- number 1)
    (recur input (+ number 1) (digest/md5 (str input number)))
    )
  )

(defn solve [input]
  (find-number input 0 "")
  )