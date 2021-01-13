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

}