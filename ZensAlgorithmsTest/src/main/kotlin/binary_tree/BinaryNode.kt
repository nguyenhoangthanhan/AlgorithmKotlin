package binary_tree

class BinaryNode<T>(val value: T) {
    var left: BinaryNode<T>? = null
    var right: BinaryNode<T>? = null

    override fun toString() = ""
    var listResult: MutableMap<Int, MutableList<T>> = mutableMapOf()

    private fun diagram(node: BinaryNode<T>?,
                        top: String = "",
                        root: String = "",
                        bottom: String = ""): String {
        return root?.let {
            if (node?.left == null && node?.right == null) {
                "$root${node?.value}\n"
            } else {
                diagram(node?.right, "$top ", "$top ┌──", "$top| ") +
                        root + "${node?.value}\n" + diagram(node?.left, "$bottom| ", "$bottom└──", "$bottom ")
            }
        } ?: "${root}null\n"
    }

    private fun clearListResult() = listResult.clear()


    fun printBinaryTree(note: BinaryNode<T>, deep: Int) {
//        print("${note.value},")
        if (!listResult.containsKey(deep)) {
            listResult[deep] = mutableListOf(note.value)
        } else {
            listResult[deep] = listResult.getValue(deep).also { it.add(note.value) }
        }


        val tempDeep = deep + 1
        note.left?.let {
            printBinaryTree(it, tempDeep)
        }
        note.right?.let {
            printBinaryTree(it, tempDeep)
        }
    }

    fun inorderTraversal(note: BinaryNode<T>, listResult: MutableList<T>) {
        note.left?.let {
            inorderTraversal(it, listResult)
        }
        note?.value?.let {
            listResult.add(it)
        }
        print("${note.value},")
        note.right?.let {
            inorderTraversal(it, listResult)
        }
    }


    var resultMinDepth = Int.MAX_VALUE
    fun minDepth(note: BinaryNode<T>, deep: Int) {
        val tempDeep = deep + 1
        if (note.right == null && note.left == null) {
            if (resultMinDepth > tempDeep) {
                resultMinDepth = tempDeep
            }
        }

        note.left?.let {
            minDepth(it, tempDeep)
        }
        note.right?.let {
            minDepth(it, tempDeep)
        }
    }


    var pathSumCurrent = 0
    fun pathSum(note: BinaryNode<Int>, targetSum: Int): Boolean {
        pathSumCurrent += note.value
//        println("pathSumCurrent = $pathSumCurrent")
//        println("note.value = ${note.value}")
        if (note.right == null && note.left == null) {
            if (pathSumCurrent == targetSum) {
                return true
            }
        }
        note.left?.let {
            val leftR = pathSum(it, targetSum)
            if (leftR) {
                return true
            }
        }
        note.right?.let {
            val rightR = pathSum(it, targetSum)
            if (rightR) {
                return true
            }
        }
        pathSumCurrent -= note.value
//        println("pathSumCurrent2 = $pathSumCurrent")
        return false
    }


    val listResultBinaryTreePreorderTraversal = mutableListOf<Int>()
    fun binaryTreePreorderTraversal(note: BinaryNode<Int>) {
        listResultBinaryTreePreorderTraversal.add(note.value)
        note.left?.let {
            binaryTreePreorderTraversal(it)
        }
        note.right?.let {
            binaryTreePreorderTraversal(it)
        }
    }

    val listResultBinaryTreePostorderTraversal = mutableListOf<Int>()
    fun binaryTreePostorderTraversal(note: BinaryNode<Int>) {
        note.left?.let {
            binaryTreePostorderTraversal(it)
        }
        note.right?.let {
            binaryTreePostorderTraversal(it)
        }
        listResultBinaryTreePostorderTraversal.add(note.value)
    }

    var countCompleteTreeNodesR = 0
    fun countCompleteTreeNodes(note: BinaryNode<Int>) {
        countCompleteTreeNodesR++
        note.left?.let {
            countCompleteTreeNodes(it)
        }
        note.right?.let {
            countCompleteTreeNodes(it)
        }
    }

    fun invertTree(note: BinaryNode<Int>, newNote: BinaryNode<Int>, addPosition: String) {
        var currentNewNote = newNote
        when (addPosition) {
            "right" -> {
                currentNewNote.left = BinaryNode(note.value)
                currentNewNote = currentNewNote.left!!
            }

            "left" -> {
                currentNewNote.right = BinaryNode(note.value)
                currentNewNote = currentNewNote.right!!
            }
        }
        note.right?.let {
            invertTree(it, currentNewNote, "right")
        }
        note.left?.let {
            invertTree(it, currentNewNote, "left")
        }
    }

    val resultOfBinaryTreePaths = mutableListOf<String>()
    val binaryTreePathsCurrent = StringBuilder()
    fun binaryTreePaths(note: BinaryNode<Int>) {
        val subString: String
        if (note.right == null && note.left == null) {
            subString = "${note.value}"
            binaryTreePathsCurrent.append(subString)
            resultOfBinaryTreePaths.add(binaryTreePathsCurrent.toString())
        } else {
            subString = "${note.value}->"
            binaryTreePathsCurrent.append(subString)
        }
        note.left?.let {
            binaryTreePaths(it)
        }
        note.right?.let {
            binaryTreePaths(it)
        }
        binaryTreePathsCurrent.deleteRange(
                binaryTreePathsCurrent.length - subString.length,
                binaryTreePathsCurrent.length
        )
    }

    var resultOfRangeSumOfBST = 0
    fun rangeSumOfBST(note: BinaryNode<Int>, low: Int, high: Int) {
        if (note.value in low..high) {
            resultOfRangeSumOfBST += note.value
        }
        note.left?.let {
            if (note.value > low) {
                rangeSumOfBST(it, low, high)
            }
        }
        note.right?.let {
            if (note.value < high) {
                rangeSumOfBST(it, low, high)
            }
        }
    }

    fun evaluateBooleanBinaryTree(root: BinaryNode<Int>): Boolean {
        when (root.value) {
            0 -> {
                return false
            }

            1 -> return true

            2 -> {
                var result1 = false
                var result2 = false
                root.left?.let {
                    result1 = evaluateBooleanBinaryTree(it)
                }
                root.right?.let {
                    result2 = evaluateBooleanBinaryTree(it)
                }

                return result1 || result2
            }

            3 -> {
                var result1 = false
                var result2 = false
                root.left?.let {
                    result1 = evaluateBooleanBinaryTree(it)
                }
                root.right?.let {
                    result2 = evaluateBooleanBinaryTree(it)
                }

                return result1 && result2
            }

            else -> {
                return false
            }
        }
    }

}

fun demoFun() {
    val zero = BinaryNode(1)
    zero.left = BinaryNode(2)
    zero.right = BinaryNode(3)
    zero.left?.left = BinaryNode(4)
    zero.left?.left?.left = BinaryNode(8)
    zero.left?.left?.right = BinaryNode(9)
    zero.left?.right = BinaryNode(5)
    zero.right?.left = BinaryNode(6)
    zero.right?.right = BinaryNode(7)

    zero.printBinaryTree(zero, 0)
    for ((key, value) in zero.listResult) {
        for (i in value) {
            print("$i,")
        }
    }
}

fun inorderTraversalDemo(): List<Int> {
    val listResult = mutableListOf<Int>()
    val zero = BinaryNode(1)
    zero.left = null
    zero.right = BinaryNode(2)
    zero.right?.left = BinaryNode(3)

    zero.inorderTraversal(zero, listResult)
    return listOf()
}

fun inorderTraversalDemo2(): List<Int> {
    val listResult = mutableListOf<Int>()
    val zero = BinaryNode(1)
    zero.left = BinaryNode(2)
    zero.left?.left = BinaryNode(4)
    zero.left?.right = BinaryNode(5)
    zero.left?.right?.left = BinaryNode(6)
    zero.left?.right?.right = BinaryNode(7)
    zero.right = BinaryNode(3)
    zero.right?.right = BinaryNode(8)
    zero.right?.right?.left = BinaryNode(9)

    zero.inorderTraversal(zero, listResult)
    return listOf()
}

//fun main() {
//    demoFun()

//    inorderTraversalDemo()

//    inorderTraversalDemo2()
//}