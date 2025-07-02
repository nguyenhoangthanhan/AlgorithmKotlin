package binary_tree


fun binaryTreePostorderTraversalDemo1() {
    val zero = BinaryNode(1)
    zero.rightChild = BinaryNode(2)
    zero.rightChild?.leftChild = BinaryNode(3)

    zero.binaryTreePostorderTraversal(zero)
    println(zero.listResultBinaryTreePostorderTraversal)
}

fun binaryTreePostorderTraversalDemo2() {
    val zero = BinaryNode(1)
    zero.leftChild = BinaryNode(2)
    zero.leftChild?.leftChild = BinaryNode(4)
    zero.leftChild?.rightChild = BinaryNode(5)
    zero.leftChild?.rightChild?.leftChild = BinaryNode(6)
    zero.leftChild?.rightChild?.rightChild = BinaryNode(7)

    zero.rightChild = BinaryNode(3)
    zero.rightChild?.rightChild = BinaryNode(8)
    zero.rightChild?.rightChild?.leftChild = BinaryNode(9)

    zero.binaryTreePostorderTraversal(zero)
    println(zero.listResultBinaryTreePostorderTraversal)
}

fun main() {
    binaryTreePostorderTraversalDemo2()
}