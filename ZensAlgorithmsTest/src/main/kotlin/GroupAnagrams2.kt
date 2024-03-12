class GroupAnagrams2 {
    fun groupAnagrams(strs: Array<String>): List<List<String>>{
        return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
    }
}