import java.util.*

class MiniMaxSum {
    fun findMiniMaxSum(){
        val reader = Scanner(System.`in`)
        val arrInput = LongArray(5)
        var sumArray = 0L

        for (i in 0..4 step 1){
            arrInput[i] = reader.nextLong()
            sumArray += arrInput[i]
        }
        arrInput.sort()

        //Start find Mini-Max Sum problem
        var minArr = 0L
        var maxArr = 0L
        for (i in 0..3 step 1){
            minArr += arrInput[i]
            maxArr += arrInput[5 - 1 - i]
        }
        println("$minArr $maxArr")
        //End find Mini-Max Sum problem

        /**Start make bonus
         * + Count total of array
         * + Find min in array
         * + Find max in array
         * + Find even elements in array
         * + Find odd elements in array
         */
//        println("Total of array: " + sumArray(arrInput))
//        println("Min in array: " + minOfArray(arrInput))
//        println("Max in array: " + maxOfArray(arrInput))
//        println("Even elements in array: " + evenElementsOfArray(arrInput))
//        println("Odd elements in array: " + oddElementsOfArray(arrInput))

    }

    fun sumArray(sortedArr: LongArray): Long{
        var sum = 0L
        for (i in 0..sortedArr.size - 1 step 1){
            sum += sortedArr[i]
        }
        return sum
    }

    fun minOfArray(sortedArr: LongArray): Long{
        return sortedArr[0]
    }

    fun maxOfArray(sortedArr: LongArray): Long{
        return sortedArr[sortedArr.size - 1]
    }

    fun evenElementsOfArray(sortedArr: LongArray): List<Long>{
        val evenElements = mutableListOf<Long>()
        for (i in 0..sortedArr.size - 1 step 1){
            if (sortedArr[i] % 2 == 0L){
                evenElements.add(sortedArr[i])
            }
        }
        return evenElements
    }

    fun oddElementsOfArray(sortedArr: LongArray): List<Long>{
        val oddElements = mutableListOf<Long>()
        for (i in 0..sortedArr.size - 1 step 1){
            if (sortedArr[i] % 2 == 1L){
                oddElements.add(sortedArr[i])
            }
        }
        return oddElements
    }
}