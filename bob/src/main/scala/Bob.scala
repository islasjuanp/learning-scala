object Bob {
  def response(statement: String): String = statement match {
    case str if str.matches("[^a-z]*[A-Z]+[^a-z]*") => "Whoa, chill out!"
    case str if str.matches(".*[?]+[\\s]*") => "Sure."
    case str if str.matches("[\\s]*") => "Fine. Be that way!"
    case _ => "Whatever."
  }
}
