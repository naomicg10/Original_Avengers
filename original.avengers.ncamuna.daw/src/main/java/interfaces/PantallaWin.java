package interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setBackground(new Color(255, 255, 255));
		this.ventana=v;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOU WIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(0, 0, 746, 481);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaEleccionPJ.class);
			}
		});
		btnNewButton.setBounds(332, 370, 89, 23);
		add(btnNewButton);
		
	}
}
