package org.math

fun getFactorial(number: Int): Int {
    var factorial = 1

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

fun fibonacciSequence(n: Int): Int {
    var counter = 1
    var currentNumber = 0
    var nextNumber = 1

    while (counter < n) {
        val temp = currentNumber + nextNumber
        currentNumber = nextNumber
        nextNumber = temp

        counter += 1
    }

    return currentNumber
}

fun isPalindrome(text: String): Boolean {
    return text == text.reversed()
}

fun sumDigits(number: Int): Int {
    var sum = 0

    for (digit in number.toString()) {
        sum += digit.digitToInt()
    }

    return sum
}

fun calculateGCD(firstNumber: Int, secondNumber: Int): Int {
    var gcd = 0
    var currentDivisor = 0

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
    var vowelCount = 0

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
