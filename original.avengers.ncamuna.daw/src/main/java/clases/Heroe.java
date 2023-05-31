package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

public class Heroe extends Personaje{

	public Heroe(String nombre, ArrayList<Carta> mazo, ArrayList<Carta> cartasEnMano,
			byte defensa, byte vida) {
		super(nombre, mazo, cartasEnMano, defensa, vida);
		this.setNombre(nombre);
		this.setMazo(mazo);
		this.setCartasEnMano(cartasEnMano);
		this.setDefensa(defensa);
		this.setVida(vida);
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
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Patada Doble", "Pega una patada doble al enemigo", (byte)10, ImageIO.read(new File(".\\Fotos\\PatadaDoble.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Lanzamiento de Escudo", "Lanza el escudo al enemigo", (byte)16, ImageIO.read(new File(".\\Fotos\\LanzamientoEscudo.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Corte de Escudo", "Le da un corte con el escudo al enemigo", (byte)13, ImageIO.read(new File(".\\Fotos\\CorteEscudo.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Escudo Vibranium", "Se cubre con el escudo de vibranium", (byte)10, ImageIO.read(new File(".\\Fotos\\EscudoVibranium.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Escudo Estrella Vector", "Se cubre con el escudo estrella vector", (byte)5, ImageIO.read(new File(".\\Fotos\\EscudoEstrella.png")));
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		for (int i = 0; i < 3; i++) {
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		}
		Heroe capipaleta = new Heroe("Capitán America", mazo, cartasEnMano, (byte) 70, (byte) 100);
		return capipaleta;
	}
	
	public static Heroe cargarIronMan() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Rayo Repulsor", "Le dispara un rayo repulsor al enemigo", (byte)11, ImageIO.read(new File(".\\Fotos\\RayoRepulsor.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Unirrayo", "Le dispara toda la energia del reactor del pecho como rayo al enemigo", (byte)16, ImageIO.read(new File(".\\Fotos\\Unirrayo.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Laser de Alto Poder", "Le dispara con un laser de alto poder que le produce un fuerte corte al enemigo", (byte)20, ImageIO.read(new File(".\\Fotos\\LaserPoder.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Escudo Defelector", "Se cubre con el escudo metalico de su armadura", (byte)6, ImageIO.read(new File(".\\Fotos\\EscudoDefelector.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Escudo Energizado", "Se cubre con el escudo de energia de su armadura", (byte)10, ImageIO.read(new File(".\\Fotos\\EscudoEnergizado.png")));
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		for (int i = 0; i < 3; i++) {
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		}
		Heroe ironman = new Heroe("Iron Man", mazo, cartasEnMano, (byte) 70, (byte) 100);
		return ironman;
	}
	
	public static Heroe cargarThor() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Lanzamiento Jonathan", "Lanza el martillo al enemigo", (byte)14, ImageIO.read(new File(".\\Fotos\\LanzamientoJonathan.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Martillazo", "Le da un golpe con el martillo al enemigo", (byte)16, ImageIO.read(new File(".\\Fotos\\Martillazo.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Rayo Impactrueno", "Absorbe un rayo del cielo y lo dispara al enemigo", (byte)13, ImageIO.read(new File(".\\Fotos\\Impactrueno.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Cubre Mjolnir", "Se cubre con el martillo de los ataques", (byte)10, ImageIO.read(new File(".\\Fotos\\CubreMjolnir.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Armadura Asgardiana", "Su armadura asgardiana le protege de cualquier ataque", (byte)5, ImageIO.read(new File(".\\Fotos\\ArmaduraAsgardiana.png")));
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		for (int i = 0; i < 3; i++) {
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		}
		Heroe thor = new Heroe("Thor", mazo, cartasEnMano, (byte) 70, (byte) 100);
		return thor;
	}
	
	public static Heroe cargarHulk() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Lanzamiento de coche", "Lanza un coche al enemigo", (byte)13, ImageIO.read(new File(".\\Fotos\\LanzamientoCoche.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Lanzamiento de Pavimento", "Lanza el pavimento arrancado del suelo al enemigo", (byte)12, ImageIO.read(new File(".\\Fotos\\LanzamientoEscudo.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Puñetazo Brutal", "Le da un puñetazo brutal al enemigo", (byte)17, ImageIO.read(new File(".\\Fotos\\PuñetazoBrutal.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Escudo Enfurecimiento", "Se enfurece por el ataque enemigo y no le afecta ningun daño", (byte)10, ImageIO.read(new File(".\\Fotos\\EscudoEnfurecimiento.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Escudo Pavimento", "Se cubre con el pavimento que ha arrancado del suelo", (byte)5, ImageIO.read(new File(".\\Fotos\\EscudoPavimento.png")));
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		for (int i = 0; i < 3; i++) {
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		}
		Heroe hulk = new Heroe("Hulk", mazo, cartasEnMano, (byte) 80, (byte) 120);
		return hulk;
	}
	
	public static Heroe cargarViudaNegra() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Bastones Dobles", "Golpea al enemigo con los bastones dobles", (byte)14, ImageIO.read(new File(".\\Fotos\\BastonesDobles.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Pistolas Glock 26 Duales", "Dispara al enemigo con las pistolas duales", (byte)16, ImageIO.read(new File(".\\Fotos\\PistolasDual.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Patada Voladora", "Le da una patada voladora que tumba al enemigo", (byte)10, ImageIO.read(new File(".\\Fotos\\PatadaVoladora.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Disco de Humo", "Detona bomba de humo para aturdir a los enemigos y cegarlos de manera temporal", (byte)9, ImageIO.read(new File(".\\Fotos\\DiscoHumo.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Esquivar Ataque", "Esquiva el ataque enemigo con artes marciales", (byte)4, ImageIO.read(new File(".\\Fotos\\EsquivarAtaque.png")));
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		for (int i = 0; i < 3; i++) {
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		}
		Heroe viudaNegra = new Heroe("Viuda Negra", mazo, cartasEnMano, (byte) 50, (byte) 100);
		return viudaNegra;
	}
	
	public static Heroe cargarOjoHalcon() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Flechazo Triple", "Dispara tres flechas a la vez al enemigo", (byte)17, ImageIO.read(new File(".\\Fotos\\FlechazoTriple.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Flecha Trucada", "Dispara una flecha que esta trucada al enemigo", (byte)12, ImageIO.read(new File(".\\Fotos\\FlechaTrucada.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Tiro Seguro", "Dispara un tiro que 100% acierta al enemigo", (byte)13, ImageIO.read(new File(".\\Fotos\\TiroSeguro.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Cubre Arco", "Se cubre con su arco de los ataques enemigos", (byte)9, ImageIO.read(new File(".\\Fotos\\CubreArco.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Evitar Ataque", "Evita el ataque enemigo con artes marciales", (byte)4, ImageIO.read(new File(".\\Fotos\\EvitarAtaque.png")));
		mazo.add(carta1);
		mazo.add(carta2);
		mazo.add(carta3);
		mazo.add(carta4);
		mazo.add(carta5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
		Random r= new Random();
		for (int i = 0; i < 3; i++) {
		int randomNumber = r.nextInt(mazo.size());
		Carta randomElement = mazo.get(randomNumber);
		cartasEnMano.add(randomElement);
		}
		Heroe ojoHalcon = new Heroe("Ojo de Halcón", mazo, cartasEnMano, (byte) 50, (byte) 100);
		return ojoHalcon;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
