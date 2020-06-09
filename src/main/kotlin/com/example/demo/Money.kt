//package com.example.demo
//
//open class Money(
//    val amount: Int,
//    internal val currency: String
//): Expression {
//    companion object {
//        fun dollar(amount: Int): Money = Money(amount, "USD")
//        fun franc(amount: Int): Money = Money(amount, "CHF")
//    }
//
//    override fun equals(other: Any?): Boolean {
//        return when {
//            other !is Money -> false
//            amount != other.amount -> false
//            currency != other.currency -> false
//            else -> true
//        }
//    }
//
//    override fun toString(): String {
//        return "Money(amount=$amount, currency='$currency')"
//    }
//
//    override fun times(multiplier: Int): Expression {
//        return Money(amount * multiplier, currency)
//    }
//
//    override operator fun plus(addend: Expression): Expression {
//        return Sum(this, addend)
//    }
//
//    override fun reduce(bank: Bank, currency: String): Money {
//        val rate = bank.rate(this.currency, currency)
//        return Money(amount / rate, currency)
//    }
//}