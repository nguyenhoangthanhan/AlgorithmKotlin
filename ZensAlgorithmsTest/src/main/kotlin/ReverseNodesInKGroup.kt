//class ReverseNodesInKGroup {
//    fun reserveKGroup(head: ListNode?, k: Int){
//        var cur = head
//        var prev: ListNode?= null
//        var newHead = head
//        while (cur != null){
//            var i = 0
//            var end = cur
//            while (end != null && i < k){
//                end = end?.next
//                i++
//            }
//            if (i == k){
//                if (cur = head){
//                    newHead = reverse(cur,end)
//                }
//                prev = cur
//                cur = end
//            }
//        }
//        return newHead
//    }
//
//    fun reverse(cur1: ListNode?, end: ListNode?): ListNode?{
//        var prev = end
//        var cur = cur1
//
//        while (cur != end){
//            val temp = cur?.next
//            cur?.next = prev
//            prev = cur
//            cur = temp
//        }
//        return prev
//    }
//}