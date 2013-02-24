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

import modelo.Calendario;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.SwingConstants;

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
	private JButton jBVerCitas = null;
	private JPanel jPCalendario = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel19 = null;
	private JLabel jLabel20 = null;
	private JLabel jLabel21 = null;
	private JLabel jLabel22 = null;
	private JLabel jLabel23 = null;
	private JLabel jLabel24 = null;
	private JLabel jLabel25 = null;
	private JLabel jLabel26 = null;
	private JLabel jLabel27 = null;
	private JLabel jLabel28 = null;
	private JLabel jLabel29 = null;
	private JLabel jLabel30 = null;
	private JLabel jLabel31 = null;
	private JLabel jLabel32 = null;
	private JLabel jLabel33 = null;
	private JLabel jLabel34 = null;
	private JLabel jLabel35 = null;
	private JButton jBDerecha = null;
	private JButton jBIzquierda = null;
	private JLabel jLabel36 = null;
	private JLabel jLabel37 = null;
	private JLabel jLabel38 = null;
	private JLabel jLabel39 = null;
	private JLabel jLabel40 = null;
	private JLabel jLabel41 = null;
	private JLabel jLabel42 = null;
	private int mes = 0;
	private JLabel jLabel43 = null;
	private JLabel jLabel44 = null;
	private JLabel jLabel45 = null;
	private JLabel jLabel46 = null;
	private JLabel jLabel47 = null;
	private JLabel jLabel48 = null;
	private JLabel jLabel49 = null;
	private JLabel jLMes = null;
	private JLabel jLYear = null;

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
		this.add(getJPCalendario(), BorderLayout.CENTER);
		this.add(getJBDerecha(), BorderLayout.EAST);
		this.add(getJBIzquierda(), BorderLayout.WEST);
		jLFechaActual.setText(Calendario.fechaActual());
		//implementarCalendario();
		mapearCalendario(0);
		jLMes.setText(Calendario.calcularMes(0));
		jLYear.setText(Integer.toString(Calendario.calcularYear()));
	}

	private void mapearCalendario(int mes) {
		Map<Integer,JLabel> mapaEtiquetas = new HashMap<Integer,JLabel>();
		Map<Integer,Integer> labels = Calendario.mapearMes(mes);
		//inicializo mapaEtiquetas
		mapaEtiquetas.put(1, jLabel1);
		mapaEtiquetas.put(2, jLabel2);
		mapaEtiquetas.put(3, jLabel3);
		mapaEtiquetas.put(4, jLabel4);
		mapaEtiquetas.put(5, jLabel5);
		mapaEtiquetas.put(6, jLabel6);
		mapaEtiquetas.put(7, jLabel7);
		mapaEtiquetas.put(8, jLabel8);
		mapaEtiquetas.put(9, jLabel9);
		mapaEtiquetas.put(10, jLabel10);
		mapaEtiquetas.put(11, jLabel11);
		mapaEtiquetas.put(12, jLabel12);
		mapaEtiquetas.put(13, jLabel13);
		mapaEtiquetas.put(14, jLabel14);
		mapaEtiquetas.put(15, jLabel15);
		mapaEtiquetas.put(16, jLabel16);
		mapaEtiquetas.put(17, jLabel17);
		mapaEtiquetas.put(18, jLabel18);
		mapaEtiquetas.put(19, jLabel19);
		mapaEtiquetas.put(20, jLabel20);
		mapaEtiquetas.put(21, jLabel21);
		mapaEtiquetas.put(22, jLabel22);
		mapaEtiquetas.put(23, jLabel23);
		mapaEtiquetas.put(24, jLabel24);
		mapaEtiquetas.put(25, jLabel25);
		mapaEtiquetas.put(26, jLabel26);
		mapaEtiquetas.put(27, jLabel27);
		mapaEtiquetas.put(28, jLabel28);
		mapaEtiquetas.put(29, jLabel29);
		mapaEtiquetas.put(30, jLabel30);
		mapaEtiquetas.put(31, jLabel31);
		mapaEtiquetas.put(32, jLabel32);
		mapaEtiquetas.put(33, jLabel33);
		mapaEtiquetas.put(34, jLabel34);
		mapaEtiquetas.put(35, jLabel35);
		mapaEtiquetas.put(36, jLabel36);
		mapaEtiquetas.put(37, jLabel37);
		mapaEtiquetas.put(38, jLabel38);
		mapaEtiquetas.put(39, jLabel39);
		mapaEtiquetas.put(40, jLabel40);
		mapaEtiquetas.put(41, jLabel41);
		mapaEtiquetas.put(42, jLabel42);
		for(int i = 1; i < 43; i++){
			if(labels.get(i)==0){
				mapaEtiquetas.get(i).setText("");
			}else{
				mapaEtiquetas.get(i).setText(labels.get(i).toString());
			}
		}
	}
/*
	private void implementarCalendario() {
		int [] arrayMes = Calendario.calcularMes();
		int indice = 1;
		if(arrayMes[0] == 0){
			jLabel1.setText("");
		}else{
			jLabel1.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[1] == 0){
			jLabel2.setText("");
		}else{
			jLabel2.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[2] == 0){
			jLabel3.setText("");
		}else{
			jLabel3.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[3] == 0){
			jLabel4.setText("");
		}else{
			jLabel4.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[4] == 0){
			jLabel5.setText("");
		}else{
			jLabel5.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[5] == 0){
			jLabel6.setText("");
		}else{
			jLabel6.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[6] == 0){
			jLabel7.setText("");
		}else{
			jLabel7.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[7] == 0){
			jLabel8.setText("");
		}else{
			jLabel8.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[8] == 0){
			jLabel9.setText("");
		}else{
			jLabel9.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[9] == 0){
			jLabel10.setText("");
		}else{
			jLabel10.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[10] == 0){
			jLabel11.setText("");
		}else{
			jLabel11.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[11] == 0){
			jLabel12.setText("");
		}else{
			jLabel12.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[12] == 0){
			jLabel13.setText("");
		}else{
			jLabel13.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[13] == 0){
			jLabel14.setText("");
		}else{
			jLabel14.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[14] == 0){
			jLabel15.setText("");
		}else{
			jLabel15.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[15] == 0){
			jLabel16.setText("");
		}else{
			jLabel16.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[16] == 0){
			jLabel17.setText("");
		}else{
			jLabel17.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[17] == 0){
			jLabel18.setText("");
		}else{
			jLabel18.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[18] == 0){
			jLabel19.setText("");
		}else{
			jLabel19.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[19] == 0){
			jLabel20.setText("");
		}else{
			jLabel20.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[20] == 0){
			jLabel21.setText("");
		}else{
			jLabel21.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[21] == 0){
			jLabel22.setText("");
		}else{
			jLabel22.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[22] == 0){
			jLabel23.setText("");
		}else{
			jLabel23.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[23] == 0){
			jLabel24.setText("");
		}else{
			jLabel24.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[24] == 0){
			jLabel25.setText("");
		}else{
			jLabel25.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[25] == 0){
			jLabel26.setText("");
		}else{
			jLabel26.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[26] == 0){
			jLabel27.setText("");
		}else{
			jLabel27.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[27] == 0){
			jLabel28.setText("");
		}else{
			jLabel28.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[28] == 0){
			jLabel29.setText("");
		}else{
			jLabel29.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[29] == 0){
			jLabel30.setText("");
		}else{
			jLabel30.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[30] == 0){
			jLabel31.setText("");
		}else{
			jLabel31.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[31] == 0){
			jLabel32.setText("");
		}else{
			jLabel32.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[32] == 0){
			jLabel33.setText("");
		}else{
			jLabel33.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[33] == 0){
			jLabel34.setText("");
		}else{
			jLabel34.setText(Integer.toString(indice));
			indice++;
		}
		if(arrayMes[34] == 0){
			jLabel35.setText("");
		}else{
			jLabel35.setText(Integer.toString(indice));
			indice++;
		}		
	}
*/
	private JPanel getJPBotonera() {
		if (jPBotonera == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 3;
			gridBagConstraints2.gridy = 0;
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
			jPBotonera.add(getJBVerCitas(), gridBagConstraints2);
		}
		return jPBotonera;
	}

	private JPanel getJPCampos() {
		if (jPCampos == null) {
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.gridx = 3;
			gridBagConstraints21.insets = new Insets(0, 10, 0, 10);
			gridBagConstraints21.gridy = 0;
			jLYear = new JLabel();
			jLYear.setText("JLabel");
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 2;
			gridBagConstraints11.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints11.insets = new Insets(0, 10, 0, 10);
			gridBagConstraints11.gridy = 0;
			jLMes = new JLabel();
			jLMes.setText("JLabel");
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
			jPCampos.add(jLMes, gridBagConstraints11);
			jPCampos.add(jLYear, gridBagConstraints21);
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
		cv.crearPanelCitaNueva();
	}

	/**
	 * This method initializes jBVerCitas	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJBVerCitas() {
		if (jBVerCitas == null) {
			jBVerCitas = new JButton();
			jBVerCitas.setText("Ver Citas");
			jBVerCitas.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					listarCitas();
				}
			});
		}
		return jBVerCitas;
	}

	protected void listarCitas() {
		cv.crearPanelListarCitas();
	}

	/**
	 * This method initializes jPCalendario	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPCalendario() {
		if (jPCalendario == null) {
			jLabel49 = new JLabel();
			jLabel49.setText("Domingo");
			jLabel49.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel49.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel48 = new JLabel();
			jLabel48.setText("Sábado");
			jLabel48.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel48.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel47 = new JLabel();
			jLabel47.setText("Viernes");
			jLabel47.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel47.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel46 = new JLabel();
			jLabel46.setText("Jueves");
			jLabel46.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel46.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel45 = new JLabel();
			jLabel45.setText("Miércoles");
			jLabel45.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel45.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel44 = new JLabel();
			jLabel44.setText("Martes");
			jLabel44.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel44.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel43 = new JLabel();
			jLabel43.setText("Lunes");
			jLabel43.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel43.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel42 = new JLabel();
			jLabel42.setText("JLabel");
			jLabel42.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel42.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel41 = new JLabel();
			jLabel41.setText("JLabel");
			jLabel41.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel41.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel40 = new JLabel();
			jLabel40.setText("JLabel");
			jLabel40.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel40.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel39 = new JLabel();
			jLabel39.setText("JLabel");
			jLabel39.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel39.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel38 = new JLabel();
			jLabel38.setText("JLabel");
			jLabel38.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel38.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel37 = new JLabel();
			jLabel37.setText("JLabel");
			jLabel37.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel37.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel36 = new JLabel();
			jLabel36.setText("JLabel");
			jLabel36.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel36.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel35 = new JLabel();
			jLabel35.setText("JLabel");
			jLabel35.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel35.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel34 = new JLabel();
			jLabel34.setText("JLabel");
			jLabel34.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel34.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel33 = new JLabel();
			jLabel33.setText("JLabel");
			jLabel33.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel33.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel32 = new JLabel();
			jLabel32.setText("JLabel");
			jLabel32.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel32.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel31 = new JLabel();
			jLabel31.setText("JLabel");
			jLabel31.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel31.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel30 = new JLabel();
			jLabel30.setText("JLabel");
			jLabel30.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel30.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel29 = new JLabel();
			jLabel29.setText("JLabel");
			jLabel29.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel29.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel28 = new JLabel();
			jLabel28.setText("JLabel");
			jLabel28.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel28.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel27 = new JLabel();
			jLabel27.setText("JLabel");
			jLabel27.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel27.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel26 = new JLabel();
			jLabel26.setText("JLabel");
			jLabel26.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel26.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel25 = new JLabel();
			jLabel25.setText("JLabel");
			jLabel25.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel25.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel24 = new JLabel();
			jLabel24.setText("JLabel");
			jLabel24.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel24.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel23 = new JLabel();
			jLabel23.setText("JLabel");
			jLabel23.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel23.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel22 = new JLabel();
			jLabel22.setText("JLabel");
			jLabel22.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel22.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel21 = new JLabel();
			jLabel21.setText("JLabel");
			jLabel21.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel21.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel20 = new JLabel();
			jLabel20.setText("JLabel");
			jLabel20.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel20.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel19 = new JLabel();
			jLabel19.setText("JLabel");
			jLabel19.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel19.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel18 = new JLabel();
			jLabel18.setText("JLabel");
			jLabel18.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel18.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel17 = new JLabel();
			jLabel17.setText("JLabel");
			jLabel17.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel17.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel16 = new JLabel();
			jLabel16.setText("JLabel");
			jLabel16.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel15 = new JLabel();
			jLabel15.setText("JLabel");
			jLabel15.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel14 = new JLabel();
			jLabel14.setText("JLabel");
			jLabel14.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel13 = new JLabel();
			jLabel13.setText("JLabel");
			jLabel13.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel12 = new JLabel();
			jLabel12.setText("JLabel");
			jLabel12.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel11 = new JLabel();
			jLabel11.setText("JLabel");
			jLabel11.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel10 = new JLabel();
			jLabel10.setText("JLabel");
			jLabel10.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel9 = new JLabel();
			jLabel9.setText("JLabel");
			jLabel9.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel8 = new JLabel();
			jLabel8.setText("JLabel");
			jLabel8.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel7 = new JLabel();
			jLabel7.setText("JLabel");
			jLabel7.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel6 = new JLabel();
			jLabel6.setText("JLabel");
			jLabel6.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel5 = new JLabel();
			jLabel5.setText("JLabel");
			jLabel5.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4 = new JLabel();
			jLabel4.setText("JLabel");
			jLabel4.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3 = new JLabel();
			jLabel3.setText("JLabel");
			jLabel3.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel2 = new JLabel();
			jLabel2.setText("JLabel");
			jLabel2.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel1 = new JLabel();
			jLabel1.setText("JLabel");
			jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(7);
			gridLayout.setHgap(11);
			gridLayout.setVgap(2);
			gridLayout.setColumns(7);
			jPCalendario = new JPanel();
			jPCalendario.setLayout(gridLayout);
			jPCalendario.add(jLabel43, null);
			jPCalendario.add(jLabel44, null);
			jPCalendario.add(jLabel45, null);
			jPCalendario.add(jLabel46, null);
			jPCalendario.add(jLabel47, null);
			jPCalendario.add(jLabel48, null);
			jPCalendario.add(jLabel49, null);
			jPCalendario.add(jLabel1, null);
			jPCalendario.add(jLabel2, null);
			jPCalendario.add(jLabel3, null);
			jPCalendario.add(jLabel4, null);
			jPCalendario.add(jLabel5, null);
			jPCalendario.add(jLabel6, null);
			jPCalendario.add(jLabel7, null);
			jPCalendario.add(jLabel8, null);
			jPCalendario.add(jLabel9, null);
			jPCalendario.add(jLabel10, null);
			jPCalendario.add(jLabel11, null);
			jPCalendario.add(jLabel12, null);
			jPCalendario.add(jLabel13, null);
			jPCalendario.add(jLabel14, null);
			jPCalendario.add(jLabel15, null);
			jPCalendario.add(jLabel16, null);
			jPCalendario.add(jLabel17, null);
			jPCalendario.add(jLabel18, null);
			jPCalendario.add(jLabel19, null);
			jPCalendario.add(jLabel20, null);
			jPCalendario.add(jLabel21, null);
			jPCalendario.add(jLabel22, null);
			jPCalendario.add(jLabel23, null);
			jPCalendario.add(jLabel24, null);
			jPCalendario.add(jLabel25, null);
			jPCalendario.add(jLabel26, null);
			jPCalendario.add(jLabel27, null);
			jPCalendario.add(jLabel28, null);
			jPCalendario.add(jLabel29, null);
			jPCalendario.add(jLabel30, null);
			jPCalendario.add(jLabel31, null);
			jPCalendario.add(jLabel32, null);
			jPCalendario.add(jLabel33, null);
			jPCalendario.add(jLabel34, null);
			jPCalendario.add(jLabel35, null);
			jPCalendario.add(jLabel36, null);
			jPCalendario.add(jLabel37, null);
			jPCalendario.add(jLabel38, null);
			jPCalendario.add(jLabel39, null);
			jPCalendario.add(jLabel40, null);
			jPCalendario.add(jLabel41, null);
			jPCalendario.add(jLabel42, null);
		}
		return jPCalendario;
	}

	/**
	 * This method initializes jBDerecha	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJBDerecha() {
		if (jBDerecha == null) {
			jBDerecha = new JButton();
			jBDerecha.setText(">");
			jBDerecha.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					mes = mes +1;
					mapearCalendario(mes);
					jLMes.setText(Calendario.calcularMes(mes));
					jLYear.setText(Integer.toString(Calendario.calcularYear()));
				}
			});
		}
		return jBDerecha;
	}

	/**
	 * This method initializes jBIzquierda	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJBIzquierda() {
		if (jBIzquierda == null) {
			jBIzquierda = new JButton();
			jBIzquierda.setText("<");
			jBIzquierda.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					mes = mes -1;
					mapearCalendario(mes);
					jLMes.setText(Calendario.calcularMes(mes));
					jLYear.setText(Integer.toString(Calendario.calcularYear()));
				}
			});
		}
		return jBIzquierda;
	}

}
