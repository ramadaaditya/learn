package hackerrank

fun minMaxSum(arr: Array<Int>): Unit {
    var totalSum = 0L
    for (i in 0..4) {
        totalSum = totalSum + arr[i]
    }
    val minValue = arr.minOrNull() ?: 0
    val maxValue = arr.maxOrNull() ?: 0
    val minSum = totalSum - maxValue
    val maxSum = totalSum - minValue
    println("$minSum $maxSum")
}

fun main() {
    minMaxSum(arrayOf(1, 2, 3, 4, 5))
    minMaxSum(arrayOf(7, 69, 2, 221, 8974))
}