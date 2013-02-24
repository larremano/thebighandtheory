package modelo;

import java.util.ArrayList;
import java.util.List;

import persistencia.AgendaDao;


public class Agenda {

	private List<Contacto> contactos = new ArrayList<Contacto>();
	private List<Contacto> amigos = new ArrayList<Contacto>();
	private List<Contacto> profesionales = new ArrayList<Contacto>();
	private List<Cita> citas = new ArrayList<Cita>();

	public Agenda() {
		super();
		this.inicializar();
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	private void inicializar() {
		AgendaDao agDao = new AgendaDao();
		contactos = agDao.listarContactos();
		profesionales = agDao.listarProfesionales();
		amigos = agDao.listarAmigos();
		citas = agDao.listarCitas(this);
	}
	public void refresh(){
		inicializar();
	}

	public List<Contacto> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Contacto> amigos) {
		this.amigos = amigos;
	}

	public List<Contacto> getProfesionales() {
		return profesionales;
	}

	public void setProfesionales(List<Contacto> profesionales) {
		this.profesionales = profesionales;
	}

}
