import sbt._
import sbt.Keys._

object Build {

}

object Dependencies {
  val nettyVersion = "4.0.25.Final"

  val nettyAll = "io.netty" % "netty-all" % nettyVersion

  val nettyDependencies = Seq(nettyAll)
}

object Common {
  lazy val commonSettings = Seq(
      version := "1.0",
      scalaVersion := "2.11.5"
  )
}