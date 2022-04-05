package semana_02;

public class Computadora {
	// Atributos
	private int codigo;
	private String marca, color;
	private double dolares;
	
	// Constructor
	public Computadora(int codigo, String marca, String color, double dolares) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.dolares = dolares;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}
	
	public double precioSoles() {
		return dolares * 3.65;
	}
	
	public double precioEuros() {
		return dolares / 1.2;
	}
	
	
}
