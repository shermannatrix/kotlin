fun findMinMax (list: List<Int>): Pair<Int, Int> {
	return Pair(50, 100)
}

data class User(val username: String, val email: String)

fun getUser() = User("Mary", "mary@somewhere.com")

fun main() {
	val (x, y, z) = arrayOf(5, 10, 15)

	val map = mapOf("Alice" to 21, "Bob" to 25)

	for ((name, age) in map) {
		println("$name is $age years old")
	}

	val (min, max) = findMinMax(listOf(100, 90, 40, 98, 76, 83))

	println("min: $min, max: $max")

	val user = getUser()
	val (username, email) = user
	println(username == user.component1())

	val (_, emailAddress) = getUser()

	println(emailAddress)
}