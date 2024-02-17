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

    fun solutionCandy2(ratings: IntArray): Int{
        if (ratings.size == 1) return 1

        val candy = IntArray(ratings.size)
        candy[0] = 1

        for (i in 1 until ratings.size) {
            if (ratings[i] > ratings[i-1]){
                candy[i] = candy[i - 1] + 1
            } else {
                candy[i] = 1
            }
        }

        var totalCandy = candy[ratings.size - 1]
        for (i in ratings.size - 2 downTo 0) {
            if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]) {
                candy[i] = candy[i + 1] + 1
            }
            totalCandy += candy[i]
        }

        return totalCandy
    }
}