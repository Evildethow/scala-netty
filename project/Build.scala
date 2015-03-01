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
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.10.4",
    organization := "org.evildethow"
  )
}