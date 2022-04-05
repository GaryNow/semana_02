package semana_02;

public class Obrero {
	private int codigo, horasTrabajadas;
	private String nombre;
	private double tarifaHora;
	
	public Obrero(int codigo, String nombre, int horasTrabajadas, double tarifaHora) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}
	
	public double sueldoBruto() {
		return horasTrabajadas * tarifaHora;
	}
	
	public double descAFP() {
		return 0.1* sueldoBruto();
	}
	
	public double descEPS() {
		return 0.05 * sueldoBruto();
	}
	
	public double sueldoNeto() {
		return	sueldoBruto() - descAFP() - descEPS();
	}
}
