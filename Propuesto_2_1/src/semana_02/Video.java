package semana_02;

public class Video {
	private int codigo;
	private String video;
	private double duracion, precioSoles, tipoCambio;
	
	public Video(int codigo, String video, double duracion, double precioSoles, double tipoCambio) {
		this.codigo = codigo;
		this.video = video;
		this.duracion = duracion;
		this.precioSoles = precioSoles;
		this.tipoCambio = tipoCambio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	public double getTipoCambio() {
		return tipoCambio;
	}
	
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public double getPrecioSoles() {
		return precioSoles;
	}

	public void setPrecioSoles(double precioSoles) {
		this.precioSoles = precioSoles;
	}
	
	public double precioDolares() {
		return precioSoles / tipoCambio;
	}
}
