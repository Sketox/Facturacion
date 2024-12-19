package interfaces;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundito");
		
		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.setAltura(10);
		rectangulo1.setBase(5);
		rectangulo1.setNombre("Rectangulo 1");
		System.out.println("El area del " + rectangulo1.getNombre() + " es: " + rectangulo1.calcularArea());
		
		Rectangulo rectangulo2 = new Rectangulo();
		rectangulo2.setAltura(69);
		rectangulo2.setBase(45);
		rectangulo2.setNombre("Rectangulo 2");
		System.out.println("El area del " + rectangulo2.getNombre() + " es: " + rectangulo2.calcularArea());
		
		Rectangulo rectangulo3 = new Rectangulo();
		rectangulo3.setAltura(2);
		rectangulo3.setBase(1);
		rectangulo3.setNombre("Rectangulo 3");
		System.out.println("El area del " + rectangulo3.getNombre() + " es: " + rectangulo3.calcularArea());
		
		Circulo circulo1 = new Circulo();
		circulo1.setNombre("Circulo 1");
		circulo1.setRadio(6);
		System.out.println("El area del " + circulo1.getNombre() + " es: " + circulo1.calcularArea());

		Circulo circulo2 = new Circulo();
		circulo2.setNombre("Circulo 2");
		circulo2.setRadio(1);
		System.out.println("El area del " + circulo2.getNombre() + " es: " + circulo2.calcularArea());

		Circulo circulo3 = new Circulo();
		circulo3.setNombre("Circulo 3");
		circulo3.setRadio(69);
		System.out.println("El area del " + circulo3.getNombre() + " es: " + circulo3.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAltura(5);
		triangulo1.setBase(10);
		triangulo1.setNombre("Triangulo 1");
		System.out.println("El area del " + triangulo1.getNombre() + " es: " + triangulo1.calcularArea());
		
		Triangulo triangulo2 = new Triangulo();
		triangulo2.setAltura(7);
		triangulo2.setBase(9);
		triangulo2.setNombre("Triangulo 2");
		System.out.println("El area del " + triangulo2.getNombre() + " es: " + triangulo2.calcularArea());
		
		Triangulo triangulo3 = new Triangulo();
		triangulo3.setAltura(1);
		triangulo3.setBase(2);
		triangulo3.setNombre("Triangulo 3");
		System.out.println("El area del " + triangulo3.getNombre() + " es: " + triangulo3.calcularArea());

	}
	

}