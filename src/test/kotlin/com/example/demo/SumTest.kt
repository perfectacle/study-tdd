//package com.example.demo
//
//import io.kotest.matchers.booleans.shouldBeTrue
//import io.kotest.matchers.shouldBe
//import org.junit.jupiter.api.Test
//
//class SumTest {
//    @Test
//    fun `test plus returns sum`() {
//        val five = Money.dollar(5)
//        val sum = (five + five) as Sum
//        five shouldBe sum.augend
//        five shouldBe sum.addend
//    }
//
//    @Test
//    fun `test reduce sum`() {
//        val sum = Sum(Money.dollar(3), Money.dollar(4))
//        val bank = Bank()
//        val result = bank.reduce(sum, "USD")
//        result shouldBe Money.dollar(7)
//    }
//
//    @Test
//    fun `test sum plus money`() {
//        val fiveBucks: Expression = Money.dollar(5)
//        val tenFrancs: Expression = Money.franc(10)
//        val bank = Bank()
//        bank.addRate("CHF", "USD", 2)
//        val sum = Sum(fiveBucks, tenFrancs) + fiveBucks
//        val result = bank.reduce(sum, "USD")
//        result shouldBe Money.dollar(15)
//    }
//
//    @Test
//    fun `test sum times`() {
//        val fiveBucks = Money.dollar(5)
//        val tenFrancs = Money.franc(10)
//        val bank = Bank()
//        bank.addRate("CHF", "USD", 2)
//        val sum = Sum(fiveBucks, tenFrancs).times(2)
//        val result = bank.reduce(sum, "USD")
//        result shouldBe Money.dollar(20)
//    }
//}