package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import clases.Heroe;
import clases.Villano;

import java.awt.Color;
import java.util.Random;

import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class PantallaNivel extends JPanel {
	private Heroe heroe;
	private Villano villano;

	public PantallaNivel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\fondo6.jpg"));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(0, 0, 1060, 598);
		add(lblNewLabel);
	}
	
	public PantallaNivel(Heroe heroe, Villano villano) {
		this.heroe = heroe;
		this.villano = villano;
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\fondo6.jpg"));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(0, 0, 1060, 598);
		add(lblNewLabel);
	}
	

}
