(ns web-tev.webserver
  (:require [org.httpkit.server :as http-srv]
            [web-tev.routes :as routes]))

(defn start-webserver
  "Start webserver on `port`"
  [port]
  (println (str "Start webserver on port " port "..."))
  (http-srv/run-server routes/routes {:port port}))