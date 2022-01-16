@main def hello: Unit = 
  println("Hello world!")
  println(msg)

  // BASICS
  println(1)
  println(1 + 1)
  println("Hello!")
  println("Hello" + "world!")

  val x_sum = 1+1
  println(x_sum)

  // val can't be reassigned

  // List declaration and print - List with Any data type
  val list: List[Any] = List(1, 2, 3, "hello", true, () => "return string method")
  list.foreach(element => println(element))

  // Example 
  val x: Long = 987654321
  val y: Float = x

  val face: Char = '☺'
  var number: Int = face

  // Variable
  // var can be reassigned
  var x_var: Int = 1 + 1
  x_var = x_var + 1
  println(x_var)

  // Blocks
  println({
    var x_block = 1 +1
    x_block + 1
  })

  // Functions
  println("Functions")
  // (x_function: Int) => x_function + 1 // Annonymous function

  // Function with name
  val addOne = (x_function: Int) => x_function + 1
  println(addOne(1))

  // Function with multiple parameters
  val multipleParams = (x_one: Int, x_two: Int) => x_one + x_two
  println(multipleParams(2, 4))

  // Function with no parameters
  val noParams = () => 3 + 4
  println(noParams())

  // Methods
  println("Methods")
  def add(x: Int, y: Int) = x + y
  println(add(2, 3))

  // Method with multiple paramter list
  def addThenMultiply(x: Int, y: Int)(multiplier: Int) = (x + y) * multiplier
  println(addThenMultiply(1, 2)(3))

  // No parameter lists at all
  def name: String = System.getProperty("user.name")
  println("Hello, " + name + "!")

  // Method with multiple line execution
  def getSquareString(input: Double): String = {
    var square = input * input
    square.toString
  }
  println(getSquareString(2))

  // Classes

  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = 
      println(prefix + name + suffix)
  }

  val greeter = new Greeter("Hello, ", "!")
  greeter.greet("Scala developer")

  case class Point(x: Int, y: Int)

  val point = Point(1, 2)
  val anotherPoint = Point(1, 2)
  val yetAnotherPoint = Point(4, 4)

  if (point == anotherPoint) {
    println(s"$point and $anotherPoint are the same.")
  } else {
    println(s"$point and $anotherPoint are differerent.")
  }

  // Objects
  println("Objects")
  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }

  val newId: Int = IdFactory.create()
  println(newId)
  val newerId: Int = IdFactory.create()
  println(newerId)

  // Traits
  println("Traits")
  trait GreeterTrait {
    def greet(name: String): Unit =
      println("Hello, " + name + "!")
  }

  class DefaultGreeter extends GreeterTrait

  class CustomizableGreeter(prefix: String, postfix: String) extends GreeterTrait {
    override def greet(name: String): Unit = {
      println(prefix + name + postfix)
    }
  }

  val default_greeter = new DefaultGreeter()
  default_greeter.greet("Scala developer, default greeter")

  val customGreeter = new CustomizableGreeter("How are you, ", "?")
  customGreeter.greet("Scala developer, custom greeter")

  // Minimal class definition
  class User

  val user1 = new User

  // Class with constructor and body
  // Constructor can be optional parameter with default value
  class PointNew(var x: Int = 0, var y: Int = 0) {
    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
    }

    override def toString: String = s"($x, $y)"
  }

  val point1 = new PointNew(1)
  println(point1.x)
  println(point1)

  // Class with private members and getter/setter syntax
  class PointPrivateGetterSetter {
    private var _x = 0
    private var _y = 0
    private val bound = 100

    def x = _x
    def x_= (newValue: Int): Unit = {
      if (newValue < bound) _x = newValue else printWarning
    }

    def y = _y
    def y_= (newValue: Int): Unit = {
      if (newValue < bound) _y = newValue else printWarning
    }

    private def printWarning = println("Warning: Out of bounds")
  }
  println("Private members and getter/setter syntax")
  val pointPrivateGetterSetter1 = new PointPrivateGetterSetter
  pointPrivateGetterSetter1.x = 99
  pointPrivateGetterSetter1.y = 101

def msg = "I was compiled by Scala 3. :)"
