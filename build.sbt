lazy val commonSettings = Seq(
  scalaVersion := "2.12.6"
)

lazy val euler = (project in file("euler"))
  .settings(
    commonSettings,
    name := "Project Euler"
  )
