name := """SQL-Alchemist-Core"""

version := "1.0"

scalaVersion := "2.11.5"

scalacOptions ++= Seq("-encoding", "UTF-8")

javacOptions ++= Seq("-encoding", "UTF-8")

resolvers += "SQL-Game-Teamprojekt" at "https://raw.githubusercontent.com/ifis-tu-bs/SQL-Alchemist-Teamprojekt/master/mvn-repository"

libraryDependencies += "de.tu_bs.cs.ifis.sqlgame" % "sql-alchemist-core_2.11" % "1.0"