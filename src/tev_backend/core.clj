(ns tev-backend.core
  (:gen-class)
  (:require [tev-backend.webserver :as webserver]
            [dotenv :as env]))

(defn -main [& args]
  (println "Matrix Homeserver: " (env/env :MATRIX_HOMESERVER))
  (println "Matrix Port: " (env/env :MATRIX_PORT))
  (println "Start application...")
  (-> :PORT
      env/env
      Integer/parseInt
      webserver/start-webserver))
