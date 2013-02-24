package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.Agenda;
import modelo.Amigo;
import modelo.Cita;
import modelo.Contacto;
import modelo.Profesional;

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
				if(cx != null){
					cx.close();
				}
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
				Date date = new Date(rs.getDate("FECHA_NACIMIENTO").getTime());
				((Amigo)contactoAux).setFechaNacimiento(date);
				amigos.add(contactoAux);
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

	public List<Cita> listarCitas(Agenda agenda) {
		List<Cita> citas = new ArrayList<Cita>();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root", "root");
			pst = cx.prepareStatement("select * from citas ORDER BY FECHA");
			rs = pst.executeQuery();
			while (rs.next()) {
				java.sql.Date sqlDate = new java.sql.Date(0);
				sqlDate = rs.getDate("FECHA");
				Date date = new Date(sqlDate.getTime());
				Cita citaAux = new Cita(date);
				citaAux.setId(rs.getInt("ID"));
				//Buscar el contacto con ese nombre
				Contacto contacto = buscarContacto(rs.getString("CONTACTO"),agenda);
				citaAux.setContacto(contacto);
				citaAux.setLugar(rs.getString("LUGAR"));
				citaAux.setHora(rs.getString("HORA"));
				citaAux.setCaracter(rs.getString("CARACTER"));
				citaAux.setDescripcion(rs.getString("DESCRIPCION"));
				citas.add(citaAux);
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
		
		return citas;
	}

	private Contacto buscarContacto(String nombreContacto,Agenda agenda) {
		for(Contacto contacto : agenda.getContactos()){
			if(contacto.getNombre().equalsIgnoreCase(nombreContacto)){
				return contacto;
			}
		}
		Contacto contactoAux = new Contacto(nombreContacto);
		return contactoAux;
	}
}
