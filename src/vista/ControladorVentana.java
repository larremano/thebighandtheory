package vista;

import java.awt.BorderLayout;


import modelo.Agenda;
import modelo.Cita;
import modelo.Contacto;

public class ControladorVentana {
	
	private Agenda agenda = null;
	private VentanaInicio vi = null;
	private PanelInicio pi = null;
	private PanelContactoNuevo pContactoNuevo = null;
	private PanelListarContactos plc = null;
	private PanelVisualizarContacto pvc = null;
	private PanelCitaNueva pCitaNueva = null;
	private PanelListarCitas pListarCitas = null;
	private PanelVisualizarCita pVisualizarCita = null;
	
	public ControladorVentana(Agenda agenda, VentanaInicio vi) {
		super();
		this.agenda = agenda;
		this.vi = vi;
		this.crearPanelInicio();
	}
	public PanelInicio getPi() {
		return pi;
	}
	public Agenda getAgenda() {
		return agenda;
	}
	public VentanaInicio getVi() {
		return vi;
	}
	public PanelInicio crearPanelInicio(){
		vi.getJContentPane().removeAll();
		pi = new PanelInicio(this);
		vi.getJContentPane().add(pi, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return pi;
	}
	public PanelContactoNuevo crearPanelContactoNuevo(){
		vi.getJContentPane().removeAll();
		pContactoNuevo = new PanelContactoNuevo(this);
		vi.getJContentPane().add(pContactoNuevo, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return pContactoNuevo;
	}
	public PanelListarContactos crearPanelListarContactos() {
		vi.getJContentPane().removeAll();
		plc = new PanelListarContactos(this);
		vi.getJContentPane().add(plc, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return plc;
	}
	public PanelVisualizarContacto crearPanelVisualizarContacto(Contacto contacto) {
		vi.getJContentPane().removeAll();
		pvc = new PanelVisualizarContacto(this,contacto);
		vi.getJContentPane().add(pvc, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return pvc;
	}
	public PanelCitaNueva crearPanelCitaNueva() {
		vi.getJContentPane().removeAll();
		pCitaNueva = new PanelCitaNueva(this);
		vi.getJContentPane().add(pCitaNueva, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return pCitaNueva;
	}
	public PanelListarCitas crearPanelListarCitas() {
		vi.getJContentPane().removeAll();
		pListarCitas = new PanelListarCitas(this);
		vi.getJContentPane().add(pListarCitas, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return pListarCitas;
	}
	public PanelVisualizarCita crearPanelVisualizarCita(Cita cita) {
		vi.getJContentPane().removeAll();
		pVisualizarCita = new PanelVisualizarCita(this,cita);
		vi.getJContentPane().add(pVisualizarCita, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return pVisualizarCita;
	}
}
