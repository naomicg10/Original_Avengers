package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Villano extends Personaje{

	public Villano(String nombre, BufferedImage imagen, ArrayList<Carta> mazo, ArrayList<Carta> cartasEnMano,
			byte defensa, byte vida) {
		super(nombre, imagen, mazo, cartasEnMano, defensa, vida);
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
	    System.out.println("Elemento aleatorio: " + randomElement);
	    return villanos.get(randomNumber);
	}
	
	public static Villano cargarLoki() {
		// Cargar Imagen personaje
		BufferedImage imagenL = null;
		// Cargar el mazo
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		// Cargar imagen de cada carta
		BufferedImage imagenCarta1 = null;
		CartaOfensiva carta1 = new CartaOfensiva("nombre", imagenCarta1, "descripcion", (byte)10);
		BufferedImage imagenCarta2 = null;
		CartaOfensiva carta2 = new CartaOfensiva("nombre", imagenCarta2, "descripcion", (byte)10);
		BufferedImage imagenCarta3 = null;
		CartaDefensiva carta3 = new CartaDefensiva("nombre", imagenCarta3, "descripcion", (byte)10);
		// Añadir todas las cartas al mazo
		mazo.add(carta1);
		mazo.add(carta2);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		//Se coge aleatoriamente del mazo
		Random r= new Random();
	    int randomNumber = r.nextInt(mazo.size());
	    Carta randomElement = mazo.get(randomNumber);
	    System.out.println("Elemento aleatorio: " + randomElement);
	    cartasEnMano.add(randomElement);
		Villano loki = new Villano("Loki", imagenL, mazo, cartasEnMano, (byte) 30, (byte) 100);
		return loki;
	}
	
	public static Villano cargarUltron() {
		BufferedImage imagenU = null;
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		BufferedImage imagenCarta1 = null;
		CartaOfensiva carta1 = new CartaOfensiva("nombre", imagenCarta1, "descripcion", (byte)10);
		BufferedImage imagenCarta2 = null;
		CartaOfensiva carta2 = new CartaOfensiva("nombre", imagenCarta2, "descripcion", (byte)10);
		BufferedImage imagenCarta3 = null;
		CartaDefensiva carta3 = new CartaDefensiva("nombre", imagenCarta3, "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		//Se coge aleatoriamente del mazo
		Random r= new Random();
	    int randomNumber = r.nextInt(mazo.size());
	    Carta randomElement = mazo.get(randomNumber);
	    System.out.println("Elemento aleatorio: " + randomElement);
	    cartasEnMano.add(randomElement);
		Villano ultron = new Villano("Ultrón", imagenU, mazo, cartasEnMano, (byte) 60, (byte) 100);
		return ultron;
	}
	
	public static Villano cargarZemo() {
		BufferedImage imagenBZ = null;
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		BufferedImage imagenCarta1 = null;
		CartaOfensiva carta1 = new CartaOfensiva("nombre", imagenCarta1, "descripcion", (byte)10);
		BufferedImage imagenCarta2 = null;
		CartaOfensiva carta2 = new CartaOfensiva("nombre", imagenCarta2, "descripcion", (byte)10);
		BufferedImage imagenCarta3 = null;
		CartaDefensiva carta3 = new CartaDefensiva("nombre", imagenCarta3, "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		//Se coge aleatoriamente del mazo
		Random r= new Random();
	    int randomNumber = r.nextInt(mazo.size());
	    Carta randomElement = mazo.get(randomNumber);
	    System.out.println("Elemento aleatorio: " + randomElement);
	    cartasEnMano.add(randomElement);
		Villano zemo = new Villano("Ultrón", imagenBZ, mazo, cartasEnMano, (byte) 60, (byte) 100);
		return zemo;
	}
	
	public static Villano cargarEbony() {
		BufferedImage imagenEM = null;
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		BufferedImage imagenCarta1 = null;
		CartaOfensiva carta1 = new CartaOfensiva("nombre", imagenCarta1, "descripcion", (byte)10);
		BufferedImage imagenCarta2 = null;
		CartaOfensiva carta2 = new CartaOfensiva("nombre", imagenCarta2, "descripcion", (byte)10);
		BufferedImage imagenCarta3 = null;
		CartaDefensiva carta3 = new CartaDefensiva("nombre", imagenCarta3, "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		//Se coge aleatoriamente del mazo
		Random r= new Random();
	    int randomNumber = r.nextInt(mazo.size());
	    Carta randomElement = mazo.get(randomNumber);
	    System.out.println("Elemento aleatorio: " + randomElement);
	    cartasEnMano.add(randomElement);
		Villano ebony = new Villano("Ultrón", imagenEM, mazo, cartasEnMano, (byte) 60, (byte) 100);
		return ebony;
	}
	
	public static Villano cargarKang() {
		BufferedImage imagenKC = null;
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		BufferedImage imagenCarta1 = null;
		CartaOfensiva carta1 = new CartaOfensiva("nombre", imagenCarta1, "descripcion", (byte)10);
		BufferedImage imagenCarta2 = null;
		CartaOfensiva carta2 = new CartaOfensiva("nombre", imagenCarta2, "descripcion", (byte)10);
		BufferedImage imagenCarta3 = null;
		CartaDefensiva carta3 = new CartaDefensiva("nombre", imagenCarta3, "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		//Se coge aleatoriamente del mazo
		Random r= new Random();
	    int randomNumber = r.nextInt(mazo.size());
	    Carta randomElement = mazo.get(randomNumber);
	    System.out.println("Elemento aleatorio: " + randomElement);
	    cartasEnMano.add(randomElement);
		Villano kang = new Villano("Ultrón", imagenKC, mazo, cartasEnMano, (byte) 60, (byte) 100);
		return kang;
	}
	
	public static Villano cargarThanos() {
		BufferedImage imagenT = null;
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		BufferedImage imagenCarta1 = null;
		CartaOfensiva carta1 = new CartaOfensiva("nombre", imagenCarta1, "descripcion", (byte)10);
		BufferedImage imagenCarta2 = null;
		CartaOfensiva carta2 = new CartaOfensiva("nombre", imagenCarta2, "descripcion", (byte)10);
		BufferedImage imagenCarta3 = null;
		CartaDefensiva carta3 = new CartaDefensiva("nombre", imagenCarta3, "descripcion", (byte)10);
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		//Se coge aleatoriamente del mazo
		Random r= new Random();
	    int randomNumber = r.nextInt(mazo.size());
	    Carta randomElement = mazo.get(randomNumber);
	    System.out.println("Elemento aleatorio: " + randomElement);
	    cartasEnMano.add(randomElement);
		Villano thanos = new Villano("Ultrón", imagenT, mazo, cartasEnMano, (byte) 60, (byte) 120);
		return thanos;
	}
}
