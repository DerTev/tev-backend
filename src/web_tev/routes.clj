(ns web-tev.routes
  (:require [compojure.route :as routing]
            [compojure.core :as compojure]
            [clojure.data.json :as json]
            [compojure.middleware :as middleware]

            [web-tev.routes.api :as api-routes]
            [web-tev.routes.root :as root-routes]))

(compojure/defroutes routes
                     (compojure/GET "/" [] (root-routes/root))
                     (compojure/GET "/style.css" [] (root-routes/style))
                     (middleware/wrap-canonical-redirect (compojure/GET "/api/random-clojure-function" [:as req]
                                                           (-> req
                                                               api-routes/random-clojure-function
                                                               json/write-str)))
                     (routing/not-found (-> {:message "404 - Not found"}
                                            json/write-str)))