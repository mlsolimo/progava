package caber;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ParticipanteTest {

	@Test
	public void test_ParticipanteConLanzamientosValidos() {
		Participante auxiliar = new Participante(new ArrayList<Lanzamiento>());
		Lanzamiento lanz1 = new Lanzamiento(1.49,5.00);
		Lanzamiento lanz2 = new Lanzamiento(1.50,3.00);
		Lanzamiento lanz3 = new Lanzamiento(1.51,-3.00);
		
		auxiliar.agregarLanzamiento(lanz1);
		auxiliar.agregarLanzamiento(lanz2);
		auxiliar.agregarLanzamiento(lanz3);
		
		assertEquals(false,auxiliar.esDescalificado());
	}
	
	@Test
	public void test_ParticipanteConLanzamientoNoValidos() {
		Participante auxiliar = new Participante(new ArrayList<Lanzamiento>());
		Lanzamiento lanz1 = new Lanzamiento(2.30,-35.00);
		Lanzamiento lanz2 = new Lanzamiento(1.30,-92.00);
		Lanzamiento lanz3 = new Lanzamiento(1.00,1.00);
		
		auxiliar.agregarLanzamiento(lanz1);
		auxiliar.agregarLanzamiento(lanz2);
		auxiliar.agregarLanzamiento(lanz3);
		
		assertEquals(true,auxiliar.esDescalificado());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_DistanciaTotal1() {
		Participante auxiliar = new Participante(new ArrayList<Lanzamiento>());
		double valorLanz1 = 1.49,valorLanz2 = 1.50,valorLanz3 = 1.51;
		Lanzamiento lanz1 = new Lanzamiento(valorLanz1,5.00);
		Lanzamiento lanz2 = new Lanzamiento(valorLanz2,3.00);
		Lanzamiento lanz3 = new Lanzamiento(valorLanz3,-3.00);
		
		double resultadoEsperado = valorLanz1 + valorLanz2 + valorLanz3;
		
		auxiliar.agregarLanzamiento(lanz1);
		auxiliar.agregarLanzamiento(lanz2);
		auxiliar.agregarLanzamiento(lanz3);
		
		double resultadoObtenido = auxiliar.obtenerDistanciaTotal();
		
		System.out.println(resultadoEsperado);
		System.out.println(resultadoObtenido);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	

}

