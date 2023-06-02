package interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PantallaWin extends JPanel {
	private Ventana ventana;
	
	@Override //Poner fondo en esta pantalla
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\Fotos\\win.jpg"));
			g.drawImage(fondo, 0,0,this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0,0,0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PantallaWin(Ventana v) {
		this.ventana=v;
		setLayout(null);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setBounds(310, 369, 114, 23);
		add(btnNewButton);
		
	}
}
