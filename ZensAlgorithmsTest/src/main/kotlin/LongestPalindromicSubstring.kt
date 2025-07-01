//
//fun longestPalindromicSubstring(s: String): String {
//    if (s.length < 2) return s
//    if (s.length == 2) {
//        return if (s[0] == s[1]) {
//            s
//        } else {
//            s[0].toString()
//        }
//    }
//
//    var i = 1
//    var result = ""
//    while (i < s.length - 1) {
//        if (i == 1 && s[1] == s[0] && s.length == 3){
//            result = s[0].toString() + s[1].toString()
//        }
//        var countEven: Int
//        var tempResultOdd: String
//        var tempResultEven = ""
//        if (s[i] == s[i+1]) {
//            countEven = if (i < s.length - 1 - (i+1)) i + 1 else s.length - (i+1)
//            if (countEven < 0) countEven = 0
//            tempResultEven = s[i].toString() + s[i + 1].toString()
//            var j = 0
//            j++
//            while (j < countEven) {
//                if (s[i - j] == s[i + j + 1]) {
//                    tempResultEven = s[i-j].toString() + tempResultEven + s[i-j].toString()
//                } else {
//                    break
//                }
//                j++
//            }
//        }
//
//        val count: Int = if (i < s.length - 1 - i) i + 1 else s.length - i
//        tempResultOdd = s[i].toString()
//
//        var k = 0
//        k++
//        while (k < count) {
//            if (s[i - k] == s[i + k]) {
//                tempResultOdd = s[i - k].toString() + tempResultOdd + s[i - k].toString()
//            } else {
//                break
//            }
//            k++
//        }
//
//        if (tempResultOdd.length > result.length) {
//            result = tempResultOdd
//        }
//
//        if (tempResultEven.length > result.length) {
//            result = tempResultEven
//        }
//
//        if (result.length > (s.length - 1 - i) * 2) {
//            return result
//        }
//
//        i++
//    }
//    return result
//}
//
//fun main() {
//
////    val demo1 = "babad"
////    val result1 = longestPalindromicSubstring(demo1)
////    println(result1)
////
////    val demo2 = "cbbd"
////    val result2 = longestPalindromicSubstring(demo2)
////    println(result2)
//
//    val demo3 = "aacabdkacaa"
//    val result3 = longestPalindromicSubstring(demo3)
//    println(result3)
//
////    val demo4 = "aaaa"
////    val result4 = longestPalindromicSubstring(demo4)
////    println(result4)
//}