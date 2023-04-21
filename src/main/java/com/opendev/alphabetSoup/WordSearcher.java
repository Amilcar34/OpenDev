package com.opendev.alphabetSoup;

import java.util.Arrays;

public class WordSearcher {

	private char soup[][];

	public WordSearcher(char soup[][]) {
		this.soup = soup;
	}

	public boolean isPresent(String word) {

		char[] letras = word.toCharArray();
		boolean palabraEncontrada = false;
		// arreglo de booleanos donde cada posicion indica si la palabra se encontro o
		// no
		boolean[][] encontradas = new boolean[soup.length][soup[0].length];

		for (int i = 0; i < soup.length; i++) {
			for (int j = 0; j < soup[0].length; j++) {
				palabraEncontrada = letraEncontrada(letras, encontradas, i, j);
				if (palabraEncontrada) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean letraEncontrada(char[] letras, boolean[][] encontradas, int i, int j) {

		char letra = soup[i][j];
		if (letras[0] != letra) {
			return false;
		}
		if (letras.length == 1) {
			return true;
		}

		for (int k = Math.max(i - 1, 0); k <= Math.min(i + 1, soup.length - 1); k++) {
			for (int l = Math.max(j - 1, 0); l <= Math.min(j + 1, soup[0].length - 1); l++) {
				if (k == i && l == j) {
					continue;
				}
				// copiar una seccion de un arreglo existente en un nuevo arreglo
				if (letraEncontrada(Arrays.copyOfRange(letras, 1, letras.length), encontradas, k, l)) {
					return true;
				}
			}
		}
		return false;
	}
}