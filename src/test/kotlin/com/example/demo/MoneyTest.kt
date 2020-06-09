package com.example.demo

import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

//class MoneyTest {
//    @Test
//    fun `test equality`() {
//        Money.dollar(5) shouldBe Money.dollar(5)
//        Money.dollar(5) shouldNotBe Money.dollar(6)
//        Money.franc(5) shouldNotBe Money.dollar(5)
//    }
//
//    @Test
//    fun `test multiplication`() {
//        val five = Money.dollar(5)
//        Money.dollar(10) shouldBe five.times(2)
//        Money.franc(10) shouldNotBe five.times(3)
//    }
//
//    @Test
//    fun `test currency`() {
//        "USD" shouldBe Money.dollar(1).currency
//        "CHF" shouldBe Money.franc(1).currency
//    }
//}

class MoneyTest {
    @Test
    fun `test different currency`() {
        // Given
        val amount = 5
        val multiplier = 2
        val dollars = Money.dollar(amount)
        val francs = Money.franc(amount)

        // When
        dollars
    }
}