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

def msg = "I was compiled by Scala 3. :)"
