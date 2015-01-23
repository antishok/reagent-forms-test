(defproject reagent-forms-test "0.1.0-SNAPSHOT"

  :source-paths ["src/cljs"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2665" :scope "provided"]
                 [com.facebook/react "0.12.2"]
                 [reagent "0.5.0-alpha"]
                 [reagent/reagent-cursor "0.1.2"]
                 [reagent-forms "0.4.1"]]

  :plugins [[lein-cljsbuild "1.0.4"]]

  :cljsbuild {:builds {:app {:source-paths ["src/cljs"]
                             :compiler {:output-to     "js/app.js"
                                        :output-dir    "js/out"
                                        :externs       ["react/externs/react.js"]
                                        :optimizations :none
                                        :pretty-print  true}}}}

  :profiles {:dev {:env {:dev? true}
                   :cljsbuild {:builds {:app {:compiler {:source-map true}}}}}

             :production {}})
