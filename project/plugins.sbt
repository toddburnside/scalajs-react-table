resolvers += Resolver.bintrayRepo("oyvindberg", "converter")
resolvers += Resolver.bintrayRepo("oyvindberg", "converter-snapshots")

addSbtPlugin("org.scala-js"                % "sbt-scalajs"         % "1.6.0")
addSbtPlugin("ch.epfl.scala"               % "sbt-scalajs-bundler" % "0.20.0")
addSbtPlugin("org.scalameta"               % "sbt-scalafmt"        % "2.4.3")
addSbtPlugin("edu.gemini"                  % "sbt-lucuma"          % "0.3.8")
addSbtPlugin("com.geirsson"                % "sbt-ci-release"      % "1.5.7")
addSbtPlugin("org.scalablytyped.converter" % "sbt-converter"       % "1.0.0-beta32")
