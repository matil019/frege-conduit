fregeLibrary := "org.frege-lang" % "frege" % "3.25.42"
fregeOptions += "-ascii"

fork in run := true

autoScalaLibrary := false
crossPaths := false

organization := "xyz.denshi_no_yamaoku"
name := "frege-conduit"
version := "0.4-SNAPSHOT"
