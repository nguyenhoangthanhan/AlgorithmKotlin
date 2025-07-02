//package binary_tree
//
//fun binaryTreePreorderTraversalDemo1() {
//    val zero = BinaryNode(1)
//    zero.rightChild = BinaryNode(2)
//    zero.rightChild?.leftChild = BinaryNode(3)
//
//    zero.binaryTreePreorderTraversal(zero)
//    println(zero.listResultBinaryTreePreorderTraversal)
//}
//
//fun binaryTreePreorderTraversalDemo2() {
//    val zero = BinaryNode(1)
//    zero.leftChild = BinaryNode(2)
//    zero.leftChild?.leftChild = BinaryNode(4)
//    zero.leftChild?.rightChild = BinaryNode(5)
//    zero.leftChild?.rightChild?.leftChild = BinaryNode(6)
//    zero.leftChild?.rightChild?.rightChild = BinaryNode(7)
//
//    zero.rightChild = BinaryNode(3)
//    zero.rightChild?.rightChild = BinaryNode(8)
//    zero.rightChild?.rightChild?.leftChild = BinaryNode(9)
//
//    zero.binaryTreePreorderTraversal(zero)
//    println(zero.listResultBinaryTreePreorderTraversal)
//}
//
//fun main() {
//    binaryTreePreorderTraversalDemo2()
//}