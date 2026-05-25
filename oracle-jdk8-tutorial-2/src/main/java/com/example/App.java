package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {
		// Crear un objeto Manzana sin especificar ninguna propiedad de la Manzana
		// Se utiliza el constructor sin parametros

		Manzana manzana1 = new Manzana();

		/*
		 
		 * ¿Como imprimir en la consola el objeto referenciado por la variable manzana1?
		 */
		System.out.println("------- Imprimiendo manzana1 ------- ");
		System.out.println(manzana1);

		// Si quisiera crear un objeto Manzana y solamente quisiera especificar
		// la variedad de la Manzana, me daría error porque yo no tengo un constructor
		// que reciba un solo parametro
		// System.out.println(manzana2);
		Manzana manzana2 = Manzana.builder()
		        .variedad("Golden")
		        .build();
		// El Patron Builder es patron factoria, es decir, creacional,
		// que permite crear o instanciar objetos sin tener explicitamente su
		// su constructor
		/*
		 //El Patron Builder NO fue inventado por lombok, pero lo ha mejorado bastante
		 * ¿ commo comparar dos objeto Manzanapara saber si son iguales o no? vamos a
		 * crear dosobjeto Manzana que sean de
		 * el patron builder no fue inventado por lombok, pero lo ha mejorado bastante
		 // El Patron Builder es patron factoria, es decir, creacional,
         // que permite crear o instanciar objetos sin tener explicitamente su
// su constructor
		 */

        //Manzana manzana3 = new Manzana("reineta", new BigDecimal(2.0));
       Manzana manzana3 = Manzana.builder()
			   .variedad("reineta")
			   .precio(new BigDecimal(2.0))
			   .build();
		// Manzana manzana4 = new Manzana("reineta", new BigDecimal(2.0));

       Manzana manzana4 = Manzana.builder()	
    		   			   .variedad("reineta")			
    		   			   .precio(new BigDecimal(2.0))
    		   			   .build();
      
    				 
    		   
    		  
    				 int x = 5;
		         int y = 5;

		// Si quiero comprobar si las variables x e y son iguales, podemos utilizar una
		// sentencia de Java
		// que la tienen todos los lenguajes de programacion, denominada sentencia
		// condicional if - else
		// que evalua una condicion entre parentesis, y que si se cumple se ejecuta el
		// grupo de sentencias
		// que aparecen en el bloque encerrado entre las llaves de apartura y cierre, y
		// si no se cumple la condicion
		// se podra ejecutar la o las sentencias que estan en siguiente bloque.

		if (x == y) {
			System.out.println("Las variables x e y son iguales");
		} else {
			System.out.println("el valor Las variables es diferente ");
		}
		if (manzana3 == manzana4) {
			System.out.println("Las manzanas son iguales");

		} else {
			System.err.println("Las manzanas son diferentes");

		}
		/*
		 * Para saber si el contenido de dos objetos es el mismo se utiliza el metodo
		 * equal, porque el operador == lo que comprueba en el caso de objetos es si
		 * dichos objetos estan en la misma ubicacion de la memoria
		 */
		if (manzana3.equals(manzana4)) {
			System.out.println("Las manzanas son iguales");
		} else {
			System.err.println("Las manzanas son diferentes");
		}
	}
}
