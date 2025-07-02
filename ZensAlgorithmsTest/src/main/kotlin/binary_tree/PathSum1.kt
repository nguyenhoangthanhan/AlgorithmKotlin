package binary_tree

fun pathSumDemo1() {
    val zero = BinaryNode(5)
    zero.leftChild = BinaryNode(4)
    zero.leftChild?.leftChild = BinaryNode(11)
    zero.leftChild?.leftChild?.leftChild = BinaryNode(7)
    zero.leftChild?.leftChild?.rightChild = BinaryNode(2)

    zero.rightChild = BinaryNode(8)
    zero.rightChild?.leftChild = BinaryNode(13)
    zero.rightChild?.rightChild = BinaryNode(4)
    zero.rightChild?.rightChild?.rightChild = BinaryNode(1)

    println(zero.pathSum(zero, 22))
}

fun pathSumDemo2() {
    val zero = BinaryNode(1)
    zero.leftChild = BinaryNode(-2)
    zero.leftChild?.leftChild = BinaryNode(1)
    zero.leftChild?.rightChild = BinaryNode(3)
    zero.leftChild?.leftChild?.leftChild = BinaryNode(-1)

    zero.rightChild = BinaryNode(-3)
    zero.rightChild?.leftChild = BinaryNode(-2)
    zero.rightChild?.rightChild?.rightChild = BinaryNode(1)

    println(zero.pathSum(zero, 3))
}

fun main() {
    pathSumDemo1()
}