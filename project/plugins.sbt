addSbtPlugin("com.geirsson"              % "sbt-ci-release"      % "1.5.7")
addSbtPlugin("com.eed3si9n"              % "sbt-unidoc"          % "0.4.3")
addSbtPlugin("org.scoverage"             % "sbt-scoverage"       % "2.0.5")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"         % "0.4.2")
addSbtPlugin("com.typesafe.sbt"          % "sbt-ghpages"         % "0.6.3")
addSbtPlugin("com.codacy"                % "sbt-codacy-coverage" % "3.0.3")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"        % "0.1.17")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"        % "2.0.4")

// A workaround until sbt ecosystem migrate to scala-xml 2.x https://github.com/sbt/sbt/issues/6997
ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)
