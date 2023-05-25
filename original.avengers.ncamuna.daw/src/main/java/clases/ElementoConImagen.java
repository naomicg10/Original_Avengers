package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ElementoConImagen extends ElementoConNombre {
	private BufferedImage imagen;

	public ElementoConImagen(String nombre) {
		super(nombre);
		try {
			this.imagen = ImageIO.read(new File("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Ironman.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
