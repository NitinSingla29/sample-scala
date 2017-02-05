package com.sample.ch2.datatype

/**
  * Created by NSingla on 05-02-2017.
  */
object TupleFeature extends App {
  println("Refer http://www.java2s.com/Tutorials/Java/Scala/0190__Scala_Tuples.htm")
  println("\nTuple is an ordered container for two or more vaules of same or different type")
  println("\nThere is no way iterate elements of a tuple")
  println("\nCreate tupple using values seperated by comma and sorrounded by pait of paranthesis")

  var tuple = ("Learn Scala", 1)
  println(tuple)
  println(("Learn Scala", 1, false))
  println("Observe diverse data types in tuple")

  println("\nCreate Tuple using releation operator ->")
  tuple = "Learn scala" -> 1
  println(tuple)
  println("Relation operator can create an tuple of two value only")

  println("\nAccess tuple element value by index using _")
  println("Get First value as tuple._1=" + tuple._1)
  println("Get First value as tuple._2=" + tuple._2)


  println("\nAssign name to tuple variable")
  var (bookName, count, author) = ("Learn scala", 1, "Nitin")
  println("bookName=$bookName")
  println(s"count=$count")
  println(s"author=$author")

  println("\nIgnore some tuple elements")
  var (bookTitle, bookCount, _) = ("Learn Java", 2, "Nitin")
  println("bookTitle=$bookTitle")
  println(s"bookCount=$bookCount")
  println(s"author=$author")

  println("\nItertate over tuple elements using productIterator")
  var tupletoIterate = ("Learn Tuple element iteration", 2, "Nitin")
  tupletoIterate.productIterator.foreach(println)
}
