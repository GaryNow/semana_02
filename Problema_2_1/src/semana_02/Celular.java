package semana_02;

public class Celular {
	// Atributos
	private int numero,segConsumidos;
	private String usuario;
	private double precioSeg;
	
	// Constructor
	public Celular(int numero, int segConsumidos, String usuario, double precioSeg) {
		super();
		this.numero = numero;
		this.segConsumidos = segConsumidos;
		this.usuario = usuario;
		this.precioSeg = precioSeg;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSegConsumidos() {
		return segConsumidos;
	}

	public void setSegConsumidos(int segConsumidos) {
		this.segConsumidos = segConsumidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getPrecioSeg() {
		return precioSeg;
	}

	public void setPrecioSeg(double precioSeg) {
		this.precioSeg = precioSeg;
	}
	
	public double costoConsumo() {
		return segConsumidos * precioSeg;
	}
	
	public double impuesto() {
		return 0.18 * costoConsumo();
	}
	
	public double totalAPagar() {
		return costoConsumo() + impuesto();
	}
	
}
