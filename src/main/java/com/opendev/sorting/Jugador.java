package com.opendev.sorting;

public class Jugador implements Comparable<Jugador> {

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
	public int compareTo(Jugador o) {
		int a = this.getNombre().compareTo(o.getNombre());
		if (a != 0) {
			return a;
		}
		return Integer.valueOf(o.getPuntuacion()).compareTo(this.getPuntuacion());
	}
}
