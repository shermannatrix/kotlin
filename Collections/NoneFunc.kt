fun main() {
	val numbers = listOf(1, -2, 3, -4, 5, -6)

	val allEven = numbers.none { it % 2 == 1 }

	val allLess6 = numbers.none { it > 6 }

	println("Numbers: $numbers")
	println("All numbers are even: $allEven")
	println("No element greater than 6: $allLess6")
}