package vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import modelo.Cita;
import controlador.ControladorListadoCitas;
import java.awt.Rectangle;

public class PanelListarCitas extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private ControladorVentana cv = null;
	private JPanel jPBotonera = null;

	private JScrollPane jScrollPane = null;
	private JList jLListado = null;
	private JButton jBInicio = null;
	private ControladorListadoCitas clc = null;
	private JButton jBListar = null;
	private Cita cita = null;

	public PanelListarCitas(ControladorVentana cv) {
		super();
		this.cv = cv;
		initialize();
	}

	private void initialize() {
		this.setBounds(new Rectangle(0, 0, 250, 200));
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(0);
		borderLayout.setVgap(18);
		this.setLayout(borderLayout);
		this.add(getJPBotonera(), BorderLayout.NORTH);
		this.add(getJScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getJPBotonera() {
		if (jPBotonera == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 3;
			gridBagConstraints1.insets = new Insets(10, 10, 10, 10);
			gridBagConstraints1.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints1.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 2;
			gridBagConstraints.insets = new Insets(10, 10, 10, 10);
			gridBagConstraints.gridy = 0;
			jPBotonera = new JPanel();
			jPBotonera.setLayout(new GridBagLayout());
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
					seleccionarCita();
				}
			});
		}
		return jLListado;
	}

	protected void seleccionarCita() {
		cita = (Cita) jLListado.getSelectedValue();
		cv.crearPanelVisualizarCita(cita);
	}

	protected void listarCitas(){
		clc = new ControladorListadoCitas(cv.getAgenda());
		jLListado.setListData(clc.cargarListado().toArray());
		jLListado.updateUI();
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
					listarCitas();
				}
			});
		}
		return jBListar;
	}
}
