package com.sample.ch2.controlstructure

/**
  * Created by NSingla on 05-02-2017.
  */
object TryExpressionFeature extends App {


  println("All exceptions are unchecked exceptions in Scala")


  useTryCatchWithPatternMatching
  returnDefaultValueInCaseOfException

  //  useTryFinally

  def useTryFinally = {
    println("Using try/finally")
    try {
      throw new Exception("Test Exception")
    } finally {
      println("This is always printed")
    }
  }

  def useTryCatchWithPatternMatching = {
    println("Try Catch is an expression in Scala that results in a value.")
    println("In Catch block, scala pattern match can be used for different exception")
    try {
      throw new Exception("Test Exception")
    } catch {
      case e: java.io.IOException => {
        println("IOException Occured")
      }
      case e: Exception => {
        println("General Exception occured")
        println("Check matched value is assigned to variable e")
        println(s"Exception message = $e.message")
      }
    }
  }

  def returnDefaultValueInCaseOfException = {
    println("\nReturn default value in case call fail")
    var defaultValue = try {
      throw new Exception("New Test Exception")
    } catch {
      case _ => 5
    }
    println(s"Default value = $defaultValue")
  }
}