package TesteSenha

import Calculadora.funcSenha

fun main() {

 println("*** Cadastro de senha ***" +
 "\n\nSua senha deve seguir os seguintes critério:")

       println("-Possuir no mínimo 6 caracteres.\n" +
       "-Conter no mínimo 1 dígito.\n" +
       "-Conter no mínimo 1 letra em minúsculo.\n" +
       "-Conter no mínimo 1 letra em maiúsculo.\n" +
       "-Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#\$%^&*()-+\n")

     // do {

       println("Digite sua senha para verificar se é forte:")
       val senha = readLine()!!
    val funcSenha = funcSenha (senha)
       var charsenha: CharArray = senha.toCharArray()
     // print(charsenha.contentToString())

           funcSenha.verificarTamanho(senha)
           funcSenha.verificarDigito(senha)
           funcSenha.verificarLetraMinuscula(senha)
           funcSenha.verificarLetraMaiuscula(senha)
           funcSenha.verificarCaracter(senha)
        /*
           if (senha.length >= 6 && Calculadora.funcSenha.verificarDigito: true ) {
                 println("Sua senha foi autorizada!")
                 break
             }
         }

         }  while ( senha.length < 6))

         */




    }