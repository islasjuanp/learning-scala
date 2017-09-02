import scala.math.BigDecimal.RoundingMode

case class SpaceAge(val seconds: Long) {

  private val yearInSeconds: Double = 31557600.0

  private def round(precision: Int)(years: Double): Double =
    BigDecimal(years).setScale(precision, RoundingMode.HALF_EVEN).toDouble

  val onEarth: Double =
    round(2)(seconds / (yearInSeconds * 1))

  val onMercury: Double =
    round(2)(seconds / (yearInSeconds * 0.2408467))

  val onVenus: Double =
    round(2)(seconds / (yearInSeconds * 0.61519726))

  val onMars: Double =
    round(2)(seconds / (yearInSeconds * 1.8808158))

  lazy val onJupiter: Double =
    round(2)(seconds / (yearInSeconds * 11.862615))

  val onSaturn: Double =
    round(2)(seconds / (yearInSeconds * 29.447498))

  val onUranus: Double =
    round(2)(seconds / (yearInSeconds * 84.016846))

  val onNeptune: Double =
    round(2)(seconds / (yearInSeconds * 164.79132))

}
