
package com.example;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Manzana {
	/* Una clase bien diseñada es aquella que tiene todas sus propiedades
	* privadas (modificador de acceso private) y se relaciona con el mundo 
	* exterior mediante metodos getters and setters publicos */

	// Campos o propiedades de la clase (Lo que caracteriza al objeto que se va a crear 
	// a partir de esta plantilla, es decir, de esta clase)

	private String color;
	private String sabor;
	private String variedad;
	private double size;
	private double peso;
	private BigDecimal precio;
}
