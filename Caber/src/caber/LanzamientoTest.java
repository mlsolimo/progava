package caber;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LanzamientoTest {

	@Test
	public void testLanzamientoPerfecto() {
		Lanzamiento l1 = new Lanzamiento(1.0, 5.0);
		double distancia = l1.calcularDistancia();

		Assert.assertEquals(1.0, distancia);
	}

	@Test
	public void testLanzamientoAceptable() {
		Lanzamiento l1 = new Lanzamiento(1.0, 35);
		double distancia = l1.calcularDistancia();

		Assert.assertEquals(0.8, distancia);
	}

	@Test
	public void testLanzamientoDescalificado() {
		Lanzamiento l1 = new Lanzamiento(1.0, 100);
		double distancia = l1.calcularDistancia();

		System.out.println(distancia);
		System.out.println(0.0);
		Assert.assertEquals(0.0, distancia);
	}

	@Test
	public void testAnguloNoValido() {
		Lanzamiento l1 = new Lanzamiento(1.0, 100);
		boolean angulo = l1.validarAngulo();

		assertEquals(false, angulo);
	}

	@Test
	public void testAnguloValido() {
		Lanzamiento l1 = new Lanzamiento(1.0, 30);
		boolean angulo = l1.validarAngulo();

		assertEquals(true, angulo);
	}
}
