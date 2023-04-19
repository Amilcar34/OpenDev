package com.opendev.sorting;

import java.util.ArrayList;
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

		jugadores.sort((o1, o2) -> {
			int a = Integer.compare(o2.getPuntuacion(), o1.getPuntuacion());
			if (a != 0) {
				return a;
			}
			return o1.getNombre().compareTo(o2.getNombre());
		});
		jugadoresOrdenados.addAll(jugadores);
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
		jugadores.sort((o1, o2) -> {
			int b = Integer.compare(o2.getPuntuacion(), o1.getPuntuacion());
			if (b != 0) {
				return b;
			}
			if (o1.getPuntuacion() == o2.getPuntuacion()) {
				if (o1.getPerdidas() == o2.getPerdidas()) {
					return o1.getNombre().compareTo(o2.getNombre());
				}
			}
			return Integer.compare(o1.getPerdidas(), o2.getPerdidas());
		});
		jugadoresOrdenados.addAll(jugadores);
		return jugadoresOrdenados;
	}
}
