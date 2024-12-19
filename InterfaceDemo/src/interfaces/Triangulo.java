package interfaces;

public class Triangulo implements FiguraGeometrica{
	
	private double base;
	private double altura;
	private String nombre;
	
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double calcularArea() {
		return (base * altura)/2;
	}

}