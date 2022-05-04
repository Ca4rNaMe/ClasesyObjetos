package Exerciseweek3

class Operador(Hora: Int, ValorHora: Int, Bono: Int) : AbstNomina(Hora, ValorHora, Bono) {

    override fun Nomina(): Double {
        var Salariototal: Int = (Hora+Bono)*ValorHora
        println("El Salario del operador es : $Salariototal")
        return Salariototal.toDouble()
    }
}