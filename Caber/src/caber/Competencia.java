package caber;

import java.util.ArrayList;

public class Competencia {
	private ArrayList<Participante> participantes;
	private int[] podioDistancia;
	private int[] podioConsistencia;

	public Competencia() {
		participantes = new ArrayList<Participante>();
		podioDistancia = new int[3];
	}

	public boolean agregar(Participante part) {
		return participantes.add(part);
	}

	public void obtenerPodioDistancia() {

		int i = 1;
		double distanciaPrimero = 0;
		double distanciaSegundo = 0;
		double distanciaTercero = 0;

		for (Participante participante : participantes) {

				double distancia = participante.obtenerDistanciaTotal();

				if (i == 1) {
					distanciaPrimero = distancia;
					podioDistancia[0] = i;
				}
				else {
					
					if (distancia >= distanciaPrimero) {

						podioDistancia[2] = podioDistancia[1];
						podioDistancia[1] = podioDistancia[0];
						podioDistancia[0] = i;

						distanciaTercero = distanciaSegundo;
						distanciaSegundo = distanciaPrimero;
						distanciaPrimero = distancia;

					} else if (distancia >= distanciaSegundo) {

						podioDistancia[2] = podioDistancia[1];
						podioDistancia[1] = i;

						distanciaTercero = distanciaSegundo;
						distanciaSegundo = distancia;

					} else if (distancia > distanciaTercero) {

						podioDistancia[2] = i;
						distanciaTercero = distancia;
					}
				}
				
				i++;
			}
	}

	public void obtenerPodioConsistencia() {

		int i = 1;
		double consistenciaPrimero = 1000;
		double consistenciaSegundo = 1000;
		double consistenciaTercero = 1000;
		podioConsistencia  = new int[3];
		
		
		for (Participante participante : participantes) {

			if (!participante.esDescalificado()) {

				double consistencia = participante.obtenerConsistencia();
				
				if (i == 1) {
					consistenciaPrimero = consistencia;
					podioConsistencia[0] = i;
				}
				else {
					
					if (consistencia <= consistenciaPrimero) {

						podioConsistencia[2] = podioConsistencia[1];
						podioConsistencia[1] = podioConsistencia[0];
						podioConsistencia[0] = i;

						consistenciaTercero = consistenciaSegundo;
						consistenciaSegundo = consistenciaPrimero;
						consistenciaPrimero = consistencia;

					} else if (consistencia <= consistenciaSegundo) {

						podioConsistencia[2] = podioConsistencia[1];
						podioConsistencia[1] = i;

						consistenciaTercero = consistenciaSegundo;
						consistenciaSegundo = consistencia;

					} else if (consistencia < consistenciaTercero) {

						podioConsistencia[2] = i;
						consistenciaTercero = consistencia;
					}

				}
			}	
			
			i++;
		}
	}

	public int[] getPodioConsistencia() {

		return this.podioConsistencia;
	}

	public int[] getPodioDistancia() {

		return this.podioDistancia;
	}
}
