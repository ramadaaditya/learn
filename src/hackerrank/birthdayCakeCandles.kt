package hackerrank

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var count = 0
    var maxHeight = 0
    for (i in candles) {
        if (i > maxHeight) {
            maxHeight = i
            count = 1
        } else if (i == maxHeight) {
            count = count + 1
        }
    }
    return count
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
