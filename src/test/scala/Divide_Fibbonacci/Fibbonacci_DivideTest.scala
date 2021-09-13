package Divide_Fibbonacci

import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ListBuffer

class Fibbonacci_DivideTest extends AnyFunSuite {

  val obj = new Fibbonacci_Divide

  test("Divide two numbers- where Divdend=4 and Divisor= 2") {
    val expectedResult = 2
    val result = obj.divide(4, 2)
    assert(expectedResult == result)
  }
  test("Dividing a Number by 0 throws Arithmetic Exception") {
    assertThrows[ArithmeticException] {
      obj.divide(40, 0)
    }
  }

  test("Return a Fibbonacci Series if the Number of Terms 7"){

    val expectedResult = new ListBuffer[Int]
    expectedResult += (0,1,1,2,3,5,8)
    val result = obj.fibbonacci(7)
    assert(expectedResult == result)
  }

  test("No. of Terms in a Fibbonacci Series if given Negative throws IllegalArgument Exception"){
    intercept[IllegalArgumentException]{
      obj.fibbonacci(-10)
    }
  }
}
