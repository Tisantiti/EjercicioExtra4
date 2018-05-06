package main;

import java.util.Scanner;

import datos.Factura;
import datos.Productos;

public class Principal {

	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		Factura fac1 = new Factura(234);
		
		Productos p1 = new Productos("C1", 24);
		Productos p2 = new Productos("H23", 234);
		Productos p3 = new Productos("M30", 109);
		
		fac1.AddProducto(p1, 0);
		fac1.AddProducto(p2, 1);
		fac1.AddProducto(p3, 2);
		
		fac1.consultaFactura();
		
		fac1.cambiarProducto();
		
		fac1.consultaFactura();
		
		sc.close();
	}

}
