open class Dog {
	open fun sayHello() {
		println("wow wow!")
	}
}

class Yorkshire: Dog() {
	override fun sayHello() {
		println("wif wif!")
	}
}

// Inheritance with parameterized constructor
open class Tiger(val origin: String) {
	fun sayHello() {
		println("A tiger from $origin says: grrhhh!")
	}
}

class SiberianTiger: Tiger("Siberia")

// Passing constructor arguments to superclass
open class Lion(val name: String, val origin: String) {
	fun sayHello() {
		println("$name, the lion from $origin says: graoh!")
	}
}

class Asiatic (name: String): Lion (name = name, origin = "India")

fun main() {
	val dog: Dog = Yorkshire()
	dog.sayHello()

	val tiger: Tiger = SiberianTiger()
	tiger.sayHello()

	val lion: Lion = Asiatic("Rufo")
	lion.sayHello()
}