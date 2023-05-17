package interfaces;

import javax.swing.JFrame;

import clases.Usuario;

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
		if (clase.equals(PantallaNivel.class)) {
			this.setContentPane(new PantallaNivel());
		}
		this.getContentPane().setVisible(true);
	}
	
	
}
