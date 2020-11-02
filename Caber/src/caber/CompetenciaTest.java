package caber;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CompetenciaTest {

	@Test
	public void test() {
		Competencia competencia = new Competencia();
		
		Participante p1 = new Participante(new ArrayList<Lanzamiento>());
		Participante p2 = new Participante(new ArrayList<Lanzamiento>());
		Participante p3 = new Participante(new ArrayList<Lanzamiento>());
		Participante p4 = new Participante(new ArrayList<Lanzamiento>());
		
		p1.agregarLanzamiento(new Lanzamiento(10.49,5.00));
		p1.agregarLanzamiento(new Lanzamiento(1.50, 3.00));
		p1.agregarLanzamiento(new Lanzamiento(1.51, -3.00));
		
		p2.agregarLanzamiento(new Lanzamiento(2.10, 6.00));
		p2.agregarLanzamiento(new Lanzamiento(2.00, -6.00));
		p2.agregarLanzamiento(new Lanzamiento(1.00, 2.00));
		
		p3.agregarLanzamiento(new Lanzamiento(2.30, -35.00));
		p3.agregarLanzamiento(new Lanzamiento(1.30, -92.00));
		p3.agregarLanzamiento(new Lanzamiento(1.00, 1.00));
		
		p4.agregarLanzamiento(new Lanzamiento(2.30, -30.00));
		p4.agregarLanzamiento(new Lanzamiento(1.30, -1.00));
		p4.agregarLanzamiento(new Lanzamiento(2.00, -1.00));
		
		competencia.agregar(p1);
		competencia.agregar(p2);
		competencia.agregar(p3);
		competencia.agregar(p4);
		
		competencia.obtenerPodioConsistencia();
		int[] podio = competencia.getPodioConsistencia();
		
		for (int i = 0; i < podio.length; i++) {
			System.out.println(podio[i]);
		}
		
		System.out.println();
		competencia.obtenerPodioDistancia();
		podio = competencia.getPodioDistancia();
		
		for (int i = 0; i < podio.length; i++) {
			System.out.println(podio[i]);
		}
	}

}
