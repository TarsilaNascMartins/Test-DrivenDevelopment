import Calculadora.funcSenha
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class funcSenhaTest () {

    val senha1 = funcSenha("Renata21#")
    val senha2 = funcSenha("123")

    @Test
    fun verificarTamanhoTest() {

      assertTrue(senha1.verificarTamanho())
      assertFalse(senha2.verificarTamanho())
    }

    @Test
    fun verificarDigitoTest() {

        assertTrue(senha1.verificarDigito("Renata21"))
        assertFalse(senha1.verificarDigito("Renata"))
    }

    @Test
    fun verificarLetraMinusculaTest() {
        assertTrue(senha1.verificarLetraMinuscula("Renata21"))
        assertFalse(senha1.verificarLetraMinuscula("Renata"))
    }

    @Test
    fun verificarLetraMaiusculaTest() {
        assertTrue(senha1.verificarLetraMaiuscula("Guilherme"))
        assertFalse(senha1.verificarLetraMaiuscula("guilherme"))
    }

    @Test
    fun verificarCaracterTest() {
        assertTrue(senha1.verificarCaracter("%Tjdhfjk"))
        assertFalse(senha1.verificarCaracter("Tjdsjksfjk"))
    }
}