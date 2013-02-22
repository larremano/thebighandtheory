package vista;

import java.awt.BorderLayout;

import modelo.Agenda;
import modelo.Contacto;

public class ControladorVentana {
	
	private Agenda agenda = null;
	private VentanaInicio vi = null;
	private PanelInicio pi = null;
	private PanelContactoNuevo pcn = null;
	private PanelListarContactos plc = null;
	private PanelVisualizarContacto pvc = null;
	
	
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
		pcn = new PanelContactoNuevo(this);
		vi.getJContentPane().add(pcn, BorderLayout.CENTER);
		vi.getJContentPane().updateUI();
		return pcn;
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
}
