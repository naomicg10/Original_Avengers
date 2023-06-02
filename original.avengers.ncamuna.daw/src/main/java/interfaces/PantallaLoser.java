package interfaces;

import javax.swing.JPanel;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class PantallaLoser extends JPanel{
	private Ventana ventana;
	
	public PantallaLoser(Ventana v) {
		setBackground(new Color(0, 0, 0));
		this.ventana=v;
		setLayout(null);
		
		 JLabel lblNewLabel = new JLabel();
	        BufferedImage imagen;
	        try {
	            imagen = ImageIO.read(new File(".\\Fotos\\loserIcon.gif"));
	            Image enIcono = imagen.getScaledInstance(90, 165, Image.SCALE_SMOOTH);
	            lblNewLabel.setIcon(new ImageIcon(enIcono));
	        } catch (IOException e) {
	            // Mostrar un mensaje de error en lugar de imprimir la excepción
	            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	        lblNewLabel.setBounds(182, 99, 432, 340); // Establecer el tamaño de la etiqueta
	        add(lblNewLabel);
	}

}
