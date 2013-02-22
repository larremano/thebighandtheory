package controlador;

import modelo.Contacto;
import persistencia.ContactoDao;

public class ControladorContactos {

	public void cargar(Contacto contacto) {
		ContactoDao contactoDao = new ContactoDao();
		contactoDao.cargar(contacto);
	}
	public void actualizar(Contacto contacto) {
		ContactoDao contactoDao = new ContactoDao();
		contactoDao.actualizar(contacto);
	}

}
