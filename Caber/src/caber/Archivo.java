package caber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public Competencia leer() {
		Scanner arch = null;
		Competencia comp = new Competencia();
		try {

			arch = new Scanner(new File("ArchivosPrueba\\"+this.nombre + ".in"));
			arch.useLocale(Locale.ENGLISH);

			int cantParticipantes = arch.nextInt();
			double distancia, angulo;
			for (int i = 0; i < cantParticipantes; i++) {
				Participante p = new Participante(new ArrayList<Lanzamiento>());
				for (int j = 0; j < 3; j++) {

					distancia = arch.nextDouble();
					angulo = arch.nextDouble();
					Lanzamiento lanz = new Lanzamiento(distancia, angulo);
					p.agregarLanzamiento(lanz);
				}
				comp.agregar(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			arch.close();
		}
		return comp;
	}

	public void escribir(Competencia comp) {
		FileWriter arch = null;
		PrintWriter pw = null;

		comp.obtenerPodioConsistencia();
		comp.obtenerPodioDistancia();

		try {
			arch = new FileWriter(this.nombre + ".out");
			pw = new PrintWriter(arch);

			pw.println(comp.getPodioConsistencia());
			pw.println(comp.getPodioDistancia());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (arch != null) {
				try {
					arch.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}