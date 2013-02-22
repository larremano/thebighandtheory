package modelo;

public class Profesional extends Contacto {

	private String sector;

	public Profesional(String nombre) {
		super(nombre);
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return this.getId() + "; " + this.getNombre() + "; " + this.getDireccion() + "; "
				+ this.getTelefono() + "; " + this.getEMail() + "; "
				+ this.getSector();
	}
}
