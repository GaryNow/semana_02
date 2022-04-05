package semana_02;

public class Pelota {
	private String marca;
	private double gramos,presionLibras,diametroCent,precio;
	
	public Pelota(String marca, double gramos, double presionLibras, double diametroCent, double precio) {
		this.marca = marca;
		this.gramos = gramos;
		this.presionLibras = presionLibras;
		this.diametroCent = diametroCent;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getGramos() {
		return gramos;
	}

	public void setGramos(double gramos) {
		this.gramos = gramos;
	}

	public double getPresionLibras() {
		return presionLibras;
	}

	public void setPresionLibras(double presionLibras) {
		this.presionLibras = presionLibras;
	}

	public double getDiametroCent() {
		return diametroCent;
	}

	public void setDiametroCent(double diametroCent) {
		this.diametroCent = diametroCent;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double radio() {
		return diametroCent / 2;
	}
	
	public double volumenBalon() {
		return 4*3.1416*( radio()*radio()*radio() )/3;
	}
	
	public double descuento() {
		return 0.1*precio;
	}
	
	public double importePaga() {
		return precio - descuento();
	}
}
