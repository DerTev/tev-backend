(ns web-tev.webserver
  (:require [org.httpkit.server :as http-srv]
            [web-tev.routes :as routes]
            [compojure.middleware :as middleware]))

(defn start-webserver
  "Start webserver on `port`"
  [port]
  (println (str "Start webserver on port " port "..."))
  (http-srv/run-server (middleware/wrap-canonical-redirect routes/routes) {:port port}))