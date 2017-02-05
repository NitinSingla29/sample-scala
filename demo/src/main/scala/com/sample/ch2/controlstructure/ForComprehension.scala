package com.sample.ch2.controlstructure

/**
  * Created by NSingla on 05-02-2017.
  */
object ForComprehension extends App {
  iterateListWithFor

  filterInsideFor

  variableBindingInsideForLoop

  yieldKeywordWithFor

  def iterateListWithFor = {
    var bookList = getSampleList

    println("\nIterate over List using foreach")
    bookList.foreach(println)

    println("\nIterate over List using for loop")
    for (book <- bookList) {
      println(book)
    }
  }

  private def getSampleList = {
    List("Learning Java", "Learn Scala", "Learn Python")
  }

  def filterInsideFor = {
    println("\nFilter List inside for loop")
    var books = getSampleList
    for (book <- books if (book.contains("Scala"))) {
      println(book)
    }

    println("\nNotice for expression is Using for{} inplace of for()")
    for {book <- books if (book.contains("Scala"))} {
      println(book)
    }
  }

  def variableBindingInsideForLoop = {
    println("\nVariable binding inside for loop")
    var books = getSampleList
    for {book <- books if (book.contains("Scala"))
         bookWithUpperCase = book.toUpperCase} {
      println(bookWithUpperCase)
    }
  }

  def yieldKeywordWithFor = {
    println("\nYield keyword with For")
    var books = getSampleList
    var scalaBooks = for {book <- books if (book.contains("Scala"))} yield book
    println(scalaBooks)
  }
}
