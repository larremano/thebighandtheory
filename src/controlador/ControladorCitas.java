package controlador;

import modelo.Cita;
import persistencia.CitaDao;

public class ControladorCitas {
	
	public void cargar(Cita cita) {
		CitaDao citaDao = new CitaDao();
		citaDao.cargarCita(cita);
	}

	public void actualizar(Cita cita) {
		CitaDao citaDao = new CitaDao();
		citaDao.actualizarCita(cita);
	}
	public void eliminarCita(Cita cita) {
		CitaDao citaDao = new CitaDao();
		citaDao.eliminarCita(cita);
	}
}
