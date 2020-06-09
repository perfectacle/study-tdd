//package com.example.demo
//
//class Sum(
//    val augend: Expression,
//    val addend: Expression
//) : Expression {
//    override fun reduce(bank: Bank, currency: String): Money {
//        val amount = augend.reduce(bank, currency).amount + addend.reduce(bank, currency).amount
//        return Money(amount, currency)
//    }
//
//    override fun plus(addend: Expression): Expression {
//        return Sum(this, addend)
//    }
//
//    override fun times(multiplier: Int): Expression {
//        return Sum(augend * multiplier, addend * multiplier)
//    }
//}
