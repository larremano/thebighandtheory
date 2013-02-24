package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.Amigo;
import modelo.Contacto;

import modelo.Profesional;

public class ListarContactosDao {

	public static Connection cx;

	public List<Contacto> listarAmigos(){

		List<Contacto> amigos = new ArrayList<Contacto>();

		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			PreparedStatement pst = null;
			pst = cx.prepareStatement("select * from amigos order by NOMBRE");
			ResultSet rs = null;
			rs = pst.executeQuery();
			while (rs.next()) {
				Amigo amigoAux = new Amigo(rs.getString("NOMBRE"));
				amigoAux.setId(rs.getInt("ID"));
				amigoAux.setDireccion(rs.getString("DIRECCION"));
				amigoAux.setTelefono(rs.getString("TELEFONO"));
				amigoAux.setEMail(rs.getString("EMAIL"));
				Date date = new Date(rs.getDate("FECHA_NACIMIENTO").getTime());
				amigoAux.setFechaNacimiento(date);
				amigos.add(amigoAux);
			}
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

		return amigos;
	}

	public List<Contacto> listarProfesionales(){

		List<Contacto> profesionales = new ArrayList<Contacto>();

		PreparedStatement pst;
		ResultSet rs;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
					"root", "root");
			pst = null;
			pst = cx.prepareStatement("select * from profesionales order by NOMBRE");
			rs = null;
			rs = pst.executeQuery();
			while (rs.next()) {
				Profesional profesionalAux = new Profesional(rs.getString("NOMBRE"));
				profesionalAux.setId(rs.getInt("ID"));
				profesionalAux.setDireccion(rs.getString("DIRECCION"));
				profesionalAux.setTelefono(rs.getString("TELEFONO"));
				profesionalAux.setEMail(rs.getString("EMAIL"));
				profesionalAux.setSector(rs.getString("SECTOR"));
				profesionales.add(profesionalAux);
			}
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

		return profesionales;
	}

}
