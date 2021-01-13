package org.kata.fizzbuzz

class DividerBy(private val divider: Int, private var result: String) {
    fun applyTo(number: Int): Boolean {
        val apply = (0 == number.rem(this.divider))
        if (apply && this.result.isEmpty()) {
            this.result = number.toString()
        }
        return apply
    }

    fun result(): String {
        return this.result
    }
}
