package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class PantallaEleccionPJ extends JPanel{
	public PantallaEleccionPJ() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Ironman.png"));
		lblNewLabel.setBounds(160, 110, 89, 161);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Captain America.png"));
		lblNewLabel_1.setBounds(278, 108, 83, 165);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Thor.png"));
		lblNewLabel_2.setBounds(399, 108, 110, 165);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Hulk.png"));
		lblNewLabel_3.setBounds(542, 108, 117, 165);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Black Widow.png"));
		lblNewLabel_4.setBounds(698, 104, 83, 172);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Ojo_de_Halcon.png"));
		lblNewLabel_4_1.setBounds(821, 104, 83, 172);
		add(lblNewLabel_4_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Capitán America");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(251, 278, 130, 23);
		rdbtnNewRadioButton.setContentAreaFilled(false);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Iron Man");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 250, 250));
		rdbtnNewRadioButton_1.setBounds(153, 278, 96, 23);
		rdbtnNewRadioButton_1.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Thor");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBounds(419, 280, 68, 23);
		rdbtnNewRadioButton_2.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Hulk");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBounds(566, 280, 68, 23);
		rdbtnNewRadioButton_3.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Viuda Negra");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_4.setBounds(695, 278, 109, 23);
		rdbtnNewRadioButton_4.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Ojo de Halcón");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_5.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_5.setBounds(820, 278, 109, 23);
		rdbtnNewRadioButton_5.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_5 = new JLabel("\r\n");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\TituloEleccion.png"));
		lblNewLabel_5.setBounds(359, 11, 333, 61);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Thanos.png"));
		lblNewLabel_6.setBounds(821, 333, 125, 190);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Kang el conquistador.png"));
		lblNewLabel_6_1.setBounds(681, 343, 109, 180);
		add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("New label");
		lblNewLabel_6_2.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\EbonyMaw.png"));
		lblNewLabel_6_2.setBounds(556, 343, 103, 180);
		add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_4 = new JLabel("New label");
		lblNewLabel_6_4.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Zemo.png"));
		lblNewLabel_6_4.setBounds(410, 351, 77, 172);
		add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("New label");
		lblNewLabel_6_5.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Ultron.png"));
		lblNewLabel_6_5.setBounds(265, 343, 96, 180);
		add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("New label");
		lblNewLabel_6_6.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Loki.png"));
		lblNewLabel_6_6.setBounds(143, 343, 89, 180);
		add(lblNewLabel_6_6);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Loki");
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1.setBounds(168, 530, 49, 23);
		rdbtnNewRadioButton_1_1.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Ultrón");
		rdbtnNewRadioButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_2.setBounds(278, 530, 62, 23);
		rdbtnNewRadioButton_1_2.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("Barón Zemo");
		rdbtnNewRadioButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_3.setBounds(399, 530, 110, 23);
		rdbtnNewRadioButton_1_3.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("Ebony Maw");
		rdbtnNewRadioButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1_4.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_4.setBounds(566, 530, 93, 23);
		rdbtnNewRadioButton_1_4.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_5 = new JRadioButton("Kang El Conquistador");
		rdbtnNewRadioButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1_5.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_5.setBounds(681, 530, 148, 23);
		rdbtnNewRadioButton_1_5.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_1_5);
		
		JRadioButton rdbtnNewRadioButton_1_6 = new JRadioButton("Thanos");
		rdbtnNewRadioButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1_6.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_6.setBounds(850, 530, 68, 23);
		rdbtnNewRadioButton_1_6.setContentAreaFilled(false);
		add(rdbtnNewRadioButton_1_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\TituloHeroes.png"));
		lblNewLabel_7.setBounds(501, 83, 46, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\TituloVillanos.png"));
		lblNewLabel_8.setBounds(499, 331, 56, 14);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\FondoEleccion.jpg"));
		lblNewLabel_9.setBounds(0, 0, 1060, 598);
		add(lblNewLabel_9);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
