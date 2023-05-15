package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import utils.DAO;

public class Usuario extends ElementoConNombre {
	private String email;
	private String fechaNacimiento;
	
	public Usuario(String nombre, String contraseña, String email, String fechaNacimiento) throws SQLException {
		super(nombre);
		HashMap<String, Object> datos=new HashMap<String, Object>();
		datos.put("nombre", nombre);
		datos.put("contraseña", contraseña);
		datos.put("email", email);
		datos.put("fechaNacimiento", fechaNacimiento);
		DAO.insertar("usuario", datos);
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Usuario(String nombre, String contraseña) throws SQLException {
		super(nombre);
		try {
			HashMap<String, Object> datos = new HashMap<String, Object>();
			datos.put("nombre", nombre);
			datos.put("contraseña", contraseña);
			LinkedHashSet<String> columnasSacar = new LinkedHashSet<String>();
			columnasSacar.add("nombre");
			columnasSacar.add("contraseña");
			HashMap<String, Object> restricciones = new HashMap<String, Object>();
			ArrayList<Object> cliente = DAO.consultar("usuario", columnasSacar, restricciones);
			for (byte i = 0; i < cliente.size(); i++) {
				System.out.print(cliente.get(i) + " | ");
			}
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getEmail() {
		return email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", fecha_nacimiento=" + fechaNacimiento
				+ "]";
	}
	
}
