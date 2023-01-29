(ns tev-backend.routes.matrix
  (:require [dotenv :as env]))

(defn client []
  {"m.homeserver" {"base_url" (str "https://" (env/env :MATRIX_HOMESERVER))}})

(defn server []
  {"m.server" (str (env/env :MATRIX_HOMESERVER) ":" (env/env :MATRIX_PORT))})