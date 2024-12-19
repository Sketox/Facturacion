package interfaces;

public class Circulo implements FiguraGeometrica{
	private double radio;
	private String nombre;
	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public double calcularArea() {
		return 3.1416 * radio * radio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}