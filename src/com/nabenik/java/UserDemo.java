package com.nabenik.java;

public class UserDemo {

	private String nombre;
	private String nickname;
	
	public UserDemo(){
		this.nickname = "";
		this.nombre = "";
	}
	
	public UserDemo(String nombre, String nickname) {
		super();
		this.nombre = nombre;
		this.nickname = nickname;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
