fun main() {
	val words = listOf("foo", "bar", "baz", "faz")
	val empty = emptyList<String>()

	val first = empty.firstOrNull()
	val last = empty.lastOrNull()

	val firstF = words.firstOrNull { it.startsWith("f") }
	val firstZ = words.firstOrNull { it.startsWith('z') }
	val lastF = words.lastOrNull { it.endsWith('f') }
	val lastZ = words.lastOrNull { it.endsWith('z') }

	println("Empty list: first is $first, last is $last")
	println("Word list: first item starting with 'f' is $firstF, first item starting with 'z' is $firstZ")
	println("Word list: last item ending with 'f' is $lastF, last item ending with 'z' is $lastZ")
}