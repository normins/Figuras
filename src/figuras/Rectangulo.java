package figuras;

public class Rectangulo {

	private double ancho;
	private double alto;

	public Rectangulo() {
	}

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}


	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}

	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}


	public double getPerimetro2() {
		return (this.alto * 2 + this.ancho * 2) * 2;
	}
}
