package caber;

import java.util.ArrayList;

public class Competencia {
	private ArrayList<Participante> participantes;
	private int mayorConsistencia = 0;
	private int[] podioDistancia;

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

	public void obtenerPodioConsistencia() {

		int i = 1;
		double maxConsistencia = 0;

		for (Participante participante : participantes) {

			if (!participante.EsDescalificado()) {

				double consistencia = participante.obtenerDistanciaTotal();

				if (i == 1 || (consistencia > maxConsistencia)) {
					maxConsistencia = consistencia;
					mayorConsistencia = i;
				}

				i++;
			}

		}
	}
}
