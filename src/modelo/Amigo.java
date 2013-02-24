package modelo;

public class Amigo extends Contacto {

	private String fechaNacimiento;

	public Amigo(String nombre) {
		super(nombre);
	}

	public String getFechaNacimiento() {

		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fecha) {
		if (!"".equalsIgnoreCase(fecha)) {
			fechaNacimiento = fecha;
		}
	}

	@Override
	public String toString() {
		return this.getId() + "; " + this.getNombre() + "; " + this.getDireccion() + "; "
				+ this.getTelefono() + "; " + this.getEMail() + "; "
				+ this.getFechaNacimiento();
	}

}
