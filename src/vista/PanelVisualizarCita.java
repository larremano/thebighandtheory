package vista;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Cita;
import modelo.Contacto;
import controlador.ControladorCitas;
import javax.swing.JComboBox;

public class PanelVisualizarCita extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JLabel jLabel = null;
	private JLabel jLFecha = null;
	private JTextField jTFFecha = null;
	private JLabel jLContacto = null;
	private JTextField jTFContacto = null;
	private JLabel jLTelefono = null;
	private JTextField jTFLugar = null;
	private JLabel jLHora = null;
	private JTextField jTFHora = null;
	private JLabel jLCaracter = null;
	private JTextField jTFCaracter = null;
	private JLabel jLFDescripcion = null;
	private JTextField jTFDescripcion = null;
	private JButton jBModificarCita = null;
	private JButton jBInicio = null;

	private Cita cita = null;
	private ControladorVentana cv = null;

	private JButton jBEliminar = null;

	private JComboBox jCBCaracter = null;

	public PanelVisualizarCita(ControladorVentana cv, Cita cita) {
		super();
		this.cv = cv;
		this.cita = cita;
		initialize();
	}

	private void initialize() {
		GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
		gridBagConstraints31.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints31.gridy = 5;
		gridBagConstraints31.weightx = 1.0;
		gridBagConstraints31.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints31.gridx = 1;
		GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
		gridBagConstraints13.gridx = 3;
		gridBagConstraints13.gridy = 0;
		GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
		gridBagConstraints16.gridx = 4;
		gridBagConstraints16.gridy = 0;
		GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
		gridBagConstraints15.gridx = 2;
		gridBagConstraints15.gridy = 0;
		GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
		gridBagConstraints12.fill = GridBagConstraints.BOTH;
		gridBagConstraints12.gridy = 5;
		gridBagConstraints12.weightx = 1.0;
		gridBagConstraints12.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints12.gridx = 4;
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.gridx = 3;
		gridBagConstraints11.anchor = GridBagConstraints.EAST;
		gridBagConstraints11.gridy = 5;
		jLFDescripcion = new JLabel();
		jLFDescripcion.setText("Descripción:");
		GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
		gridBagConstraints10.fill = GridBagConstraints.BOTH;
		gridBagConstraints10.gridy = 5;
		gridBagConstraints10.weightx = 1.0;
		gridBagConstraints10.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints10.gridx = 2;
		GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
		gridBagConstraints9.gridx = 0;
		gridBagConstraints9.anchor = GridBagConstraints.EAST;
		gridBagConstraints9.gridy = 5;
		jLCaracter = new JLabel();
		jLCaracter.setText("Carácter:");
		GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
		gridBagConstraints8.fill = GridBagConstraints.BOTH;
		gridBagConstraints8.gridy = 4;
		gridBagConstraints8.weightx = 1.0;
		gridBagConstraints8.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints8.gridx = 4;
		GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
		gridBagConstraints7.gridx = 3;
		gridBagConstraints7.insets = new Insets(0, 0, 0, 0);
		gridBagConstraints7.anchor = GridBagConstraints.EAST;
		gridBagConstraints7.gridy = 4;
		jLHora = new JLabel();
		jLHora.setText("Hora:");
		GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
		gridBagConstraints6.fill = GridBagConstraints.BOTH;
		gridBagConstraints6.gridy = 4;
		gridBagConstraints6.weightx = 1.0;
		gridBagConstraints6.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints6.gridx = 1;
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.gridx = 0;
		gridBagConstraints5.insets = new Insets(0, 10, 0, 0);
		gridBagConstraints5.anchor = GridBagConstraints.EAST;
		gridBagConstraints5.gridy = 4;
		jLTelefono = new JLabel();
		jLTelefono.setText("Lugar:");
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.fill = GridBagConstraints.BOTH;
		gridBagConstraints4.gridy = 2;
		gridBagConstraints4.weightx = 1.0;
		gridBagConstraints4.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints4.gridx = 4;
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.gridx = 3;
		gridBagConstraints3.anchor = GridBagConstraints.EAST;
		gridBagConstraints3.gridy = 2;
		jLContacto = new JLabel();
		jLContacto.setText("Contacto:");
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.fill = GridBagConstraints.BOTH;
		gridBagConstraints2.gridy = 2;
		gridBagConstraints2.weightx = 1.0;
		gridBagConstraints2.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints2.gridx = 1;
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.gridx = 0;
		gridBagConstraints1.insets = new Insets(0, 10, 0, 0);
		gridBagConstraints1.anchor = GridBagConstraints.EAST;
		gridBagConstraints1.gridy = 2;
		jLFecha = new JLabel();
		jLFecha.setText("Fecha:");
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jLabel = new JLabel();
		jLabel.setText("Datos de la Cita");
		this.setLayout(new GridBagLayout());
		this.setSize(new Dimension(650, 200));
		this.add(jLabel, gridBagConstraints);
		this.add(jLFecha, gridBagConstraints1);
		this.add(getJTFFecha(), gridBagConstraints2);
		this.add(jLContacto, gridBagConstraints3);
		this.add(getJTFContacto(), gridBagConstraints4);
		this.add(jLTelefono, gridBagConstraints5);
		this.add(getJTFLugar(), gridBagConstraints6);
		this.add(jLHora, gridBagConstraints7);
		this.add(getJTFHora(), gridBagConstraints8);
		this.add(jLCaracter, gridBagConstraints9);
		this.add(getJTFCaracter(), gridBagConstraints10);
		this.add(jLFDescripcion, gridBagConstraints11);
		this.add(getJTFDescripcion(), gridBagConstraints12);
		this.add(getJBModificarCita(), gridBagConstraints15);
		this.add(getJBInicio(), gridBagConstraints16);
		this.add(getJBEliminar(), gridBagConstraints13);
		this.add(getJCBCaracter(), gridBagConstraints31);
		Date date = new Date();
		date = cita.getDate();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		jTFFecha.setText(sdf.format(date));
		jTFContacto.setText(cita.getContacto().getNombre());
		jTFLugar.setText(cita.getLugar());
		jTFHora.setText(cita.getHora());
		jTFDescripcion.setText(cita.getDescripcion());
		jTFCaracter.setText(cita.getCaracter());
	}

	private JTextField getJTFFecha() {
		if (jTFFecha == null) {
			jTFFecha = new JTextField();
		}
		return jTFFecha;
	}

	private JTextField getJTFContacto() {
		if (jTFContacto == null) {
			jTFContacto = new JTextField();
		}
		return jTFContacto;
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

	private JTextField getJTFCaracter() {
		if (jTFCaracter == null) {
			jTFCaracter = new JTextField();
			jTFCaracter.setEditable(true);
			jTFCaracter.setEnabled(false);
		}
		return jTFCaracter;
	}

	private JTextField getJTFDescripcion() {
		if (jTFDescripcion == null) {
			jTFDescripcion = new JTextField();
		}
		return jTFDescripcion;
	}

	private JButton getJBModificarCita() {
		if (jBModificarCita == null) {
			jBModificarCita = new JButton();
			jBModificarCita.setText("Actualizar");
			jBModificarCita
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							actualizarCita();
						}
					});
		}
		return jBModificarCita;
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

	protected void actualizarCita() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = sdf.parse(jTFFecha.getText());
			cita.setDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(!jTFContacto.getText().equalsIgnoreCase(cita.getContacto().getNombre())){
			buscarContactoPorNombre(jTFContacto.getText());
		}
		cita.setLugar(jTFLugar.getText());
		cita.setHora(jTFHora.getText());
		cita.setDescripcion(jTFDescripcion.getText());
		ControladorCitas cc = new ControladorCitas();
		cc.actualizar(cita);
		cv.getAgenda().refresh();
		volverInicio();
	}

	private void buscarContactoPorNombre(String text) {
		List<Contacto> contactos = cv.getAgenda().getContactos();
		for(Contacto contacto : contactos){
			if(contacto.getNombre().equalsIgnoreCase(text)){
				cita.setContacto(contacto);
				break;
			}
		}
		
	}

	private JButton getJBEliminar() {
		if (jBEliminar == null) {
			jBEliminar = new JButton();
			jBEliminar.setText("Eliminar");
			jBEliminar
			.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					eliminarCita();
				}
			});
		}
		return jBEliminar;
	}

	protected void eliminarCita() {
		ControladorCitas cc = new ControladorCitas();
		cc.eliminarCita(cita);
		cv.getAgenda().refresh();
		volverInicio();
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
}
