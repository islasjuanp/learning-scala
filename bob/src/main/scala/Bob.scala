object Bob {
  val question = ".*[?]+[\\s]*".r
  val yell = "[^a-z]*[A-Z]+[^a-z]*".r
  val silence = "[\\s]*".r

  def response(statement: String): String = statement match {
    case yell() => "Whoa, chill out!"
    case question() => "Sure."
    case silence() => "Fine. Be that way!"
    case _ => "Whatever."
  }
}
