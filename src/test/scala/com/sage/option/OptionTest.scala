package com.sage.option

import com.sage.BaseSpec

import scala.collection.mutable.ListBuffer

class OptionTest extends BaseSpec{

  "A list containing options " should "only map the non-None values" in {
    val options = List(Some(1),Some(2),None,Some(4),None)
    val expected = List(1,2,4)
    val result = ListBuffer[Int]()
    for(option <- options){
      option.map(i => result += i)
    }
    result.sameElements(expected) should be(true)
  }

}
