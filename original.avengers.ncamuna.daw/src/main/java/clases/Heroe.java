package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Heroe extends Personaje{

	public Heroe(String nombre, ArrayList<Carta> mazo, ArrayList<Carta> cartasEnMano,
			byte defensa, byte vida) {
		super(nombre, mazo, cartasEnMano, defensa, vida);
		this.setNombre(nombre);
		this.setMazo(mazo);
		this.setCartasEnMano(cartasEnMano);
		this.setDefensa(defensa);
		this.setVida(vida);
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
	    return heroes.get(randomNumber);
	}
	
	public static Heroe cargarCapipaleta() {
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
		Heroe capipaleta = new Heroe("Capitán America", mazo, cartasEnMano, (byte) 70, (byte) 100);
		return capipaleta;
	}
	
	public static Heroe cargarIronMan() {
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
		Heroe ironman = new Heroe("Iron Man", mazo, cartasEnMano, (byte) 70, (byte) 100);
		return ironman;
	}

//		public Heroe cargarIronMan() {
////		BufferedImage imagenIM = null;
//		
////		BufferedImage imagenCarta1 = null;
//		CartaOfensiva carta1 = new CartaOfensiva("nombre", "descripcion", (byte)10);
////		BufferedImage imagenCarta2 = null;
//		CartaOfensiva carta2 = new CartaOfensiva("nombre", "descripcion", (byte)10);
////		BufferedImage imagenCarta3 = null;
//		CartaDefensiva carta3 = new CartaDefensiva("nombre", "descripcion", (byte)10);
//		this.getMazo().add(carta1);
//		this.getMazo().add(carta2);
//		this.getMazo().add(carta3);
//		
//		this.getCartasEnMano().add((CartaOfensiva)(this.getMazo().get(0)));
//		this.getCartasEnMano().add((CartaOfensiva)(this.getMazo().get(1)));
//		this.getCartasEnMano().add((CartaDefensiva)(this.getMazo().get(2)));
//		//Se coge aleatoriamente del mazo
//		Random r= new Random();
//	    int randomNumber = r.nextInt(this.getMazo().size());
//	    Carta randomElement = this.getMazo().get(randomNumber);
//	    this.getCartasEnMano().add(randomElement);
//		Heroe ironman = new Heroe("Iron Man", this.getMazo(), this.getCartasEnMano(), (byte) 90, (byte) 100);
//		return ironman;
//	}
	
	public static Heroe cargarThor() {
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
		Heroe thor = new Heroe("Thor", mazo, cartasEnMano, (byte) 70, (byte) 100);
		return thor;
	}
	
	public static Heroe cargarHulk() {
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
		Heroe hulk = new Heroe("Hulk", mazo, cartasEnMano, (byte) 80, (byte) 120);
		return hulk;
	}
	
	public static Heroe cargarViudaNegra() {
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
		Heroe viudaNegra = new Heroe("Viuda Negra", mazo, cartasEnMano, (byte) 50, (byte) 100);
		return viudaNegra;
	}
	
	public static Heroe cargarOjoHalcon() {
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
		Heroe ojoHalcon = new Heroe("Ojo de Halcón", mazo, cartasEnMano, (byte) 50, (byte) 100);
		return ojoHalcon;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
