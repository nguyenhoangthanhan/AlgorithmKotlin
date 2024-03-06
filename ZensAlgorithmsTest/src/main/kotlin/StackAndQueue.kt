class StackAndQueue {

    fun implementStack(){

        val stack = java.util.ArrayDeque<Int>()

        //Push elements onto the stack
        stack.push(10)
        stack.push(20)
        stack.push(30)

        // Accessing the top element
        val topElement = stack.peek()
        println(topElement) //Output: 30

        // Popping elements from the stack
        val poppedElement = stack.pop()
        println(poppedElement) //Output: 30

        // Check if the stack is empty
        val isEmpty = stack.isEmpty()
        println(isEmpty) // Output false

        // Print the remain in the stack
        println(stack)



    }
}