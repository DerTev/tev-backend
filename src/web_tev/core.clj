(ns web-tev.core
  (:gen-class)
  (:require [web-tev.webserver :as webserver]
            [dotenv :as env]))

(defn -main [& args]
  (println "Start application...")
  (-> :PORT
      env/env
      Integer/parseInt
      webserver/start-webserver))
