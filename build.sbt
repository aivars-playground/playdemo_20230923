name := """playdemo"""
organization := "com.example"
version := "1.0-SNAPSHOT"

scalaVersion := "3.3.1"

libraryDependencies += guice
libraryDependencies += ehcache

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0-RC2" % Test

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"