package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cita {

	private int id;
	private Date date;
	private Contacto contacto;
	private String lugar;
	private String hora;
	private String caracter;
	private String descripcion;

	public Cita(Date date) {
		super();
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCaracter() {
		return caracter;
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String numero = "00";
		if(this.getId() < 10){
			numero = "0" + Integer.toString(this.getId());
		}else{
			numero = Integer.toString(this.getId());
		}
		if(this.getContacto() == null){
			return numero + ";   " + sdf.format(this.getDate()) + ";   " + "Irrelevante" + ";   "
			+ this.getLugar() + ";   " + this.getHora() + ";   " + this.getCaracter() + ";   "
			+ this.getDescripcion();
		}else{
			return numero + ";   " + sdf.format(this.getDate()) + ";   " + this.getContacto().getNombre() + ";   "
			+ this.getLugar() + ";   " + this.getHora() + ";   " + this.getCaracter() + ";   "
			+ this.getDescripcion();
		}
	}
}
