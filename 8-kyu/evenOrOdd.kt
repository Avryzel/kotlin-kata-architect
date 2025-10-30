package `8-kyu`

/**
 * Kata: Even or Odd (8 Kyu)
 * URL: https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
 *
 * **ARCHITECTURAL REFLECTION:**
 * 1. Efficiency: How fast should it be?
 * - Focus: Time Complexity (Efficiency) is O(1).
 * - Reflection: The solution uses the constant-time modulo operation (number % 2).
 *               The execution time is O(1) because it relies on a fixed number of arithmetic steps that do not change based on the input size.
 *
 * 2. Longevity (Sustainability): How will it keep running?
 * - Focus: Readability and Maintainability.
 * - Reflection: The conditional logic is implemented using a concise Kotlin 'when' expression, which is idiomatic and significantly more readable and scalable than traditional multi-line 'if/else' statements.
 *
 * 3. Reliability & Safety: How will it recover after failure?
 * - Focus: Reliability/Resiliency.
 * - Reflection: The modulo operator (%) correctly handles both positive and negative input integers, ensuring reliable classification (e.g., -4 % 2 is 0).
 *               No casting or special checks are required.
 */

/**
 * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */

fun main() {
    println(evenOrOdd(1))
    println(evenOrOdd(2))
    println(evenOrOdd(3))
    println(evenOrOdd(-1))
}

// My Solution
fun evenOrOdd(number: Int): String {
    return when (number % 2) {
        0 -> "Even"
        else -> "Odd"
    }
}