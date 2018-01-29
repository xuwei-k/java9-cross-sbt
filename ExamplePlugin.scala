package com.example

import sbt._

object ExamplePlugin extends AutoPlugin {
  object autoImport {
    val foo = inputKey[Int]("")
  }
}
