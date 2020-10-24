package caber;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaberTest {

	@Test
	public void test() {
		
		Archivo arch = new Archivo("PruebaEnunciado");	
		Competencia comp = arch.leerYProcesar();
		arch.escribir(comp);
		
	}

}
