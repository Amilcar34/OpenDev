package com.opendev.alphabetSoup;

public class WordSearcher {

	private char soup[][];

	public WordSearcher(char soup[][]) {
		this.soup = soup;
	}

	public boolean isPresent(String word) {
		boolean ok = false;
		
		for (int c = 0; c < word.length(); c++) {
			for (int i = 0; i < soup.length; i++) {
				for (int j = 0; j < soup[i].length; j++) {
					ok = true;
					/*for (int j2 = 0; j2 < soup[c+i].length; j2++) {
						for (int k = 0; k < soup[c+j].length; k++) {*/
							if (word.charAt(c) == soup[i][j]) {
								ok = true;
							} else {
								ok = false;
						}
					}
				// for anidados o while
					
						/* recorrer la sopa no solo secuencialmente sino como si fueran cinco cuadrados.
						ej:
						*     A
						*  B  G  H
						*     K
						*/
					}
		}
		return ok;
	}}