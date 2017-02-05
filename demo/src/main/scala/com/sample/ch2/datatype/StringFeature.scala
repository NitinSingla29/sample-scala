package com.sample.ch2.datatype

object StringFeature extends App {
  checkInterpolcation
  multiLineString

  def checkInterpolcation = {
    val bookTitle: String = "Begining Scala"
    val bookName: String = s"Book name is $bookTitle"
    println(bookName)
  }

  def multiLineString = {
    var multiLineString =
      """Line 1
        |Line 2
        |Line 3
      """
    println("\n")
    println(multiLineString)

    println("\nUsing stripMargin")
    println(multiLineString.stripMargin)

  }
}