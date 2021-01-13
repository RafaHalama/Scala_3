

object main {
  
  def main(args: Array[String]): Unit = {

    println("Zadanie 1:")
    println()
    val container  = new Container[Double](100.0)
    println("container value: " + container.getContent)

    println("function: " + container.applyFunction[String]((value: Double) => (value - 54.68).toString))

    println("Zadanie 2:")
    println()
     
    val yes = new Yes[Double](100.0)
    val no = new No()
    println("yes podtyp: " + yes.isInstanceOf[Maybe[_]])

    println("no podtyp: " + no.isInstanceOf[Maybe[_]])
    println()
    println("Zadanie 3:")
    println("applfunction no: " + no.applyFunction[String]( Nothing => "x"))
    println("applyfunction yes: " + yes.applyFunction[String]((value: Double) => (value/2).toString))
    println()
    println("Zadanie 4:")
    
    println("getOrElse no: " + no.getOrElse("no"))
    println("getOrElse yes: " + yes.getOrElse("yes"))
    
  }
}