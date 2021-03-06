(ns dpisarenko.ui.core
  (:require
   #_[om.core :as om :include-macros true]
   [sablono.core :as sab :include-macros true]
   [dpisarenko.work.entry-point :refer [my-novel]]
   )


  (:require-macros
   [devcards.core :as dc :refer [defcard deftest]])

  )

(enable-console-print!)


(defcard entry-point2
  (sab/html (let [work-name (get my-novel :name)]
         [:div
             [:h1 work-name]
             [:p (str
                   "Hello, again!"
                   "Hello, body text"
                      "Name of our novel: "
                      work-name
                       )]
             ]

              ) ))


(defn main []
  ;; conditionally start the app based on whether the #main-app-area
  ;; node is on the page
  (if-let [node (.getElementById js/document "main-app-area")]
    (.render js/ReactDOM (sab/html [:div "This is working"]) node)))

(main)

;; remember to run lein figwheel and then browse to
;; http://localhost:3449/cards.html
