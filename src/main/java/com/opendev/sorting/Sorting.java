package com.opendev.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	/**
	 * Se debe ordenar primero por puntuación de manera descendente, luego por
	 * nombre de manera ascendente.
	 *
	 * @param jugadores la lista de jugadores a ordenar
	 * @return la lista ordenada de jugadores
	 */
	public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores) {
		List<Jugador> jugadoresOrdenados = new ArrayList<>();
		jugadoresOrdenados.addAll(jugadores);

		jugadores.sort((o1, o2) -> {
			int a = o1.getNombre().compareTo(o2.getNombre());
			if (a != 0) {
				return a;
			}
			return Integer.valueOf(o2.getPuntuacion()).compareTo(o1.getPuntuacion());
		});
		return jugadoresOrdenados;		
	}

	/**
	 * Se debe ordenar primero por puntuación de manera descendente. Cuando 2
	 * jugadores tienen igual cantidad de puntos, el que tiene menos perdidas se lo
	 * considerara el mayor. Luego a igual puntos y perdidas se segxxuirá usando el
	 * nombre de manera ascendente.
	 *
	 * @param jugadores la lista de jugadores a ordenar
	 * @return la lista ordenada de jugadores
	 */
	public static List<Jugador> ordenarPorPuntuacionPerdidasYNombre(List<Jugador> jugadores) {
		List<Jugador> jugadoresOrdenados = new ArrayList<>();
		jugadores.sort((o1,o2) -> {
			int b = o1.getNombre().compareTo(o2.getNombre());
			if(b != 0) {
				return b;
			}
			if(o1.getPuntuacion() == o2.getPuntuacion()) {
				return Integer.valueOf(o1.getPerdidas()).compareTo(o2.getPerdidas());
			}
			return Integer.valueOf(o2.getPuntuacion()).compareTo(o1.getPuntuacion());
			
		});
		jugadoresOrdenados.addAll(jugadores);
		return jugadoresOrdenados;
	}
}
