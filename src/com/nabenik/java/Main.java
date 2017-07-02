package com.nabenik.java;

import com.nabenik.kotlin.KStreamController;
import com.nabenik.kottut.KotlinDemosKt;
import com.nabenik.kottut.User;
public class Main {
	
	public static void main(String[] args){

		
		// First demo - Lambda function
		
//		FunctionalController fc = new FunctionalController();
//		fc.doDemo();
//		
//		StreamController streamController = new StreamController();
//		streamController.doDemo();
		
		// Second demo - Kotlin lambda equivalent
//		KotlinController kotlinController = new KotlinController();
//		kotlinController.doDemo();
//		
		// Second demo - Streams
//		StreamController streamController = new StreamController();
//		streamController.doDemo();		
		
		//Kotlin demos
//		KotlinDemosKt.doHello();
//		KotlinDemosKt.demoVariables();
//		KotlinDemosKt.demoLenguaje();
//		KotlinDemosKt.demoRange();
//		KotlinDemosKt.demoCondicional(6);
//		KotlinDemosKt.demoFunciones();
//		KotlinDemosKt.demoMapReduce();
		KotlinDemosKt.demoClasses();
		
//		KStreamController kController = new KStreamController();
//		kController.doDemo();
//		
		//Kotlin
		User userKt = new User();
		System.out.println(userKt.getCiudad());
		
		//Java
		UserDemo user = new UserDemo();
		user.setNickname("Victor");
		user.setNickname("Orozco");
		System.out.println(user.toString());
	}
}
