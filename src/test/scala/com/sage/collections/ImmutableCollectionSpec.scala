package com.sage.collections

import org.scalatest.{FlatSpec, Matchers}

class ImmutableCollectionSpec extends FlatSpec with Matchers{
  "A Demo of 'puts' and gets for an immutable map" should "be demostrated below " in {
    val immutableMap = Map("name" -> "Mark")
    immutableMap("name") should be ("Mark")
    val anotherMap = immutableMap + ("age" -> 108)
    anotherMap.size should be(2)
    val aThirdMap = anotherMap ++ Map("sex" -> "Male", "job" -> "Thrillseeker")
    aThirdMap.size should be(4)
  }
  "A Demo of 'adds' and gets for an immutable list " should "be demonstrated below " in {
    val list = List("Mark","Julie","Babs")
    list(0) should be("Mark")
    val anotherList =  "Lindsey" :: list
    anotherList.size should be(4)
    val aThirdMap = anotherList ++ List("Kirin","Shawn")
  }
  "Two collections with the same elements" should "compare properly with respect to equality" in {
     val map1 = Map("name" -> "Mark", "age" -> 90)
     val map2 = Map("name" -> "Mark", "age" -> 90)
     map1 eq map2 should be(false)
     map1 ne map2 should be(true)
     map1.sameElements(map2) should be(true)
     map1.keySet.sameElements(map2.keySet)
     val x = 'inter
     println(x.getClass)
  }

}
