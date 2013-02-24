package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cita;

public class CitaDao {
	public static Connection cx;

	public void cargarCita(Cita cita){

		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = cx.prepareStatement("insert into citas "
					+ "(FECHA,CONTACTO,LUGAR,HORA,CARACTER,DESCRIPCION)"
					+ "values (?,?,?,?,?,?)");
			java.sql.Date sqlDate = new java.sql.Date(cita.getDate().getTime());
			pst.setDate(1, sqlDate);
			if(cita.getContacto() != null){
				pst.setString(2, cita.getContacto().getNombre());
			}else {
				pst.setString(2, "");
			}
			pst.setString(3, cita.getLugar());
			pst.setString(4, cita.getHora());
			pst.setString(5, cita.getCaracter());
			pst.setString(6, cita.getDescripcion());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(cx != null){
					cx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void actualizarCita(Cita cita) {
		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = null;
			pst = cx.prepareStatement("update citas "
					+ "SET FECHA=?,CONTACTO=?,LUGAR=?,HORA=?,CARACTER=?,DESCRIPCION=? where ID=?");
			
			java.sql.Date sqlDate = new java.sql.Date(cita.getDate().getTime());
			pst.setDate(1, sqlDate);
			pst.setString(2, cita.getContacto().getNombre());
			pst.setString(3, cita.getLugar());
			pst.setString(4, cita.getHora());
			pst.setString(5, cita.getCaracter());
			pst.setString(6, cita.getDescripcion());
			pst.setInt(7, cita.getId());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(cx != null){
					cx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void eliminarCita(Cita cita) {
		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = null;
			pst = cx.prepareStatement("DELETE FROM citas where ID=?");
			pst.setInt(1, cita.getId());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(cx != null){
					cx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
