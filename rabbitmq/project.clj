(defproject jepsen.rabbitmq "0.1.0-SNAPSHOT"
  :description "RabbitMQ tests for Jepsen"
  :url "https://github.com/aphyr/jepsen"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [jepsen "0.0.5"]
                 [com.novemberain/langohr "2.7.1" ]])
