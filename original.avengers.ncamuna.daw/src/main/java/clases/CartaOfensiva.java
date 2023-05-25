package clases;

import java.awt.image.BufferedImage;

public class CartaOfensiva extends Carta {
	private byte daño;

	public CartaOfensiva(String nombre, String descripcion, byte daño) {
		super(nombre, descripcion);
		this.daño = daño;
	}

	public byte getDaño() {
		return daño;
	}

	public void setDaño(byte daño) {
		this.daño = daño;
	}

	@Override
	public String toString() {
		return "\nCartaOfensiva nombre="+ getNombre()+ " descripción=" + getDescripcion() + " daño=" + daño;
	}

}
