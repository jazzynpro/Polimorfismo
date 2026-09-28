package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();
		
		Triangulo triangulo = new Triangulo("Triangulo", "amarillo");
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "rojo");
		Rectangulo rectangulo = new Rectangulo("Rectangulo","naranja");
		
		graficador.graficar(triangulo);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);

	}

}
