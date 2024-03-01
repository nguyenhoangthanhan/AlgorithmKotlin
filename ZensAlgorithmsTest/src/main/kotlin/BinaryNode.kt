typealias Visitor<T> = (T) -> Unit

class BinaryNode<T>(val value: T) {
    var leftChild: BinaryNode<T>? = null
    var rightChild: BinaryNode<T>? = null

    fun demoFun(){
        val zero = BinaryNode(0)
        val one = BinaryNode(1)
        val five = BinaryNode(5)
        val seven = BinaryNode(7)
        val eight = BinaryNode(8)
        val nine = BinaryNode(9)
        seven.leftChild = one
        one.leftChild = zero
        one.rightChild = five
        seven.rightChild = nine
        nine.leftChild = eight

        val tree = seven
        println(tree)
    }

    override fun toString() = diagram(this)

    private fun diagram(node: BinaryNode<T>?,
                         top: String = "",
                        root: String = "",
                        bottom: String = ""): String {
        return root?.let {
            if (node?.leftChild == null && node?.rightChild == null){
                "$root${node?.value}\n"
            } else {
                diagram(node?.rightChild, "$top ", "$top ┌──", "$top| ") +
                        root + "${node?.value}\n" + diagram(node?.leftChild, "$bottom| ", "$bottom└──", "$bottom ")
            }
        } ?: "${root}null\n"
    }
}