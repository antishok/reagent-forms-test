(ns reagent-forms-test.core
  (:require [reagent.core :as r]
            [reagent-forms.core :as rf]))

(def form
  [:div
   [:input {:field :radio :value :a :name :foo :id :radioselection} "foo"]
   [:input {:field :radio :value :b :name :foo :id :radioselection} "bar"]
   [:input {:field :radio :value :c :name :foo :id :radioselection} "baz"]])

(defn app []
  (let [doc (r/atom {:radioselection :b})]
    (fn []
      [:div
       [rf/bind-fields form doc]
       [:label (str @doc)]])))

(r/render [app] (.-body js/document))



