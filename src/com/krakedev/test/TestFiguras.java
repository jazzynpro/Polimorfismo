package com.krakedev.test;

import com.krakedev.figuras.Figura;
import com.krakedev.figuras.*;

public class TestFiguras {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("Triangulo", "amarillo");
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "rojo");
		
		System.out.println(triangulo);
		System.out.println(cuadrado);

	}

}
