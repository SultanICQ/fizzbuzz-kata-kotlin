package org.kata.fizzbuzz

class FizzBuzz(private val dividers: List<DividerBy>) {
    fun result(i: Int): String {

        for( divider in this.dividers) {
            if ( divider.applyTo(i) ) {
                return divider.result()
            }
        }

        if (0 == i.rem(3) && 0 == i.rem(5)) {
            return "FizzBuzz"
        }

        return i.toString()
    }
}
