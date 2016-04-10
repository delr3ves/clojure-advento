(defproject clojure-advento "0.1.0-SNAPSHOT"
  :description "Just me messing around with Clojure"
  :url "http://github.com/delr3ves/clojure-adviento"
  :license {
            :name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"
            }
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 ]
  :target-path "target/%s"
  :profiles {:dev     {
                       :plugins      [[lein-midje "3.2"]]
                       :dependencies [[midje "1.6.3"]]}
             :uberjar {:aot :all}
             }
  )
