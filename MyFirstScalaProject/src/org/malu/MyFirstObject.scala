package org.malu

object MyFirstObject {

  def main(args: Array[String]): Unit = {
    println("Scala rocks!")
    println(1 + 1.1)
    println(4 + "abc")

    val a: Int = 1
    val b = 2

    if (a < b) {
      println("true")
    } else {
      println("false")
    }
    whileloop
    forLoop(args)
    rubyStyleForEachLoop(args)
    val range = 0 until 10
    println(range)
    println(range.start)
    println(range.end)
    println(range.step)
    println((0 to 20) by 3)
    val otherRange = (0 to 50) by 2
    println(otherRange)
    val otherRange2 = (0 to 10)
    println(otherRange2)
    val otherRangeAlpha = 'a' to 'g'
    println(otherRangeAlpha)
  }

  def whileloop {
    var i = 1;
    while (i <= 3) {
      println(i)
      i += 1
    }
  }

  def forLoop(args: Array[String]) {
    println("for loop using Java-style iteration")
    for (i <- 0 until args.length) {
      println(args(i))
    }
  }

  def rubyStyleForEachLoop(args: Array[String]) {
    println("for loop using ruby style")
    args.foreach { x => println("hello>>" + x) }
  }
}

