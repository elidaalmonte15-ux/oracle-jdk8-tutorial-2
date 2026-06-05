package com.example;

import java.math.BigDecimal;
import java.util.Iterator;

public class App {
	public static void main(String[] args) {

		/*
		 * Trabajo con arrays de dos dimensiones, tambien llamado matriz.
		 * 
		 * Cuando el array es de una sola dimension se le denomina vector.
		 */

		/* ¿Como declarar un array de dos dimensiones (matriz) ? */

		/*
		 * A modo de ejemplo, vamos a crear un array bidimensional de 3 filas y 3
		 * columnas con numeros enteros.
		 * 
		 * Posteriormente recorreremos dicha matriz para buscar la ocurrencia de un
		 * numero y cuando se encuentre imprimir en la consola la fila y la columna
		 * donde ha sido encontrado dicho numero
		 */

		/*
		 * No tiene que ver con los array de dos dimensiones , pero vale para recordar:
		 * Que cuando se declara un array y en mismo momento se le asigna valores, se
		 * obtiene un array de tamaño fijo
		 */

		String[] nombres = { "Elida", "Gina" };

		// nombres[2] = "Miguel";
		int[][] matrizEnteros = {

				{ 1, 2, 3, 10, 100, 200 }, { 4, 5, 6, 20 }, { 7, 8, 9 }, { 4, 5, 6, 20, 400 }, { 7, 8, 9, 30 }

		};

		/*
		 * Ejemplo: Recorrer la matriz anterior para buscar la primera ocurrencia del
		 * numero 5 y mostrar la fila y la columna en las cuales ha sido encontrado.
		 * 
		 * Para recorrer una matriz se utilizan sentecias for anidadas, una para las
		 * filas y otra para las columnas
		 */

		// for (int fila = 0; fila <= 3 - 1; fila++ )
		// for (int columna = 0; columna <= 3 - 1; columna++ ) {
		//
		// }

		/*
		 * El codigo anterior no es correcto y se ha comentado porque solamente serviria
		 * para tratar una matriz cuadrada de 3 x 3, es decir 3 filas y 3 columnas.
		 * 
		 * Si ampliamos o disminuimos el numero de filas o de columnas ya el codigo no
		 * vale para nada
		 */
		int totalFilas = matrizEnteros.length;

		System.out.println("Total de filas: " + totalFilas);

		// El numero a buscar , su primera ocurrencia en la fila y columna donde se
		// encuentra

		int numeroABuscar = 5;

		for (int fila = 0; fila <= totalFilas - 1; fila++)
			for (int columna = 0; columna <= matrizEnteros[fila].length - 1; columna++) {

				/*
				 * El codigo siguiente ha sido sugerido por GitHub Copilot, un agente de IA,
				 * pero soluciona el encontrar la primera ocurrencia del numero a buscar, porque
				 * aunque ya haya encontrado el numero lo continua buscando, pero si el numero
				 * se encontrase repetido en la misma fila tampoco lo encontraria por segunda
				 * vez.
				 * 
				 * En resumen, es bastante deficiente el codigo sugerido inicialmente
				 * 
				 * SOLAMENTE serviria para encontrar la primera ocurrencia en cada fila
				 */

				if (matrizEnteros[fila][columna] == numeroABuscar) {
					System.out.println("El numero " + numeroABuscar + " se ha encontrado en la fila " + fila
							+ " y en la columna " + columna);
					break;

				}
			}
		/*
		 * A continuacion, el codigo que realmente soluciona el planteamiento original,
		 * es decir, de buscar la PRIMERA ocurrencia del valor buscado , el numero 5 en
		 * este caso:
		 */
		
		System.out.println("codigo que soluciona el problema original");
		
		bucleExterior:	for (int fila = 0; fila <= totalFilas - 1; fila++)
			for (int columna = 0; columna <= matrizEnteros[fila].length - 1; columna++) {

				
				if (matrizEnteros[fila][columna] == numeroABuscar) {
					System.out.println("El numero " + numeroABuscar + " se ha encontrado en la fila " + fila
							+ " y en la columna " + columna);
					break bucleExterior;
					
					
				}
			}
	
		/* Ejercicio # 1 del Viernes 5 de Junio.
		* 
		* Recorrer la matriz y encotrar todas las ocurrencias del numero 5, es decir,
		* tener en cuenta que pueda estar en la misma fila en mas de una columna */	

		System.out.println("-----Solucion al ejercicio # 1 del viernes 5 de Junio-----");
		
		for (int fila = 0; fila <= totalFilas - 1; fila++)
			for (int columna = 0; columna <= matrizEnteros[fila].length - 1; columna++) {
		
				if (matrizEnteros[fila][columna] == numeroABuscar)
					System.out.println("Numero encontrado en fila: " + fila + 
							" y columna: " + columna);
			}
	
	}
}
