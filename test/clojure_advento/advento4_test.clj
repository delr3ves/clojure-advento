(ns clojure-advento.advento4-test
  (:use midje.sweet)
  (:require [clojure-advento.advento4 :as advento4])
  )

(fact "Adventofcode fourth day exercise"
      (advento4/solve "abcdef") => 609043
      (advento4/solve "pqrstuv") => 1048970
      (advento4/solve "bgvyzdsv") => 254575
      )