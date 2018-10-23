sbtPlugin := true

name := "sbt-scala-js-map"

organization := "com.thoughtworks.sbt-scala-js-map"

description := "A Sbt plugin that setup source mapping for Scala.js projects hosted on Github"

startYear := Some(2016)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.25")

libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "5.1.3.201810200350-r"
