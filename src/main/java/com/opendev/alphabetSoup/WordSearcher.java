	package com.opendev.alphabetSoup;

import java.util.ArrayList;
import java.util.List;

public class WordSearcher {

	private char soup[][];

	public WordSearcher(char soup[][]) {
		this.soup = soup;
	}

	/*
	 * recorrer la sopa no solo secuencialmente sino como si fueran cinco cuadrados.
	 * ej: A B G H K
	 */

	public boolean isPresent(String word) {
		/*
		 * for (int c = 0; c < word.length(); c++) { for (int i = 0; i < soup.length;
		 * i++) { for (int j = 0; j < soup[i].length; j++)
		 */

		char letras[] = word.toCharArray();
		int indice = 0;
		List<String> m = new ArrayList<String>();
		boolean ok = false;

		for (int i = 0; i < soup.length; i++) {
			for (int j = 0; j < soup[1].length; j++) {
				if (letras[indice] == soup[i][j]) {
					m.add(i + " " + j);
					if (indice == letras.length - 1) {
						return true;
					}
					indice++;
				}
			}
		}
		return false;
	}
}