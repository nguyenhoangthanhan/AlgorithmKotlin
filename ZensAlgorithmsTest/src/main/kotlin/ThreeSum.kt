class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var result = mutableListOf<List<Int>>()
        if(nums.size < 3){
            result.add(listOf())
            return result
        }
        if(nums.size == 3){
            if (nums[0] + nums[1] + nums[2] == 0){
                result.add(listOf(nums[0], nums[1], nums[2]))
                return result
            }else{
                return result
            }
        }

        for (i in 0..nums.size-3 step 1){

            for (j in i+1..nums.size-2 step 1){

                for (k in j+1..nums.size-1 step 1){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        if (nums[i] > nums[j]){
                            if (nums[k] > nums[i]){
                                if (!isDuplication(result, nums[k],
                                        nums[i], nums[j])){
                                    result.add(listOf(nums[k], nums[i], nums[j]))
                                }
                            }else{
                                if (nums[k] > nums[j]){
                                    if (!isDuplication(result, nums[i],
                                            nums[k], nums[j])){
                                        result.add(listOf(nums[i], nums[k], nums[j]))
                                    }
                                }else{
                                    if (!isDuplication(result, nums[i],
                                            nums[j], nums[k])){
                                        result.add(listOf(nums[i], nums[j], nums[k]))
                                    }
                                }
                            }
                        }else{
                            if (nums[k] > nums[j]){
                                if (!isDuplication(result, nums[k],
                                        nums[j], nums[i])){
                                    result.add(listOf(nums[k], nums[j], nums[i]))
                                }
                            }else{
                                if (nums[k] > nums[i]){
                                    if (!isDuplication(result, nums[j],
                                            nums[k], nums[i])){
                                        result.add(listOf(nums[j], nums[k], nums[i]))
                                    }
                                }else{
                                    if (!isDuplication(result, nums[j],
                                            nums[i], nums[k])){
                                        result.add(listOf(nums[j], nums[i], nums[k]))
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        return result
    }

    fun isDuplication(
        result: List<List<Int>>,
        n1: Int,
        n2: Int,
        n3: Int
    ): Boolean{
        for (i in 0..result.size-1 step 1){
            if (result[i][0] == n1
                && result[i][1] == n2
                && result[i][2] == n3 ) {
                return true
            }
        }
        return false
    }

    fun threeSum2(nums: IntArray): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()

        nums.sort()

        for (i in 0..nums.size - 2 step 1){
            if (i > 0 && nums[i] == nums[i-1]){
                continue
            }

            var j = i + 1
            var k = nums.size - 1

            while(j < k){
                val sum = nums[i] + nums[j] + nums[k]

                if (sum == 0){
                    ans.add(listOf<Int>(nums[i], nums[j], nums[k]))

                    while(j < k && nums[j] == nums[j + 1]){
                        j++
                    }
                    while(j < k && nums[k] == nums[k - 1]){
                        k--
                    }

                    j++
                    k--
                }else if (sum < 0){
                    j++
                } else{
                    k--
                }
            }
        }
        return ans
    }
}