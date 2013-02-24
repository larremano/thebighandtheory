package controlador;

import modelo.Amigo;
import modelo.Contacto;
import persistencia.ContactoDao;

public class ControladorContactos {

	public void cargar(Contacto contacto) {
		ContactoDao contactoDao = new ContactoDao();
		if(contacto instanceof Amigo){
			contactoDao.cargarAmigo(contacto);
		}else{
			contactoDao.cargarProfesional(contacto);
		}
	}
	public void actualizar(Contacto contacto) {
		ContactoDao contactoDao = new ContactoDao();
		if(contacto instanceof Amigo){
			contactoDao.actualizarAmigo(contacto);
		}else{
			contactoDao.actualizarProfesional(contacto);
		}
	}
	public void eliminar(Contacto contacto) {
		ContactoDao contactoDao = new ContactoDao();
		if(contacto instanceof Amigo){
			contactoDao.eliminarAmigo(contacto);
		}else{
			contactoDao.eliminarProfesional(contacto);
		}
	}
}
