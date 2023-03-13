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
					if (word.charAt(c) == soup[i][j]) {
						//soup[i][j] = '*';
						ok = true;
					}

				}
			}
		}
		return ok;
	}
}