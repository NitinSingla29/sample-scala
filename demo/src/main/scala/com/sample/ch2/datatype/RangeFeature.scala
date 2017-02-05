package com.sample.ch2.datatype

/**
  * Created by NSingla on 05-02-2017.
  */
object RangeFeature extends App {

  learnRangeCreation

  def learnRangeCreation = {
    println("Range is defined by start value, end value and stepping value")

    println("\nCreate Range using to method: " + "1 to 5")
    var range: Range = 1 to 5
    println(range)


    println("\nCreate Range using until method: " + "1 until 5")
    range = 1 until 5
    println(range)

    println("\nCreate Range using step value: " + "1 to 10 by 2")
    range = 1 to 10 by 2
    println(range)


  }
}
