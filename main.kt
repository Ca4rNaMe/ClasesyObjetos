fun main(){
    println("EJEMPLO PROGRAMACIÓN ORIENTADA A OBJETOS")

    var miObjetoPersona:Persona= Persona()
    miObjetoPersona.nombre="Camilo"
    miObjetoPersona.documento="1020444666"
    miObjetoPersona.edad=21
    miObjetoPersona.telefono="3183901010"

    println("El nombre de la persona es ${miObjetoPersona.nombre}")
    miObjetoPersona.caminar()
    miObjetoPersona.imprimirDatos()
}

class Persona{

    var documento: String=""
    var nombre: String=""
    var edad: Int=0
        get() = field
        set(value) {
            if (value>0){
                field = value
            }else {
                field = 0
            }
        }
    var telefono: String=""

    fun caminar(){
        println("La persona esta caminando...")
    }

    fun imprimirDatos(){
        var texto="Nombre: $nombre \nDocumento: $documento \nEdad: $edad \nTelefono: $telefono"
        println(texto)
    }
}