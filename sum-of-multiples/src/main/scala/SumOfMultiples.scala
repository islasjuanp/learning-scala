

object SumOfMultiples {

  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    factors
      .flatMap(factor => Range(factor, limit, factor))
      .sum
  }
}

