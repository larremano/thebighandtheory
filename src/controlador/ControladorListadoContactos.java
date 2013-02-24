package controlador;

import java.util.List;

import modelo.Agenda;
import modelo.Contacto;

public class ControladorListadoContactos {
	
	private Agenda agenda = null;

	public ControladorListadoContactos(Agenda agenda) {
		super();
		this.agenda = agenda;
	}

	public List<Contacto> cargarListado(boolean esAmigo){
		if(esAmigo){
			return agenda.getAmigos();
		}else{
			
			return agenda.getProfesionales();
		}
	}	

}
