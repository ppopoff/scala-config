organization := "com.doingfp"
name := "scalaconfig"
version := "0.1-SNAPSHOT"

description := "Safe configuration for Scala"

// publish to maven repo
publishMavenStyle := true

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1" % Provided,
  "org.scalacheck" %% "scalacheck" % "1.13.4" % Test,
  "com.typesafe" % "config" % "1.3.1" % Test
)

