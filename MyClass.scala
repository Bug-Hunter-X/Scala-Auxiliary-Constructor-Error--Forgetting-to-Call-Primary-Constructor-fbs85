```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInstance = new MyClass()
    println(myInstance.value) // This will print 0
    
    val myInstance2 = new MyClass(5)
    println(myInstance2.value) // This will print 5
  }
}
```