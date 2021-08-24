import Exercise_cityPop.getCityYear

object Exercise_CityPopulation extends App {
  def getCityYear(p0: Int, percentage: Double, delta: Int, targetPopulation: Int) = {
    var population = p0.toDouble
    var finalPopulation = (p0 * (1 + percentage / 100)) + delta
    var year = 0
    var isJobFinished = false
    if (finalPopulation > p0) {
      while (population < targetPopulation) {
        population = (population * (1 + percentage / 100)) + delta
        year += 1
      }
      println(s"The city will reach the target population in $year years")
    }
    else {
      println("The city will never reach the target population")
      isJobFinished = true // Does it change anything? Is it needed?
    }
  }

  getCityYear(p0 = 1000, percentage = 2, delta = 50, targetPopulation = 1200)
  getCityYear(1500000, 2.5, 10000, 2000000)
  getCityYear(p0 = 1000, percentage = 2, delta = -50, targetPopulation = 12000)
}
