import java.lang.IllegalArgumentException

class Calculadora {


    fun multiplicacao(n1: Double, n2: Double): Double {
        return n1 * n2
    }

    fun adicao(n1: Double, n2: Double): Double {
        return n1 + n2
    }

    fun subtrair(n1: Double, n2: Double): Double {
        return n1 - n2
    }

    fun dividir(n1: Double, n2: Double): Double {
        if (n2 != 0.0) {
            return n1 / n2
        } else {
            throw IllegalArgumentException("Erro: divisão por zero não é permitida")
        }

    }

}