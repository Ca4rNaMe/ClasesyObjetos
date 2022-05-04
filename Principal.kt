package Exerciseweek3

fun main() {
    print("¿Que salario desea ver? Marque (1) para Gerente, Marque (2) Operario, Marque (3) para Contador: ")
    var tipo = readLine()!!.toInt()
    //Ingresar Codigo para interactuar con el usuario


    // Hacer un if para cuando el usuario ingrese un número del 1 al 3
    if(tipo == 1) {
        var MiGerente: Gerente = Gerente(200, 200, 0)
        MiGerente.Nomina()

    } else if (tipo == 2) {
        var MiOperador: Operador = Operador(230, 10, 10)
        MiOperador.Nomina()

    } else if (tipo == 3) {
        var MiContador: Contador = Contador(200, 50, 0)
        MiContador.Nomina()
    } else {
        println("Ingrese solo entre 1 y 3")
    }
}




