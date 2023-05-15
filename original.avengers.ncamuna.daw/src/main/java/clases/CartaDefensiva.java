package clases;

import java.awt.image.BufferedImage;

public class CartaDefensiva extends Carta {
	private byte defensa;

	public CartaDefensiva(String nombre, BufferedImage imagen, String descripcion, byte defensa) {
		super(nombre, imagen, descripcion);
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
		return "CartaDefensiva [defensa=" + defensa + "]";
	}

}
