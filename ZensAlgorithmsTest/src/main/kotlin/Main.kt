import java.util.*

fun main(args: Array<String>) {
    val miniMaxSum = MiniMaxSum()
    val arrInput = miniMaxSum.createLongArray()
    println(miniMaxSum.findMiniMaxSum(arrInput))

    /**Start make bonus
     * + Count total of array
     * + Find min in array
     * + Find max in array
     * + Find even elements in array
     * + Find odd elements in array
     */
//        println("Total of array: " + miniMaxSum.sumArray(arrInput))
//        println("Min in array: " + miniMaxSum.minOfArray(arrInput))
//        println("Max in array: " + miniMaxSum.maxOfArray(arrInput))
//        println("Even elements in array: " + miniMaxSum.evenElementsOfArray(arrInput))
//        println("Odd elements in array: " + miniMaxSum.oddElementsOfArray(arrInput))

}
