/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var resultListNode: ListNode = ListNode(-1)
        var head: ListNode = resultListNode
        var tempL1 = l1
        var tempL2 = l2
        var list1 = mutableListOf<Int>()
        var list2 = mutableListOf<Int>()
        var list3 = listOf<Int>()


        while (tempL1 != null) {
            list1.add(0, tempL1.`val`)
            tempL1 = tempL1.next
        }

        while (tempL2 != null) {
            list2.add(0, tempL2.`val`)
            tempL2 = tempL2.next
        }

        if (list1.isEmpty()) {
            if (list2.isNotEmpty()) {
                list3 = list2.reversed()
            }
        } else {
            list3 = if (list2.isNotEmpty()) {
                if (list1.size > list2.size) {
                    calculateList(listLonger = list1, listShorter = list2, list1.size)
                } else {
                    calculateList(listLonger = list2, listShorter = list1, list2.size)
                }
            } else {
                list1.reversed()
            }
        }

        if (list3.isNotEmpty()) {
            resultListNode.`val` = list3[0]
            for (i in 1..list3.size - 1 step 1) {
                resultListNode.next = ListNode(list3[i])
                resultListNode = resultListNode.next
            }
        }
        return head
    }

    fun calculateList(listLonger: MutableList<Int>, listShorter: MutableList<Int>, size: Int): MutableList<Int> {
        val listResult = mutableListOf<Int>()
        var remember = 0
        var i = 0
        while (i < size) {
            if (i < listShorter.size) {
                val resultPlus = plusReturnRemember(listLonger[listLonger.size - 1 - i], listShorter[listShorter.size - 1 - i], remember)
                listResult.add(resultPlus.first)
                remember = resultPlus.second
            } else {
                val resultPlus = plusReturnRemember(listLonger[listLonger.size - 1 - i], 0, remember)
                listResult.add(resultPlus.first)
                remember = resultPlus.second
            }
            i++
            if (i == size && remember > 0) {
                listResult.add(remember)
            }
        }
        return listResult
    }

    fun plusReturnRemember(a: Int, b: Int, remember: Int): Pair<Int, Int> {
        return if (a + b + remember < 10) {
            Pair(a + b + remember, 0)
        } else {
            Pair((a + b + remember) % 10, (a + b + remember) / 10)
        }
    }
}