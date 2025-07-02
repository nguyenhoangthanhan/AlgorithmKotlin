package binary_tree

fun invertTreeDemo2() {
    val zero = BinaryNode(4)
    zero.left = BinaryNode(2)
    zero.left?.left = BinaryNode(1)
    zero.left?.right = BinaryNode(3)

    zero.right = BinaryNode(7)
    zero.right?.left = BinaryNode(6)
    zero.right?.right = BinaryNode(9)

    val newNode = BinaryNode(zero.value)
    zero.invertTree(zero, newNode, "")

    newNode.printBinaryTree(newNode, 0)
    for ((key, value) in newNode.listResult) {
        for (i in value) {
            print("$i,")
        }
    }
}

fun main() {
    invertTreeDemo2()
}