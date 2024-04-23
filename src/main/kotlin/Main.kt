package org.example

fun main() {
    println("Factorial of 3" + getFactorial(3))
    println("3 is Prime: " + isPrime(3))
    println("Reverse of joe biden: " + reverseText("joe biden"))
    println("Max number: " + getMax(arrayOf(2,5,1,6,3,8,4)))
    println("Fibonacci 5th term: " + fibonacciSequence(5))
    println("racecar is a palindrome: " + isPalindrome("racecar"))
    println("Summation of 51: " + summateDigits(51))
    println("GCD of 3 and 6: " + calculateGCD(3, 6))
    println("Vowel count of francis: " + countVowels("francis"))
    println("30.0 deg. Celsius to Fahrenheit: " + celsiusToFahrenheit(30.0))
}

fun getFactorial(number: Int): Int {
    var factorial: Int = 1

    for (num in number downTo 1) {
        factorial *= num
    }

    return factorial
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}

fun reverseText(text: String): String {
    return text.reversed()
}

fun <T : Comparable<T>> getMax(numbers: Array<T>): T? {
    return numbers.maxOrNull()
}

fun fibonacciSequence(n: Int): List<Int> {
    val sequence = mutableListOf<Int>()

    var counter = 0
    var toAdd = 0
    var nextNumber = 1

    while (counter < n) {
        sequence.add(toAdd)

        val temp = toAdd + nextNumber
        toAdd = nextNumber
        nextNumber = temp

        counter += 1
    }

    return sequence
}

fun isPalindrome(text: String): Boolean {
    return text == text.reversed()
}

fun summateDigits(number: Int): Int {
    var sum: Int = 0

    for (digit in number.toString()) {
        sum += digit.digitToInt()
    }

    return sum
}

fun calculateGCD(firstNumber: Int, secondNumber: Int): Int {
    var gcd: Int = 0
    var currentDivisor: Int = 0

    while (firstNumber >= currentDivisor || secondNumber >= currentDivisor) {
        currentDivisor += 1

        if (firstNumber % currentDivisor == 0 && secondNumber % currentDivisor == 0) {
            gcd = currentDivisor
        }
    }

    return gcd
}

fun countVowels(text: String): Int {
    val vowels: List<Char> = listOf('a', 'e', 'i', 'o', 'u')
    var vowelCount: Int = 0

    for (letter in text.lowercase()) {
        if (letter in vowels) {
            vowelCount += 1
        }
    }

    return vowelCount
}

fun celsiusToFahrenheit(number: Double): Double {
    return (number * (9.0 / 5.0)) + 32
}
