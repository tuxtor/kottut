package com.nabenik.kottut

data class User (var nombre: String = "",
				 var nickname: String = "",
				 var ciudad: String = "Trujillo"){
	constructor() : this("","", "")
}