class MedianOfTwoSortedArrays {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double{
        val mergedArray = nums1.plus(nums2)
        mergedArray.sort()
        val median: Double
        if (mergedArray.size % 2 != 0) {
            median = mergedArray[mergedArray.size / 2].toDouble()
        } else {
            median =
                (mergedArray[mergedArray.size / 2].toDouble() + mergedArray[mergedArray.size / 2 - 1].toDouble()) / 2
        }
        return median
    }
}