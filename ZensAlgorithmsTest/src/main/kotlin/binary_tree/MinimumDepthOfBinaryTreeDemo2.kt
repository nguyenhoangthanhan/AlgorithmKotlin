//package binary_tree
//
//fun minDepthDemo(): Int {
//    val zero = BinaryNode(1)
//    zero.leftChild = null
//    zero.rightChild = BinaryNode(2)
//    zero.rightChild?.leftChild = BinaryNode(3)
//
//    zero.minDepth(zero, 0)
//    return zero.resultMinDepth
//}
//
//fun minDepthDemo2(): Int {
//    val zero = BinaryNode(1)
//    zero.leftChild = BinaryNode(9)
//    zero.rightChild = BinaryNode(20)
//    zero.rightChild?.leftChild = BinaryNode(15)
//    zero.rightChild?.rightChild = BinaryNode(7)
//
//    zero.minDepth(zero, 0)
//    return zero.resultMinDepth
//}
//
//fun main() {
////    val result = minDepthDemo()
////    println(result)
//
//    val result2 = minDepthDemo2()
//    println(result2)
//}