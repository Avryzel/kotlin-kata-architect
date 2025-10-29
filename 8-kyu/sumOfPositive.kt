package `8-kyu`

/**
 * Kata: Sum of Positive (8 Kyu)
 * URL: https://www.codewars.com/kata/5715eaedb436cf5606000381
 *
 * **ARCHITECTURAL REFLECTION:**
 * 1. Efficiency: How fast should it be?
 * - Focus: Performance (optimizing for time complexity $O()$).
 * - Reflection: [State the time complexity (O(n)) and justify the loop structure.]
 * 2. Longevity (Sustainability): How will it keep running?
 * - Focus: Readability and Maintainability (using clean Kotlin idioms).
 * - Reflection: [Explain how you used val/var or a Kotlin function for clarity.]
 * 3. Reliability & Safety: How will it recover after failure?
 * - Focus: Reliability/Resiliency and Security (ensuring predictable, safe behavior).
 * - Reflection: [How did you ensure the function handles the empty array case?]
 */

/**
Task
You get an array of numbers, return the sum of all the positives ones.

Example
[1, -4, 7, 12] => 1 + 7 + 12 = 20

Note
If there is nothing to sum, the sum is default to 0.
 */

fun main() {
    println(sum(intArrayOf(1, -3 , 4)))
    println(sum(intArrayOf(-1, -3 , 4)))
}

// My Solution
fun sum(numbers: IntArray): Int {
   return numbers.filter { it > 0 }.sum()
}