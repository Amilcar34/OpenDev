package com.opendev.strings;

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
		/*
		 * for (int i = 0; i < cadena.length(); i++) { if(cadena.charAt(i)==) }
		 */
		int posicion, contador = 0;
		boolean si = false;
		for (int i = 0; i < cadena.length(); i++) {
			posicion = cadena.indexOf(cadena.charAt(i));
			while (posicion != -1) {
				contador++;
				// se sigue buscando a partir de la posición siguiente a la encontrada
				posicion = cadena.indexOf(cadena.charAt(i), posicion + 1);
				si = true;
			}
		}
		return si;
	}
}
