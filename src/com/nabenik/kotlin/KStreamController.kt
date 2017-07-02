package com.nabenik.kotlin

import java.util.Random

class KStreamController {
	
	fun generateRandomList(): List<Int>{
		val list1 = mutableListOf<Int>()
		val rGenerator = Random()
		for(num in 1..10){
			list1.add(rGenerator.nextInt(255))
		}
		println("Original list $list1")
		return list1
	}
	
	fun doSort(){
		var theList = generateRandomList()
		println("Kotlin sorting")
		println(theList.sorted())
	}
	
	fun doFilter(){
		var theList = generateRandomList()
		println("Kotlin filtering")
		println(
		theList
				.filter { x -> x>70 }
				.map { x -> x*2 }
		)
	}

	fun doDemo(){
//		this.doSort()
		this.doFilter()
	}
}