//package com.example.demo
//
//class Bank {
//    private val rates = mutableMapOf<Pair, Int>()
//
//    fun reduce(expression: Expression, currency: String): Money {
//        return expression.reduce(this, currency)
//    }
//
//    fun rate(from: String, to: String): Int {
//        if (from == to) return 1
//        return rates[Pair(from, to)] ?: 0
//    }
//
//    fun addRate(from: String, to: String, rate: Int) {
//        rates[Pair(from, to)] = rate
//    }
//}
//
//private class Pair(
//    val from: String,
//    val to: String
//) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Pair
//
//        if (from != other.from) return false
//        if (to != other.to) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = from.hashCode()
//        result = 31 * result + to.hashCode()
//        return result
//    }
//}