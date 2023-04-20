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
		Map<Integer, Integer> cantCaracteres = new HashMap<>();
		List<Integer> reduccion = new ArrayList<>();
		HashMap<Character, Integer> contador = new HashMap<>();

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
				// si es verdadero, se almacena la clave del valor del caracter en cantidad.
				// Se incrementa y se agrega al map donde la clave es el valor del caracter
				Integer cantidad = cantCaracteres.get(caracter.getValue());
				cantCaracteres.put(caracter.getValue(), cantidad);
				// caso contrario se almacena con valor 1 si se encuentra por primera vez
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
				iguales = true;
			

		}

		return iguales;
	}
}
