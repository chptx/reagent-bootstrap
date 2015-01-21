(defproject reagent-bootstrap "0.0.1"
  :description "Reagent wrapper for React Bootstrap"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :clojurescript? true
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [reagent "0.4.3"]]
  :plugins [[codox "0.6.4"]]
  :profiles {:dev
             {:dependencies [[org.clojure/clojurescript "0.0-2322"]]
              :plugins [[lein-cljsbuild "1.0.3"]]}})
