package datos;

import java.util.Scanner;


public class Factura {
	
	private int numFactura;
	private Productos[] tabla;
	private static Scanner sc = new Scanner (System.in);
	public Factura(int numFactura) {
		super();
		this.numFactura = numFactura;
		this.tabla = new Productos[3];
	}
	
	
	public int getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	public Productos[] getTabla() {
		return tabla;
	}
	public void setTabla(Productos[] tabla) {
		this.tabla = tabla;
	}
	
	public void consultaFactura() {
		System.out.println("El número de la factura es: "+ numFactura);
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i] != null)
			System.out.println(tabla[i].toString());
		}
	}
	
	public void cambiarProducto() {
		int num = -1;
		double precio = -1; 
		do {
		System.out.println("Nombre de los Productos de la lista");
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(i+1+ " --> " + tabla[i].getCodigo() + " su precio: --> "+ tabla[i].getPrecio());
		}
		try {
		System.out.println("¿Qué producto quieres cambiar?");
		
		String a = sc.next();
		num = Integer.parseInt(a);
		num--;
		System.out.println("Su código es: " + tabla[num].getCodigo());
		System.out.println("Dime el código nuevo: ");
		a = sc.next();
		System.out.println("Su precio es: " + tabla[num].getPrecio());	
		System.out.println("Dime el precio nuevo: ");
		String c = sc.next();
		precio = Float.parseFloat(c);
		
		tabla[num].setCodigo(a);
		tabla[num].setPrecio(precio);
		}catch (Exception e) {
			System.out.println("No has escrito un número");
		}
		}while(num == -1 || precio == -1);
		System.out.println("Su producto ha sido modificado");
	}

	public void AddProducto (Productos p1, int id) {
		tabla[id]=p1;
	}
	
}
