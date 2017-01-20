-- :name create-task! :! :n
-- :doc creates a new task record
INSERT INTO tasks
(title, description, priority, size, done)
VALUES (:title, :description, :priority, :size, FALSE)

-- :name update-task! :! :n
-- :doc update an existing task record
UPDATE tasks
SET title = :title, title = :title, description = :description, priority = :priority, size = :size
WHERE id = :id

-- :name get-task :? :1
-- :doc retrieve a task given the id.
SELECT * FROM tasks
WHERE id = :id

-- :name all-tasks :? :*
-- :doc retrieve a task given the id.
SELECT * FROM tasks

-- :name finish-task! :! :n
-- :doc update a task done flag given the id.
UPDATE tasks
SET done = true
WHERE id = :id

-- :name delete-task! :! :n
-- :doc delete a task given the id
DELETE FROM tasks
WHERE id = :id
