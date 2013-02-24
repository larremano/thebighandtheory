package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Amigo extends Contacto {

	private Date fechaNacimiento;

	public Amigo(String nombre) {
		super(nombre);
	}

	public Date getFechaNacimiento() {

		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fecha) {
		fechaNacimiento = fecha;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return this.getId() + "; " + this.getNombre() + "; " + this.getDireccion() + "; "
				+ this.getTelefono() + "; " + this.getEMail() + "; "
				+ sdf.format(this.getFechaNacimiento());
	}

}
