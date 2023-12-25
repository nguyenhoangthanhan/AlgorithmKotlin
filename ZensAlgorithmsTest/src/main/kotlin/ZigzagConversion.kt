class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows <= 1) return s
        var listMatrix = mutableListOf<List<Char>>()
        var tempS = s
        var i = 0
        var result = ""
//        println("tempS.0 = " + tempS[0])
        var checkEmpty = false
        var k = numRows - 2
        while (!tempS.isEmpty()) {
//            println("tempS = $tempS; i = $i")
            if (i == 0 || (i % (numRows - 1) == 0)) {
//                println("[[$i % ($numRows - 1)= ]]" + (i % (numRows - 1)))
                val list = mutableListOf<Char>()

                for (j in 0..numRows - 1 step 1) {
                    if (tempS.isNotEmpty()) {
                        val t = tempS[0]
                        list.add(t)
                        tempS = tempS.substring(1);
                    }else{
                        checkEmpty = true
                        list.add(' ')
                    }
                }
                listMatrix.add(list)
                if (checkEmpty) break
            } else {
                if (!tempS.isEmpty()) {
                    val list = MutableList(numRows) { index -> ' ' }
//                    println("--------------------------------------------------------------------")
//                    println("$numRows - 1 - ($i % $numRows)= " + (numRows - 1 - (i % numRows)))
                    list[numRows - 1 - (i % (numRows - 1))] = tempS[0]
                    tempS = tempS.substring(1);
                    listMatrix.add(list)
                }
            }
            i++
        }
//        println(listMatrix.toString())

        for (i in 0..numRows - 1 step 1) {
            for (j in 0..listMatrix.size - 1 step 1) {
                if (listMatrix[j][i] != ' ') {
                    result += listMatrix[j][i]
                }
            }
        }
        return result
    }
}