package vista;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Amigo;
import modelo.Contacto;
import modelo.Profesional;
import controlador.ControladorContactos;

public class PanelVisualizarContacto extends JPanel{
	private static final long serialVersionUID = 1L;
	
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
	private JButton jBModificarContacto = null;
	private JButton jBInicio = null;

	private Contacto contacto = null;
	private ControladorVentana cv = null;

	public PanelVisualizarContacto(ControladorVentana cv, Contacto contacto) {
		super();
		this.cv = cv;
		this.contacto = contacto;
		initialize();
	}

	private void initialize() {
		GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
		GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
		gridBagConstraints15.gridx = 2;
		gridBagConstraints15.gridy = 0;
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
		this.add(getJBModificarContacto(), gridBagConstraints15);
		this.add(getJBInicio(), gridBagConstraints16);
		jTFNombre.setText(contacto.getNombre());
		jTFDireccion.setText(contacto.getDireccion());
		jTFTelefono.setText(contacto.getTelefono());
		jTFeMail.setText(contacto.getEMail());
		if(contacto instanceof Amigo){
			jTFFechaNacimiento.setEnabled(true);
			jTFSector.setEnabled(false);
			jTFFechaNacimiento.setText(((Amigo)contacto).getFechaNacimiento());
		}else{
			jTFFechaNacimiento.setEnabled(false);
			jTFSector.setEnabled(true);
			jTFSector.setText(((Profesional)contacto).getSector());
		}
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
		}
		return jTFSector;
	}

	private JTextField getJTFFechaNacimiento() {
		if (jTFFechaNacimiento == null) {
			jTFFechaNacimiento = new JTextField();
		}
		return jTFFechaNacimiento;
	}

	private JButton getJBModificarContacto() {
		if (jBModificarContacto == null) {
			jBModificarContacto = new JButton();
			jBModificarContacto.setText("Actualizar");
			jBModificarContacto
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							actualizarContacto();
						}
					});
		}
		return jBModificarContacto;
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

	protected void actualizarContacto() {
		Contacto contactoAux = contacto;
		contactoAux.setNombre(jTFNombre.getText());
		contactoAux.setDireccion(jTFDireccion.getText());
		contactoAux.setTelefono(jTFTelefono.getText());
		contactoAux.setEMail(jTFeMail.getText());
		if(contacto instanceof Amigo){
			((Amigo)contactoAux).setFechaNacimiento(jTFFechaNacimiento.getText());
		}else{
			((Profesional)contactoAux).setSector(jTFSector.getText());
		}
		ControladorContactos cc = new ControladorContactos();
		cc.actualizar(contactoAux);
		cv.getAgenda().refresh();
		volverInicio();
	}

}
