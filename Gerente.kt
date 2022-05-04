package Exerciseweek3

class Gerente(Hora: Int, ValorHora: Int, Bono: Int) : AbstNomina(Hora, ValorHora, Bono) {

    override fun Nomina(): Double {
        var Salariototal: Int = (Hora+Bono)*ValorHora
        println("El Salario del gerente es : $Salariototal")
        return Salariototal.toDouble()

    }
}