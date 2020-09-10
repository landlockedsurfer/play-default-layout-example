

lazy val core = (project in file("core"))
  .enablePlugins(PlayScala)
  .settings(
    libraryDependencies += guice
  )
  .disablePlugins(PlayLayoutPlugin)

lazy val app = (project in file("app"))
  .enablePlugins(PlayScala)
  .settings(
    libraryDependencies += guice
  )
  .disablePlugins(PlayLayoutPlugin)
  .dependsOn(core)
  .aggregate(core)


