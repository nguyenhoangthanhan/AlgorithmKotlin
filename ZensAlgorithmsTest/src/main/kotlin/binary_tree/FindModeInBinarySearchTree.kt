package binary_tree

val resultFindModeInBinarySearchTree: MutableMap<Int, Int> = mutableMapOf()
fun findModeInBinarySearchTree(note: BinaryNode<Int>) {
    if (!resultFindModeInBinarySearchTree.containsKey(note.value)) {
        resultFindModeInBinarySearchTree[note.value] = 1
    } else {
        resultFindModeInBinarySearchTree[note.value] =
                resultFindModeInBinarySearchTree.getValue(note.value) + 1
    }

    note.left?.let {
        findModeInBinarySearchTree(it)
    }
    note.right?.let {
        findModeInBinarySearchTree(it)
    }
}

fun main() {

    val binaryNode = BinaryNode(4)
    binaryNode.left = BinaryNode(2)
    binaryNode.left?.left = BinaryNode(1)
    binaryNode.left?.right = BinaryNode(3)

    binaryNode.right = BinaryNode(7)
    binaryNode.right?.left = BinaryNode(6)
    binaryNode.right?.right = BinaryNode(9)

    findModeInBinarySearchTree(binaryNode)

    val listResult = mutableListOf<Int>()
    var maxValue = Int.MIN_VALUE
    for ((key, value) in resultFindModeInBinarySearchTree) {
        when {
            value > maxValue -> {
                maxValue = value
                listResult.clear()
                listResult.add(key)
            }

            value == maxValue -> {
                listResult.add(key)
            }
        }
    }

    val intArrayResult = IntArray(listResult.size)
    listResult.forEachIndexed { index, data ->
        intArrayResult[index] = data
    }
    println(intArrayResult)
}