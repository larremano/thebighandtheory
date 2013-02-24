package modelo;

public class Contacto {

	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String eMail;

	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String mail) {
		eMail = mail;
	}

}
