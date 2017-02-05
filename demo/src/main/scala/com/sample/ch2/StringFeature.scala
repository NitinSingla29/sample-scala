package com.sample.ch2

class StringFeature {

  def checkInterpolcation = {
    val bookTitle: String = "Begining Scala"
    val bookName: String = s"Book name is $bookTitle"
    println(bookName)
  }
}