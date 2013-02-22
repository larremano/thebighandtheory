import modelo.Agenda;
import modelo.Contacto;
import vista.VentanaInicio;

public class AgendaMain {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Agenda agenda = new Agenda();
		VentanaInicio vi = new VentanaInicio(agenda);
		vi.setVisible(true);
		for(Contacto contacto : agenda.getContactos()){
			System.out.println(contacto);
		}
	}

}
