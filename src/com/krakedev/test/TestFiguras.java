package com.krakedev.test;

import com.krakedev.figuras.Figura;
import com.krakedev.figuras.*;

public class TestFiguras {

	public static void main(String[] args) {
		Figura figura = new Figura("Rectangulo", "azul");
		Triangulo triangulo = new Triangulo("Triangulo", "amarillo");
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "rojo");
		
		System.out.println(figura);
		System.out.println(triangulo);
		System.out.println(cuadrado);

	}

}
