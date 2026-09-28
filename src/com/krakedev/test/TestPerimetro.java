package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		
		Graficador graficador = new Graficador();
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "rojo" , 20);
		Rectangulo rectangulo = new Rectangulo("Rectangulo","naranja", 20, 10);
		Triangulo triangulo = new Triangulo("Triangulo","amarillo", 30, 10);
		
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(triangulo);
	}

}
