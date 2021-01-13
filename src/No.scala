
case class No() extends Maybe[Nothing] {
  override def applyFunction[R](function: Nothing => R): Maybe[R] = No()
  override def getOrElse[R >: Nothing](value: R): R = value

}