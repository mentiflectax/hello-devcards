(ns hello-devcards.core
  (:require
   #_[om.core :as om :include-macros true]
   [sablono.core :as sab :include-macros true]
   [dpisarenko.work.entry-point :refer [my-novel]]
   )


  (:require-macros
   [devcards.core :as dc :refer [defcard deftest]])

;  (:require [dpisarenko.work.entry-point :refer [my-novel]])
  )

(enable-console-print!)

(defcard first-card
  (sab/html [:div
             [:h1 "Привет! This is your first devcard!"]]))

(defn main []
  ;; conditionally start the app based on whether the #main-app-area
  ;; node is on the page
  (if-let [node (.getElementById js/document "main-app-area")]
    (.render js/ReactDOM (sab/html [:div "This is working"]) node)))

(main)

;; remember to run lein figwheel and then browse to
;; http://localhost:3449/cards.html

