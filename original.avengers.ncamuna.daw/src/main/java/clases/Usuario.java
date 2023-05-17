package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import excepciones.ClienteNoExisteException;
import excepciones.ContraseñaInvalidaExcepcion;
import utils.DAO;

public class Usuario extends ElementoConNombre {
	private String email;
	private String fechaNacimiento;
	private Personaje personaje;

	public Usuario(String nombre, String email, String fechaNacimiento, Personaje personaje) {
		super(nombre);
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.personaje = personaje;
	}

	public Usuario(String nombre, String contraseña, String email, String fechaNacimiento) throws SQLException {
		super(nombre);
		HashMap<String, Object> datos = new HashMap<String, Object>();
		datos.put("nombre", nombre);
		datos.put("contraseña", contraseña);
		datos.put("email", email);
		datos.put("fechaNacimiento", fechaNacimiento);
		DAO.insertar("usuario", datos);
		this.setNombre(nombre);
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Usuario(String nombre, String contraseña) throws SQLException, ClienteNoExisteException, ContraseñaInvalidaExcepcion {
		super(nombre);
			LinkedHashSet<String> columnasSacar = new LinkedHashSet<String>();
			columnasSacar.add("nombre");
			columnasSacar.add("contraseña");
			columnasSacar.add("email");
			columnasSacar.add("fechaNacimiento");
			HashMap<String, Object> restricciones = new HashMap<String, Object>();
			restricciones.put("nombre", nombre);
			ArrayList<Object> cliente = DAO.consultar("usuario", columnasSacar, restricciones);
			if(cliente.isEmpty()) {
				throw new ClienteNoExisteException("Cliente no extiste");
			}else {
				String contraseñaAlmacenada=(String)cliente.get(1);
				if(contraseñaAlmacenada.equals(contraseña)) {
					this.setNombre((String) cliente.get(0));
					this.email = (String) cliente.get(2);
					this.fechaNacimiento = (String) cliente.get(3);
				}else {
					throw new ContraseñaInvalidaExcepcion("Contraseña incorrecta");
				}
			}
	}

	public String getEmail() {
		return email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", personaje=" + personaje + "]";
	}

}
