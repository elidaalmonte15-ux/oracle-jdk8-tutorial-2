package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		// El array es un identificador que hace referencia a una zona de memoria,
		// a diferencia de una variable que hace referencia a una sola ubicacion
		// en la memoria, y que puede contener elementos de un mismo tipo de datos
		// A los elementos del array se pueden acceder utilizando un indice numerico,
		// entero, entre corchetes

		/* ¿Como se declara un array actualmente? */

		// por ejemplo, un array de String
		// El identificador nombres es un array donde cada elemento del array
		// es de tipo String

		// ¿Que ventajas no ofrece?
		// Que en lugar de crear una variable por cada elemento ahora solo tenemos
		// un nombre para todo el conjunto de los elementos y es mucho mas escalable
		// porque podremos tratar 10, 20 o un millon de elementos de la misma forma

		// Si no existieran los array, entonces
		String nombre1;
		String nombre2;
		;
		;
		String nombren;// donde n es el numero de elementos que queremos manejar

		String[] nombres = { "Juan", "Maria", "Pedro", "Luisa", "Jorge", "Carla", "Diego", "Sofia", "Alberto", "Ana"

		};

		// Hasta el momento los arrays que hemos creado son de tamaño
		// fijo, es decir, no se pueden modificar una vez que han sido creados
		System.out.println("array original de nombres: ");

		System.out.println("Array original de nombres");
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);

		System.out.println("El array de nombres tiene " + nombres.length + " elementos");

// Tamaño fijo implica que no se pueden agregar mas elementos al array, 
// pero si se pueden modificar los elementos existentes
// nombres[3] = "Marisol";

		nombres[2] = "Marisol";

		System.out.println("Array de nombres modificado");

		System.out.println(nombres[2]);

		int[] erraynumerosenteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//array de 3 Manzana
		/*
		 * Manzana[] manzanas = { new Manzana("Roja", "Dulce", "Red Delicious", 7.5,
		 * 0.2, new BigDecimal("0.50")), new Manzana("Verde", "Acida", "Granny Smith",
		 * 6.0, 0.25, new BigDecimal("0.60")), new Manzana("Amarilla", "Dulce",
		 * "Golden Delicious", 8.0, 0.3, new BigDecimal("0.55")) };
		 */
		Manzana[] manzanas = {
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(),
				Manzana.builder().color("Verde").sabor("Acida").variedad("Granny Smith").size(6.0).peso(0.25)
						.precio(new BigDecimal("0.60")).build(),
				Manzana.builder().color("Amarilla").sabor("Dulce").variedad("Golden Delicious").size(8.0).peso(0.3)
						.precio(new BigDecimal("0.55")).build()

		};
//Hasta el momento los arrays que hemos creado son de tamaño
//fijo, es decir, no se pueden modificar una vez que han sido creados

		/*
		 * Declarar arrays que sean modificables, es decir, que se le puedan agregar o
		 * eliminar elementos o modificar los elementos existentes
		 */

		String[] nombres2 = new String[3];

//El array de nombres2 tiene 3 elementos, pero todos los elementos son null
//porque no se les ha asignado un valor aun. Con la sentencia anterior 
//se ha reservado espacio en la memoria para 3 elementos de tipo String.
//No sera posible pasarse de la cantidad de elementos reservados para el array
//que en el caso anterior es de 3.

	}
}