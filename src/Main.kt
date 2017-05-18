fun main(args: Array<String>){
	val helloWorld : String = "HolaMundo" //Variable final --> val
	println(helloWorld)
	println(sumar(1,2))
	var edad : Int = 17 //Variable dinámica --> var
	println(mayorDeEdad(edad))
}

fun sumar(num1:Int,num2:Int)=num1+num2

fun mayorDeEdad(edad:Int) = if(edad>=18) true else false