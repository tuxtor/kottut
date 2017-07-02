package com.nabenik.kottut

/**
 * Original derekbanas
 * Orden e integración con Java @tuxtor
 */

import java.util.Random

fun doHello(){
	println("Hola amigos upao desde kotlin!")
}

fun demoVariables(): Unit{
	// Inmutable
    val nombre = "Victor"

    // Mutable
    var edad: Int= 29

    // Sin inferencia de tipos
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE
	
	println("Nombre " +  nombre + " edad " + edad + "programador java")
	println("Nombre $nombre edad $edad años programador kotlin")
	
	//String interpolation
	println("Valores bigInt $bigInt y smallInt $smallInt")
}

fun demoLenguaje() {
	//Casting
	var calificacion: String = "9"
	println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + (calificacion.toInt()))
    println("65 to Char : " + (65.toChar()))
	
	
    val longStr = """This is a
    long string
    esta es una cadena
    absurdamente larga
    y con demsaiados espacios
    en la pantalla, me gusta
    presionar enter"""
	
	println(longStr)
	
	var str1 = "marco"
	var str2 = "polo"
	
	// Comparar strings
    println("Strings Equal : ${str1.equals(str2)}")
    println("Comparar : ${"marco".equals("marco")}")

    // Operaciones comunes
    println("2nd Index : ${str1.get(2)}")
}

fun demoRange(){
	val oneTo30 = 1..30
    val alfabeto = "A".."D"
    val alfabetoMinisculas = "a".."z"
	
    // Arreglo de caracteres
    println("R en alfabeto : ${"R" in alfabeto}")

    // Down
    val tenTo1 = 10.downTo(1)

    // Up
    val twoTo20 = 2.rangeTo(20)

    // Pasos
    val rng3 = oneTo30.step(3)

    // Loop
    for(x in rng3) println("rng3 : $x")

    // Loop reverso
    for(x in tenTo1.reversed()) println("Reverso: $x")
}

fun demoCondicional(numero:Int):Unit{

    if (numero % 2 == 0){
        println("Par")
    } else {
        println("Impar")
    }

    when (numero) {

        // Numeros del la suerte
        0,7,33,8,4 -> println("No tuviste suerte")

        // Match a specific value
        5 -> println("5")

        // Match a range
        in 1..10 -> {
            println("Es basico")
        }

        // Default
        else -> println("Es un numero mortal")
    }

}

fun demoFunciones(){
	
//    // Unilinea
//    fun sumar(num1: Int, num2: Int) : Int {
//		return num1 + num2
//	}
//    println("5 + 4 = ${sumar(5,4)}")
//
//    fun restar(num1: Int = 1, num2: Int = 1) = num1 - num2
//    println("5 - 4 = ${restar(5,4)}")
//
//    // Named parameters
//    println("4 - 5 = ${restar(num2 = 5, num1 = 4)}")
//
//    // Unit = Void
//    fun sayHello(name: String) : Unit = println("Hola $name")
//    sayHello("Victor")
//
//    // Tuplas simples (dobles)
//    val (two, three) = nextTwo(5)
//    println("5 $two $three")
//
//    // Numero variable de argumentos
//    println("Sum : ${getSum(1,2,1)}")

     //Function literals (lambda)
    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5,3)}")

    // Factorial recursivo
    println("5! = ${fact(2)}")

    // ----- HIGHER ORDER FUNCTIONS -----
    val numList = 1..20

    // Filtro - Lambda abreviado
    val parList = numList.filter { it % 2 == 0 }
    parList.forEach { n -> println(n) }

    // Funcion que retorna una funcion
    val mult3 = crearFuncionMat(2)
    println("5 * 2 = ${mult3(5)}")

    // Envia listado e implementacion
    val multiply2 = {num1: Int -> num1 * 1}
    val numList2 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    mathOnList(numList2, multiply2)
}


// ----- Funciones -----

// Retorna dos valores
fun nextTwo(num: Int): Pair<Int, Int>{
    return Pair(num+1, num+2)
}

// Recibe parametros de forma variable
fun getSum(vararg nums: Int): Int{
    var sum = 0

    nums.forEach { n -> sum += n }
    return sum
}

fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }
	
    return factTail(x, 1)
}

// Retorna una funcion que multiplica los valores
fun crearFuncionMat(num1: Int): (Int) -> Int = { num2 -> num1 * num2}

// Recibe una lista y la funcio a utilizar en la lista
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int){
    for(num in numList){
        println("MathOnList : ${myFunc(num)}")
    }
}

fun demoMapReduce(){
	
	val numList2 = 1..10
	
	// Suma reduce
    val listSum = numList2.reduce { x, y -> x + y }
    println("Reduce Sum : $listSum")

    // Suma fold
    val listSum2 = numList2.fold(5) { x, y -> x + y }
    println("Fold Sum : $listSum2")

    // Operaciones sobre listas
    println("Evens : ${numList2.any {it % 2 == 0}}")
    println("Evens : ${numList2.all {it % 2 == 0}}")

    // Filtros
    val big3 = numList2.filter { it > 3}
    big3.forEach { n -> println(">3 : $n") }

    // Map
    val times7 = numList2.map {it * 7}
    times7.forEach { n -> println("*7 : $n") }
}


fun demoClasses() {
    // ----- Clases -----
    val tortuga = Animal("Tortuga ninja", 20.0, 13.5)

    // Call method in the class
    tortuga.obtenerInformacion()

    // ----- Herencia -----
    val spot = Dog("Pancho", 10.0, 25.5, "Victor Orozco")
    spot.obtenerInformacion()
//
//    // ----- Interfaz -----
//    val tweety = Bird("Tweety", true)
//    tweety.fly(10.0)

}


// ----- Clases -----
// open = non-final
open class Animal (val name: String, var height: Double, var weight: Double){

    // Inicializador
    init {

    	println("Iniciando un animal")
    }

    // Open permite sobreescritura
    open fun obtenerInformacion(): Unit{
        println("$name tiene $height de alto y pesa $weight libras")
    }
}

// ----- Herencia -----
class Dog(name: String,
          height: Double,
          weight: Double,
          var owner: String) : Animal(name, height, weight){

    // Override
    override fun obtenerInformacion(): Unit{
        println("$name tiene $height de alto y pesa $weight, su dueño es $owner")
    }

}


// ----- Interfaces -----
interface Flyable {
    var flies: Boolean

    fun fly(distMiles: Double): Unit
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable{

    // We must also override any methods in the interface
    override fun fly(distMiles: Double): Unit{
        if(flies){
            println("$name flies $distMiles miles")
        }
    }
}


fun demoNull(){
	
    // ----- NULL SAFETY -----
    // Permitir nulos ?
    var nullVal: String? = null

    // Funcion que puede retornar nulos
    fun returnNull(): String? {
        return null
    }

    var nullVal2 = returnNull()

    // This is a smart cast
    if(nullVal2 != null) {
        println(nullVal2.length)
    }

    // Forzar nulo
    var nullVal3 = nullVal2!!.length

    // Elvis operator (default si nulo)
    var nullVal4: String = returnNull() ?: "No hay nada"
}