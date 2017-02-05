package com.sample.ch2.datatype

object ListFeature extends App {

  checkListCreation

  createListWithConsOperator

  usingHeadAndTail

  def checkListCreation = {
    println("Learn List creation")
    println("In scala all elements in List are of same type and List is immutable")
    //List is immutable in scala so can not add elements by index like Array
    var bookList: List[String] = List("Begining Java", "Begining Python")
    println(bookList)
    println("\n\n")
  }

  def createListWithConsOperator = {
    println("Using cons operator on list")
    // :: is called as cons operator.
    // Nil is an empty list
    var emptyList = Nil
    println("Nil is an empty list in scala")
    println(emptyList)
    var boolList: List[String] = "Begining Java" :: ("Begining Python" :: ("Begining Scala" :: Nil))
    println(boolList)
    println("\n\n")
  }

  def usingHeadAndTail = {
    println("List elements can be retrieved via head and tail operations on List")
    var bookList: List[String] = List("Begining Java", "Begining Python")
    println(bookList.head)
    println(bookList.tail)
    println("\n\n")
  }
}
