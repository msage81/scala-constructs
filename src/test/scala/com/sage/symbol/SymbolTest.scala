package com.sage.symbol

import org.scalatest.{FlatSpec, Matchers}

class SymbolTest extends FlatSpec with Matchers{

  "The name of an interned String" should "correspond to the actual String" in {
    val symbol: Symbol = 'IamAsymbol
    symbol.name should be("IamAsymbol")
  }

}
