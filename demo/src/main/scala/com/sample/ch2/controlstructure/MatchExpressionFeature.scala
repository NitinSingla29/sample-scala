package com.sample.ch2.controlstructure

/**
  * Created by NSingla on 05-02-2017.
  */
object MatchExpressionFeature extends App {


  println("Basic pattern matching is like Java")

  println("Break statement is not required between case like in Java")

  checkMatchExpression

  def checkMatchExpression = {
    println("Pattern matching is an expression that return a value and this value can be assigned/returned to a variable")
    var value = 44 match {
      case 44 => true
      case _ => false
    }
    println(s"Returned value = $value")

    var personAge = "David" match {
      case "David" => 45 // the result is 45 if we match "David"
      case "Elwood" => 77
      case _ => 0
    }
    println(s"Person Age = $personAge")
  }

}
