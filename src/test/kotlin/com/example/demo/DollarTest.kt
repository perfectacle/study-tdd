package com.example.demo

import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode

@Execution(ExecutionMode.CONCURRENT)
class DollarTest {
    @TestFactory
    fun `test multiplication`() = listOf(
        Pair(5, 2),
        Pair(6, 3)
    ).map { (amount, multiplier) ->
        dynamicTest("$${amount} * $multiplier = $${amount * multiplier}") {
            // Given
            val dollars = Money.dollar(amount)

            // When
            val actual = dollars * multiplier

            // Then
            val expected = Money.dollar(amount * multiplier)
            actual shouldBe expected
        }
    }

    @Test
    fun `test not equality`() {
        // Given
        val five = Money.dollar(5)

        // When
        val actual = five * 2

        // Then
        val notExpected = Money.dollar(7)
        actual shouldNotBe notExpected
    }
}

class Dollar(amount: Int): Money(amount) {
    override operator fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}
