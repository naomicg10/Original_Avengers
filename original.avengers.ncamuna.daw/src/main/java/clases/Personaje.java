package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Personaje extends ElementoConImagen {
	private ArrayList<Carta> mazo;
	private ArrayList<Carta> cartasEnMano;
	private byte defensa;
	private byte vida;

	public Personaje(String nombre, ArrayList<Carta> mazo, ArrayList<Carta> cartasEnMano,
			byte defensa, byte vida) {
		super(nombre);
		this.mazo = mazo;
		this.cartasEnMano = cartasEnMano;
		this.defensa = defensa;
		this.vida = vida;
	}
	
	public Personaje(String nombre) {
		super(nombre);
	
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


	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}
	
	public void recibirCarta(Carta carta) {
        cartasEnMano.add(carta);
    }
	
	    
	@Override
	public String toString() {
		return "Personaje: Nombre: " + getNombre() + "\nMazo: " + mazo + "\nCartas en Mano: " + cartasEnMano + "\nDefensa: " + defensa + "\nVida: " + vida;
	}

}
