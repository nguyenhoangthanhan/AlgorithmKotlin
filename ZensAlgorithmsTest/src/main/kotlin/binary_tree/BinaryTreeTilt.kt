package binary_tree


fun binaryTreeTiltDemo1() {
    val zero = BinaryNode(1)
    zero.left = BinaryNode(2)

    zero.right = BinaryNode(3)
    zero.binaryTreeTilt(zero)
    println(zero.binaryTreeTiltResult)
}
fun binaryTreeTiltDemo2() {
    val zero = BinaryNode(4)
    zero.left = BinaryNode(2)
    zero.left?.left = BinaryNode(3)
    zero.left?.right = BinaryNode(5)

    zero.right = BinaryNode(9)
    zero.right?.right = BinaryNode(7)
    zero.binaryTreeTilt(zero)
    println(zero.binaryTreeTiltResult)
}
fun binaryTreeTiltDemo3() {
    val zero = BinaryNode(21)
    zero.left = BinaryNode(7)
    zero.left?.left = BinaryNode(1)
    zero.left?.left?.left = BinaryNode(3)
    zero.left?.left?.right = BinaryNode(3)
    zero.left?.right = BinaryNode(1)

    zero.right = BinaryNode(14)
    zero.right?.left = BinaryNode(2)
    zero.right?.right = BinaryNode(2)
    zero.binaryTreeTilt(zero)
    println(zero.binaryTreeTiltResult)
}

fun main() {
    binaryTreeTiltDemo3()
}