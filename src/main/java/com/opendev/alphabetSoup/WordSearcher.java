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
		boolean palabraEncontrada = false;
		char letras[] = word.toCharArray();
		int indice = 0;
		List<String> coincidencias = new ArrayList<String>();

		for (int fila = 0; fila < soup.length; fila++) {
			for (int columna = 0; columna < soup[0].length; columna++) {
				if (letras[indice] == soup[fila][columna]) {
					coincidencias.add(fila + " " + columna);
					if (indice == letras.length - 1) {
						System.out.println(coincidencias);
						palabraEncontrada = letraEncontrada(letras, indice, fila, columna, coincidencias);
						return true;

					}
					indice++;
				}

			}

		}
		return false;
	}

	private boolean letraEncontrada(char[] letras, int indice, int i, int j, List<String> coincidencias) {
		boolean palabraEncontrada = false;
		int filaMas = i + 1;
		int filaMenos = i - 1;
		int colMas = j + 1;
		int colMenos = j - 1;

		if (filaMas <= soup.length - 1 && !coincidencias.contains(filaMas + "-" + j)) {
			palabraEncontrada = letraEncontrada(letras, indice, filaMas, j, coincidencias);
		}
		if (filaMenos >= 0 && !palabraEncontrada && !coincidencias.contains(filaMenos + "-" + j)) {
			palabraEncontrada = letraEncontrada(letras, indice, i - 1, j, coincidencias);
		}
		if (colMas <= soup[0].length - 1 && !palabraEncontrada && !coincidencias.contains(i + "-" + colMas)) {
			palabraEncontrada = letraEncontrada(letras, indice, i, colMas, coincidencias);
		}
		if (colMenos >= 0 && !palabraEncontrada && !coincidencias.contains(i + "-" + colMenos)) {
			palabraEncontrada = letraEncontrada(letras, indice, i, colMenos, coincidencias);
		}
		if (filaMas <= soup.length - 1 && colMas <= soup[0].length - 1 && !palabraEncontrada
				&& !coincidencias.contains(filaMas + "-" + colMas)) {
			palabraEncontrada = letraEncontrada(letras, indice, filaMas, colMas, coincidencias);
		}
		if (filaMenos >= 0 && colMenos >= 0 && !palabraEncontrada
				&& !coincidencias.contains(filaMenos + "-" + colMenos)) {
			palabraEncontrada = letraEncontrada(letras, indice, filaMenos, colMenos, coincidencias);
		}
		if (filaMenos >= 0 && colMas <= soup[0].length - 1 && !palabraEncontrada
				&& !coincidencias.contains(filaMenos + "-" + colMas)) {
			palabraEncontrada = letraEncontrada(letras, indice, filaMenos, colMas, coincidencias);
		}
		if (filaMas <= soup.length - 1 && colMenos >= 0 && !palabraEncontrada
				&& !coincidencias.contains(filaMas + "-" + colMenos)) {
			palabraEncontrada = letraEncontrada(letras, indice, filaMas, colMenos, coincidencias);

		}
		return palabraEncontrada;
	}

}