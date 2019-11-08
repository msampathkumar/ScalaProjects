name := "ScalaProjects"

version := "0.1"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq (
  "org.apache.spark" %% "spark-core" % "2.4.3",
  "org.apache.spark" %% "spark-sql" % "2.4.3",
  "org.apache.spark" %% "spark-graphx" % "2.4.3",
  "org.apache.spark" %% "spark-mllib" % "2.4.3" % "runtime"
)

/*
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.3" % "runtime"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"
*/