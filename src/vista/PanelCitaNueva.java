package vista;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

import modelo.Amigo;
import modelo.Cita;
import modelo.Contacto;
import modelo.Profesional;

import controlador.ControladorCitas;
import controlador.ControladorListadoContactos;

public class PanelCitaNueva extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private ControladorVentana cv = null;
	private Contacto contacto = null;
	private JTextField jTFFecha = null;
	private JTextField jTFLugar = null;
	private JLabel jLFecha = null;
	private JLabel jLLugar = null;
	private JLabel jLHora = null;
	private JTextField jTFHora = null;
	private JLabel jLCaracter = null;
	private JComboBox jCBCaracter = null;
	private JTextField jTFDescripcion = null;
	private JLabel jLDescripcion = null;
	private JLabel jLCita = null;
	private JButton jBInsertar = null;
	private JButton jBInicio = null;
	private JScrollPane jSPContactos = null;
	private JList jLContactos = null;
	private JLabel jLContacto = null;
	private JTextField jTFContacto = null;
	
	public PanelCitaNueva(ControladorVentana cv) {
		super();
		this.cv = cv;
		initialize();
	}

	private void initialize() {
		GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
		gridBagConstraints31.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints31.gridy = 4;
		gridBagConstraints31.weightx = 1.0;
		gridBagConstraints31.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints31.gridx = 3;
		GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
		gridBagConstraints21.gridx = 2;
		gridBagConstraints21.anchor = GridBagConstraints.EAST;
		gridBagConstraints21.gridy = 4;
		jLContacto = new JLabel();
		jLContacto.setText("Contacto:");
		GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
		gridBagConstraints13.fill = GridBagConstraints.BOTH;
		gridBagConstraints13.gridy = 4;
		gridBagConstraints13.weightx = 1.0;
		gridBagConstraints13.weighty = 1.0;
		gridBagConstraints13.gridwidth = 2;
		gridBagConstraints13.gridx = 0;
		GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
		gridBagConstraints12.gridx = 3;
		gridBagConstraints12.gridy = 0;
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.gridx = 2;
		gridBagConstraints11.gridy = 0;
		GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
		gridBagConstraints10.gridx = 1;
		gridBagConstraints10.gridy = 0;
		jLCita = new JLabel();
		jLCita.setText("Añadir Cita Nueva:");
		GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
		gridBagConstraints9.gridx = 0;
		gridBagConstraints9.anchor = GridBagConstraints.EAST;
		gridBagConstraints9.insets = new Insets(0, 10, 0, 0);
		gridBagConstraints9.gridy = 3;
		jLDescripcion = new JLabel();
		jLDescripcion.setText("Descripción:");
		GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
		gridBagConstraints8.fill = GridBagConstraints.BOTH;
		gridBagConstraints8.gridy = 3;
		gridBagConstraints8.weightx = 1.0;
		gridBagConstraints8.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints8.gridwidth = 3;
		gridBagConstraints8.gridx = 1;
		GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
		gridBagConstraints7.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints7.gridy = 2;
		gridBagConstraints7.weightx = 1.0;
		gridBagConstraints7.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints7.gridx = 3;
		GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
		gridBagConstraints6.gridx = 2;
		gridBagConstraints6.anchor = GridBagConstraints.EAST;
		gridBagConstraints6.gridy = 2;
		jLCaracter = new JLabel();
		jLCaracter.setText("Caracter:");
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints5.gridy = 2;
		gridBagConstraints5.weightx = 1.0;
		gridBagConstraints5.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints5.gridx = 1;
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.gridx = 0;
		gridBagConstraints4.anchor = GridBagConstraints.EAST;
		gridBagConstraints4.gridy = 2;
		jLHora = new JLabel();
		jLHora.setText("Hora:");
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.gridx = 2;
		gridBagConstraints3.anchor = GridBagConstraints.EAST;
		gridBagConstraints3.gridy = 1;
		jLLugar = new JLabel();
		jLLugar.setText("Lugar:");
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.gridx = 0;
		gridBagConstraints2.anchor = GridBagConstraints.EAST;
		gridBagConstraints2.gridy = 1;
		jLFecha = new JLabel();
		jLFecha.setText("Fecha:");
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints1.gridy = 1;
		gridBagConstraints1.weightx = 1.0;
		gridBagConstraints1.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints1.gridx = 3;
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints.gridx = 1;
		this.setLayout(new GridBagLayout());
		this.setSize(new Dimension(650, 200));
		this.add(getJTFFecha(), gridBagConstraints);
		this.add(getJTFLugar(), gridBagConstraints1);
		this.add(jLFecha, gridBagConstraints2);
		this.add(jLLugar, gridBagConstraints3);
		this.add(jLHora, gridBagConstraints4);
		this.add(getJTFHora(), gridBagConstraints5);
		this.add(jLCaracter, gridBagConstraints6);
		this.add(getJCBCaracter(), gridBagConstraints7);
		this.add(getJTFDescripcion(), gridBagConstraints8);
		this.add(jLDescripcion, gridBagConstraints9);
		this.add(jLCita, gridBagConstraints10);
		this.add(getJBInsertar(), gridBagConstraints11);
		this.add(getJBInicio(), gridBagConstraints12);
		this.add(getJSPContactos(), gridBagConstraints13);
		this.add(jLContacto, gridBagConstraints21);
		this.add(getJTFContacto(), gridBagConstraints31);
	}

	private JTextField getJTFFecha() {
		if (jTFFecha == null) {
			jTFFecha = new JTextField();
		}
		return jTFFecha;
	}

	private JTextField getJTFLugar() {
		if (jTFLugar == null) {
			jTFLugar = new JTextField();
		}
		return jTFLugar;
	}

	private JTextField getJTFHora() {
		if (jTFHora == null) {
			jTFHora = new JTextField();
		}
		return jTFHora;
	}

	private JComboBox getJCBCaracter() {
		if (jCBCaracter == null) {
			jCBCaracter = new JComboBox();
			jCBCaracter.addItem("Ninguno");
			jCBCaracter.addItem("Ocio");
			jCBCaracter.addItem("Trabajo");
			jCBCaracter.addItem("Cumpleaños");
			jCBCaracter.addItem("Deporte");
		}
		return jCBCaracter;
	}

	private JTextField getJTFDescripcion() {
		if (jTFDescripcion == null) {
			jTFDescripcion = new JTextField();
		}
		return jTFDescripcion;
	}

	private JButton getJBInsertar() {
		if (jBInsertar == null) {
			jBInsertar = new JButton();
			jBInsertar.setText("Añadir");
			jBInsertar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					crearCitaNueva();
				}
			});
		}
		return jBInsertar;
	}

	protected void crearCitaNueva() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(!"".equals(jTFFecha.getText())){
			try {
				date = sdf.parse(jTFFecha.getText());
				Cita cita = new Cita(date);
				cita.setLugar(jTFLugar.getText());
				cita.setHora(jTFHora.getText());
				cita.setCaracter(jCBCaracter.getSelectedItem().toString());
				cita.setDescripcion(jTFDescripcion.getText());
				if(contacto == null && "".equals(jTFContacto.getText())){
					Contacto contactoAux = new Contacto("Irrelevante");
					cita.setContacto(contactoAux);
				}else if(contacto == null && !"".equals(jTFContacto.getText())){
					Contacto contactoAux = new Contacto(jTFContacto.getText());
					cita.setContacto(contactoAux);
				}else if(contacto != null && "".equals(jTFContacto.getText())){
					Contacto contactoAux = new Contacto("Irrelevante");
					cita.setContacto(contactoAux);
				}else{
					Contacto contactoAux = new Contacto(jTFContacto.getText());
					cita.setContacto(contactoAux);
				}
				ControladorCitas cc = new ControladorCitas();
				cc.cargar(cita);
				cv.getAgenda().refresh();
				cv.crearPanelInicio();
			} catch (ParseException e) {
				jTFFecha.setBackground(Color.RED);
				jTFFecha.setText("Introduce una fecha válida");
				//e.printStackTrace();
			}
		}
	}

	private JButton getJBInicio() {
		if (jBInicio == null) {
			jBInicio = new JButton();
			jBInicio.setText("Volver a Inicio");
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

	private JScrollPane getJSPContactos() {
		if (jSPContactos == null) {
			jSPContactos = new JScrollPane();
			jSPContactos.setViewportView(getJLContactos());
		}
		return jSPContactos;
	}

	private JList getJLContactos() {
		if (jLContactos == null) {
			jLContactos = new JList();
			jLContactos.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					seleccionarContacto();
				}
			});
			ControladorListadoContactos clc = new ControladorListadoContactos(cv.getAgenda());
			jLContactos.setListData(clc.cargarListado().toArray());
		}
		return jLContactos;
	}

	protected void seleccionarContacto() {
		if(jLContactos.getSelectedValue() instanceof Amigo){
			contacto = (Amigo)jLContactos.getSelectedValue();
		}else{
			contacto = (Profesional) jLContactos.getSelectedValue();
		}
		jTFContacto.setText(contacto.getNombre());
	}

	private JTextField getJTFContacto() {
		if (jTFContacto == null) {
			jTFContacto = new JTextField();
		}
		return jTFContacto;
	}

}
