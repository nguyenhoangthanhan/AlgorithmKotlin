
class MinimumSizeSubarraySum {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var size = 0
        var removePosition = 0
        var resultSize = nums.size
        if (nums.size < 1 || nums.sum() < target) return 0
        for (i in 0..nums.size - 1 step 1){
            sum += nums[i]
            size++
            if (nums[i] >= target){
                return 1
            }
            if (sum >= target && size == 1){
                return 1
            }

            if (sum >= target){
                var tempSize = size
                var tempSum = sum
                var tempPos = removePosition
                while(tempSum >= target){
                    if (tempSum - nums[tempPos] < target){
                        removePosition = tempPos
                        sum = tempSum
                        size = tempSize
                        if (resultSize > tempSize){
                            resultSize = tempSize
                        }
                        break
                    }
                    tempSum -= nums[tempPos]
                    tempSize--
                    tempPos++
                }
            }
        }

        return resultSize
    }

    fun removeSmallestElement(listInput: List<Int>): MutableList<Int>{
        val resultList = listInput.toMutableList()
        var smallestElement = listInput[0]
        var mIndex = 0
        for(i in 1..listInput.size - 1 step 1){
            if (listInput[i] < smallestElement){
                smallestElement = i
                mIndex = i
            }
        }
        resultList.removeAt(index = mIndex)
        return resultList
    }
}