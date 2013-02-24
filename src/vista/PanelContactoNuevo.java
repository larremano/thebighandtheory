package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


import controlador.ControladorContactos;

import modelo.Amigo;
import modelo.Contacto;
import modelo.Profesional;

public class PanelContactoNuevo extends JPanel{

	private static final long serialVersionUID = 1L;
	private ControladorVentana cv = null;
	private JLabel jLabel = null;
	private JLabel jLNombre = null;
	private JTextField jTFNombre = null;
	private JLabel jLDireccion = null;
	private JTextField jTFDireccion = null;
	private JLabel jLTelefono = null;
	private JTextField jTFTelefono = null;
	private JLabel jLeMail = null;
	private JTextField jTFeMail = null;
	private JLabel jLSector = null;
	private JTextField jTFSector = null;
	private JLabel jLFechaNacimiento = null;
	private JTextField jTFFechaNacimiento = null;
	private JRadioButton jRBAmigo = null;
	private JRadioButton jRBProfesional = null;
	private JButton jBNuevoContacto = null;
	private JButton jBInicio = null;

	private ButtonGroup bGroup = null;
	private Contacto contacto = null;
	
	public PanelContactoNuevo(ControladorVentana cv) {
		super();
		this.cv = cv;
		initialize();
	}

	private void initialize() {
		GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
		GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
		gridBagConstraints15.gridx = 2;
		gridBagConstraints15.gridy = 0;
		GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
		gridBagConstraints14.gridx = 2;
		gridBagConstraints14.gridy = 6;
		GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
		gridBagConstraints13.gridx = 1;
		gridBagConstraints13.fill = GridBagConstraints.BOTH;
		gridBagConstraints13.gridy = 6;
		GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
		gridBagConstraints12.fill = GridBagConstraints.BOTH;
		gridBagConstraints12.gridy = 5;
		gridBagConstraints12.weightx = 1.0;
		gridBagConstraints12.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints12.gridx = 3;
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.gridx = 2;
		gridBagConstraints11.gridy = 5;
		jLFechaNacimiento = new JLabel();
		jLFechaNacimiento.setText("Fecha de Nacimiento:");
		GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
		gridBagConstraints10.fill = GridBagConstraints.BOTH;
		gridBagConstraints10.gridy = 5;
		gridBagConstraints10.weightx = 1.0;
		gridBagConstraints10.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints10.gridx = 1;
		GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
		gridBagConstraints9.gridx = 0;
		gridBagConstraints9.gridy = 5;
		jLSector = new JLabel();
		jLSector.setText("Sector:");
		GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
		gridBagConstraints8.fill = GridBagConstraints.BOTH;
		gridBagConstraints8.gridy = 4;
		gridBagConstraints8.weightx = 1.0;
		gridBagConstraints8.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints8.gridx = 3;
		GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
		gridBagConstraints7.gridx = 2;
		gridBagConstraints7.insets = new Insets(0, 0, 0, 0);
		gridBagConstraints7.gridy = 4;
		jLeMail = new JLabel();
		jLeMail.setText("eMail:");
		GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
		gridBagConstraints6.fill = GridBagConstraints.BOTH;
		gridBagConstraints6.gridy = 4;
		gridBagConstraints6.weightx = 1.0;
		gridBagConstraints6.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints6.gridx = 1;
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.gridx = 0;
		gridBagConstraints5.insets = new Insets(0, 10, 0, 0);
		gridBagConstraints5.gridy = 4;
		jLTelefono = new JLabel();
		jLTelefono.setText("Teléfono:");
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.fill = GridBagConstraints.BOTH;
		gridBagConstraints4.gridy = 2;
		gridBagConstraints4.weightx = 1.0;
		gridBagConstraints4.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints4.gridx = 3;
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.gridx = 2;
		gridBagConstraints3.gridy = 2;
		jLDireccion = new JLabel();
		jLDireccion.setText("Dirección:");
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.fill = GridBagConstraints.BOTH;
		gridBagConstraints2.gridy = 2;
		gridBagConstraints2.weightx = 1.0;
		gridBagConstraints2.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints2.gridx = 1;
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.gridx = 0;
		gridBagConstraints1.insets = new Insets(0, 10, 0, 0);
		gridBagConstraints1.gridy = 2;
		jLNombre = new JLabel();
		jLNombre.setText("Nombre:");
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jLabel = new JLabel();
		jLabel.setText("Contacto Nuevo");
		this.setLayout(new GridBagLayout());
		this.setSize(new Dimension(650, 200));
		this.add(jLabel, gridBagConstraints);
		this.add(jLNombre, gridBagConstraints1);
		this.add(getJTFNombre(), gridBagConstraints2);
		this.add(jLDireccion, gridBagConstraints3);
		this.add(getJTFDireccion(), gridBagConstraints4);
		this.add(jLTelefono, gridBagConstraints5);
		this.add(getJTFTelefono(), gridBagConstraints6);
		this.add(jLeMail, gridBagConstraints7);
		this.add(getJTFeMail(), gridBagConstraints8);
		this.add(jLSector, gridBagConstraints9);
		this.add(getJTFSector(), gridBagConstraints10);
		this.add(jLFechaNacimiento, gridBagConstraints11);
		this.add(getJTFFechaNacimiento(), gridBagConstraints12);
		this.add(getJRBAmigo(), gridBagConstraints13);
		this.add(getJRBProfesional(), gridBagConstraints14);
		this.add(getJBNuevoContacto(), gridBagConstraints15);
		this.add(getJBInicio(), gridBagConstraints16);
		bGroup = new ButtonGroup();
		bGroup.add(jRBAmigo);
		bGroup.add(jRBProfesional);
	}

	private JTextField getJTFNombre() {
		if (jTFNombre == null) {
			jTFNombre = new JTextField();
		}
		return jTFNombre;
	}

	private JTextField getJTFDireccion() {
		if (jTFDireccion == null) {
			jTFDireccion = new JTextField();
		}
		return jTFDireccion;
	}

	private JTextField getJTFTelefono() {
		if (jTFTelefono == null) {
			jTFTelefono = new JTextField();
		}
		return jTFTelefono;
	}

	private JTextField getJTFeMail() {
		if (jTFeMail == null) {
			jTFeMail = new JTextField();
		}
		return jTFeMail;
	}

	private JTextField getJTFSector() {
		if (jTFSector == null) {
			jTFSector = new JTextField();
			jTFSector.setEnabled(false);
		}
		return jTFSector;
	}

	private JTextField getJTFFechaNacimiento() {
		if (jTFFechaNacimiento == null) {
			jTFFechaNacimiento = new JTextField();
		}
		return jTFFechaNacimiento;
	}

	private JRadioButton getJRBAmigo() {
		if (jRBAmigo == null) {
			jRBAmigo = new JRadioButton();
			jRBAmigo.setText("Amigo");
			jRBAmigo.setSelected(true);
		}
		return jRBAmigo;
	}

	private JRadioButton getJRBProfesional() {
		if (jRBProfesional == null) {
			jRBProfesional = new JRadioButton();
			jRBProfesional.setText("Profesional");
			jRBProfesional.setEnabled(true);
		}
		return jRBProfesional;
	}

	private JButton getJBNuevoContacto() {
		if (jBNuevoContacto == null) {
			jBNuevoContacto = new JButton();
			jBNuevoContacto.setText("Añadir");
			jBNuevoContacto
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							nuevoContacto();
						}
					});
		}
		return jBNuevoContacto;
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

	protected void nuevoContacto() {
		if (jRBAmigo.isSelected()) {
			contacto = new Amigo(jTFNombre.getText());
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			if(!"".equals(jTFFechaNacimiento.getText())){
				try {
					date = sdf.parse(jTFFechaNacimiento.getText());
					((Amigo) contacto).setFechaNacimiento(date);
					contacto.setDireccion(jTFDireccion.getText());
					contacto.setTelefono(jTFTelefono.getText());
					contacto.setEMail(jTFeMail.getText());
					ControladorContactos cc = new ControladorContactos();
					cc.cargar(contacto);
					cv.getAgenda().refresh();
					volverInicio();

				} catch (ParseException e) {
					jTFFechaNacimiento.setBackground(Color.RED);
					jTFFechaNacimiento.setText("Introduce una fecha válida");
					//e.printStackTrace();
				}
			}
		} else {
			contacto = new Profesional(jTFNombre.getText());
			((Profesional) contacto).setSector(jTFSector.getText());
			contacto.setDireccion(jTFDireccion.getText());
			contacto.setTelefono(jTFTelefono.getText());
			contacto.setEMail(jTFeMail.getText());
			ControladorContactos cc = new ControladorContactos();
			cc.cargar(contacto);
			cv.getAgenda().refresh();
			volverInicio();
		}
	}

}
