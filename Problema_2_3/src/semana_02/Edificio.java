package semana_02;

public class Edificio {
	// Atributos
	private int codigo, departamentos, cantidadPisos;
	private double precioDolares;
	
	// Constructor
	public Edificio(int codigo, int departamentos, int cantidadPisos, double precioDolares) {
		this.codigo = codigo;
		this.departamentos = departamentos;
		this.cantidadPisos = cantidadPisos;
		this.precioDolares = precioDolares;
	}
	
	//
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(int departamentos) {
		this.departamentos = departamentos;
	}
	public int getCantidadPisos() {
		return cantidadPisos;
	}
	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}
	public double getPrecioDolares() {
		return precioDolares;
	}
	public void setPrecioDolares(double precioDolares) {
		this.precioDolares = precioDolares;
	}
	
	public double precioEdificio() {
		return departamentos * precioDolares;
	}
	
}
