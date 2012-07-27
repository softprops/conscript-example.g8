name := "$project-name$"

organization := "$org$"

version := "$version$"

libraryDependencies <+= (sbtVersion)(
  "org.scala-sbt" %
   "launcher-interface" %
    _ % "provided")
