package binary_tree

class BinaryNode<T>(val value: T) {
    var leftChild: BinaryNode<T>? = null
    var rightChild: BinaryNode<T>? = null

    override fun toString() = ""
    var listResult:MutableMap<Int, MutableList<T>> = mutableMapOf()

    private fun diagram(node: BinaryNode<T>?,
                        top: String = "",
                        root: String = "",
                        bottom: String = ""): String {
        return root?.let {
            if (node?.leftChild == null && node?.rightChild == null){
                "$root${node?.value}\n"
            } else {
                diagram(node?.rightChild, "$top ", "$top ┌──", "$top| ") +
                        root + "${node?.value}\n" + diagram(node?.leftChild, "$bottom| ", "$bottom└──", "$bottom ")
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
        note.leftChild?.let {
            printBinaryTree(it, tempDeep)
        }
        note.rightChild?.let {
            printBinaryTree(it, tempDeep)
        }
    }
    fun inorderTraversal(note: BinaryNode<T>, listResult: MutableList<T>) {
        note.leftChild?.let {
            inorderTraversal(it, listResult)
        }
        note?.value?.let {
            listResult.add(it)
        }
        print("${note.value},")
        note.rightChild?.let {
            inorderTraversal(it, listResult)
        }
    }


    var resultMinDepth = Int.MAX_VALUE
    fun minDepth(note: BinaryNode<T>, deep: Int) {
        val tempDeep = deep + 1
        if (note.rightChild == null && note.leftChild == null) {
            if (resultMinDepth > tempDeep) {
                resultMinDepth = tempDeep
            }
        }

        note.leftChild?.let {
            minDepth(it, tempDeep)
        }
        note.rightChild?.let {
            minDepth(it, tempDeep)
        }
    }


    var pathSumCurrent = 0
    fun pathSum(note: BinaryNode<Int>, targetSum: Int): Boolean {
        pathSumCurrent += note.value
//        println("pathSumCurrent = $pathSumCurrent")
//        println("note.value = ${note.value}")
        if (note.rightChild == null && note.leftChild == null) {
            if (pathSumCurrent == targetSum) {
                return true
            }
        }
        note.leftChild?.let {
            val leftR = pathSum(it, targetSum)
            if (leftR) {
                return true
            }
        }
        note.rightChild?.let {
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
        note.leftChild?.let {
            binaryTreePreorderTraversal(it)
        }
        note.rightChild?.let {
            binaryTreePreorderTraversal(it)
        }
    }

    val listResultBinaryTreePostorderTraversal = mutableListOf<Int>()
    fun binaryTreePostorderTraversal(note: BinaryNode<Int>) {
        note.leftChild?.let {
            binaryTreePostorderTraversal(it)
        }
        note.rightChild?.let {
            binaryTreePostorderTraversal(it)
        }
        listResultBinaryTreePostorderTraversal.add(note.value)
    }

    var countCompleteTreeNodesR = 0
    fun countCompleteTreeNodes(note: BinaryNode<Int>) {
        countCompleteTreeNodesR ++
        note.leftChild?.let {
            countCompleteTreeNodes(it)
        }
        note.rightChild?.let {
            countCompleteTreeNodes(it)
        }
    }
}

fun demoFun(){
    val zero = BinaryNode(1)
    zero.leftChild = BinaryNode(2)
    zero.rightChild = BinaryNode(3)
    zero.leftChild?.leftChild = BinaryNode(4)
    zero.leftChild?.leftChild?.leftChild = BinaryNode(8)
    zero.leftChild?.leftChild?.rightChild = BinaryNode(9)
    zero.leftChild?.rightChild = BinaryNode(5)
    zero.rightChild?.leftChild = BinaryNode(6)
    zero.rightChild?.rightChild = BinaryNode(7)

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
    zero.leftChild = null
    zero.rightChild = BinaryNode(2)
    zero.rightChild?.leftChild = BinaryNode(3)

    zero.inorderTraversal(zero, listResult)
    return listOf()
}

fun inorderTraversalDemo2(): List<Int> {
    val listResult = mutableListOf<Int>()
    val zero = BinaryNode(1)
    zero.leftChild = BinaryNode(2)
    zero.leftChild?.leftChild = BinaryNode(4)
    zero.leftChild?.rightChild = BinaryNode(5)
    zero.leftChild?.rightChild?.leftChild = BinaryNode(6)
    zero.leftChild?.rightChild?.rightChild = BinaryNode(7)
    zero.rightChild = BinaryNode(3)
    zero.rightChild?.rightChild = BinaryNode(8)
    zero.rightChild?.rightChild?.leftChild = BinaryNode(9)

    zero.inorderTraversal(zero, listResult)
    return listOf()
}

//fun main() {
//    demoFun()

//    inorderTraversalDemo()

//    inorderTraversalDemo2()
//}