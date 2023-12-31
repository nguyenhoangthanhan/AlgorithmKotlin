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


    fun twoSum2(numbers: IntArray, target: Int): IntArray {
        var currentPivot = 0
        var left = 0
        var right = numbers.size-1
        for (i in 0..numbers.size-2 step 1){
            left = i + 1
            right = numbers.size-1
            if (left == right){
                if (numbers[i] + numbers[right] == target){
                    return intArrayOf(i + 1, right + 1)
                }
            }else if (left > right){
                break
            }
            while(right > left){
                if ((-left + right) == 1){
                    if (numbers[i] + numbers[right] == target){
                        return intArrayOf(i + 1, right + 1)
                    }
                    if (numbers[i] + numbers[left] == target){
                        return intArrayOf(i + 1, left + 1)
                    }
                    break
                }
                else if ((left + right) % 2 == 0){
                    currentPivot = (left + right) / 2
                }else{
                    currentPivot = (left + right) / 2 + 1
                }
                if (numbers[i] + numbers[currentPivot] == target){
                    return intArrayOf(i + 1, currentPivot + 1)
                }
                else if(numbers[i] + numbers[currentPivot] < target){
                    left = currentPivot
                }
                else {
                    right = currentPivot
                }
            }
        }
        return intArrayOf(1, 2)
    }
}