fun main(args: Array<String>){
	println("Hola mundo")
	println(sumar(1,2))
	println(mayorDeEdad(17))
	println(mayorDeEdad(18))
}

fun sumar(num1:Int,num2:Int)=num1+num2

fun mayorDeEdad(edad:Int) = if(edad>=18) true else false