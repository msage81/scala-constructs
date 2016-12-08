package com.sage.collections

import org.scalatest.{FlatSpec, Matchers}

import collection.mutable.Map
import scala.collection.mutable.ListBuffer

class MutableCollectionSpec extends FlatSpec with Matchers{
  "A Demo of puts and gets for an mutable map" should "be demostrated below " in {
    val mutableMap = Map[String, Any]("name" -> "Mark")
    mutableMap("name") should be ("Mark")
    mutableMap("age") = 108
    mutableMap.size should be(2)
    mutableMap ++= Map("sex" -> "Male", "job" -> "Thrillseeker")
    mutableMap.size should be(4)
  }
  "A Demo of adds and gets for an listbuffer " should "be demostrated below " in {
    val list = ListBuffer("Mark","Julie","Babs")
    list(0) should be("Mark")
    list += "Lindsey"
    list.size should be(4)
    list ++= List("Kirin","Shawn")
    list.size should be(6)
  }
}
