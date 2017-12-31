organization := "com.doingfp"
name := "scalaconfig"
version := "0.1-SNAPSHOT"

description := "Safe configuration for Scala"

// publish to maven repo
publishMavenStyle := true

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1" % Provided,
  "com.typesafe" % "config" % "1.3.1" % Test,
  "org.scalacheck" %% "scalacheck" % "1.13.4" % Test,
  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  // required by scalatest
  "org.scalactic" %% "scalactic" % "3.0.4" % Test
)


// Custom paths for src & test
scalaSource in Compile := baseDirectory.value / "src"
scalaSource in Test := baseDirectory.value / "test"

resourceDirectory in Test := baseDirectory.value / "test-resources"
