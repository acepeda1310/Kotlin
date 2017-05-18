import java.util.*

fun main(args: Array<String>){
	println("Escribe un texto:")
	val scanner=Scanner(System.`in`)
	val helloWorld : String = scanner.nextLine() //Variable final --> val
	println("Texto: ${if(helloWorld!="") helloWorld else "No se introdujo texto"}")
	println(sumar(1,2))
	var edad : Int = 17 //Variable dinámica --> var
	println(mayorDeEdad(edad))
}

fun sumar(num1:Int,num2:Int)=num1+num2

fun mayorDeEdad(edad:Int) = if(edad>=18) true else false