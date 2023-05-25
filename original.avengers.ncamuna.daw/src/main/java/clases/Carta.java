package clases;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Carta extends ElementoConImagen {
	private String descripcion;

	public Carta(String nombre, String descripcion) {
		super(nombre);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Carta descripcion=" + descripcion;
	}

}
