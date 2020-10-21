package caber;

public class Lanzamiento {

	private double distancia;
	private double angulo;
	private final double anguloMinimoValido = -90;
	private final double anguloMaximoValido = 90;
	private final double anguloMinimo100 = -30;
	private final double anguloMaximo100 = 30;
	private final double porcentajeDistancia = 0.8;
	
	public Lanzamiento(double distancia, double angulo) {
		this.distancia = distancia;
		this.angulo = angulo;
	}
	
	public double calcularDistancia() {
		
		double resultadoDistancia=0;
		
		if(this.validarAngulo()) {
			
			if(this.angulo >= anguloMinimo100 && this.angulo <= anguloMaximo100) {
				resultadoDistancia = distancia;
			}
			else {
				resultadoDistancia = distancia * porcentajeDistancia;
			}
		}
			
		return resultadoDistancia;	
	}
	
	public boolean validarAngulo() {
		
		if(this.angulo>=anguloMinimoValido && this.angulo<=anguloMaximoValido)
			return true;
		return false;
	}

	public double getDistancia() {
		return distancia;
	}

	public double getAngulo() {
		return angulo;
	}
	
}
