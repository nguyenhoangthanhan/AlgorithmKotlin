fun reverseInteger(x: Int): Int {
    var result = 0L
    var temp: Int = if (x < 0) {
        -x
    } else {
        x
    }
    var checkFirstTime = false
    while (temp > 0) {
        if (temp % 10 == 0 && !checkFirstTime) {
            temp /= 10
        } else {
            checkFirstTime = true
            result = result * 10 + temp % 10
            temp /= 10
        }
    }
    return if (x < 0) {
        val returnResult: Long = (0 - result)
        if (returnResult >= Int.MIN_VALUE + 1) {
            returnResult.toInt()
        } else {
            0
        }
    } else {
        if (result <= Int.MAX_VALUE - 1) {
            result.toInt()
        } else {
            0
        }
    }
}

fun main() {
    val demo3 = 123
    val result3 = reverseInteger(demo3)
    println(result3)

    val demo1 = -123
    val result1 = reverseInteger(demo1)
    println(result1)

    val demo2 = 901000
    val result2 = reverseInteger(demo2)
    println(result2)
}