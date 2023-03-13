package com.opendev.sorting;

import java.util.Comparator;

public class Jugador implements Comparator<Jugador>{

	private String nombre;
	private int puntuacion;
	private int perdidas;

	public Jugador(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.perdidas = 0;
	}

	public Jugador(String nombre, int puntuacion, int perdidas) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.perdidas = perdidas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getPerdidas() {
		return perdidas;
	}

	public void setPerdidas(int perdidas) {
		this.perdidas = perdidas;
	}

	@Override
	public int compare(Jugador o1, Jugador o2) {
		return new Integer(o2.getPuntuacion()).compareTo(new Integer(o1.getPuntuacion()));
	}
}