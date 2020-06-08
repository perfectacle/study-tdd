package com.example.demo

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class SomeClassTest {
    @Test
    fun `SomeClass should be SomeClass`() {
        val no = 1
        SomeClass(no = no) shouldBe SomeClass(no = no)
    }
}