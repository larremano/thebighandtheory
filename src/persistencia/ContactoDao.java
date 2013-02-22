package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Amigo;
import modelo.Contacto;
import modelo.Profesional;

public class ContactoDao {

	public static Connection cx;

	public void cargar(Contacto contacto){

		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			if (contacto instanceof Amigo) {
				pst = cx.prepareStatement("insert into amigos "
						+ "(NOMBRE,DIRECCION,TELEFONO,EMAIL,FECHA_NACIMIENTO)"
						+ "values (?,?,?,?,?)");
				pst.setString(1, contacto.getNombre());
				pst.setString(2, contacto.getDireccion());
				pst.setString(3, contacto.getTelefono());
				pst.setString(4, contacto.getEMail());
				pst.setString(5, ((Amigo)contacto).getFechaNacimiento());
			} else {
				pst = cx.prepareStatement("insert into profesionales "
						+ "(NOMBRE,DIRECCION,TELEFONO,EMAIL,SECTOR)"
						+ "values (?,?,?,?,?)");
				pst.setString(1, contacto.getNombre());
				pst.setString(2, contacto.getDireccion());
				pst.setString(3, contacto.getTelefono());
				pst.setString(4, contacto.getEMail());
				String sector = ((Profesional) contacto).getSector();
				pst.setString(5, sector);
			}
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void actualizar(Contacto contacto){

		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = null;
			if (contacto instanceof Amigo) {
				pst = cx.prepareStatement("update amigos "
						+ "SET NOMBRE=?,DIRECCION=?,TELEFONO=?,EMAIL=?,FECHA_NACIMIENTO=? where ID=?");
				pst.setString(1, contacto.getNombre());
				pst.setString(2, contacto.getDireccion());
				pst.setString(3, contacto.getTelefono());
				pst.setString(4, contacto.getEMail());
				pst.setString(5, ((Amigo)contacto).getFechaNacimiento());
				pst.setInt(6, contacto.getId());
			} else {
				pst = cx.prepareStatement("update profesionales "
						+ "SET NOMBRE=?,DIRECCION=?,TELEFONO=?,EMAIL=?,SECTOR=? where ID=?");
				pst.setString(1, contacto.getNombre());
				pst.setString(2, contacto.getDireccion());
				pst.setString(3, contacto.getTelefono());
				pst.setString(4, contacto.getEMail());
				String sector = ((Profesional)contacto).getSector();
				pst.setString(5, sector);
				pst.setInt(6, contacto.getId());
			}
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				cx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
