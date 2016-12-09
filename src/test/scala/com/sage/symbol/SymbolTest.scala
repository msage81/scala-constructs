package com.sage.symbol

import com.sage.BaseSpec


class SymbolTest extends BaseSpec{

  "The name of an interned String" should "correspond to the actual String" in {
    val symbol: Symbol = 'IamAsymbol
    symbol.name should be("IamAsymbol")
  }

}
