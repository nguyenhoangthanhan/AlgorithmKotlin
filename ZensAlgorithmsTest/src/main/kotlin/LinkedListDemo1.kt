class LinkedListDemo1 {
    //https://blog.logrocket.com/arraylist-vs-linkedlist-kotlin-data-structure/
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

        var list4 = ArrayList<Int>()
        list4.addAll(listOf(1, 2, 3))
// setting 4 in position 1
        list4.set(1, 4)
        println(list4) // [1, 4, 3]

        var list5 = ArrayList<Int>()
        list5.addAll(listOf(1, 2, 3))
        println(list5.indexOf(1)) // 0
        println(list5.indexOf(4)) // -1

        var list6 = ArrayList<Int>()
        list6.addAll(listOf(1, 2, 3))
// removing the element 2 from the list
        list6.remove(2)
        println(list6) // [1, 3]

        var list7 = ArrayList<Int>()
        list7.addAll(listOf(1, 2, 3))
// removing the element of index 0 from the list
        list7.removeAt(0)
        println(list7) // [2, 3]

        var list8 = ArrayList<Int>()
        list8.addAll(listOf(1, 2, 3))
// clearing the list
        list8.clear()
        println(list8) // []

        var list9 = ArrayList<Int>()
// adding 1, 2, 3 to the list
        list9.addAll(listOf(1, 2, 3))
        println(list9.size) // 3

        // initializing an ArrayList with the [1, 2, 3] list
        val list10 = ArrayList<Int>(listOf(1,2,3))
        println(list10)

        // getting an ArrayList from the [1, 2, 3] list
        val list11 = arrayListOf(1, 2, 3)
// printing the Class name of list
        println(list11::class.simpleName)
        println(list11)
    }
}