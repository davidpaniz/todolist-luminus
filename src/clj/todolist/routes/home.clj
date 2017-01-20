(ns todolist.routes.home
  (:require [todolist.layout :as layout]
            [todolist.db.core :as db]
            [compojure.core :refer [defroutes GET POST]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render
    "home.html" {:tasks (db/all-tasks)}))

(defn about-page []
  (layout/render "about.html"))

(defn create-task [{:keys [params]}]
  (db/create-task! params)
  (response/found "/"))

(defn finish-task [id]
  (db/finish-task! {:id id})
  (response/found "/"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (POST "/" request (create-task request))
  (POST "/:id" [id] (finish-task id))
  (GET "/about" [] (about-page)))

