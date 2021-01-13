

case class Yes[A](val value: A) extends Maybe[A]
{
  override def applyFunction[R](function: A => R): Maybe[R] = Yes(function(value))
  override def getOrElse[R >: A](value2: R): R = value
}