(ns tev-backend.routes
  (:require [compojure.route :as routing]
            [compojure.core :as compojure]
            [clojure.data.json :as json]
            [compojure.middleware :as middleware]

            [tev-backend.routes.api :as api-routes]
            [tev-backend.routes.matrix :as matrix-routes]))

(compojure/defroutes routes
                     (middleware/wrap-canonical-redirect (compojure/GET "/api/random-clojure-function" [:as req]
                                                           (-> req
                                                               api-routes/random-clojure-function
                                                               json/write-str)))
                     (compojure/GET "/.well-known/matrix/client" [] (-> (matrix-routes/client)
                                                                        json/write-str))
                     (compojure/GET "/.well-known/matrix/server" [] (-> (matrix-routes/server)
                                                                        json/write-str))
                     (routing/files "/")
                     (routing/not-found (-> {:message "404 - Not found"}
                                            json/write-str)))