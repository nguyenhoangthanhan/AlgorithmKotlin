class RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var ind = 0

        for(i in 1 until nums.size) {
            if(nums[ind] != nums[i]) {
                nums[++ind] = nums[i]
            }
        }

        return ++ind
    }
}