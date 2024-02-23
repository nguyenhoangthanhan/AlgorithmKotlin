class MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists == null || lists.length == 0){
            return null
        }
        return mergeKListsHelper(lists, 0, lists.length - 1)
    }

    private fun mergeKListsHelper(lists: ListNode[], start: Int, end: Int){
        if (start == end){
            return lists[start]
        }
        if (start + 1 == end){
            return merge(list[start], list[end])
        }
        int mid = start + (end - start) / 2
        val left = mergeKListsHelper(lists, start, mid)
        val right = mergeKListsHelper(lists, mid + 1, end)
        return merge(left, right)
    }

    private fun merge(l1 : ListNode, l2 : ListNode){
        val dummy = ListNode(0)
        val curr = dummy

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                curr.next = l1
                l1 = l1.next
            }else{
                curr.next = l2
                l2 = l2.next
            }
            curr = curr.next
        }
        curr.next = dummy
    }

    curr.next = (l1 != null) ? l1 : l2

    return dummy.next
}