package clases;

import java.awt.image.BufferedImage;
import java.util.Random;

public class CartaDefensiva extends Carta {
	private byte defensa;

	public CartaDefensiva(String nombre, String descripcion, byte defensa, BufferedImage imagen) {
		super(nombre, descripcion, imagen);
		this.setImagen(imagen);
		this.setDefensa(defensa);
	}

	public byte getDefensa() {
		return defensa;
	}

	public void setDefensa(byte defensa) {
		if(defensa<=0) {
			this.defensa=0;
		}else {
			this.defensa = defensa;
		}

	}
	
	@Override
	public String toString() {
		return "\nCartaDefensiva: Nombre: "+ getNombre()+ " Descripción: " + getDescripcion() + " Defensa: " + defensa;
	}

}
