package org.example.ejercicios;

import java.util.List;
import java.time.LocalDate;

public class Facturaciom2 {
	record Factura(String cliente,  LocalDate fechafactura, List<Double> precioProducto) {
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sannabria", LocalDate.of(1999, 7, 1), List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", LocalDate.of(2000, 8, 15), List.of(3500D, 6000D, 2800D));

		System.out.println("Factura 1" );
		System.out.println("Cliente: " + factura1.cliente());
		double total1 = calcularTotalFacturas(factura1.precioProducto);
		System.out.println("Total: " + total1);

		System.out.println("Factura 2" );
		System.out.println("Cliente: " + factura2.cliente());
		double total2 = calcularTotalFacturas(factura2.precioProducto);
		System.out.println("Total: " + total2);
	}

	public static double calcularTotalFacturas (List<Double> precios){
		double total = 0;
		for (Double precio : precios) {
			total += precio;
		}
		return total;
	}
}
