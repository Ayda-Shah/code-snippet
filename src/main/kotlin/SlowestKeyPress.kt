import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val column = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)

    println(findSlowestKeyPress(scanner, n))
}

fun findSlowestKeyPress(scanner: Scanner, n: Int): Char {
    var maxDiff = 0
    var slowestKeyAsciiCode = 0
    var previousTime = 0

    if (n == 1) {
        val (key, time) = scanner.nextLine()!!.split(' ').map(String::toInt)
        return (key + 97).toChar()
    }

    for (i in 0 until n) {
        val (key, time) = scanner.nextLine()!!.split(' ').map(String::toInt)
        if (i == 1) slowestKeyAsciiCode = (key + 97)
        val diff: Int = time - previousTime
        if (diff > maxDiff) {
            maxDiff = diff
            slowestKeyAsciiCode = key + 97
        }
        previousTime = time
    }

    return slowestKeyAsciiCode.toChar()
}