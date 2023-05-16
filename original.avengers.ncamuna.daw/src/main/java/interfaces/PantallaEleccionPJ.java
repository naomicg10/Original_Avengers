package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Font;

public class PantallaEleccionPJ extends JPanel {
	private Ventana ventana;

	public PantallaEleccionPJ(Ventana v) {
		this.ventana = v;
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Ironman.png"));
		lblNewLabel.setBounds(160, 110, 89, 161);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(
				new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Captain America.png"));
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
		lblNewLabel_4
				.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Black Widow.png"));
		lblNewLabel_4.setBounds(698, 104, 83, 172);
		add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1
				.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Ojo_de_Halcon.png"));
		lblNewLabel_4_1.setBounds(821, 104, 83, 172);
		add(lblNewLabel_4_1);

		JRadioButton RadioButton = new JRadioButton("Capitán America");
		abrirVentana(RadioButton, ventana);
		RadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton.setForeground(new Color(255, 255, 255));
		RadioButton.setBounds(251, 278, 130, 23);
		RadioButton.setContentAreaFilled(false);
		add(RadioButton);

		final JRadioButton RadioButton_1 = new JRadioButton("Iron Man");
		abrirVentana(RadioButton_1, ventana);
		RadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_1.setForeground(new Color(255, 250, 250));
		RadioButton_1.setBounds(153, 278, 96, 23);
		RadioButton_1.setContentAreaFilled(false);
		add(RadioButton_1);

		JRadioButton RadioButton_2 = new JRadioButton("Thor");
		abrirVentana(RadioButton_2, ventana);
		RadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_2.setForeground(new Color(255, 255, 255));
		RadioButton_2.setBounds(419, 280, 68, 23);
		RadioButton_2.setContentAreaFilled(false);
		add(RadioButton_2);

		JRadioButton RadioButton_3 = new JRadioButton("Hulk");
		abrirVentana(RadioButton_3, ventana);
		RadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_3.setForeground(new Color(255, 255, 255));
		RadioButton_3.setBounds(566, 280, 68, 23);
		RadioButton_3.setContentAreaFilled(false);
		add(RadioButton_3);

		JRadioButton RadioButton_4 = new JRadioButton("Viuda Negra");
		abrirVentana(RadioButton_4, ventana);
		RadioButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_4.setForeground(new Color(255, 255, 255));
		RadioButton_4.setBounds(695, 278, 109, 23);
		RadioButton_4.setContentAreaFilled(false);
		add(RadioButton_4);

		JRadioButton RadioButton_5 = new JRadioButton("Ojo de Halcón");
		abrirVentana(RadioButton_5, ventana);
		RadioButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_5.setForeground(new Color(255, 255, 255));
		RadioButton_5.setBounds(820, 278, 109, 23);
		RadioButton_5.setContentAreaFilled(false);
		add(RadioButton_5);

		JLabel lblNewLabel_5 = new JLabel("\r\n");
		lblNewLabel_5.setIcon(
				new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\TituloEleccion.png"));
		lblNewLabel_5.setBounds(359, 11, 333, 61);
		add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Thanos.png"));
		lblNewLabel_6.setBounds(821, 333, 125, 190);
		add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(
				new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Kang.png"));
		lblNewLabel_6_1.setBounds(681, 343, 109, 180);
		add(lblNewLabel_6_1);

		JLabel lblNewLabel_6_2 = new JLabel("New label");
		lblNewLabel_6_2
				.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\EbonyMaw.png"));
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

		JRadioButton RadioButton_6 = new JRadioButton("Loki");
		abrirVentana(RadioButton_6, ventana);
		RadioButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_6.setForeground(new Color(255, 255, 255));
		RadioButton_6.setBounds(168, 530, 49, 23);
		RadioButton_6.setContentAreaFilled(false);
		add(RadioButton_6);

		JRadioButton RadioButton_7 = new JRadioButton("Ultrón");
		abrirVentana(RadioButton_7, ventana);
		RadioButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_7.setForeground(new Color(255, 255, 255));
		RadioButton_7.setBounds(278, 530, 62, 23);
		RadioButton_7.setContentAreaFilled(false);
		add(RadioButton_7);

		JRadioButton RadioButton_8 = new JRadioButton("Barón Zemo");
		abrirVentana(RadioButton_8, ventana);
		RadioButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_8.setForeground(new Color(255, 255, 255));
		RadioButton_8.setBounds(399, 530, 110, 23);
		RadioButton_8.setContentAreaFilled(false);
		add(RadioButton_8);

		JRadioButton RadioButton_9 = new JRadioButton("Ebony Maw");
		abrirVentana(RadioButton_9, ventana);
		RadioButton_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_9.setForeground(new Color(255, 255, 255));
		RadioButton_9.setBounds(566, 530, 93, 23);
		RadioButton_9.setContentAreaFilled(false);
		add(RadioButton_9);

		JRadioButton RadioButton_10 = new JRadioButton("Kang El Conquistador");
		abrirVentana(RadioButton_10, ventana);
		RadioButton_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_10.setForeground(new Color(255, 255, 255));
		RadioButton_10.setBounds(681, 530, 148, 23);
		RadioButton_10.setContentAreaFilled(false);
		add(RadioButton_10);

		JRadioButton RadioButton_11 = new JRadioButton("Thanos");
		abrirVentana(RadioButton_11, ventana);
		RadioButton_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_11.setForeground(new Color(255, 255, 255));
		RadioButton_11.setBounds(850, 530, 68, 23);
		RadioButton_11.setContentAreaFilled(false);
		add(RadioButton_11);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7
				.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\TituloHeroes.png"));
		lblNewLabel_7.setBounds(501, 83, 46, 14);
		add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(
				new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\TituloVillanos.png"));
		lblNewLabel_8.setBounds(499, 331, 56, 14);
		add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9
				.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\FondoEleccion.jpg"));
		lblNewLabel_9.setBounds(0, 0, 1060, 598);
		add(lblNewLabel_9);
	}

	private static void abrirVentana(final JRadioButton radioButton, final Ventana ventana) {
		radioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					ImageIcon icono = new ImageIcon(
							"C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\AvengersIcon.png");
					int opcion = JOptionPane.showOptionDialog(radioButton, "¿Quieres este personaje?", "Confirmación",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, null, null);

					if (opcion == JOptionPane.YES_OPTION) {
						System.out.println("Has hecho clic en el botón 'Aceptar'");
						ventana.cambiarAPantalla(PantallaNivel.class);
					} else if (opcion == JOptionPane.NO_OPTION) {
						System.out.println("Has hecho clic en el botón 'Cancelar'");
					}
				}
			}
		});
	}
}
