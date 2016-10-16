(defproject untangled-auth "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.1"]
                 [org.bouncycastle/bcpkix-jdk15on "1.54"]
                 [clj-jwt "0.1.1"]
                 [commons-codec "1.10"]
                 [crypto-equality "1.0.0"]
                 [org.clojure/data.json "0.2.6"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-jetty-adapter "1.5.0"]]

  :plugins [[com.jakemccrary/lein-test-refresh "0.15.0"]]
  :source-paths ["src"]
  :test-paths ["specs"]
  :resource-paths ["src" "resources"]

  :jvm-opts ["-server" "-Xmx1024m" "-Xms512m" "-XX:-OmitStackTraceInFastThrow"]

  :test-refresh {:report       untangled-spec.reporters.terminal/untangled-report
                 :with-repl    true
                 :changes-only true}

  )
