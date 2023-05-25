package clases;

import java.awt.image.BufferedImage;
import java.util.Random;

public class CartaDefensiva extends Carta {
	private byte defensa;

	public CartaDefensiva(String nombre, String descripcion, byte defensa) {
		super(nombre, descripcion);
		this.defensa = defensa;
	}

	public byte getDefensa() {
		return defensa;
	}

	public void setDefensa(byte defensa) {
		this.defensa = defensa;
	}
	
	@Override
	public String toString() {
		return "\nCartaDefensiva nombre="+ getNombre()+ " descripción=" + getDescripcion() + " defensa=" + defensa;
	}

}
