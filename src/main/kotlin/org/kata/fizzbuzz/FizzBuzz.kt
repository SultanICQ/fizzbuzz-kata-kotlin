package org.kata.fizzbuzz

class FizzBuzz {
    fun result(i: Int): String {
        if (0 == i.rem(3) && 0 == i.rem(5)) {
            return "FizzBuzz"
        }
        if (0 == i.rem(3)) {
            return "Fizz"
        }
        if (0 == i.rem(5)) {
            return "Buzz"
        }
        return i.toString()
    }

}
