package Calculadora

class funcSenha(var senha: String) {

    //Possui no mínimo 6 caracteres.

    fun verificarTamanho(): Boolean {
        return senha.length >= 6
    }
    fun verificarTamanho(valor: String) {
        if (valor.length >= 6) {
            println("A senha digitada contém no mínimo 6 dígitos")
            // println(senha.length)
        } else {
            println("A senha digitada não contém o mínimo de 6 dígitos.")
        }
    }


    // Contém no mínimo 1 dígito.

        fun verificarDigito(valor: String): Boolean {
        val textWithOnlyDigits = valor.filter { it.isDigit() }
        //  println(textWithOnlyDigits)
        if (textWithOnlyDigits.isEmpty()) {
            println("A senha digitada não contém dígito, colocar no mínimo 1 dígito.")
            return false
        } else {
            println("O senha digitada contém no mínimo um dígito.")
            return true }
        }


        // Contém no mínimo 1 letra em minúsculo.

            fun verificarLetraMinuscula (valor: String) : Boolean{
            val resultletra = valor.filter { it.isLowerCase() }
            //println(resultletra)
            if (resultletra.isEmpty()) {
                println("A senha digitada não contém uma letra minúscula.")
                return false
            } else {
                println("A senha digitada contém letra minúscula.")
                return true }
        }


        // Contém no mínimo 1 letra em maiúsculo.

        fun verificarLetraMaiuscula(valor: String): Boolean {
            val maiuscLetra = valor.filter { it.isUpperCase() }
            //println(maiuscLetra)
            if (maiuscLetra.isEmpty()) {
                println("A senha digitada não contém uma letra maiúscula.")
                return false
            } else {
                println("A senha digitada contém letra maiúscula.")
                return true }
        }


        //Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

        fun verificarCaracter (valor: String): Boolean {
        val senhaCaracter = valor.filterNot { it.isLetterOrDigit() }
        // println(senhaCaracter) // abcde
        if (senhaCaracter.isEmpty()) {
            println("Falta um caractere especial na senha digitada.")
            return false
        } else {
            println("O caractere especial foi colocado na senha digitada.")
            return true }
        }



}












