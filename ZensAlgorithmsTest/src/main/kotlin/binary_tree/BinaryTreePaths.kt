package binary_tree

fun binaryTreePathsDemo() {
    val zero = BinaryNode(1)
    zero.left = BinaryNode(2)
    zero.left?.right = BinaryNode(5)

    zero.right = BinaryNode(3)

    zero.right?.right = BinaryNode(3)

    zero.binaryTreePaths(zero)
    println(zero.resultOfBinaryTreePaths)
}
fun binaryTreePathsDemo2() {
    val zero = BinaryNode(1)
    zero.binaryTreePaths(zero)
    println(zero.resultOfBinaryTreePaths)
}

fun main() {
    binaryTreePathsDemo()
}