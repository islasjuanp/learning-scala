name := MyBuild.NamePrefix + "root"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

lazy val common = project.
  settings(Common.settings: _*)

lazy val api = project.
  settings(Common.settings: _*).
  settings(libraryDependencies ++= Dependencies.bob)