package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ElementoConImagen extends ElementoConNombre {
	private BufferedImage imagen;

	public ElementoConImagen(String nombre, BufferedImage imagen) {
		super(nombre);
			this.setNombre(nombre);
			this.imagen = imagen;
	}
	
	public ElementoConImagen(String nombre) {
		super(nombre);
		this.setNombre(nombre);
	}
	

	public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "ElementoConImagen imagen=" + imagen;
	}

}
