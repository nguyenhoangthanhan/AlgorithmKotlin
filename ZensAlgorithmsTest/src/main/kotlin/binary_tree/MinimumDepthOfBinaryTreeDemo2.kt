package binary_tree

fun minDepthDemo(): Int {
    val zero = BinaryNode(1)
    zero.left = null
    zero.right = BinaryNode(2)
    zero.right?.left = BinaryNode(3)

    zero.minDepth(zero, 0)
    return zero.resultMinDepth
}

fun minDepthDemo2(): Int {
    val zero = BinaryNode(1)
    zero.left = BinaryNode(9)
    zero.right = BinaryNode(20)
    zero.right?.left = BinaryNode(15)
    zero.right?.right = BinaryNode(7)

    zero.minDepth(zero, 0)
    return zero.resultMinDepth
}

fun main() {
//    val result = minDepthDemo()
//    println(result)

    val result2 = minDepthDemo2()
    println(result2)
}