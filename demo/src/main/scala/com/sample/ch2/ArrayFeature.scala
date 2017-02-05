package com.sample.ch2

object ArrayFeature extends App {

  checkArrayCreation

  def checkArrayCreation = {
    var books: Array[String] = Array("Scala In Action", "Begining Java")
    println(books.length)

    books = new Array[String](3)
    books(0) = "Beginning Scala"
    books(1) = "Beginning Java"
    books(2) = "Beginning Groovy"
    println(books)
    println(books.length)
  }


}
