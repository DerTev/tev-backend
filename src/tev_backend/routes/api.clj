(ns tev-backend.routes.api)

(defn random-clojure-function
  "Response for /api/random-clojure-function"
  [req]
  (let [core-vars (-> 'clojure.core
                      (ns-publics))
        rand-var (->> core-vars
                      (keys)
                      (to-array)
                      (rand-nth))]
    {:name (name rand-var)
     :description (get (meta (get core-vars rand-var)) :doc)
     :args (get (meta (get core-vars rand-var)) :arglists)}))