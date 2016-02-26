name := """scala-web-project"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

pipelineStages := Seq(digest)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scaldi" %% "scaldi" % "0.5.7",
  "org.scaldi" %% "scaldi-play" % "0.5.13",
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
