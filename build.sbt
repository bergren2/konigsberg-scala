ThisBuild / organization := "dev.bergren"
ThisBuild / scalaVersion := "3.3.1"

ThisBuild / libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.17"
ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"

lazy val euler = (project in file("euler"))
  .settings(
    name := "Project Euler",
  )
