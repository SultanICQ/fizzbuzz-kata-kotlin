package org.kata.fizzbuzz

class FizzBuzz(private val dividers: List<DividerBy>) {
    fun result(i: Int): String {

        var result = ""

        for( divider in this.dividers) {
            if ( divider.applyTo(i) ) {
                result = result.plus( divider.result())
            }
        }

        if (result.isEmpty() ) {
            result = i.toString()
        }

        return result
    }
}
