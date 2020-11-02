package caber;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class LanzamientoTest {

	@Test
	public void testLanzamientoPerfecto() {
		Lanzamiento l1 = new Lanzamiento(1.0,5.0);
		double distancia = l1.calcularDistancia();
		
		assertEquals(1.0, distancia);
	}

	@Test
	public void testLanzamientoAceptable() {
		Lanzamiento l1 = new Lanzamiento(1.0,35);
		double distancia = l1.calcularDistancia();
		
		assertEquals(0.8, distancia);
	}
	
	@Test
	public void testLanzamientoDescalificado() {
		Lanzamiento l1 = new Lanzamiento(1.0,100);
		double distancia = l1.calcularDistancia();
		
		assertEquals(0.0, distancia);
	}
}

