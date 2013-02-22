package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import modelo.Amigo;
import modelo.Contacto;
import modelo.Profesional;

import controlador.ControladorListadoContactos;

public class PanelListarContactos extends JPanel {

	private static final long serialVersionUID = 1L;
	private ControladorVentana cv = null;
	private JPanel jPBotonera = null;

	private JScrollPane jScrollPane = null;
	private JList jLListado = null;

	private JRadioButton jRBAmigo = null;
	private JRadioButton jRBProfesional = null;
	private ButtonGroup bGroup = null;
	private JButton jBInicio = null;
	private ControladorListadoContactos clc = null;
	private JButton jBListar = null;
	private Contacto contacto = null;

	public PanelListarContactos(ControladorVentana cv) {
		super();
		this.cv = cv;
		initialize();
	}

	private void initialize() {
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(0);
		this.setLayout(borderLayout);
		this.setSize(new Dimension(622, 514));
		this.add(getJPBotonera(), BorderLayout.NORTH);
		this.add(getJScrollPane(), BorderLayout.CENTER);
		bGroup = new ButtonGroup();
		bGroup.add(jRBAmigo);
		bGroup.add(jRBProfesional);
	}

	private JPanel getJPBotonera() {
		if (jPBotonera == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 3;
			gridBagConstraints1.insets = new Insets(0, 20, 0, 0);
			gridBagConstraints1.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 2;
			gridBagConstraints.gridy = 0;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 1;
			gridBagConstraints7.insets = new Insets(20, 40, 20, 20);
			gridBagConstraints7.gridy = 0;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.insets = new Insets(20, 20, 20, 40);
			gridBagConstraints6.gridy = 0;
			jPBotonera = new JPanel();
			jPBotonera.setLayout(new GridBagLayout());
			jPBotonera.add(getJRBAmigo(), gridBagConstraints6);
			jPBotonera.add(getJRBProfesional(), gridBagConstraints7);
			jPBotonera.add(getJBListar(), gridBagConstraints);
			jPBotonera.add(getJBInicio(), gridBagConstraints1);
		}
		return jPBotonera;
	}

	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJLListado());
		}
		return jScrollPane;
	}

	private JList getJLListado() {
		if (jLListado == null) {
			jLListado = new JList();
			jLListado.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					seleccionarContacto();
				}
			});
		}
		return jLListado;
	}

	protected void seleccionarContacto() {
		if(jRBAmigo.isSelected()){
			contacto = (Amigo)jLListado.getSelectedValue();
		}else{
			contacto = (Profesional) jLListado.getSelectedValue();
		}
		cv.crearPanelVisualizarContacto(contacto);
	}

	private JRadioButton getJRBAmigo() {
		if (jRBAmigo == null) {
			jRBAmigo = new JRadioButton();
			jRBAmigo.setText("Amigo");
			jRBAmigo.setSelected(true);
		}
		return jRBAmigo;
	}

	protected void listarContactos(){
		clc = new ControladorListadoContactos(cv.getAgenda());
		jLListado.setListData(clc.cargarListado(jRBAmigo.isSelected()).toArray());
		jLListado.updateUI();
	}

	private JRadioButton getJRBProfesional() {
		if (jRBProfesional == null) {
			jRBProfesional = new JRadioButton();
			jRBProfesional.setText("Profesional");
			jRBProfesional.setEnabled(true);
		}
		return jRBProfesional;
	}

	private JButton getJBInicio() {
		if (jBInicio == null) {
			jBInicio = new JButton();
			jBInicio.setText("Volver Inicio");
			jBInicio.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					volverInicio();
				}
			});
		}
		return jBInicio;
	}

	protected void volverInicio() {
		cv.crearPanelInicio();
	}

	private JButton getJBListar() {
		if (jBListar == null) {
			jBListar = new JButton();
			jBListar.setText("Listar");
			jBListar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					listarContactos();
				}
			});
		}
		return jBListar;
	}

}
