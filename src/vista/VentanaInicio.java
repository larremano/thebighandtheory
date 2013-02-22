package vista;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import modelo.Agenda;

public class VentanaInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private Agenda agenda = null;
	private ControladorVentana cv = null;

	public VentanaInicio(Agenda agenda) {
		super();
		this.agenda = agenda;
		initialize();
	}

	private void initialize() {
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setBounds(new Rectangle(300, 150, 650, 300));
		this.setContentPane(getJContentPane());
		this.setTitle("Mi Agenda");
		this.getJContentPane().removeAll();
		cv = new ControladorVentana(agenda,this);
		this.getJContentPane().add(cv.getPi(), BorderLayout.CENTER);
		this.getJContentPane().updateUI();
	}

	public ControladorVentana getCv() {
		return cv;
	}

	public void setCv(ControladorVentana cv) {
		this.cv = cv;
	}

	public JPanel getJContentPane() {
		if (jContentPane == null) {
			BorderLayout borderLayout = new BorderLayout();
			jContentPane = new JPanel();
			jContentPane.setLayout(borderLayout);
		}
		return jContentPane;
	}

}
