//package com.example.demo
//
//import io.kotest.matchers.shouldBe
//import org.junit.jupiter.api.Test
//
//class BankTest {
//    @Test
//    fun `test simple addition`() {
//        val five = Money.dollar(5)
//        val sum = five + five
//        val bank = Bank()
//        val reducedExpression = bank.reduce(sum, "USD")
//        reducedExpression shouldBe Money.dollar(10)
//    }
//
//    @Test
//    fun `test reduce money`() {
//        val bank = Bank()
//        val result = bank.reduce(Money.dollar(1), "USD")
//        result shouldBe Money.dollar(1)
//    }
//
//    @Test
//    fun `test reduce money different currency`() {
//        val bank = Bank()
//        bank.addRate("CHF", "USD", 2)
//        val result = bank.reduce(Money.franc(2), "USD")
//        result shouldBe Money.dollar(1)
//    }
//
//    @Test
//    fun `test identity rate`() {
//        Bank().rate("USD", "USD") shouldBe 1
//    }
//
//    @Test
//    fun `test mixed addition`() {
//        val fiveBucks: Expression = Money.dollar(5)
//        val tenFrancs: Expression = Money.franc(10)
//        val bank = Bank()
//        bank.addRate("CHF", "USD", 2)
//        val result = bank.reduce(fiveBucks + tenFrancs, "USD")
//        result shouldBe Money.dollar(10)
//    }
//}