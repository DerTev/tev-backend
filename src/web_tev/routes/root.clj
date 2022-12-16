(ns web-tev.routes.root
  (:require [hiccup.core :as html]))

(defn root [req]
  (html/html [:html {:lang "de"}
              [:head [:title "DerTev"]
               [:meta {:name "robots" :content "noindex,nofollow"}]]
              [:body [:p "Hello, world!"]]]))