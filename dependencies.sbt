
scalaVersion := "2.12.2"

libraryDependencies := Seq(
  ws,
  guice,
  //caffeine, // Not supported in SBT 0.13.x
  specs2 % Test,
  "com.typesafe.play" %% "play-json" % "2.6.12",
  "com.typesafe.play" %% "play-slick" % "3.0.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "3.0.1"
)
