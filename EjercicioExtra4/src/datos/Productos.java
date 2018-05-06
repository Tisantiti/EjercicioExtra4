package datos;

public class Productos {
	private String codigo;
	private double precio;
			
	public Productos(String codigo, double precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", precio=" + precio + "]";
	}
	

	
	
}
