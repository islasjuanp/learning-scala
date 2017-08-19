import scala.math.BigDecimal.RoundingMode

case class SpaceAge(val seconds: Long) {

  private val yearInSeconds:Double = 31557600.0

  private def round(years: Double): Double =
    BigDecimal(years).setScale(2, RoundingMode.HALF_EVEN).toDouble

  val onEarth: Double =
    round(seconds / (yearInSeconds * 1))

  val onMercury: Double =
    round(seconds / (yearInSeconds * 0.2408467))

  val onVenus: Double =
    round(seconds / (yearInSeconds * 0.61519726))

  val onMars: Double =
    round(seconds / (yearInSeconds * 1.8808158))

  lazy val onJupiter: Double =
    round(seconds / (yearInSeconds * 11.862615))

  val onSaturn: Double =
    round(seconds / (yearInSeconds * 29.447498))

  val onUranus: Double =
    round(seconds / (yearInSeconds * 84.016846))

  val onNeptune: Double =
    round(seconds / (yearInSeconds * 164.79132))

}
