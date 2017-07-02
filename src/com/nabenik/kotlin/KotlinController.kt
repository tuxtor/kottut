package com.nabenik.kotlin

class KotlinController {
	
	fun myFunctionalImplementation(x: String): (y: String) -> Unit = { println(it + x) }
	
	fun doHighOrder(myFunc: (x: String) -> Unit){
		myFunc("Invocacion al comportamiento")
	}
	
	fun doDemo(){
		val behaviour = myFunctionalImplementation("Comportamiento original 1")
		val behaviour2 = myFunctionalImplementation("Comportamiento original 2")
		
		doHighOrder(behaviour)
		doHighOrder(behaviour2)
	}
	
}