(ns web-tev.core
  (:gen-class)
  (:require [web-tev.webserver :as webserver]
            [dotenv :as env]))

(defn -main [& args]
  (println "Matrix Homeserver: " (env/env :MATRIX_HOMESERVER))
  (println "Matrix Port: " (env/env (env/env :MATRIX_PORT)))
  (println "Start application...")
  (-> :PORT
      env/env
      Integer/parseInt
      webserver/start-webserver))
