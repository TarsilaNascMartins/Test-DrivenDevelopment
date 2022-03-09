import Calculadora.calculadora

fun main() {

    do {
        print("Digite o primeiro valor: ")
        val num1 = readLine()!!.toInt()

        print("Digite o operador , + - * /: ")
        val oper = readLine()!!

        print("Digite o segundo valor: ")
        val num2 = readLine()!!.toInt()

        if (oper == "+") {
            println("A soma dos numeros é ${calculadora.resulSoma(num1, num2)}")
        } else if (oper == "-") {
            println("A soma dos numeros é ${calculadora.resulSub(num1, num2)}")
        } else if (oper == "/") {
            println("A soma dos numeros é ${calculadora.resulD(num1, num2)}")
        } else if (oper == "*") {
            println("A soma dos numeros é ${calculadora.resulM(num1, num2)}")
        } else {
            println("Operação não existente")
        }

        print("Deseja continuar: sim/não: ")
        var resposta = readLine()!!

    } while (resposta == "sim")
}



