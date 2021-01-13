import org.kata.fizzbuzz.DividerBy
import org.kata.fizzbuzz.FizzBuzz
import org.testng.Assert
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class FizzBuzzTest {
    private lateinit var actor:FizzBuzz

    @BeforeClass
    fun globalSetUp() {
        val dividerBy3 = DividerBy(3)
        val dividers = listOf(dividerBy3)
        this.actor = FizzBuzz(dividers)
    }

    @Test
    fun `test obtain Fizz word when number is divisible by 3`() {
        Assert.assertEquals(actor.result(3), "Fizz")
    }

    @Test
    fun `test obtain Buzz word when number is divisible by 5`() {
        Assert.assertEquals(actor.result(5), "Buzz")
    }

    @Test
    fun `test a number not in fizzbuzz rules return the same number`() {
        Assert.assertEquals(actor.result(1), "1")
    }

    @Test
    fun `test obtain Fizz for numbers 3, 6, 9`() {
        Assert.assertEquals(actor.result(3), "Fizz")
        Assert.assertEquals(actor.result(6), "Fizz")
        Assert.assertEquals(actor.result(9), "Fizz")
    }

    @Test
    fun `test obtain Buzz for numbers 5,10,20`() {
        Assert.assertEquals(actor.result(5), "Buzz")
        Assert.assertEquals(actor.result(10), "Buzz")
        Assert.assertEquals(actor.result(20), "Buzz")
    }

    @Test
    fun `test obtain FizzBuzz word when number is divisible by 3 and 5`() {
        Assert.assertEquals(actor.result(15), "FizzBuzz")
    }

}