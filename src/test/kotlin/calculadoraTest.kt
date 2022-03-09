import Calculadora.calculadora
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class calculadoraTest{

    @Test
    fun ResultSomaTest (){
             assertEquals(3, calculadora.resulSoma(1, 2))
    }

    @Test
    fun ResultSubTest (){
        assertEquals(4, calculadora.resulSub(7, 3))
    }

    @Test
    fun ResultMTest (){
        assertEquals(50, calculadora.resulM(10, 5))
    }

    @Test
    fun ResultDTest (){
        assertEquals(6, calculadora.resulD(30, 5))
    }







}