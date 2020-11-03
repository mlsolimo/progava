package caber;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaberTest { // Aca se generan los archivos .out

	@Test
	public void test_PruebaEnunciado() {
		
		Archivo arch = new Archivo("PruebaEnunciado");	
		Competencia comp = arch.leer();
		arch.escribir(comp);
		
	}
	
	@Test
	public void test_Prueba4Participantes() {
		
		Archivo arch = new Archivo("Prueba4Participantes");	
		Competencia comp = arch.leer();
		arch.escribir(comp);
		
	}

	@Test
	public void test_PruebaLecturaCantParticipantes() {
		
		Archivo arch = new Archivo("PruebaLecturaCantParticipantes");	
		Competencia comp = arch.leer();
		arch.escribir(comp);
		
	}
	
	@Test
	public void test_NingunGanador() {
		
		Archivo arch = new Archivo("NingunGanador");	
		Competencia comp = arch.leer();
		arch.escribir(comp);
		
	}
	
	@Test
	public void test_ConsistenciaMaxima() {
		
		Archivo arch = new Archivo("ConsistenciaMaxima");	
		Competencia comp = arch.leer();
		arch.escribir(comp);
		
	}
}
