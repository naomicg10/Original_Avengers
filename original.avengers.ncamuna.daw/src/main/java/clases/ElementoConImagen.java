package clases;

import java.awt.image.BufferedImage;

public class ElementoConImagen extends ElementoConNombre {
	private BufferedImage imagen;

	public ElementoConImagen(String nombre, BufferedImage imagen) {
		super(nombre);
		this.imagen = imagen;
	}

	public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "ElementoConImagen [imagen=" + imagen + "]";
	}

}
