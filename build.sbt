import sbt._
import sbt.Keys._

name := "scala-mqtt-client-raspberryPi-starter-kit"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.eclipse.paho" % "org.eclipse.paho.client.mqttv3" % "1.2.0",
  "com.typesafe" % "config" % "1.3.1")

resolvers += "MQTT Repository" at "https://repo.eclipse.org/content/repositories/paho-releases/"

assemblyJarName in assembly := "raspi-mqtt-client.jar"