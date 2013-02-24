package controlador;

import java.util.List;

import modelo.Agenda;
import modelo.Cita;

public class ControladorListadoCitas {
	private Agenda agenda = null;

	public ControladorListadoCitas(Agenda agenda) {
		super();
		this.agenda = agenda;
	}

	public List<Cita> cargarListado(){
		return agenda.getCitas();
	}	
}
