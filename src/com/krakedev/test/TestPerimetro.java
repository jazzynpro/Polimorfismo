package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		
		Graficador graficador = new Graficador();
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "rojo" , 20);
		Rectangulo rectangulo = new Rectangulo("Rectangulo","naranja", 20, 10);
		Triangulo triangulo = new Triangulo("Triangulo","amarillo", 30, 10);
		TrianguloRectangulo trianguloRect = new TrianguloRectangulo("Triangulo Rectangulo","verde", 30, 40);
		
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(triangulo);
		graficador.graficar(trianguloRect);
	}

}
