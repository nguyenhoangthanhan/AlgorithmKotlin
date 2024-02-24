class CountValueGreaterAllOfBeforeIt {
    fun solution(arr: IntArray) {
        var count = 0
        for (i in 1 until arr.size step 1) {
            var check = true
            for (j in 0..i - 1 step 1) {
                if (arr[j] > arr[i]) {
                    check = false
                    break
                }
            }
            if (check) {
                count++
            }
        }
        println("CountValueGreaterAllOfBeforeIt = $count")
    }
}