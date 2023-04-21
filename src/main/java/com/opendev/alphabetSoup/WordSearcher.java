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
		// arreglo de booleanos donde cada posicion indica si la palabra se encontro o no
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
		
		if (encontradas[i][j]) {
			return false;
		}
		char letra = soup[i][j];
		if (letras[0] != letra) {
			return false;
		}
		if (letras.length == 1) {
			return true;
		}

		encontradas[i][j] = true;

		int filaMas = Math.min(i + 1, soup.length - 1);
		int filaMenos = Math.max(i - 1, 0);
		int colMas = Math.min(j + 1, soup[0].length - 1);
		int colMenos = Math.max(j - 1, 0);

		for (int k = filaMenos; k <= filaMas; k++) {
			for (int l = colMenos; l <= colMas; l++) {
				if (k == i && l == j) {
					continue;
				}
				//  copiar una seccion de un arreglo existente en un nuevo arreglo
				if (letraEncontrada(Arrays.copyOfRange(letras, 1, letras.length), encontradas, k, l)) {
					return true;
				}
			}
		}

		encontradas[i][j] = false;
		return false;
	}
}