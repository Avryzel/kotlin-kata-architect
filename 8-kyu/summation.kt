package `8-kyu`

/**
 * Kata: Summation (The O(1) Optimization)
 * URL: https://www.codewars.com/kata/55d24f55d7dd296eb9000030
 *
 * **ARCHITECTURAL REFLECTION:**
 * 1. Efficiency: How fast should it be?
 * - Focus: Time Complexity (Efficiency) is O(1).
 * - Reflection: The solution is O(1) Constant Time because it uses a fixed number of arithmetic operations.
 *               The execution time does not depend on the input size 'n'.
 *
 * 2. Longevity (Sustainability): How will it keep running?
 * - Focus: Readability and Maintainability.
 * - Reflection: The single-line formula is declarative and concise, which is highly readable.
 *
 * 3. Reliability & Safety: How will it recover after failure?
 * - Focus: Reliability/Resiliency.
 * - Reflection: The critical risk is Integer Overflow.
 *               For large input values of 'n', the intermediate result of n * (n + 1) will exceed the capacity of a 32-bit Int, causing an incorrect result.
 *               To prevent this, the input should be cast to Long before multiplication.
 */

/**
 * Write a program that finds the summation of every number from 1 to num (both inclusive).
 * The number will always be a positive integer greater than 0.
 * Your function only needs to return the result, what is shown between parentheses in the example below is how you reach that result, and it's not part of it, see the sample tests.
 *
 * For example (Input -> Output):
 * 2 -> 3 (1 + 2)
 * 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */

fun main() {
    println(GrassHopper.summation(5))
    println(GrassHopper.summation(99999))
}

//My Solution
object GrassHopper {
    fun summation(n: Int): Int {
        return ((n.toLong() * (n + 1)) / 2).toInt()
    }
}