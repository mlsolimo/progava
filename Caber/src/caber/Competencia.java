package caber;

import java.util.ArrayList;

public class Competencia {
	private ArrayList<Participante> participantes;
	private int mayorConsistencia = 0;
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

			if (!participante.esDescalificado()) {

				double distancia = participante.obtenerDistanciaTotal();

				if (i == 1) {
					distanciaPrimero = distancia;
					podioDistancia[0] = i;
				}

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

				i++;
			}
		}
	}

	public void obtenerPodioConsistencia() {

		int i = 1;
		double maxConsistencia = 0;
		double consistenciaPrimero = 0;
		double consistenciaSegundo = 0;
		double consistenciaTercero = 0;

		for (Participante participante : participantes) {

			if (!participante.esDescalificado()) {

				double consistencia = participante.obtenerConsistencia();  	// Entre mas grande sea el numero que devueva obtenerConsistencia, menor consistente 
																			// sera el participante
				if (i == 1) {
					consistenciaPrimero = consistencia;
					podioDistancia[0] = i;
				}

				if (consistencia <= consistenciaPrimero) {

					podioDistancia[2] = podioDistancia[1];
					podioDistancia[1] = podioDistancia[0];
					podioDistancia[0] = i;

					consistenciaTercero = consistenciaSegundo;
					consistenciaSegundo = consistenciaPrimero;
					consistenciaPrimero = consistencia;

				} else if (consistencia <= consistenciaSegundo) {

					podioDistancia[2] = podioDistancia[1];
					podioDistancia[1] = i;

					consistenciaTercero = consistenciaSegundo;
					consistenciaSegundo = consistencia;

				} else if (consistencia < consistenciaTercero) {

					podioDistancia[2] = i;
					consistenciaTercero = consistencia;
				}

				i++;
			}

		}
	}

	public int[] getMayorConsistencia() {

		return this.podioConsistencia;
	}

	public int[] getPodioDistancia() {

		return this.podioDistancia;
	}
}
