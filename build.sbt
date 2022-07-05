fregeLibrary := "org.frege-lang" % "frege" % "3.25.42" from "https://github.com/Frege/frege/releases/download/3.25alpha/frege3.25.42.jar"
fregeOptions += "-ascii"

fork in run := true

autoScalaLibrary := false
crossPaths := false

organization := "xyz.denshi_no_yamaoku"
name := "frege-conduit"
version := "0.4-SNAPSHOT"
