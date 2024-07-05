package com.test.Inheritancetest

import java.math.BigDecimal
import java.time.LocalDateTime

class NewPersonWallet(_id: Long, saveMoneyL: BigDecimal, saveDate: LocalDateTime): Wallet(_id, saveMoneyL, saveDate) {

    override fun canVIPApplyFor(): Boolean{
        val checkFirst = super.canVIPApplyFor()
        return (saveMoneyL > BigDecimal(10000000))
    }
}