package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

	private static GregorianCalendar cal = new GregorianCalendar();

	public Fecha() {
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

}
