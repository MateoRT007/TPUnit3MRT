package org.example.ejercicios;

public class CalculaPerimetroRectangulo2 {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(4D, 7D, 4D, 7D);
		double perimetro = rectangulo.calcularPerimetroRectangulo();
		System.out.println("El perímetro del rectángulo es: " + perimetro);
	}

	record Rectangulo(double lado1, double lado2, double lado3, double lado4) {
		public double calcularPerimetroRectangulo() {
			double perimetro = lado1 + lado2 + lado3 + lado4;
			return perimetro;
		}
	}
}