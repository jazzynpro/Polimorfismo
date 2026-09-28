package com.krakedev.figuras;

public abstract class Figura {
	//Atributos
	private String nombre;
	private String color;
	
	//constructor 
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	} 
	
	//Getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//toString
	@Override
	public String toString() {
		return "figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	public abstract int calcularPerimetro(); 
	
	public abstract double calcularArea();
	
	
	
	
}
