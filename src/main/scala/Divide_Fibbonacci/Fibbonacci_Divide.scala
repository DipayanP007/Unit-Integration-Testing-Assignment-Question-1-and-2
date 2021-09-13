package Divide_Fibbonacci

import scala.collection.mutable.ListBuffer

class Fibbonacci_Divide extends Divide with Fibbonacci {

  @Override
  override def divide(divisor: Int, dividend: Int) = divisor / dividend

  @Override
  override def fibbonacci(numberOfTerms: Int): ListBuffer[Int] = {

    if (numberOfTerms < 0) throw new IllegalArgumentException("Negative number of Terms not Allowed in Fibbonacci Series")

    var first_term: Int = 0
    var second_term: Int = 1
    var sum: Int = 0
    val fibbonacciSeries = new ListBuffer[Int]
    if (numberOfTerms == 1) return (fibbonacciSeries += first_term)

    fibbonacciSeries += (first_term, second_term)
    if (numberOfTerms == 2) return fibbonacciSeries
    for (i <- 3 to numberOfTerms) {

      sum = first_term + second_term
      fibbonacciSeries.append(sum)
      first_term = second_term
      second_term = sum
    }

    fibbonacciSeries
  }


}

