package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Calendario {
	
	private static int mesCalculadoInt;
	private static int yearCalculadoInt;
	
	public static Map<Integer,Integer> labels = new HashMap<Integer,Integer>();

	private static GregorianCalendar cal = new GregorianCalendar();

	public Calendario() {
		super();
	}

	public static String fechaActual() {
		int numeroDiaSemana = cal.get(Calendar.DAY_OF_WEEK);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		String diaSemana = "";
		switch (numeroDiaSemana) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Lunes";
			break;
		case 3:
			diaSemana = "Martes";
			break;
		case 4:
			diaSemana = "Miercoles";
			break;
		case 5:
			diaSemana = "Jueves";
			break;
		case 6:
			diaSemana = "Viernes";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		}

		return diaSemana + ", " + dia + "/" + mes + "/" + year;
	}
	
	public static Map<Integer,Integer> mapearMes(int mesIncrementoInt){
		int j = 1;
		int mesActualInt = cal.get(Calendar.MONTH);
		mesCalculadoInt = mesActualInt+mesIncrementoInt;
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR),mesCalculadoInt,1);
		int primerDiaMes = cal.get(Calendar.DAY_OF_WEEK);
		switch (primerDiaMes) {
		case 1://domingo
			for(int i = 1; i < 43; i++){
				if(i<7 || j > cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
					labels.put(i, 0);
				}else{
					labels.put(i, j);
					j++;
				}
			}
			break;
		case 2://lunes
			for(int i = 1; i < 43; i++){
				if(i<1 || j > cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
					labels.put(i, 0);
				}else{
					labels.put(i, j);
					j++;
				}
			}
			break;
		case 3:
			for(int i = 1; i < 43; i++){
				if(i<2 || j > cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
					labels.put(i, 0);
				}else{
					labels.put(i, j);
					j++;
				}
			}
			break;
		case 4:
			for(int i = 1; i < 43; i++){
				if(i<3 || j > cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
					labels.put(i, 0);
				}else{
					labels.put(i, j);
					j++;
				}
			}
			break;
		case 5:
			for(int i = 1; i < 43; i++){
				if(i<4 || j > cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
					labels.put(i, 0);
				}else{
					labels.put(i, j);
					j++;
				}
			}
			break;
		case 6:
			for(int i = 1; i < 43; i++){
				if(i<5 || j > cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
					labels.put(i, 0);
				}else{
					labels.put(i, j);
					j++;
				}
			}
			break;
		case 7:
			for(int i = 1; i < 43; i++){
				if(i<6 || j > cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
					labels.put(i, 0);
				}else{
					labels.put(i, j);
					j++;
				}
			}
		}
		return labels;
	}
	
	public static String calcularMes(int mesIncrementoInt){
		String mesString = "";
		int mesActualInt = cal.get(Calendar.MONTH);
		mesCalculadoInt = mesActualInt + mesIncrementoInt;
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR),mesCalculadoInt,1);
		mesCalculadoInt = cal.get(Calendar.MONTH);
		yearCalculadoInt = cal.get(Calendar.YEAR);
		calcularYear();
		switch(mesCalculadoInt){
		case 0:
			mesString = "Enero";
			break;
		case 1:
			mesString = "Febrero";
			break;
		case 2:
			mesString = "Marzo";
			break;
		case 3:
			mesString = "Abril";
			break;
		case 4:
			mesString = "Mayo";
			break;
		case 5:
			mesString = "Junio";
			break;
		case 6:
			mesString = "Julio";
			break;
		case 7:
			mesString = "Agosto";
			break;
		case 8:
			mesString = "Septiembre";
			break;
		case 9:
			mesString = "Octubre";
			break;
		case 10:
			mesString = "Noviembre";
			break;
		case 11:
			mesString = "Diciembre";
			break;
		}
		return mesString;
	}

	public static int calcularYear() {
		return yearCalculadoInt;
	}

}
