package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Villano extends Personaje{

	public Villano(String nombre, ArrayList<Carta> mazo, ArrayList<Carta> cartasEnMano,
			byte defensa, byte vida) {
		super(nombre, mazo, cartasEnMano, defensa, vida);
		this.setNombre(nombre);
		this.setMazo(mazo);
		this.setCartasEnMano(cartasEnMano);
		this.setDefensa(defensa);
		this.setVida(vida);
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList <Villano> getVillanos(){
		ArrayList<Villano> villanos = new ArrayList<Villano>();
		villanos.add(cargarLoki());
		villanos.add(cargarUltron());
		villanos.add(cargarZemo());
		villanos.add(cargarEbony());
		villanos.add(cargarKang());
		villanos.add(cargarThanos());
		return villanos;
	}
	
	public static Villano villanoAleatorio(ArrayList <Villano> villanos) {
		Random r= new Random();
	    int randomNumber = r.nextInt(villanos.size());
	    Villano randomElement = villanos.get(randomNumber);
	    return villanos.get(randomNumber);
	}
	
	public static Villano cargarLoki() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		CartaOfensiva carta1 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta2 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta3 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta4 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta5 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta6 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta7 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		mazo.add(carta6);
		mazo.add(carta7);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
	    int randomNumber = r.nextInt(mazo.size());
	    Carta randomElement = mazo.get(randomNumber);
	    cartasEnMano.add(randomElement);
	    cartasEnMano.add(randomElement);
	    cartasEnMano.add(randomElement);
		Villano loki = new Villano("Loki", mazo, cartasEnMano, (byte) 30, (byte) 100);
		return loki;
	}
	
	public static Villano cargarUltron() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		CartaOfensiva carta1 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta2 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta3 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta4 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta5 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta6 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta7 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		mazo.add(carta6);
		mazo.add(carta7);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();		Random r= new Random();
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		Villano ultron = new Villano("Ultrón", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return ultron;
	}
	
	public static Villano cargarZemo() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		CartaOfensiva carta1 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta2 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta3 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta4 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta5 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta6 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta7 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		mazo.add(carta6);
		mazo.add(carta7);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		Villano zemo = new Villano("Barón Zemo", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return zemo;
	}
	
	public static Villano cargarEbony() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		CartaOfensiva carta1 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta2 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta3 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta4 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta5 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta6 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta7 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		mazo.add(carta6);
		mazo.add(carta7);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		Villano ebony = new Villano("Ebony Maw", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return ebony;
	}
	
	public static Villano cargarKang() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		CartaOfensiva carta1 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta2 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta3 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta4 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta5 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta6 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta7 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		mazo.add(carta6);
		mazo.add(carta7);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		Villano kang = new Villano("Kang El Conquistador", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return kang;
	}
	
	public static Villano cargarThanos() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		CartaOfensiva carta1 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta2 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta3 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaOfensiva carta4 = new CartaOfensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta5 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta6 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		CartaDefensiva carta7 = new CartaDefensiva("nombre", "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		mazo.add(carta6);
		mazo.add(carta7);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		cartasEnMano.add(randomElement);
		Villano thanos = new Villano("Thanos", mazo, cartasEnMano, (byte) 60, (byte) 120);
		return thanos;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
