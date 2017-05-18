import java.util.*

fun main(args: Array<String>){
	//PRUEBA DE SCANNER
	println("Escribe un texto:")
	val scanner=Scanner(System.`in`)
	val helloWorld : String = scanner.nextLine() //Variable final --> val
	
	//HOLAMUNDO
	println("Texto: ${if(helloWorld!="") helloWorld else "No se introdujo texto"}")
	
	//PRUEBA METODOS
	println(sumar(1,2))
	var edad : Int = 17 //Variable dinámica --> var
	println(mayorDeEdad(edad))
	
	//PRUEBA DE OBJETOS
	val persona=Persona("Adrian",22)
	println(persona.nombre)
	println(persona.edad)
	persona.edad=23
	println(persona.edad)
}

fun sumar(num1:Int,num2:Int)=num1+num2

fun mayorDeEdad(edad:Int) = if(edad>=18) true else false

class Persona(val nombre:String, var edad:Int)