package interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import clases.Heroe;
import clases.Villano;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;


public class PantallaNivel extends JPanel {
	private Heroe heroe;
	private Villano villano;
	private Ventana ventana;
	
	@Override //Poner fondo en esta pantalla
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\Fotos\\fondo6.jpg"));
			g.drawImage(fondo, 0,0,this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0,0,0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PantallaNivel(Heroe heroe, Villano villano, Ventana v) {
		this.heroe = heroe;
		this.villano = villano;
		this.ventana=v;
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 500, 1058, 98);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setText("hola");
		textArea.append("\nmundo");
		
		System.out.println(Heroe.cargarCapipaleta());
		System.out.println(Heroe.cargarIronMan());
		System.out.println(Heroe.cargarThor());
		System.out.println(Heroe.cargarHulk());
		System.out.println(Heroe.cargarViudaNegra());
		System.out.println(Heroe.cargarOjoHalcon());
		
		System.out.println(Villano.cargarLoki());
		System.out.println(Villano.cargarUltron());
		System.out.println(Villano.cargarZemo());
		System.out.println(Villano.cargarEbony());
		System.out.println(Villano.cargarKang());
		System.out.println(Villano.cargarThanos());
		
//		while(heroe.getVida()!=0&&villano.getVida()!=0) {
//			
//		}
	}
	
	

}
