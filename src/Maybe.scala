
trait Maybe[+A] {
def applyFunction[R](function: A => R): Maybe[R] 
def getOrElse[R >: A](funValue: R): R
}


