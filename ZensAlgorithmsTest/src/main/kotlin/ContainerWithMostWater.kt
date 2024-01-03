class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        if (height.size < 2){
            return 0
        }
        if (height.size == 2){
            return if (height[0] >= height[1]){
                height[1]
            }else height[0]
        }
        var result = 0
        var current = 0
        for (i in 0 .. height.size-2 step 1){
            for (j in i + 1 .. height.size - 1 step 1){
                if (height[i] < height[j]){
                    current = height[i] * (j - i)
                }else{
                    current = height[j] * (j - i)
                }
                if (result < current){
                    result = current
                }
            }
        }
        return result
    }


    fun maxArea2(height: IntArray): Int {
        var result = 0
        var left = 0
        var right = height.size - 1
        while(left < right){
            var  w = right - left
            var h = Math.min(height[left], height[right])
            var area = h * w
            result = Math.max(result, area)
            if (height[left] < height[right]) left++
            else if(height[left] > height[right])  right--
            else{
                left++
                right--
            }
        }
        return result
    }
}