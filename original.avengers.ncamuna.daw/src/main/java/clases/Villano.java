package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

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
		villanos.add(cargarSoldadoInvierno());
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
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Hechizo de Cetro", "Le lanza un hechizo al enemigo", (byte)16, ImageIO.read(new File(".\\Fotos\\HechizoCetro.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Engaño", "Engaña al enemigo y le ataca por sopresa", (byte)11, ImageIO.read(new File(".\\Fotos\\Engaño.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Lanzamiento de dagas", "Le lanza las dagas al enemigo que produce unos profundos cortes", (byte)12, ImageIO.read(new File(".\\Fotos\\LanzamientoDagas.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Ilusion", "Se cubre mediante una ilusion que crea", (byte)8, ImageIO.read(new File(".\\Fotos\\Ilusion.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Cambia Forma", "Se cambia de forma y despista al enemigo", (byte)5, ImageIO.read(new File(".\\Fotos\\CambiaForma.png")));
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
		Villano loki = new Villano("Loki", mazo, cartasEnMano, (byte) 30, (byte) 100);
		return loki;
	}
	
	public static Villano cargarUltron() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Ataque Drones", "Envia drones a los enemigos", (byte)9, ImageIO.read(new File(".\\Fotos\\AtaqueDrones.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Ataque Robots", "Envia robots centinelas a los enemigos", (byte)12, ImageIO.read(new File(".\\Fotos\\AtaqueRobots.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Lanza de dos puntas", "Le da un corte con la lanza al enemigo", (byte)13, ImageIO.read(new File(".\\Fotos\\LanzaDoble.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Armadura de Adamantium", "Le protege su armadura de adamantium", (byte)10, ImageIO.read(new File(".\\Fotos\\ArmaduraAdamantium.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Defensa Robotica", "Se cubre usando sus robots de escudo", (byte)5, ImageIO.read(new File(".\\Fotos\\DefensaRobotica.png")));
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
		Villano ultron = new Villano("Ultrón", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return ultron;
	}
	
	public static Villano cargarZemo() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Espada Espadachin", "Le da un espadazo al enemigo", (byte)10, ImageIO.read(new File(".\\Fotos\\EspadaEspadachín.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Experto en Pistola", "Dispara al enemigo", (byte)16, ImageIO.read(new File(".\\Fotos\\ExpertoPistola.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Manda Mercenarios", "Manda a sus mercenarios a atacar al enemigo", (byte)13, ImageIO.read(new File(".\\Fotos\\MandaMercenarios.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Experto Influyente", "Influye al enemigo y lo deja confuso y sin atacar", (byte)5, ImageIO.read(new File(".\\Fotos\\ExpertoInfluyente.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Maestro Engaño", "Engaña al enemigo para que no le ataque", (byte)7, ImageIO.read(new File(".\\Fotos\\MaestroEngaño.png")));
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
		Villano zemo = new Villano("Barón Zemo", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return zemo;
	}
	
	public static Villano cargarSoldadoInvierno() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Arma MK9", "Dispara al enemigo con un MK9", (byte)10, ImageIO.read(new File(".\\Fotos\\ArmaMK9.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Puñetazo Breazo Bionico", "Le da un puñetazo con su brazo bionico al enemigo", (byte)15, ImageIO.read(new File(".\\Fotos\\PuñetazoBionico.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Lanzagranadas", "Dispara al enemigo con un lanzagranadas", (byte)13, ImageIO.read(new File(".\\Fotos\\Lanzagranadas.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Escudo Brazo Bionico", "Se cubre con su brazo bionico", (byte)9, ImageIO.read(new File(".\\Fotos\\EscudoBionico.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Puerta de coche arrancado", "Se cubre con una puerta de un coche que ha arrancado", (byte)4, ImageIO.read(new File(".\\Fotos\\PuertaCoche.png")));
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
		Villano soldadoInvierno = new Villano("Soldado de Invierno", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return soldadoInvierno;
	}
	
	public static Villano cargarKang() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Pistola Avanzada", "Dispara al enemigo con una pistola avanzada tecnologicamente", (byte)11, ImageIO.read(new File(".\\Fotos\\PistolaAvanzada.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Lanzamiento de Soldados", "Lanza soldados al enemigo", (byte)13, ImageIO.read(new File(".\\Fotos\\LanzamientoSoldados.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Proyector Rayos", "Dispara al enemigo con un proyector de rayos", (byte)16, ImageIO.read(new File(".\\Fotos\\ProyectorRayos.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Pantalla de Defensa Antimateria", "Usa la pantalla antimateria para transformar cualquier ataque", (byte)10, ImageIO.read(new File(".\\Fotos\\PantallaAntimateria.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Armadura Neurocinetica", "Le protege su armadura neurocinetica", (byte)5, ImageIO.read(new File(".\\Fotos\\ArmaduraNeurocinetica.png")));
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
		Villano kang = new Villano("Kang El Conquistador", mazo, cartasEnMano, (byte) 60, (byte) 100);
		return kang;
	}
	
	public static Villano cargarThanos() {
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		try {
			CartaOfensiva carta1 = new CartaOfensiva("Espada de doble Filo", "Le da un corte al enemigo", (byte)9, ImageIO.read(new File(".\\Fotos\\EspadaFilo.png")));
			CartaOfensiva carta2 = new CartaOfensiva("Guantelete", "Ataca al enemigo con el guantelete y su poder", (byte)16, ImageIO.read(new File(".\\Fotos\\GuanteleteAtaque.png")));
			CartaOfensiva carta3 = new CartaOfensiva("Puñetazo con Armadura Uru", "Le da un puñetazo al enemigo con su armadura uru", (byte)12, ImageIO.read(new File(".\\Fotos\\PuñetazoUru.png")));
			CartaDefensiva carta4 = new CartaDefensiva("Armadura de Uru", "Se cubre con su armadura de uru", (byte)6, ImageIO.read(new File(".\\Fotos\\ArmaduraUru.png")));
			CartaDefensiva carta5 = new CartaDefensiva("Escudo Guantelete", "Se defiende con el guantelete y su poder", (byte)10, ImageIO.read(new File(".\\Fotos\\Guantelete.png")));
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
		Villano thanos = new Villano("Thanos", mazo, cartasEnMano, (byte) 60, (byte) 120);
		return thanos;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
