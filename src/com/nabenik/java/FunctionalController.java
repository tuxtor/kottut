package com.nabenik.java;

public class FunctionalController {
	
	/**
	 * Old implementation (return annon class)
	 */
	public MyFunctionalInterface createOldBehaviour(){
		
		return new MyFunctionalInterface() {
			@Override
			public void doFunctional(String x) {
				String result = x.concat(" la vieja confiable");
				System.out.println(result);
			}
		};
	}
	
	/**
	 * Funciones high order
	 * Funcion capaz de retornar otra funcion (o comporamiento)
	 */
	public MyFunctionalInterface createLambdaBehavior(){
		
		return (x) -> {
			String result = x.concat(" La forma lambda");
			System.out.println(result);
		};
		
	}
	
	public void doDemo(){
		MyFunctionalInterface behavior1 = createOldBehaviour();
		behavior1.doFunctional("parametro original");
		MyFunctionalInterface behavior2 = createLambdaBehavior();
		behavior2.doFunctional("parametro original");
		
		
		MyFunctionalInterface behavior3 = x -> {
			System.out.println("Comportamiento directo");
			System.out.println(x);
			System.out.println(":)");
		};
		
		doHighOrderfunction(behavior3);
		
//		MyFunctionalInterface behavior3 = System.out::println;
		
//		doHighOrderfunction(behavior1);
//		doHighOrderfunction(behavior2);
//		doHighOrderfunction(behavior3);
	}
	
	/**
	 * Funcion high order "dummy"
	 * @param param
	 */
	public void doHighOrderfunction(MyFunctionalInterface param){
		//Execution
		param.doFunctional("parametro desde high order function ");
		
	}

}
