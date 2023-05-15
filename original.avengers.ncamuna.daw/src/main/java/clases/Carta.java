package clases;

import java.awt.image.BufferedImage;

public class Carta extends ElementoConImagen {
	private String descripcion;

	public Carta(String nombre, BufferedImage imagen, String descripcion) {
		super(nombre, imagen);
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
		return "Carta [descripcion=" + descripcion + "]";
	}

}
