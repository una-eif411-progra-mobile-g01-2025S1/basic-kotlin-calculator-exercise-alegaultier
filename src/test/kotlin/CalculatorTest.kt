import org.example.Calculator
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp(){
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        val a: Double = 20.0
        val b: Double = 5.0

        val result: Double = calculator.add(a,b)

        assertEquals(25.0, result)
    }

    @Test
    fun testSubtraction() {
        val a: Double = 20.0
        val b: Double = 5.0

        val result: Double = calculator.subtract(a,b)

        assertEquals(15.0, result)
    }

    @Test
    fun testMultiplication() {
        val a: Double = 20.0
        val b: Double = 5.0

        val result: Double = calculator.multiply(a,b)

        assertEquals(100.0, result)
    }

    @Test
    fun testDivision() {
        val a: Double = 20.0
        val b: Double = 5.0

        val result: Double = calculator.divide(a,b)

        assertEquals(4.0, result)
    }

    @Test
    fun testErrorDivisionByZero() {
        val a: Double = 20.0
        val b: Double = 0.0

        try{
            var result: Double = calculator.divide(a,b)
            assertTrue { false }
        } catch (_: Exception){
            assertTrue { true }
        }
    }
}