package binary_tree


fun binaryTreePostorderTraversalDemo1() {
    val zero = BinaryNode(1)
    zero.right = BinaryNode(2)
    zero.right?.left = BinaryNode(3)

    zero.binaryTreePostorderTraversal(zero)
    println(zero.listResultBinaryTreePostorderTraversal)
}

fun binaryTreePostorderTraversalDemo2() {
    val zero = BinaryNode(1)
    zero.left = BinaryNode(2)
    zero.left?.left = BinaryNode(4)
    zero.left?.right = BinaryNode(5)
    zero.left?.right?.left = BinaryNode(6)
    zero.left?.right?.right = BinaryNode(7)

    zero.right = BinaryNode(3)
    zero.right?.right = BinaryNode(8)
    zero.right?.right?.left = BinaryNode(9)

    zero.binaryTreePostorderTraversal(zero)
    println(zero.listResultBinaryTreePostorderTraversal)
}

fun main() {
    binaryTreePostorderTraversalDemo2()
}