package com.example.demo

abstract class Money(
    protected val amount: Int,
    private val currency: String
) {
    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Money

        if (amount != other.amount) return false
        if (currency != other.currency) return false

        return true
    }

    abstract operator fun times(multiplier: Int): Money
}
