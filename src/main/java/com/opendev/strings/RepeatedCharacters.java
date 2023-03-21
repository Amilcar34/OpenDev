package com.opendev.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedCharacters {

	/**
	 * El metodo debe retornar un booleano indicando si el parametro `cadena` cumple
	 * con alguna de las siguientes propiedades: 1- Todos los caracteres aparecen la
	 * misma cantidad de veces. Ejemplos: "aabbcc", "abcdef", "aaaaaa" 2- Todos los
	 * caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece
	 * un vez mas o una vez menos. Ejemplos: "aabbccc", "aabbc", "aaaaccccc"
	 *
	 * @param cadena la cadena a evaluar
	 * @return booleano indicando si la cadena cumple con las propiedades
	 */
	public Boolean isValid(String cadena) {

		boolean iguales = false;
		Map<Integer, Integer> cantCaracteres = new HashMap<Integer, Integer>();
		List<Integer> reduccion = new ArrayList<Integer>();
		HashMap<Character, Integer> contador = new HashMap<Character, Integer>();

		// frecuencia de cada caracter
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (contador.containsKey(caracter)) {
				contador.put(caracter, contador.get(caracter) + 1);

			} else {
				contador.put(caracter, 1);
			}
		}
		// for map que recorre a las claves-valor de contador
		for (Map.Entry<Character, Integer> caracter : contador.entrySet()) { // entrySet() devuelve un conjunto de pares
																				// clave-valor
			// pregunta si el valor del caracter esta dentro del map de caracteres
			if (cantCaracteres.containsKey(caracter.getValue())) {
				// si es verdadero, se almacena la clave del valor del caracter en cantidad.
				// Se incrementa y se agrega al map donde la clave es el valor del caracter
				Integer cantidad = cantCaracteres.get(caracter.getValue());
				cantidad++;
				cantCaracteres.put(caracter.getValue(), cantidad);
			} else {
				cantCaracteres.put(caracter.getValue(), 1);
				// caso contrario se almacena con valor 1 si se encuentra por primera vez
			}
		}

		// si la frecuencia de ese caracter es igual a 1 retorna true
		if (cantCaracteres.size() == 1) {
			iguales = true;
		}
		// caso contrario se vuelve a iterar con cantidad de caracteres pero se agrega a
		// otro map las claves.
		if (cantCaracteres.size() == 2) {
			for (Map.Entry<Integer, Integer> cantidadDeCantidades : cantCaracteres.entrySet()) {
				reduccion.add(cantidadDeCantidades.getKey());
			}
			// el primer get representa cuantos caracteres se repitieron menos que otro.
			int resultado = reduccion.get(0) - reduccion.get(1); // el segundo get representa la cantidad de veces que se repitio un caracter.
			if (resultado == 1 || resultado == -1) {
				iguales = true;
			}

		}

		return iguales;
	}
}
