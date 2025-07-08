package binary_tree

fun diameterOfBinaryTreeDemo1() {
    val zero = BinaryNode(4)
    zero.left = BinaryNode(-7)

    zero.right = BinaryNode(-3)
    zero.right?.left = BinaryNode(-9)
    zero.right?.left?.left = BinaryNode(9)
    zero.right?.left?.left?.left = BinaryNode(6)
    zero.right?.left?.left?.left?.left = BinaryNode(0)
    zero.right?.left?.left?.left?.left?.right = BinaryNode(-1)
    zero.right?.left?.left?.left?.right = BinaryNode(6)
    zero.right?.left?.left?.left?.right?.left = BinaryNode(-4)
    zero.right?.left?.right = BinaryNode(-7)
    zero.right?.left?.right?.left  = BinaryNode(-6)
    zero.right?.left?.right?.left?.left  = BinaryNode(9)
    zero.right?.left?.right?.right = BinaryNode(-6)
    zero.right?.left?.right?.left?.left  = BinaryNode(9)
    zero.right?.left?.right?.left?.left?.left  = BinaryNode(-2)

    zero.right?.right = BinaryNode(-3)
    zero.right?.right?.left = BinaryNode(-4)

    println(zero.diameterOfBinaryTree(zero))

}
fun diameterOfBinaryTreeDemo2() {
    val zero = BinaryNode(1)
    zero.left = BinaryNode(2)
    zero.left?.left = BinaryNode(4)
    zero.left?.right = BinaryNode(5)

    zero.right = BinaryNode(3)

    println(zero.diameterOfBinaryTree(zero))

}

fun main() {
    diameterOfBinaryTreeDemo1()
}