import java.util.*

class MiniMaxSum {
    fun findMiniMaxSum(){
        val reader = Scanner(System.`in`)
        val arrInput = LongArray(5)

        for (i in 0..4 step 1){
            arrInput[i] = reader.nextLong()
        }
        arrInput.sort()

        var minArr = 0L
        var maxArr = 0L
        for (i in 0..3 step 1){
            minArr += arrInput[i]
            maxArr += arrInput[5 - 1 - i]
        }
        println("$minArr $maxArr")
    }
}