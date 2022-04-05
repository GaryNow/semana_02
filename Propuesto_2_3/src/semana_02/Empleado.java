package semana_02;

public class Empleado {
	private int codigo,numeroCelular;
	private String nombre;
	private double sueldo;
	
	public Empleado(int codigo, String nombre, int numeroCelular, double sueldo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.numeroCelular = numeroCelular;
		this.sueldo = sueldo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String restriccion() {
		if(sueldo > 3500) {
			return "Sueldo mayor a $/.3500";
		} else if (sueldo <= 3500 && sueldo > 0) {
			return "Sueldo menor a $/.3500";
		} else {
			return "error";
		}
	}
	
}
