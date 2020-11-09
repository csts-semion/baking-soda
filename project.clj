(defproject org.semion/baking-soda "0.3.1-SNAPSHOT"
  :description "baking-soda is an interface between clojurescript's reagent
                and reactstrap (i.e., bootstrap 4 react components)"
  :url "https://github.com/gadfly361/baking-soda"
  :license {:name "MIT"}
  :scm {:name "git"
        :url  "https://github.com/gadfly361/baking-soda"}

  :min-lein-version "2.5.3"

  :plugins [[s3-wagon-private "1.3.4"]]
  :repositories [["semion" {:url           "s3p://semion-repos/releases/"
                            :username      :env/AWS_SECRET_ACCESS_KEY
                            :passphrase    :env/AWS_ACCESS_KEY_ID
                            :sign-releases false}]]

  :dependencies
  [[org.clojure/clojure "1.10.1"]
   [org.clojure/clojurescript "1.10.758"]
   [reagent "0.8.1"]
   [cljsjs/reactstrap "6.0.1-0" :exclusions [cljsjs/react
                                             cljsjs/react-dom
                                             cljsjs/react-transition-group
                                             cljsjs/react-popper]]])
