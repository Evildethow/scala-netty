import Common._
import Dependencies._

lazy val root = (project in file("."))
  .aggregate(examples)

lazy val examples = (project in file("examples"))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= nettyDependencies)
