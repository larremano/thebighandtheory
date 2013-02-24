package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Fecha;

public class PanelInicio extends JPanel {
	private static final long serialVersionUID = 1L;
	private ControladorVentana cv = null;
	private JPanel jPBotonera = null;
	private JPanel jPCampos = null;
	private JLabel jLFechaActual = null;
	private JLabel jLabel = null;
	private JButton jBNuevoContacto = null;
	private JButton jBVerContactos = null;
	private JButton jBNuevaCita = null;

	public PanelInicio(ControladorVentana cv) {
		super();
		this.cv = cv;
		initialize();
	}

	private void initialize() {
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		this.setSize(new Dimension(650, 200));
		this.add(getJPCampos(), BorderLayout.NORTH);
		this.add(getJPBotonera(), BorderLayout.SOUTH);
		jLFechaActual.setText(Fecha.fechaActual());
	}

	private JPanel getJPBotonera() {
		if (jPBotonera == null) {
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.insets = new Insets(20, 20, 20, 20);
			gridBagConstraints8.gridy = 0;
			gridBagConstraints8.gridx = 2;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 1;
			gridBagConstraints7.insets = new Insets(20, 20, 20, 20);
			gridBagConstraints7.gridy = 0;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.insets = new Insets(20, 20, 20, 20);
			gridBagConstraints6.gridy = 0;
			jPBotonera = new JPanel();
			jPBotonera.setLayout(new GridBagLayout());
			jPBotonera.add(getJBNuevoContacto(), gridBagConstraints6);
			jPBotonera.add(getJBVerContactos(), gridBagConstraints7);
			jPBotonera.add(getJBNuevaCita(), gridBagConstraints8);
		}
		return jPBotonera;
	}

	private JPanel getJPCampos() {
		if (jPCampos == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.insets = new Insets(10, 20, 10, 20);
			gridBagConstraints1.gridy = 0;
			jLFechaActual = new JLabel();
			jLFechaActual.setText("JLabel");
			jLFechaActual.setFont(new Font("Dialog", Font.BOLD, 24));
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.insets = new Insets(10, 20, 10, 20);
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			gridBagConstraints.gridy = 0;
			jLabel = new JLabel();
			jLabel.setText("Hoy es:");
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jPCampos = new JPanel();
			jPCampos.setLayout(new GridBagLayout());
			jPCampos.add(jLabel, gridBagConstraints);
			jPCampos.add(jLFechaActual, gridBagConstraints1);
		}
		return jPCampos;
	}

	private JButton getJBNuevoContacto() {
		if (jBNuevoContacto == null) {
			jBNuevoContacto = new JButton();
			jBNuevoContacto.setText("Nuevo Contacto");
			jBNuevoContacto
					.addActionListener(new java.awt.event.ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent e) {
							nuevoContacto();
						}
					});
		}
		return jBNuevoContacto;
	}

	protected void nuevoContacto() {
		cv.crearPanelContactoNuevo();
	}

	private JButton getJBVerContactos() {

		if (jBVerContactos == null) {
			jBVerContactos = new JButton();
			jBVerContactos.setText("Ver Contactos");
			jBVerContactos
					.addActionListener(new java.awt.event.ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent e) {
							verContactos();
						}
					});
		}
		return jBVerContactos;
	}

	protected void verContactos() {
		cv.crearPanelListarContactos();
	}

	private JButton getJBNuevaCita() {
		if (jBNuevaCita == null) {
			jBNuevaCita = new JButton();
			jBNuevaCita.setText("Nueva Cita");
			jBNuevaCita.addActionListener(new java.awt.event.ActionListener() {
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e) {
					nuevaCita();
				}
			});
		}
		return jBNuevaCita;
	}

	protected void nuevaCita() {

	}

}
