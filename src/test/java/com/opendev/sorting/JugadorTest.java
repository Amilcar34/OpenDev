package com.opendev.sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JugadorTest {

	@Test
	public void vGetNombre() {
		Jugador jugador = new Jugador("Pepe", 30);
		assertEquals("Pepe", jugador.getNombre());
	}

	@Test
	public void vSetNombre() {
		// test que marca el code coverage
		Jugador jugador = new Jugador("Pepe", 30);
		jugador.setNombre("Mario");
		assertEquals("Mario", jugador.getNombre());
	}

	@Test
	public void vSetPuntuacion() {
		// test que marca el code coverage
		Jugador jugador = new Jugador("Pepe", 30);
		jugador.setPuntuacion(10);
		assertEquals(10, jugador.getPuntuacion());
	}

	@Test
	public void vSetPerdidas() {
		// test que marca el code coverage
		Jugador jugador = new Jugador("Pepe", 30, 5);
		jugador.setPerdidas(1);
		assertEquals(1, jugador.getPerdidas());
	}

	@Test
	public void vToString() {
		// test que marca el code coverage
		Jugador jugador = new Jugador("Pepe", 30, 5);
		String string = "Jugador [nombre=Pepe, puntuacion=30, perdidas=5]";
		assertEquals(string, jugador.toString());
	}

	@Test
	public void vCompare() {
		// test que marca el code coverage
		Jugador jugador = new Jugador("Pepe", 30);
		Jugador jugador2 = new Jugador("Juan", 10);
		
		assertEquals(6, jugador.compare(jugador, jugador2));
	}

}
