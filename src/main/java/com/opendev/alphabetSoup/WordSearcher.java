package com.opendev.alphabetSoup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WordSearcher {

	private char soup[][];

	public WordSearcher(char soup[][]) {
		this.soup = soup;
	}

	public boolean isPresent(String word) {
		char letras[] = word.toCharArray();
		int indice = 0;
		List<String> coincidencias = new ArrayList<String>();

		for (int fila = 0; fila < soup.length; fila++) {
			for (int columna = 0; columna < soup[0].length; columna++) {
				if (letras[indice] == soup[fila][columna]) {
					coincidencias.add(fila + " " + columna);
					if (indice == letras.length - 1) {
						System.out.println(coincidencias);
						return true;
					}
					indice++;
				} else if (!coincidencias.isEmpty()) {
					break;
				}

			}
		}
		coincidencias.clear();
		indice = 0;
		for (int fila = soup.length; fila == 0; fila--) {
			for (int columna = soup[0].length; columna == 0; columna--) {
				if (letras[indice] == soup[fila][columna]) {
					coincidencias.add(fila + " " + columna);
					if (indice == letras.length - 1) {
						System.out.println(coincidencias);
						return true;
					}
					indice++;
				} else if (!coincidencias.isEmpty()) {
					break;
				}

			}
		}
		coincidencias.clear();
		indice = 0;
		for (int columna = 0; columna == soup[0].length ; columna++) {
			for (int fila = 0; fila == soup.length; fila++) {
				if (letras[indice] == soup[fila][columna]) {
					coincidencias.add(fila + " " + columna);
					if (indice == letras.length - 1) {
						System.out.println(coincidencias);
						return true;
					}
					indice++;
				} else if (!coincidencias.isEmpty()) {
					break;
				}

			}
		}
		coincidencias.clear();
		indice = 0;
		for (int columna = soup[0].length; columna == 0 ; columna--) {
			for (int fila = soup.length; fila == 0; fila--) {
				if (letras[indice] == soup[fila][columna]) {
					coincidencias.add(fila + " " + columna);
					if (indice == letras.length - 1) {
						System.out.println(coincidencias);
						return true;
					}
					indice++;
				} else if (!coincidencias.isEmpty()) {
					break;
				}

			}
		}
		return false;
	}

}