import org.kata.fizzbuzz.FizzBuzz
import org.testng.Assert
import org.testng.annotations.Test

class FizzBuzzTest {
    @Test
    fun `test obtain Fizz word when number is divisible by 3`() {
        val actor = FizzBuzz()

        val result = actor.result(3)

        Assert.assertEquals(result, "Fizz")
    }

    @Test
    fun `test obtain Buzz word when number is divisible by 5`() {
        val actor = FizzBuzz()

        val result = actor.result(5)

        Assert.assertEquals(result, "Buzz")
    }

    @Test
    fun `test a number not in fizzbuzz rules return the same number`() {
        val actor = FizzBuzz()

        val result = actor.result(1)

        Assert.assertEquals(result, "1")
    }

    @Test
    fun `test obtain Fizz for numbers 3, 6, 9`() {
        val actor = FizzBuzz()

        val result1 = actor.result(3)
        val result2 = actor.result(6)
        val result3 = actor.result(9)

        Assert.assertEquals(result1, "Fizz")
        Assert.assertEquals(result2, "Fizz")
        Assert.assertEquals(result3, "Fizz")
    }

    @Test
    fun `test obtain Buzz for numbers 5,10,20`() {
        val actor = FizzBuzz()

        val result1 = actor.result(5)
        val result2 = actor.result(10)
        val result3 = actor.result(20)

        Assert.assertEquals(result1, "Buzz")
        Assert.assertEquals(result2, "Buzz")
        Assert.assertEquals(result3, "Buzz")
    }

    @Test
    fun `test obtain FizzBuzz word when number is divisible by 3 and 5`() {
        val actor = FizzBuzz()

        val result = actor.result(15)

        Assert.assertEquals(result, "FizzBuzz")
    }

}