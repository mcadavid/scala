package org.malu

object InheritanceExamples {

  def main(args: Array[String]): Unit = {
    println("=========Inheretence=======")
    val employee = new Employee("Yoda", 4)
    employee.talk("Extend or extend not. There is no try.")

    val john = new John
    john.printName
    println(john.name)

    println("=========Traits=======")
    val flanders = new Character("Ned")
    flanders.greet()
  }

  class Person(val name: String) {
    def talk(message: String) = println(name + " says " + message)
    def id(): String = name
  }

  class Employee(override val name: String, val number: Int) extends Person(name) {
    override def talk(message: String) {
      println(name + " with number " + number + " says " + message)
    }

    override def id(): String = number.toString()
  }

  trait Nice {
    def greet() = println("howdily doodily.")
  }

  class Character(override val name: String) extends Person(name) with Nice

  abstract class AbstractPerson {
    def name: String
    def printName = println(name)
  }

  class John extends AbstractPerson {
    def name = "John Doe"
  }
}
