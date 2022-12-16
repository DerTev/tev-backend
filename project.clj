(defproject web-tev "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http-kit "2.6.0"]
                 [compojure "1.7.0"]
                 [org.clojure/data.json "2.4.0"]
                 [lynxeyes/dotenv "1.1.0"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot web-tev.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
