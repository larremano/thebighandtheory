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

	public void cargarAmigo(Contacto contacto){

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
				java.sql.Date sqlDate = new java.sql.Date(((Amigo)contacto).getFechaNacimiento().getTime());
				pst.setDate(5, sqlDate);
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
				if(cx != null){
					cx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void cargarProfesional(Contacto contacto){
		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = cx.prepareStatement("insert into profesionales "
					+ "(NOMBRE,DIRECCION,TELEFONO,EMAIL,SECTOR)"
					+ "values (?,?,?,?,?)");
			pst.setString(1, contacto.getNombre());
			pst.setString(2, contacto.getDireccion());
			pst.setString(3, contacto.getTelefono());
			pst.setString(4, contacto.getEMail());
			String sector = ((Profesional) contacto).getSector();
			pst.setString(5, sector);
			
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

	public void actualizarAmigo(Contacto contacto){

		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = null;
			pst = cx.prepareStatement("update amigos "
					+ "SET NOMBRE=?,DIRECCION=?,TELEFONO=?,EMAIL=?,FECHA_NACIMIENTO=? where ID=?");
			pst.setString(1, contacto.getNombre());
			pst.setString(2, contacto.getDireccion());
			pst.setString(3, contacto.getTelefono());
			pst.setString(4, contacto.getEMail());
			java.sql.Date sqlDate = new java.sql.Date(((Amigo)contacto).getFechaNacimiento().getTime());
			pst.setDate(5, sqlDate);
			pst.setInt(6, contacto.getId());
			
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
	public void actualizarProfesional(Contacto contacto){
		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = cx.prepareStatement("update profesionales "
				+ "SET NOMBRE=?,DIRECCION=?,TELEFONO=?,EMAIL=?,SECTOR=? where ID=?");
			pst.setString(1, contacto.getNombre());
			pst.setString(2, contacto.getDireccion());
			pst.setString(3, contacto.getTelefono());
			pst.setString(4, contacto.getEMail());
			String sector = ((Profesional)contacto).getSector();
			pst.setString(5, sector);
			pst.setInt(6, contacto.getId());
			
			pst.executeUpdate();
		}catch (SQLException e) {
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
	public void eliminarAmigo(Contacto contacto){

		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = null;
			pst = cx.prepareStatement("DELETE FROM amigos where ID=?");
			pst.setInt(1, contacto.getId());
			
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
	public void eliminarProfesional(Contacto contacto){

		PreparedStatement pst = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = null;
			pst = cx.prepareStatement("DELETE FROM profesionales where ID=?");
			pst.setInt(1, contacto.getId());
			
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
