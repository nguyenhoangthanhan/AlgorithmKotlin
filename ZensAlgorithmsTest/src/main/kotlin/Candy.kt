class Candy {
    fun candy(ratings: IntArray): Int {
        val n = ratings.size
        var ans = 0
        var candies = MutableList<Int>(n) {1}

        for (i in 1..n - 1 step 1){
            if (ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1
            }
        }
        for(i in n-1 downTo 1 step 1){
            if (ratings[i-1] > ratings[i] && candies[i-1] <= candies[i]){
                candies[i-1] = candies[i] + 1
            }
        }
        for (i in candies){
            ans += i
        }
        return ans
    }
}