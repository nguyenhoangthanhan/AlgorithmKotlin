import java.util.*

class MiniMaxSum {

    fun createLongArray(): LongArray{
        val reader = Scanner(System.`in`)
        val arrInput = LongArray(5)

        for (i in 0..4 step 1){
            arrInput[i] = reader.nextLong()
        }

//        arrInput.sort()

        return arrInput
    }
    fun findMiniMaxSum(arrInput: LongArray): String{
        var sum = arrInput[0]
        var sumMin = 0L
        var sumMax = 0L
        var min1 = arrInput[0]
        var max1 = arrInput[0]
        for (i in 1..4 step 1){
            sum+= arrInput[i]
            if(min1 > arrInput[i]){
                min1 = arrInput[i]
            }
            if(max1 < arrInput[i]){
                max1 = arrInput[i]
            }
        }
        sumMin = sum - max1
        sumMax = sum - min1
        return ("$sumMin $sumMax")
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