(ns user
  (:require [mount.core :as mount]
            todolist.core))

(defn start []
  (mount/start-without #'todolist.core/http-server
                       #'todolist.core/repl-server))

(defn stop []
  (mount/stop-except #'todolist.core/http-server
                     #'todolist.core/repl-server))

(defn restart []
  (stop)
  (start))


