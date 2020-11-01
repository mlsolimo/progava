package caber;

import java.util.ArrayList;

public class Participante {

	private ArrayList<Lanzamiento> lanzamientos;
	
	public Participante(ArrayList<Lanzamiento> lanzamientos) {
		this.lanzamientos = lanzamientos;
	}

	public boolean agregarLanzamiento(Lanzamiento lanz) {
		
		if(this.lanzamientos == null) {
			return false;
		}
		
		this.lanzamientos.add(lanz);
		return true;
	}
	
	public double obtenerDistanciaTotal() {
		
		double sumaDistancias=0;
		
		for (Lanzamiento lanzamiento : lanzamientos) {		
			sumaDistancias += lanzamiento.calcularDistancia();
		}
		
		return sumaDistancias;
	}
	
	public double obtenerConsistencia() {
		
		double consistencia=0;
		
		double mediaAngulo = 0;
		double mediaDistancia = 0;
		
		double varianzaAngulo = 0;
		double varianzaDistancia = 0;
		
		double sumatoriaAngulo = 0;
		double sumatoriaDistancia = 0; 
		
		int n = 0;
		
		for (Lanzamiento lanzamiento : lanzamientos) {
			
			mediaAngulo += lanzamiento.getAngulo();
			mediaDistancia += lanzamiento.getDistancia();
			n++;
		}
		
		mediaAngulo = mediaAngulo / n;
		mediaDistancia = mediaDistancia / n;
		
		for (Lanzamiento lanzamiento : lanzamientos) {
			
			sumatoriaAngulo += Math.pow(lanzamiento.getAngulo() - mediaAngulo, 2);
			sumatoriaDistancia = Math.pow(lanzamiento.getDistancia() - mediaDistancia, 2);
		}
		
		varianzaAngulo = sumatoriaAngulo / (n - 1);
		varianzaDistancia = sumatoriaDistancia / (n - 1);
		
		consistencia = varianzaAngulo + varianzaDistancia;
		
		return consistencia;
	}
	
	public boolean esDescalificado() {
		
		boolean esDescalificado = false;
		
		for (Lanzamiento lanzamiento : lanzamientos) {
			if(!lanzamiento.validarAngulo()) {
				esDescalificado = true;
			}
		}
		return esDescalificado;
	}

}
