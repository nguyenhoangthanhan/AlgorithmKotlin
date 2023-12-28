import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
//    val miniMaxSum = MiniMaxSum()
//    val arrInput = miniMaxSum.createLongArray()
//    println(miniMaxSum.findMiniMaxSum(arrInput))

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

//    var input = 1598759L
//    var input2 = -7965859457L
//    findMax(input)
//    findMax(input2)

    //HIndex
//    var input = intArrayOf(3,0,6,1,5)
//    val hIndex = HIndex()
//
//    println(hIndex.hIndex(input))

//    val solution = Solution()
//    val gas = intArrayOf(1,2,3,4,5)
//    val cost = intArrayOf(3,4,5,1,2)
//    println(solution.canCompleteCircuit(gas, cost))

//    Zigzag Conversion
//    val ZigzagConversion = ZigzagConversion()
//    var s = "PAYPALISHIRING"
//    var numRows = 4
//    println(ZigzagConversion.convert(s, numRows))

    val twoSumII_InputArrayIsSorted_167 = TwoSumII_InputArrayIsSorted_167()
    var input = intArrayOf(2,3,4)
    var target = 6
    println(twoSumII_InputArrayIsSorted_167.twoSum(input, target).contentToString())
}

fun findMax(input: Long){
    var maxResult:Long = -input
    var absInput:Long = if (input < 0) -input else input

    var inputString = absInput.toString()

    var indexResult = 0
    var i = 0
    if (input > 0){
        while (i < inputString.length){
            val stringBuilder = StringBuilder(inputString)
            if (inputString[i] == '5'){
                val temp:Long = stringBuilder.deleteAt(i).toString().toLong()
                if (maxResult < temp) {
                    maxResult = temp
                    indexResult = i
                }
            }
            i++
        }

    }else{
        while (i < inputString.length){
            val stringBuilder = StringBuilder(inputString)
            if (inputString[i] == '5'){
                val temp:Long = stringBuilder.deleteAt(i).toString().toLong()
                if (maxResult > temp) {
                    maxResult = temp
                    indexResult = i
                }
            }
            i++
        }

    }

    if (input < 0) maxResult = -maxResult
    println("Input = $input; $maxResult $indexResult")

}
