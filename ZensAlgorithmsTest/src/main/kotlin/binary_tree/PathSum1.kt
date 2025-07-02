package binary_tree

fun pathSumDemo1() {
    val zero = BinaryNode(5)
    zero.left = BinaryNode(4)
    zero.left?.left = BinaryNode(11)
    zero.left?.left?.left = BinaryNode(7)
    zero.left?.left?.right = BinaryNode(2)

    zero.right = BinaryNode(8)
    zero.right?.left = BinaryNode(13)
    zero.right?.right = BinaryNode(4)
    zero.right?.right?.right = BinaryNode(1)

    println(zero.pathSum(zero, 22))
}

fun pathSumDemo2() {
    val zero = BinaryNode(1)
    zero.left = BinaryNode(-2)
    zero.left?.left = BinaryNode(1)
    zero.left?.right = BinaryNode(3)
    zero.left?.left?.left = BinaryNode(-1)

    zero.right = BinaryNode(-3)
    zero.right?.left = BinaryNode(-2)
    zero.right?.right?.right = BinaryNode(1)

    println(zero.pathSum(zero, 3))
}

fun main() {
    pathSumDemo1()
}