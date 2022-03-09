package Calculadora

class calculadora {

companion object {
    //Operação Soma
    fun resulSoma(num1: Int, num2: Int): Int {
        val resulS = num1 + num2
        return resulS
    }

    //Operação Subtração
    fun resulSub(num1: Int, num2: Int): Int {
        val resulSub = num1 - num2
        return resulSub
    }

    //Operação Divisao
    fun resulD(num1: Int, num2: Int): Int {
        val resulD = num1 / num2
        return resulD
    }

    //Operação Multiplicação
    fun resulM(num1: Int, num2: Int): Int {
        val resulM = num1 * num2
        return resulM
    }


}
}