lazy val time = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.0"
)
