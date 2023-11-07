
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import java.util.*

class MiniMaxSumTest {

    private val miniMaxSum = MiniMaxSum()
    private val inputTestCase1 = longArrayOf(1, 3, 5, 7, 9)
    private val inputTestCase2 =
        longArrayOf(10000000000000, 30000000000000, 50000000000000, 70000000000000, 90000000000000)

    @org.junit.Test
    fun findMiniMaxSum_TestCase1() {
        assertEquals("16 24", miniMaxSum.findMiniMaxSum(inputTestCase1))
    }

    @org.junit.Test
    fun findMiniMaxSum_TestCase2() {
        assertEquals("160000000000000 240000000000000", miniMaxSum.findMiniMaxSum(inputTestCase2))
    }

    @org.junit.Test
    fun sumArray_TestCase1() {
        assertEquals(25, miniMaxSum.sumArray(inputTestCase1))
    }

    @org.junit.Test
    fun sumArray_TestCase2() {
        assertEquals(250000000000000, miniMaxSum.sumArray(inputTestCase2))
    }

    @org.junit.Test
    fun minOfArray_TestCase1() {
        assertEquals(1, miniMaxSum.minOfArray(inputTestCase1))
    }

    @org.junit.Test
    fun minOfArray_TestCase2() {
        assertEquals(10000000000000, miniMaxSum.minOfArray(inputTestCase2))
    }

    @org.junit.Test
    fun maxOfArray_TestCase1() {
        assertEquals(9, miniMaxSum.maxOfArray(inputTestCase1))
    }

    @org.junit.Test
    fun maxOfArray_TestCase2() {
        assertEquals(90000000000000, miniMaxSum.maxOfArray(inputTestCase2))
    }

    @org.junit.Test
    fun evenElementsOfArray_TestCase1() {
        assertEquals(listOf<Long>(), miniMaxSum.evenElementsOfArray(inputTestCase1))
    }

    @org.junit.Test
    fun evenElementsOfArray_TestCase2() {
        assertEquals(listOf<Long>(10000000000000, 30000000000000, 50000000000000, 70000000000000, 90000000000000), miniMaxSum.evenElementsOfArray(inputTestCase2))
    }

    @org.junit.Test
    fun oddElementsOfArray_TestCase1() {
        assertEquals(listOf<Long>(1,3,5,7,9), miniMaxSum.oddElementsOfArray(inputTestCase1))
    }

    @org.junit.Test
    fun oddElementsOfArray_TestCase2() {
        assertEquals(listOf<Long>(), miniMaxSum.oddElementsOfArray(inputTestCase2))
    }
}