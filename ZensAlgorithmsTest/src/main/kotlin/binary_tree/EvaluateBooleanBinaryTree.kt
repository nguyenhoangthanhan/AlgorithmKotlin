package binary_tree

fun evaluateBooleanBinaryTreeDemo2() {
    val zero = BinaryNode(2)
    zero.left = BinaryNode(1)

    zero.right = BinaryNode(3)
    zero.right?.left = BinaryNode(0)
    zero.right?.right = BinaryNode(1)

    val result = zero.evaluateBooleanBinaryTree(zero)
    println(result)
}

fun main() {
    evaluateBooleanBinaryTreeDemo2()
}