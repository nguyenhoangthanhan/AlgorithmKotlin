class GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        val layers = mutableListOf(listOf(""))

        repeat(n) { i ->
            layers += buildList<String> {
                for (j in 0 until i + 1) {
                    for (left in layers[j]) {
                        for (right in layers[i - j]) {
                            add("($left)$right")
                        }
                    }
                }
            }
        }

        return layers.last()
    }
}