/*
* Slowest Key Press
*   Engineers have redesigned a keypad used by ambulance drivers in urban areas. In order to determine which key
*   takes the longest time to press, the keypad is tested by a driver. Given the results of that test, determine which key
*   takes the longest to press.
*
* Example
*   keyTimes = [[0.2],[1,5],[0,9],[2,15]]]
*
*   Elements in keyTimes(1)[0] represent encoded characters in the range ascila-z]where a = 0, b = 1, ..., 2 = 25. The
*   second element, keyTimes(1)/1] represents the time the key is pressed since the start of the test. The elements will
*   be given in ascending time order. In the example, keys pressed, in order are 0102encoded =abac at times 2, 5, 9, 15.
*   From the start time, it took 2-0 = 2to press the first key, 5 - 2 = 3 to press the second, and so on. The longest time it
*   took to press a key was key 2, or C;, at 15 - 9 = 6.
*
* Function Description
*   Complete the function slowestKey in the editor below.
*
* slowestKey has the following parameter(s):
*   int keyTimes[n](2]: the first column contains the encoded key pressed, the second contains the time at which it was
*   pressed
*
* Returns:
* char, the key that took the longest time to press
*
* Constraints
* 1 ≤ n ≤ 10 pow 5
* O ≤ keyTimes[i][0] ≤ 25 (0 si < n)
* There will only be one key with the worst time.
* keyTimes is sorted in ascending order of keyTimes[i][1]
*
* Input Format For Custom Testing
* The first line contains an integer, n, the number of elements in keyTimes.
* The second line contains the integer 2, the number of columns in each keyTimes[i).
* Each line / of the n subsequent lines (where 0 s/ < n) contains two space-separated integers, keyTimes[i][O]and
* keyTimes[i][1]
*/

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