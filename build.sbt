name := "mock_inline"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  "org.mockito" % "mockito-core" % "2.13.0" % Test,
  "org.mockito" % "mockito-inline" % "2.13.0" % Test
)

scalaSource in Compile := baseDirectory.value / "src/main/scala"
scalaSource in Test := baseDirectory.value / "src/test"
