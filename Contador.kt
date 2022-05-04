package Exerciseweek3

class Contador(Hora: Int, ValorHora: Int, Bono: Int) : AbstNomina(Hora, ValorHora, Bono) {

    override fun Nomina(): Double {
        var Salariototal: Int = (Hora+Bono)*ValorHora
        println("El Salario del contador es : $Salariototal")
        return Salariototal.toDouble()
    }
}