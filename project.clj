(defproject baking-soda "0.2.5"
  :description "baking-soda is an interface between clojurescript's reagent
                and reactstrap (i.e., bootstrap 4 react components)"
  :url "https://github.com/gadfly361/baking-soda"
  :license {:name "MIT"}
  :scm {:name "git"
        :url  "https://github.com/gadfly361/baking-soda"}

  :min-lein-version "2.5.3"

  :dependencies
  [[org.clojure/clojure "1.10.1"]
   [org.clojure/clojurescript "1.10.758"]
   [reagent "0.8.1"]
   [cljsjs/reactstrap "6.0.1-0" :exclusions [cljsjs/react
                                             cljsjs/react-dom
                                             cljsjs/react-transition-group
                                             cljsjs/react-popper]]])