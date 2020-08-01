libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

lazy val commonSettings = Seq(
  scalaVersion := "2.13.3"
)

lazy val euler = (project in file("euler"))
  .settings(
    commonSettings,
    name := "Project Euler"
  )
