(ns script
  (:require ["ink" :refer [render Box Text]]
            [reagent.core :as r]
            ["ink$default" :as ink]
            ["ink-fuzzy-select$default.default" :as FuzzySelect]
            ["react" :as react]))

(defn handle-select [i]
  (js/console.log i)
  (js/process.exit 0))

(def items (clj->js
            [{:label "First"
              :value "first"}
             {:label "Second"
              :value "second"}]))

(defn
  example
  []
  (let [[v set-v] (react/useState "")]
    [:f>
     FuzzySelect
     {:options items
      :onSelect (constantly nil)}]))

(defn root []
  [:f> example])

(render (r/as-element [root]))
