organization := "com.luketebbs.uniform"

enablePlugins(SbtPlugin)

crossSbtVersions := Vector("0.13.17", "1.2.8") // 0.13 (and therefore scala 2.10) needed by HMRC

libraryDependencies += "org.typelevel" %% "cats-core" % "1.2.0" // last version to support 2.10

libraryDependencies += "com.github.pureconfig" %% "pureconfig" % "0.9.2" // last version to support 2.10

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full) // needed for Scala 2.10
