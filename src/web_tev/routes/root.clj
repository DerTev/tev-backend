(ns web-tev.routes.root
  (:require [hiccup.core :as html]
            [garden.core :as css]))

(defn root []
  (html/html [:html {:lang "de"}
              [:head [:title "DerTev"]
               [:meta {:name "robots" :content "noindex,nofollow"}]
               [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
               [:link {:rel  "stylesheet"
                       :type "text/css"
                       :href "style.css"}]
               [:link {:rel  "stylesheet"
                       :href "https://fonts.googleapis.com/css2?family=Chivo+Mono:wght@200&display=swap"}]
               [:link {:rel "me" :href "https://chaos.social/@tev"}]]
              [:body [:p {:class "code"}
                      "{:name [\"Tim\" \"DerTev\"]"
                      [:br]
                      "&nbsp;:location \"Germany\""
                      [:br]
                      "&nbsp;:skills [\"Clojure\" \"ClojureScript\"]"
                      [:br]
                      "&nbsp;:mail \"Tim@DerTev.de\""
                      [:br]
                      "&nbsp;:mastodon \"@tev@chaos.social\""
                      [:br]
                      "&nbsp;:github \"github.com/DerTev\""
                      [:br]
                      "&nbsp;:website \"DerTev.de\"}"]]]))

(defn style []
  (css/css [:body {:background  "rgb(32, 33, 36)"
                   :color       "rgb(28, 239, 28)"
                   :font-family "'Chivo Mono', monospace"
                   :text-shadow "rgb(0, 255, 0) 1px 0 10px"
                   :font-size   "20px"}
            :p {:position  "absolute"
                :transform "translate(-50%, -50%)"
                :left      "50%"
                :top       "50%"}]))