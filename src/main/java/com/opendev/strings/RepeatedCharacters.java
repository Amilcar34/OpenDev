package com.opendev.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		boolean iguales = true;
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
		// verificar si todos los caracteres tienen la misma frecuencia
		int frecuencia = -1;
		for (int valor : contador.values()) {
			if (frecuencia == -1 || frecuencia == 1) {
				frecuencia = valor;
			} 
		}
		if (iguales) {
			return true;
		}
		return false;
	}
}