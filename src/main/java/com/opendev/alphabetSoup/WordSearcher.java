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
		char[] letras = word.toCharArray();
		boolean palabraEncontrada = false;
		int indice = 0;
		List<String> coincidencias = new ArrayList<String>();

		for (int i = 0; i < soup.length; i++) {
			for (int j = 0; j < soup[0].length; j++) {
				if (letras[indice] == this.soup[i][j]) {
					coincidencias.add(i + "-" + j);
					if (indice == letras.length - 1) {
						int filaMas = i + 1;
						int filaMenos = i - 1;
						int colMas = j + 1;
						int colMenos = j - 1;

						if (filaMas <= soup.length - 1 && !coincidencias.contains(filaMas + "-" + j)) {
							palabraEncontrada = true;
						}
						if (filaMenos >= 0 && !palabraEncontrada && !coincidencias.contains(filaMenos + "-" + j)) {
							palabraEncontrada = true;
						}
						if (colMas <= soup[0].length - 1 && !palabraEncontrada
								&& !coincidencias.contains(i + "-" + colMas)) {
							palabraEncontrada = true;
						}
						if (colMenos >= 0 && !palabraEncontrada && !coincidencias.contains(i + "-" + colMenos)) {
							palabraEncontrada = true;
						}
						if (filaMas <= soup.length - 1 && colMas <= soup[0].length - 1 && !palabraEncontrada
								&& !coincidencias.contains(filaMas + "-" + colMas)) {
							palabraEncontrada = true;
						}
						if (filaMenos >= 0 && colMenos >= 0 && !palabraEncontrada
								&& !coincidencias.contains(filaMenos + "-" + colMenos)) {
							palabraEncontrada = true;
						}
						if (filaMenos >= 0 && colMas <= soup[0].length - 1 && !palabraEncontrada
								&& !coincidencias.contains(filaMenos + "-" + colMas)) {
							palabraEncontrada = true;
						}
						if (filaMas <= soup.length - 1 && colMenos >= 0 && !palabraEncontrada
								&& !coincidencias.contains(filaMas + "-" + colMenos)) {
							palabraEncontrada = true;
						} else {
							palabraEncontrada = false;
						}
						return true;

					}
					indice++;

				}

			}

		}
		return palabraEncontrada;
	}

}