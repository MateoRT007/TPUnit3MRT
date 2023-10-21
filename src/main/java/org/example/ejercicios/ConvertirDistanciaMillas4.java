package org.example.ejercicios;

public class ConvertirDistanciaMillas4 {
		public static void main(String[] args) {
			DistanciaViaje viaje = new DistanciaViaje("Medellin", "Bogotá", 100.0);
			double distanciaKilometros = viaje.distanciakilometros() ;
			double distanciaMillas = distanciaKilometros *  0.621371;
			System.out.println("La distancia entre " + viaje.origen() + " y " + viaje.destino() + " es de " + distanciaMillas + " millas.");
		}

		record DistanciaViaje(String origen, String destino, double distanciakilometros) {}
}
