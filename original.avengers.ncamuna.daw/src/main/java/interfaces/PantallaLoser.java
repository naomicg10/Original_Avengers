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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaLoser extends JPanel{
	private Ventana ventana;
	
	public PantallaLoser(Ventana v) {
		setBackground(new Color(0, 0, 0));
		this.ventana=v;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GAME OVER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(0, 0, 841, 516);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaEleccionPJ.class);
			}
		});
		btnNewButton.setBounds(375, 370, 89, 23);
		add(btnNewButton);
		
		 
	}

}
