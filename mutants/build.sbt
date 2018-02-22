name := """mutants"""
organization := "com.mercadolibre"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(evolutions, javaJdbc, guice)
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"