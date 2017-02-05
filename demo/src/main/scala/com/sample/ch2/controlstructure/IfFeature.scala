package com.sample.ch2.controlstructure

/**
  * Created by NSingla on 05-02-2017.
  */
object IfFeature extends App {
  var bool: Boolean = true
  if (bool) {
    println("bool is true")
  }

  bool = false
  if (bool) {
    println("bool is true")
  } else {
    println("bool is false")
  }

  println("Result of if expresseion in Scala is always Unit")
}
