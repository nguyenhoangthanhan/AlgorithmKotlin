class LinkedListDemo1 {
    fun demo() {
        // initializing an empty ArrayList
        var list = ArrayList<Int>()
// adding 1 to the list
        list.add(1)
// adding 2 to the list
        list.add(2)
        println(list) // [1, 2]

// adding 3 in position 1
        list.add(1, 3)
        println(list) // [1, 3, 2]

        var list2 = ArrayList<Int>()
// adding 1, 2, 3 to the list
        list2.addAll(listOf(1, 2, 3))
        println(list2) // [1, 2, 3]

        var list3 = ArrayList<Int>()
        list3.addAll(listOf(1, 2, 3))
// getting the element of index 1
        println(list3.get(1)) // 2
    }
}