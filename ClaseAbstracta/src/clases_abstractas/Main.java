package clases_abstractas;

public class Main {

	public static void main(String[] args) {
		
		FiguraGeometrica rectangulo1 = new Rectangulo(70,45, "Rectangulo Grande");
		FiguraGeometrica rectangulo2 = new Rectangulo(15,5, "Rectangulo Chiquito");
		
		imprimirArea(rectangulo1);
		imprimirArea(rectangulo2);
		imprimirMayor(rectangulo1, rectangulo2);
		
		
		FiguraGeometrica triangulo1 = new Triangulo(50,78, "Triangulo Grande");
		FiguraGeometrica triangulo2 = new Triangulo(5,10, "Triangulo Chiquito");
		
		imprimirArea(triangulo1);
		imprimirArea(triangulo2);
		imprimirMayor(triangulo1, triangulo2);
		
		
		FiguraGeometrica circulo1 = new Circulo("Circulo Grande",49);
		FiguraGeometrica circulo2 = new Circulo("Circulo Pi",1);
		
		imprimirArea(circulo1);
		imprimirArea(circulo2);
		imprimirMayor(circulo1, circulo2);
		
		System.out.println("Otros ejemplos: \nViendo el mayor tamano de diferentes figuras\n");
		imprimirMayor(rectangulo1, circulo1);
		imprimirMayor(rectangulo2, triangulo2);
		imprimirMayor(triangulo2, circulo2);
		
	}
	
	public static void imprimirMayor(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		if(figura1.mayorQue(figura2)) {
			System.out.println("La figura " + figura1.getNombreFigura() + " es mayor que la figura " + figura2.getNombreFigura());
		}
		else {
			System.out.println("La figura " + figura2.getNombreFigura() + " es mayor que la figura " + figura1.getNombreFigura());
		}
		System.out.println("");
	}
	
	public static void imprimirArea(FiguraGeometrica figura) {
		System.out.println("El area de " + figura.getNombreFigura() + " es: " + figura.calcularArea());
	}

}