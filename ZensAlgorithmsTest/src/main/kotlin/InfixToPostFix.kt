import java.lang.StringBuilder
import java.util.Stack

class InfixToPostFix {

    fun prec(c: Char): Int {
        return if (c == '^') {
            3;
        } else if (c == '/' || c == '*') {
            2;
        } else if (c == '+' || c == '-') {
            1
        } else
            -1
    }

    // Function to return associativity of operators
    fun associativity(c: Char): Char{
        if (c == '^'){
            return 'R'
        }
        return 'L' // Default to left-associative
    }

    // The main function to convert infix expression to postfix expression
    fun infixToPostfix(s: String) {
        val result = StringBuilder()
        val stack = Stack<Char>()

        for (i in s.indices step 1){
            val c = s[i]

            // If the scanned character in an operand, add it to the output string.
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                result.append(c)
            }
            // If the scanned character is an `(`, push it to the stack.
            else if (c == '('){
                stack.push(c)
            }
            // If the scanned character is an '(', pop and add to the output string from the stack
            // until an '(' is encountered.
            else if (c == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop())
                }
                stack.pop() // Pop '(
            }
            // if an operator is scanned
            else {
                while (!stack.isEmpty() && (prec(s[i]) < prec(stack.peek()) ||
                        prec(s[i]) == prec(stack.peek()) &&
                        associativity(s[i]) == 'L')){
                    result.append(stack.pop())
                }
                stack.push(c)
            }
        }

        // Pop all the remaining elements from the stack
        while (!stack.isEmpty()){
            result.append(stack.pop())
        }

        println(result)
    }

    fun solution() {

    }
}