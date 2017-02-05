package com.sample.ch2

object ListFeature extends App {

  checkListCreation

  def checkListCreation = {
    //List is immutable in scala so can not add elements by index like Array
    var bookList: List[String] = List("Begining Java", "Begining Python")
    println(bookList)
  }
}
