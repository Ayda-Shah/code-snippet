/**
* Meetup Schedule
*   A start-up owner is looking to meet new investors to get some funds for his
*   company. Each investor has a tight schedule that the owner has to respect.
*   Given the schedules of the days investors are available, determine how many
*   meetings the owner can schedule. Note that the owner can only have one
*   meeting per day.
*   The schedules consists of two integer arrays, firstDay and lastDay. Each
*   element in the array firstDay represents the first day an investor is available,
*   and each element in lastDay represents the last day an investor is available,
*   both inclusive.
*
* Example:
*   firstDay=[1,2,3,3,3]
*   lastDay=[2,2,3,4,4]
*
*   There are 5 investors [I-0, 1-1, 1-2, 1-3, I-4]
*   The investor 1-0 is available from day 1 to day 2 inclusive [1, 2]
*   The investor 1-1 is available in day 2 only [2, 2]. The investor I-2 is available in day
*   3 only [3, 3]
*   The investors I-3 and 1-4 are available from day 3 to day 4 only [3, 4]
*   The owner can only meet 4 investors out of 5: 1-0 in day 1, I-1 in day 2, I-2 in day
*   3 and 1-3 in day 4. The graphic below shows the scheduled meetings in green
*   and blocked days are in gray.
*
* Function Description
*   Complete the function countMeetings in the editor below.
*   countMeetings has the following parameters:
*   int firstDay[n]: an array of integers where the value of each element
*   firstDay[i]: is the first day the pit investor is available to meet.
*   int lastDay[n]: an array of integers where the value of each element
*   lastDay[i]: is the last day the jh investor is available to meet.
*   Returns:
*   int: an integer that represents the maximum number of meetings possible.
*
* Constraints
*   1 ≤ n ≤ 105
*   1 ≤ firstDay[i],lastDay[i] ≤ 10 pow 5 (where O ≤ i <n)
*   firstDay[i] ≤ lastDay[i] (where O ≤ i < n)
*
* Input Format For Custom Testing
*   The first line contains an integer, n, that denotes the number of elements in
*   firstDay.
*   Each line of the n subsequent lines (where 0 si <n) contains an integer
*   that describes firstDayl].
*   The next line contains the integer, n, that denotes the number of elements
*   in lastDay.
*   Each line of the n subsequent lines (where 0 si < n) contains an integer
*   that describes lastDaylin.
*
*   Sample Input For Custom Testing
*       STDIN       Function
*       -----       --------
*       3       ->  firstDay[] size n = 3
*       1       ->  firstDay= [1, 1, 2]
*       1
*
*       3       ->  lastDay[] size n = 3
*       1       ->  lastDay= [1, 2, 2]
*       2
*       2
*   Sample Output
*       2
*
 */

import java.util.*

fun main() {
}

fun countMeetings(): Int {
    return 0
}