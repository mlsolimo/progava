package caber;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class CompetenciaTest {

	@Test
	public void podioConsistencia3participantes() {
		
		Competencia competencia = new Competencia();
		
		Participante p1 = new Participante(new ArrayList<Lanzamiento>());
		Participante p2 = new Participante(new ArrayList<Lanzamiento>());
		Participante p3 = new Participante(new ArrayList<Lanzamiento>());
		
		p1.agregarLanzamiento(new Lanzamiento(1.49,5.00));
		p1.agregarLanzamiento(new Lanzamiento(1.50, 3.00));
		p1.agregarLanzamiento(new Lanzamiento(1.51, -3.00));
		
		p2.agregarLanzamiento(new Lanzamiento(2.10, 6.00));
		p2.agregarLanzamiento(new Lanzamiento(2.00, -6.00));
		p2.agregarLanzamiento(new Lanzamiento(1.00, 2.00));
		
		p3.agregarLanzamiento(new Lanzamiento(2.30, -35.00));
		p3.agregarLanzamiento(new Lanzamiento(1.30, -92.00));
		p3.agregarLanzamiento(new Lanzamiento(1.00, 1.00));
		
		competencia.agregar(p1);
		competencia.agregar(p2);
		competencia.agregar(p3);
		
		competencia.obtenerPodioConsistencia();
		int[] podio = competencia.getPodioConsistencia();
		int[] resultado = {1, 2, 0}; 
		assertTrue(Arrays.equals(podio, resultado));
	}
	
	@Test
	public void podioConsistencia4participantes() {
		
		Competencia competencia = new Competencia();
		
		Participante p1 = new Participante(new ArrayList<Lanzamiento>());
		Participante p2 = new Participante(new ArrayList<Lanzamiento>());
		Participante p3 = new Participante(new ArrayList<Lanzamiento>());
		Participante p4 = new Participante(new ArrayList<Lanzamiento>());
		
		
		p1.agregarLanzamiento(new Lanzamiento(1.49,5.00));
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
		int[] resultado = {1, 2, 4}; 
		assertTrue(Arrays.equals(podio, resultado));
		/*for (int i = 0; i < podio.length; i++) {
			System.out.println(podio[i]);
		}*/
		/*
		competencia.obtenerPodioDistancia();
		podio = competencia.getPodioDistancia();
		
		for (int i = 0; i < podio.length; i++) {
			System.out.println(podio[i]);
		}*/
	}
	
	@Test
	public void podioDistancia3participantes() {
		
		Competencia competencia = new Competencia();
		
		Participante p1 = new Participante(new ArrayList<Lanzamiento>());
		Participante p2 = new Participante(new ArrayList<Lanzamiento>());
		Participante p3 = new Participante(new ArrayList<Lanzamiento>());
		
		p1.agregarLanzamiento(new Lanzamiento(1.49,5.00));
		p1.agregarLanzamiento(new Lanzamiento(1.50, 3.00));
		p1.agregarLanzamiento(new Lanzamiento(1.51, -3.00));
		
		p2.agregarLanzamiento(new Lanzamiento(2.10, 6.00));
		p2.agregarLanzamiento(new Lanzamiento(2.00, -6.00));
		p2.agregarLanzamiento(new Lanzamiento(1.00, 2.00));
		
		p3.agregarLanzamiento(new Lanzamiento(2.30, -35.00));
		p3.agregarLanzamiento(new Lanzamiento(1.30, -92.00));
		p3.agregarLanzamiento(new Lanzamiento(1.00, 1.00));
		
		competencia.agregar(p1);
		competencia.agregar(p2);
		competencia.agregar(p3);
		
		int[] resultado = {2, 1, 3}; 
		
		competencia.obtenerPodioDistancia();
		int [] podio = competencia.getPodioDistancia();
		
		assertTrue(Arrays.equals(podio, resultado));
	}
	
	@Test
	public void podioDistancia4participantes() {
		
		Competencia competencia = new Competencia();
		
		Participante p1 = new Participante(new ArrayList<Lanzamiento>());
		Participante p2 = new Participante(new ArrayList<Lanzamiento>());
		Participante p3 = new Participante(new ArrayList<Lanzamiento>());
		Participante p4 = new Participante(new ArrayList<Lanzamiento>());
		
		
		p1.agregarLanzamiento(new Lanzamiento(1.49,5.00));
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
		
		
		int[] resultado = {4, 2, 1}; 
		
		competencia.obtenerPodioDistancia();
		int [] podio = competencia.getPodioDistancia();
		
		assertTrue(Arrays.equals(podio, resultado));
	}
	
	
	@Test
	public void podioConsistenciaSinGanadores() {
		
		Competencia competencia = new Competencia();
		
		Participante p1 = new Participante(new ArrayList<Lanzamiento>());
		Participante p2 = new Participante(new ArrayList<Lanzamiento>());
		Participante p3 = new Participante(new ArrayList<Lanzamiento>());
		
		p1.agregarLanzamiento(new Lanzamiento(1.49,-92.00));
		p1.agregarLanzamiento(new Lanzamiento(1.50, 3.00));
		p1.agregarLanzamiento(new Lanzamiento(1.51, -3.00));
		
		p2.agregarLanzamiento(new Lanzamiento(2.10, 6.00));
		p2.agregarLanzamiento(new Lanzamiento(2.00, -92.00));
		p2.agregarLanzamiento(new Lanzamiento(1.00, 2.00));
		
		p3.agregarLanzamiento(new Lanzamiento(2.30, -35.00));
		p3.agregarLanzamiento(new Lanzamiento(1.30, -92.00));
		p3.agregarLanzamiento(new Lanzamiento(1.00, 1.00));
		
		competencia.agregar(p1);
		competencia.agregar(p2);
		competencia.agregar(p3);
		
		int[] resultado = {0, 0, 0}; 
		
		competencia.obtenerPodioConsistencia();
		int [] podio = competencia.getPodioConsistencia();
		
		assertTrue(Arrays.equals(podio, resultado));
	}
}
