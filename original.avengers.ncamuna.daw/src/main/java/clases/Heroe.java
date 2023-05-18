package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Heroe extends Personaje{

	public Heroe(String nombre, BufferedImage imagen, ArrayList<Carta> mazo, ArrayList<Carta> cartasEnMano,
			byte defensa, byte vida) {
		super(nombre, imagen, mazo, cartasEnMano, defensa, vida);
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList <Heroe> getHeroes(){
		ArrayList<Heroe> heroes = new ArrayList<Heroe>();
		heroes.add(cargarCapipaleta());
		heroes.add(cargarIronMan());
		heroes.add(cargarThor());
		heroes.add(cargarHulk());
		heroes.add(cargarViudaNegra());
		heroes.add(cargarOjoHalcon());
		return heroes;
	}
	
	public static Heroe heroeAleatorio(ArrayList <Heroe> heroes) {
		Random r= new Random();
	    int randomNumber = r.nextInt(heroes.size());
	    Heroe randomElement = heroes.get(randomNumber);
	    System.out.println("Elemento aleatorio: " + randomElement);
	    return heroes.get(randomNumber);
	}
	
	public static Heroe cargarCapipaleta() {
		BufferedImage imagenCA = null;
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
		Heroe capipaleta = new Heroe("Capitán America", imagenCA, mazo, cartasEnMano, (byte) 70, (byte) 100);
		return capipaleta;
	}

	public static Heroe cargarIronMan() {
		BufferedImage imagenIM = null;
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
		Heroe ironman = new Heroe("Iron Man", imagenIM, mazo, cartasEnMano, (byte) 90, (byte) 100);
		return ironman;
	}
	
	public static Heroe cargarThor() {
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
		Heroe thor = new Heroe("Thor", imagenT, mazo, cartasEnMano, (byte) 70, (byte) 100);
		return thor;
	}
	
	public static Heroe cargarHulk() {
		BufferedImage imagenH = null;
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
		Heroe hulk = new Heroe("Hulk", imagenH, mazo, cartasEnMano, (byte) 80, (byte) 120);
		return hulk;
	}
	
	public static Heroe cargarViudaNegra() {
		BufferedImage imagenVN = null;
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
		Heroe viudaNegra = new Heroe("Viuda Negra", imagenVN, mazo, cartasEnMano, (byte) 50, (byte) 100);
		return viudaNegra;
	}
	
	public static Heroe cargarOjoHalcon() {
		BufferedImage imagenOH = null;
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
		Heroe ojoHalcon = new Heroe("Ojo de Halcón", imagenOH, mazo, cartasEnMano, (byte) 50, (byte) 100);
		return ojoHalcon;
	}
}
