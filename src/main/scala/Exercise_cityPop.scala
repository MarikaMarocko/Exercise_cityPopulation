
object Exercise_cityPop extends App {
  def getCityYear(p0: Int, percentage: Double, delta: Int, targetPopulation: Int) = {
    var population = p0.toDouble
    var year = 0
    if (percentage > 0 && delta > 0) {
      while (population < targetPopulation) {
        population = (population * (1 + percentage / 100)) + delta
        year += 1
      }
      println(s"The city will reach the target population in $year years")
    }
    else {
      println("The city will never reach the target population")
    }
  }

  getCityYear(p0 = 1000, percentage = 2, delta = 50, targetPopulation = 1200)
  getCityYear(p0 = 1500000, percentage = 2.5, delta = 10000, argetPopulation = 2000000)
  getCityYear(p0 = 1000, percentage = 2, delta = -50, targetPopulation = 12000)


  }
