package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Personaje extends ElementoConImagen {
	private ArrayList<Carta> mazo;
	private ArrayList<Carta> cartasEnMano;
	private byte defensa;
	private BufferedImage imagen;
	private byte vida;

	public Personaje(String nombre, BufferedImage imagen, ArrayList<Carta> mazo, ArrayList<Carta> cartasEnMano,
			byte defensa, BufferedImage imagen2, byte vida) {
		super(nombre, imagen);
		this.mazo = mazo;
		this.cartasEnMano = cartasEnMano;
		this.defensa = defensa;
		imagen = imagen2;
		this.vida = vida;
	}

	public ArrayList<Carta> getMazo() {
		return mazo;
	}

	public void setMazo(ArrayList<Carta> mazo) {
		this.mazo = mazo;
	}

	public ArrayList<Carta> getCartasEnMano() {
		return cartasEnMano;
	}

	public void setCartasEnMano(ArrayList<Carta> cartasEnMano) {
		this.cartasEnMano = cartasEnMano;
	}

	public byte getDefensa() {
		return defensa;
	}

	public void setDefensa(byte defensa) {
		this.defensa = defensa;
	}

	public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}

	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "Personaje [mazo=" + mazo + ", cartasEnMano=" + cartasEnMano + ", defensa=" + defensa + ", imagen="
				+ imagen + ", vida=" + vida + "]";
	}

}
