class TwoSumII_InputArrayIsSorted_167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for (i in 0..numbers.size-2 step 1){
            for (j in (i + 1)..numbers.size - 1 step 1){
                if (numbers[i] + numbers[j] == target){
                    return intArrayOf(i + 1, j + 1)
                }
            }
        }
        return intArrayOf(1, 2)
    }
}