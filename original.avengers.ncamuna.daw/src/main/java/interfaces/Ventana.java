package interfaces;

import javax.swing.JFrame;

import clases.Heroe;
import clases.Usuario;
import clases.Villano;

public class Ventana extends JFrame {
	protected Usuario clienteLogado;
	protected Usuario clienteRegistrado;
	public Ventana() {
		this.setSize(1060, 620);
		this.setTitle("Original Avengers");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaLogin(this));
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
		
		this.getContentPane().setVisible(true);
	}
	
	public void interfazCombate(Class<?> clase, Heroe heroe, Villano villano) {
		this.getContentPane().setVisible(false);
		if (clase.equals(PantallaNivel.class)) {
			this.setContentPane(new PantallaNivel(heroe, villano));
		}
		this.getContentPane().setVisible(true);
	}
}
