/**
 * Kata: Returning Strings (8 Kyu)
 *
 * **ARCHITECTURAL REFLECTION:**
 * 1. Efficiency: How fast should it be?
 * - Focus: Performance (optimizing for time complexity $O()$).
 * - Reflection: [State the time complexity and justify your choice.]
 * 2. Longevity (Sustainability): How will it keep running?
 * - Focus: Readability and Maintainability (using clean Kotlin idioms).
 * - Reflection: [Explain which Kotlin idiom you used for readability.]
 * 3. Reliability & Safety: How will it recover after failure?
 * - Focus: Reliability/Resiliency and Security (ensuring predictable, safe behavior).
 * - Reflection: [How did you ensure the function cannot fail or throw an error?]
 */

fun main() {
    println(greet("Amba"))
}

// My Solution
fun greet(name: String): String {
    return "Hello, $name how are you doing today?"
}