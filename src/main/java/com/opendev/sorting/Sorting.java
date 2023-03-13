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

		// Comparator<Jugador> comparadorDescendente = Collections.reverseOrder();
		// Collections.sort(jugadoresOrdenados, comparadorDescendente);

		/*
		 * Collections.sort(jugadoresOrdenados, new Comparator<Jugador>() {
		 * 
		 * @Override public int compare(Jugador o1, Jugador o2) { //return new
		 * Jugador(o2.getPuntuacion().compareTo(new Jugador(o1.getPuntuacion()))); } });
		 */

		jugadoresOrdenados.sort((o1, o2) -> {
			int a = o1.getNombre().compareTo(o2.getNombre());
			if (a != 0) {
				return a;
			}
			//return Integer.valueOf(o2.getPuntuacion().compareTo(o1.getPuntuacion()));
			return Integer.valueOf(o2.getPuntuacion()).compareTo(o1.getPuntuacion());
		});
		// jugadoresOrdenados.sort(Comparator.comparing(Jugador::getPuntuacion).reversed());
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
		return null;
	}
}
