import org.math.*

fun main() {
    println("Factorial of 3: ${getFactorial(3)}")
    println("3 is Prime: ${isPrime(3)}")
    println("Reverse of joe biden: ${reverseText("joe biden")}")
    println("Max number: ${getMax(arrayOf(2, 5, 1, 6, 3, 8, 4))}")
    println("Fibonacci 5th term: ${fibonacciSequence(5)}")
    println("racer is a palindrome: ${isPalindrome("racer")}")
    println("Summation of 51: ${sumDigits(51)}")
    println("GCD of 3 and 6: ${calculateGCD(3, 6)}")
    println("Vowel count of francis: ${countVowels("francis")}")
    println("30.0 deg. Celsius to Fahrenheit: ${celsiusToFahrenheit(30.0)}")
}
