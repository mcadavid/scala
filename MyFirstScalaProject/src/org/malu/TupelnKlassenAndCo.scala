package org.malu

object TupelnKlassenAndCo {

  def main(args: Array[String]): Unit = {
    val person = ("Elena", "Morbach")
    println(person._1)
    println(person._2)

    val (x, y) = ("Elena", "Morbach")
    println(x + " " + y)
    val elenita = new Person("Elena", "Morbach")
    println(elenita)

    val myCompass = new Compass()
    myCompass.turnRight()
    myCompass.turnRight()

    myCompass.turnLeft()
    myCompass.turnLeft()
    myCompass.turnLeft()

    val bob = new Person("Bob")
    val bobTate = new Person("Bob", "Tate")
    println(bob)
    println(bobTate)
    println(bob.talk())
    println(bobTate.talkALot())
    myCompass.turnLeft()
  }

  class PersonOld(firstName: String, lastName: String)

  class Person(firstName: String) {
    println("Outer constructor")

    def this(firstName: String, lastName: String) {
      this(firstName)
      println("Inner constructor")
    }

    def talk() = println("Hi")
    def talkALot() {
      println("Hi everyone !")
    }
  }

  class Compass {

    val directions = List("N", "E", "S", "W");
    var bearing = 0
    print("Initial bearing: ")
    println(direction)

    def direction() = directions(bearing)

    def inform(turnDirection: String) {
      println("Turning " + turnDirection + ". Now bearing " + direction)
    }

    def turnRight() {
      bearing = (bearing + 1) % directions.size
      inform("right")
    }

    def turnLeft() {
      bearing = (bearing + (directions.size - 1)) % directions.size
      inform("left")
    }
  }
}
