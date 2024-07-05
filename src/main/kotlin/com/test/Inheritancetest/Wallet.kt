package com.test.Inheritancetest

import java.math.BigDecimal
import java.time.LocalDateTime

open class Wallet (_id: Long, var saveMoneyL: BigDecimal, val saveDate: LocalDateTime) {
    val id  = _id
        get() {
            return System.currentTimeMillis() + field
        }

    constructor(_id: Long):this (_id, BigDecimal(1000), LocalDateTime.now())

    open fun canVIPApplyFor(): Boolean{
        println(saveMoneyL)

        return saveMoneyL > BigDecimal(999)
    }
}