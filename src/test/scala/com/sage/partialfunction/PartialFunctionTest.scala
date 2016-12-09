package com.sage.partialfunction

import com.sage.BaseSpec

class PartialFunctionTest extends BaseSpec{

  "Defining a muliplication method and assigning that method to a function" should "results in the same functionality " in {
    def mulitply(x:Int, y:Int) = x * y
    val mult = mulitply _
    mult(6,7) should be(mulitply(6,7))
  }

  "Partial functions that are combined" should "handle the cases specified" in {
    val young:PartialFunction[Int,String] = {case x:Int if x < 81 => "you are young" }
    val old:PartialFunction[Int,String] = {case x:Int if x >= 81 => "you are old" }
    val tester = young.orElse(old)

    tester(56) should be("you are young")
    tester(85) should be("you are old")

  }

  "Partial functions that are called" should "throw a match error for cases not handled" in {
    val young:PartialFunction[Int,String] = {case x:Int if x < 81 => "you are young" }
    assertThrows[MatchError] {
      young(90)
    }
  }

}
