import kotlin.math.roundToInt

class User(var name: String, var age: Int?) {

    constructor(name: String) : this(name, null)

    init {
        println("Olá, " + returnName())
    }

    fun returnName(): String {
        return name
    }

    fun updateName(name: String) {
        this.name = name
    }

    fun sum(a: Double, b: Double): Unit {
        var result = a + b
        println("O resultado da soma é: ${result.roundToInt()} ")
    }

    fun subtraction(a: Double, b: Double): Unit {
        var result = a - b
        println("O resultado da subtração é: ${result.roundToInt()} ")
    }

    fun division(a: Double, b: Double): Unit {
        var result = a / b
        if (b != 0.0) {
            println("O resultado da divisão é: ${result.roundToInt()} ")
        } else println("Não é possivel dividir por 0")

    }

    fun multiplication(a: Double, b: Double) {
        var result = a * b
        println("O resultado da multiplicação é: ${result.roundToInt()} ")
    }

}