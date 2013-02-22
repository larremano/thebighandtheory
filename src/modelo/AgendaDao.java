package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgendaDao {
	
	public static Connection cx;

	public List<Contacto> listarContactos(){

		List<Contacto> contactos = new ArrayList<Contacto>();
		List<Contacto> amigos = new ArrayList<Contacto>();
		List<Contacto> profesionales = new ArrayList<Contacto>();
		
		amigos = this.listarAmigos();
		profesionales = this.listarProfesionales();
		
		for(Contacto contacto : amigos){
			contactos.add(contacto);
		}
		for(Contacto contacto : profesionales){
			contactos.add(contacto);
		}
		
		/*
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root", "root");
			pst = cx.prepareStatement("select * from amigos order by NOMBRE");
			rs = pst.executeQuery();
			while (rs.next()) {
				Contacto contactoAux = new Amigo(rs.getString("NOMBRE"));
				contactoAux.setDireccion(rs.getString("DIRECCION"));
				contactoAux.setTelefono(rs.getString("TELEFONO"));
				contactoAux.setEMail(rs.getString("EMAIL"));
				((Amigo)contactoAux).setFechaNacimiento(rs.getString("FECHA_NACIMIENTO"));
				contactos.add(contactoAux);
			}
			pst = cx.prepareStatement("select * from profesionales order by NOMBRE");
			rs = pst.executeQuery();
			while (rs.next()) {
				Contacto contactoAux = new Profesional(rs.getString("NOMBRE"));
				contactoAux.setDireccion(rs.getString("DIRECCION"));
				contactoAux.setTelefono(rs.getString("TELEFONO"));
				contactoAux.setEMail(rs.getString("EMAIL"));
				((Profesional)contactoAux).setSector(rs.getString("SECTOR"));
				contactos.add(contactoAux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
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
		*/
		return contactos;
	}

	public List<Contacto> listarProfesionales() {
		List<Contacto> profesionales = new ArrayList<Contacto>();
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root", "root");
			pst = cx.prepareStatement("select * from profesionales order by NOMBRE");
			rs = pst.executeQuery();
			while (rs.next()) {
				Contacto contactoAux = new Profesional(rs.getString("NOMBRE"));
				contactoAux.setId(rs.getInt("ID"));
				contactoAux.setDireccion(rs.getString("DIRECCION"));
				contactoAux.setTelefono(rs.getString("TELEFONO"));
				contactoAux.setEMail(rs.getString("EMAIL"));
				((Profesional)contactoAux).setSector(rs.getString("SECTOR"));
				profesionales.add(contactoAux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
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
		
		return profesionales;
	}

	public List<Contacto> listarAmigos() {
		List<Contacto> amigos = new ArrayList<Contacto>();
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root", "root");
			pst = cx.prepareStatement("select * from amigos order by NOMBRE");
			rs = pst.executeQuery();
			while (rs.next()) {
				Contacto contactoAux = new Amigo(rs.getString("NOMBRE"));
				contactoAux.setId(rs.getInt("ID"));
				contactoAux.setDireccion(rs.getString("DIRECCION"));
				contactoAux.setTelefono(rs.getString("TELEFONO"));
				contactoAux.setEMail(rs.getString("EMAIL"));
				((Amigo)contactoAux).setFechaNacimiento(rs.getString("FECHA_NACIMIENTO"));
				amigos.add(contactoAux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
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
		
		return amigos;
	}
}
