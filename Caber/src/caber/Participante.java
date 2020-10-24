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
		double anguloConsistencia=0;
		double distanciaConsistencia=0;
		
		
		double lanz1 = lanzamientos.get(0).getDistancia();
		double lanz2 = lanzamientos.get(1).getDistancia();
		double lanz3 = lanzamientos.get(2).getDistancia();
		
		double ang1 = lanzamientos.get(0).getAngulo();
		double ang2 = lanzamientos.get(1).getAngulo();
		double ang3 = lanzamientos.get(2).getAngulo();
			
		anguloConsistencia = Math.abs(ang1 - ang2) + Math.abs(ang2 - ang3) + Math.abs(ang1 - ang3);
		distanciaConsistencia = Math.abs(lanz1 - lanz2) + Math.abs(lanz2 - lanz3) + Math.abs(lanz1 - lanz3);
		
		consistencia = anguloConsistencia+distanciaConsistencia;
		
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
