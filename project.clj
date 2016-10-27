(defproject untangled-auth "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.1"]
                 [org.bouncycastle/bcpkix-jdk15on "1.54"]
                 [com.taoensso/timbre "4.3.1"]
                 [clj-jwt "0.1.1"]
                 [bidi "1.21.1"]
                 [commons-codec "1.10"]
                 [crypto-equality "1.0.0"]
                 [clj-http "2.1.0"]
                 [crypto-equality "1.0.0"]
                 [org.clojure/data.json "0.2.6"]
                 [ring/ring-core "1.5.0"]
                 [hickory "0.6.0" :scope "test"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [ring/ring-mock "0.3.0" :scope "test"]
                 [navis/untangled-spec "0.3.6" :scope "test" :exclusions [org.clojure/google-closure-library-third-party org.clojure/google-closure-library io.aviso/pretty org.clojure/clojurescript]]]

  :plugins [[com.jakemccrary/lein-test-refresh "0.15.0"]]
  :source-paths ["src"]
  :test-paths ["src" "specs"]
  :resource-paths ["src" "resources"]

  :jvm-opts ["-server" "-Xmx1024m" "-Xms512m" "-XX:-OmitStackTraceInFastThrow"]

  :test-refresh {:report       untangled-spec.reporters.terminal/untangled-report
                 :with-repl    true
                 :changes-only true}

  )
