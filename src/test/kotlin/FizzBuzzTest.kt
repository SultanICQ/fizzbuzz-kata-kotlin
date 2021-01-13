import org.kata.fizzbuzz.FizzBuzz
import org.testng.Assert
import org.testng.annotations.Test

class FizzBuzzTest {
    @Test
    fun `test obtain Fizz word when number is divisible by 3`() {
        val actor = FizzBuzz()

        val result = actor.result()

        Assert.assertEquals(result, "Fizz")
    }
}