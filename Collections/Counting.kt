fun main() {
	val numbers = listOf(1, -2, 3, -4, 5, -6)

	val totalCount = numbers.count()
	val evenCount = numbers.count { it % 2 == 0 }

	println("Total number of elements: $totalCount")
	println("Number of even elements: $evenCount")
}