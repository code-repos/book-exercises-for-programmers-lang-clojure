(ns saying-hello)

(do
  (println "What is your name?")
  (flush)
  (let [name (read-line)
        greeting (str "Hello, " name ", nice to meet you!")]
    (print greeting)))