package interfaces;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import clases.Heroe;
import clases.Personaje;
import clases.Usuario;
import clases.Villano;

public class Ventana extends JFrame {
	protected Usuario clienteLogado;
	protected Usuario clienteRegistrado;
	protected Personaje personaje;
	protected Personaje personaje2;
	
	public Ventana() {
		this.setSize(1075, 635);
		this.setTitle("Original Avengers");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaLogin(this));
		this.setIconImage(new ImageIcon("./Fotos/AvengersIcon.png").getImage());
		this.setVisible(true);
	}

	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if (clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if (clase.equals(PantallaEleccionPJ.class)) {
			this.setContentPane(new PantallaEleccionPJ(this));
		}
		if(clase.equals(PantallaNivel.class)) {
			this.setContentPane(new PantallaNivel(this));
		}
		if(clase.equals(PantallaWin.class)) {
			this.setContentPane(new PantallaNivel(this));
		}
		if(clase.equals(PantallaLoser.class)) {
			this.setContentPane(new PantallaNivel(this));
		}
		
		this.getContentPane().setVisible(true);
	}
	
//	public void interfazCombate(Class<?> clase, Heroe heroe, Villano villano) {
//		this.getContentPane().setVisible(false);
//		if (clase.equals(PantallaNivel.class)) {
//			this.setContentPane(new PantallaNivel(heroe, villano,(this)));
//		}
//		this.getContentPane().setVisible(true);
//	}
	
}
