internal enum class Result {
    TRUE, FALSE
}

internal class RegularExpressionMatching1 {
    var memo: Array<Array<Result?>> = arrayOf()

    fun isMatch(text: String, pattern: String): Boolean {
        memo = Array(text.length + 1) { arrayOfNulls(pattern.length + 1) }
        return dp(0, 0, text, pattern)
    }

    fun dp(i: Int, j: Int, text: String, pattern: String): Boolean {
        if (memo[i][j] != null) {
            return memo[i][j] == Result.TRUE
        }
        val ans: Boolean
        if (j == pattern.length) {
            ans = i == text.length
        } else {
            val first_match = (i < text.length &&
                    (pattern[j] == text[i] ||
                            pattern[j] == '.'))

            ans = if (j + 1 < pattern.length && pattern[j + 1] == '*') {
                dp(i, j + 2, text, pattern) ||
                        first_match && dp(i + 1, j, text, pattern)
            } else {
                first_match && dp(i + 1, j + 1, text, pattern)
            }
        }
        memo[i][j] = if (ans) Result.TRUE else Result.FALSE
        return ans
    }
}