import kotlin.math.cos

class HIndex {
    fun hIndex(citations: IntArray): Int {
        var i = 0
        val sortedCitations = citations.sortedDescending()
        var result = sortedCitations[0]
        println(sortedCitations)
        while(i < sortedCitations.size){
            if(sortedCitations[i] >= i){
                if(result > sortedCitations[i]){
                    result = sortedCitations[i]
                }
            }
            i++
        }
        return result
    }
}

class Solution {
    fun canCompleteCircuit2(gas: IntArray, cost: IntArray): Int {
        var i = 0
        var currentTank = 0
        var j = 0
        var k = 0
        var check = false
        while(i < gas.size){
            currentTank = gas[i]
            j = i
            check = true
//            println("currentTank1 = $currentTank")
            k = 0
            while(k <= gas.size){
                if (currentTank - cost[j] < 0){
                    check = false
                    break
                }
                if (j + 1 < gas.size){
//                    println("i = $i, j = $j, currentTank = $currentTank, " +
//                            "cost[$j] = ${cost[j]}, gas[${j+1}] = ${gas[j + 1]}")
                    currentTank = currentTank - cost[j] + gas[j+1]
                    j++
                    k++
                }else{
//                    println("i = $i, j = $j, currentTank = $currentTank, " +
//                            "cost[$j] = ${cost[j]}, gas[${0}] = ${gas[0]}")
                    currentTank = currentTank - cost[j] + gas[0]
                    j = 0
                    k++
                }
                if (currentTank < 0){
                    check = false
                    break
                }
            }
            if (check){
                return i
            }
            i++
        }
        return -1
    }

    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var i = 0
        var result = 0
        var sumGas = 0
        var sumCost = 0
        while (i < gas.size){
            sumGas += gas[i]
            sumCost += cost[i]
            if (gas[i] < cost[i]){
                result = i + 1
            }
            i++
        }
        if (sumGas - sumCost >= 0){
            return result
        }
        else return -1
    }
}