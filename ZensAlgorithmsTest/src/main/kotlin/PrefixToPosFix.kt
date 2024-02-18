import java.util.Stack

class PrefixToPosFix {

    fun isOperator(x: Char): Boolean {
        when (x) {
            '+', '-', '*', '/' -> return true
        }
        return false
    }

    fun preToPos(preInput: String): String{
        val s = Stack<String>()

        // length of expression
        val sizeOfInput = preInput.length

        // reading from right to left
        for (i in sizeOfInput - 1 downTo 0 step 1){
            if (isOperator(preInput[i])){
                val op1 = s.peek()
                s.pop()
                val op2 = s.peek()
                s.pop()

                // concat the operands and operator
                val temp = op1 + op2 + preInput[i]

                // Push String temp back to stack
                s.push(temp)
            }

            // if symbol is an operand
            else {
                // push the operand to the stack
                s.push(preInput[i] + "")
            }
        }

        // stack contains only Postfix expression
        return s.peek()
    }
}