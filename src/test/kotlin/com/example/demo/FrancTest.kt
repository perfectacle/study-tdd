package com.example.demo

import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode

@Execution(ExecutionMode.CONCURRENT)
class FrancTest {
    @TestFactory
    fun `test multiplication`() = listOf(
        Pair(5, 2),
        Pair(6, 3)
    ).map { (amount, multiplier) ->
        dynamicTest("$${amount} * $multiplier = $${amount * multiplier}") {
            // Given
            val francs = Money.franc(amount)

            // When
            val actual = francs * multiplier

            // Then
            val expected = Money.franc(amount * multiplier)
            actual shouldBe expected
        }
    }

    @Test
    fun `test not equality`() {
        // Given
        val five = Money.franc(5)

        // When
        val actual = five * 2

        // Then
        val notExpected = Money.franc(7)
        actual shouldNotBe notExpected
    }
}

class Franc(amount: Int): Money(amount, "USD") {
    override operator fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}
