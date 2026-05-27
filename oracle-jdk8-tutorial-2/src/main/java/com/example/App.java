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
		
		// Agregando elemento al array nombres2

		nombres2[0] = "Pepa";
		nombres2[1] = "Jakelin";
		nombres2[2] = "Marisol";		
		
		/* SENTENCIAS DE CONTROL DE FLUJO. En general permiten modificar el 
		* flujo de ejecucion de un programa en dependencia del cumplimiento de
		* una o varias condiciones, aqui estarian las sentencia condicionales
		* if - else y switch - case y switch - expression 
		* 
		* Y por otra parte, pero como parte tambien de las sentencias de control
		* flujo estarian las que permiten ejecutar en bucle un conjunto de sentencias
		* entre las que estarian
		* 
		* 1- sentencia for clasica
		* 2- sentencia for mejorada
		* 3- sentencia while
		* 4- sentencia do - while
		* 
		* Por ultimo las sentencias break y continue */
		/* La sentencia for clasica, se utiliza cuando se conoce a priori la cantidad
		* de veces que se van ejecutar un conjunto de instrucciones.
		* 
		* Tambien se puede utilizar para recorrer los elementos de un array */
		
		/* Para mostrar en la consola los elementos de un array, por ejemplo
		* el array de nombres */

		System.out.println("Recorriendo el array"
		+ " nombres con una sentencia for clasica");

		for (int i = 0; i < nombres.length; i++) {
		System.out.println(nombres[i]);
		
		}
		/* Si intentaramos mostrar por la consola los elemetos del array nombres */

		System.out.println("Intentando imprimir los elementos del array nombres");
		System.out.println(nombres);	
		/* La sentencia anterior solamente mostro por la consola la direccion
		* de memoria de la zona donde estan almacenados los elementos del array
		* pero los elementos como tal no los ha mostrado.
		* 
		* Para mostrar los elementos del array se necesita una sentencia de control
		* de flujo, que en bucle recorra todos los elementos del array de nombres
		* y podria ser la sentencia for clasica, en primer lugar, y en segundo 
		* lugar la sentencia for mejorada */
		
		// Primero: Sentencia for clasica

		System.out.println("Recorriendo/Iterando los elemento del array nombres con una sentencia for clasica");
	
		for (int i = 0; i <= nombres.length-1; i++) {
		System.out.println(nombres[i]);
		}
	System.out.println("la sentencia for ha concluido");
	/*operador de auto incremento(++) y de auto decremento(--) */
	int ii = 0;
    ii++	;

/* Para comprobar la diferencia entre las dos instrucciones anteriores se 
* puede utilizar una herramiento de linea de comandos llamado jshell y 
* comprobaremos que el operador de autoincremento cuando esta solo, es lo 
* mismo que este al principio que al final, que no es igual a cuando esta 
* en una expresion */

    /*ejemplo de creacion de un array de numero fraccionario,tipo doble,que
     * tienen parte enteray parte fraccionaria,los valores del array se tienen que generar
     * de forma aleatoriay con numero entre 0 100.
     * por lo tanto vamos a utilizarla herramienta jshll para aberiguar como hacer que se generen
     * los numero aleatorio que generemos*/
    
    System.out.println("Array de numeros de tipo double, generado de forma aleatoria ");

    double[] arrayDeDoubles = new double[20];

    System.out.println("Array original, con los valores por defecto " );

    for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
    System.out.println(arrayDeDoubles[i]);
    }

    // Rellenando el array con valores generados aleatoriamente
    for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
    arrayDeDoubles[i] = Math.random() * 100 - 1;
    }

    // Mostrando el array resultante

    for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {

    System.out.println(arrayDeDoubles[i]);
    }
    /* Ejercicio # 1. Modificar el ejemplo anterior para que 
    * array sea de 100 numeros enteros generados aleatoriamente 
    * 
    * Sugerencia: Hacer un commit previamente a ponerse con la solucion
    * del ejercicio, para que puedas modificar el codigo sin que se 
    * pierda el codigo del ejemplo original */  
    
	}
	
	
	
}