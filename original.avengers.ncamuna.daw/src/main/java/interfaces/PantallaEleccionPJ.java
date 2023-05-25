package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import clases.Carta;
import clases.CartaDefensiva;
import clases.CartaOfensiva;
import clases.Heroe;
import clases.Personaje;
import clases.Villano;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.SwingConstants;

public class PantallaEleccionPJ extends JPanel {
	private Ventana ventana;
	
	@Override //Poner fondo en esta pantalla
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\Fotos\\FondoEleccion.jpg"));
			g.drawImage(fondo, 0,0,this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0,0,0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PantallaEleccionPJ(Ventana v) {
		this.ventana = v;
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		JLabel LabelIM = new JLabel("");
		LabelIM.setHorizontalAlignment(SwingConstants.CENTER);
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Ironman.png"));
			Image enIcono=imagen.getScaledInstance(90, 165, Image.SCALE_SMOOTH);
			LabelIM.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelIM.setBounds(160, 110, 90, 163);
		add(LabelIM);

		JLabel LabelCA = new JLabel("");
		LabelCA.setHorizontalAlignment(SwingConstants.CENTER);
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Captain America.png"));
			Image enIcono=imagen.getScaledInstance(83, 165, Image.SCALE_SMOOTH);
			LabelCA.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelCA.setBounds(278, 108, 83, 165);
		add(LabelCA);

		JLabel LabelBB = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Thor.png"));
			Image enIcono=imagen.getScaledInstance(110, 165, Image.SCALE_SMOOTH);
			LabelBB.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelBB.setBounds(399, 108, 110, 165);
		add(LabelBB);

		JLabel LabelH = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Hulk.png"));
			Image enIcono=imagen.getScaledInstance(120, 170, Image.SCALE_SMOOTH);
			LabelH.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelH.setBounds(542, 110, 117, 163);
		add(LabelH);

		JLabel LabelVN = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Black Widow.png"));
			Image enIcono=imagen.getScaledInstance(83, 172, Image.SCALE_SMOOTH);
			LabelVN.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelVN.setBounds(698, 104, 83, 172);
		add(LabelVN);

		JLabel LabelOH = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Ojo_de_Halcon.png"));
			Image enIcono=imagen.getScaledInstance(83, 172, Image.SCALE_SMOOTH);
			LabelOH.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelOH.setBounds(821, 104, 83, 172);
		add(LabelOH);
		
		ArrayList <Villano> villanos = Villano.getVillanos();
		Villano villano = Villano.villanoAleatorio(villanos);
		ArrayList <Heroe> heroes = Heroe.getHeroes();
		Heroe heroe = Heroe.heroeAleatorio(heroes);  
//		((Heroe)ventana.personaje).getHeroes();
		
		JRadioButton RadioButton_CA = new JRadioButton("Capitán America");
		RadioButton_CA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Heroe.cargarCapipaleta();
			}
		});
		Heroe capipaleta = Heroe.cargarCapipaleta();
		abrirVentana(RadioButton_CA, ventana, capipaleta, villano);
		RadioButton_CA.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_CA.setForeground(new Color(255, 255, 255));
		RadioButton_CA.setBounds(251, 278, 130, 23);
		RadioButton_CA.setContentAreaFilled(false);
		add(RadioButton_CA);

		final JRadioButton RadioButton_IM = new JRadioButton("Iron Man");
		RadioButton_IM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Heroe.cargarIronMan();
			}
		});
//		Heroe ironman = ((Heroe)ventana.personaje).cargarIronMan();
		Heroe ironman = Heroe.cargarIronMan();
		abrirVentana(RadioButton_IM, ventana, ironman, villano);
		RadioButton_IM.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_IM.setForeground(new Color(255, 250, 250));
		RadioButton_IM.setBounds(153, 278, 96, 23);
		RadioButton_IM.setContentAreaFilled(false);
		add(RadioButton_IM);

		JRadioButton RadioButton_BB = new JRadioButton("Thor");
		RadioButton_BB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Heroe.cargarThor();
			}
		});
		Heroe thor = Heroe.cargarThor();
		abrirVentana(RadioButton_BB, ventana, thor, villano);
		RadioButton_BB.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_BB.setForeground(new Color(255, 255, 255));
		RadioButton_BB.setBounds(419, 280, 68, 23);
		RadioButton_BB.setContentAreaFilled(false);
		add(RadioButton_BB);

		JRadioButton RadioButton_H = new JRadioButton("Hulk");
		RadioButton_H.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Heroe.cargarHulk();
			}
		});
		Heroe hulk = Heroe.cargarHulk();
		abrirVentana(RadioButton_H, ventana, hulk, villano);
		RadioButton_H.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_H.setForeground(new Color(255, 255, 255));
		RadioButton_H.setBounds(566, 280, 68, 23);
		RadioButton_H.setContentAreaFilled(false);
		add(RadioButton_H);

		JRadioButton RadioButton_VN = new JRadioButton("Viuda Negra");
		RadioButton_VN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Heroe.cargarViudaNegra();
			}
		});
		Heroe viudaNegra = Heroe.cargarViudaNegra();
		abrirVentana(RadioButton_VN, ventana, viudaNegra, villano);
		RadioButton_VN.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_VN.setForeground(new Color(255, 255, 255));
		RadioButton_VN.setBounds(695, 278, 109, 23);
		RadioButton_VN.setContentAreaFilled(false);
		add(RadioButton_VN);

		JRadioButton RadioButton_OH = new JRadioButton("Ojo de Halcón");
		RadioButton_OH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Heroe.cargarOjoHalcon();
			}
		});
		Heroe ojoHalcon = Heroe.cargarOjoHalcon();
		abrirVentana(RadioButton_OH, ventana, ojoHalcon, villano);
		RadioButton_OH.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_OH.setForeground(new Color(255, 255, 255));
		RadioButton_OH.setBounds(820, 278, 109, 23);
		RadioButton_OH.setContentAreaFilled(false);
		add(RadioButton_OH);

		JLabel LabelTituloEleccion = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\TituloEleccion.png"));
			Image enIcono=imagen.getScaledInstance(333, 61, Image.SCALE_SMOOTH);
			LabelTituloEleccion.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelTituloEleccion.setBounds(359, 11, 333, 61);
		add(LabelTituloEleccion);

		JLabel LabelT = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Thanos.png"));
			Image enIcono=imagen.getScaledInstance(125, 190, Image.SCALE_SMOOTH);
			LabelT.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelT.setBounds(821, 333, 125, 190);
		add(LabelT);

		JLabel LabelKC = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Kang.png"));
			Image enIcono=imagen.getScaledInstance(109, 180, Image.SCALE_SMOOTH);
			LabelKC.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelKC.setBounds(681, 343, 109, 180);
		add(LabelKC);

		JLabel LabelEM = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\EbonyMaw.png"));
			Image enIcono=imagen.getScaledInstance(105, 210, Image.SCALE_SMOOTH);
			LabelEM.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelEM.setBounds(556, 343, 103, 180);
		add(LabelEM);

		JLabel LabelBZ = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Zemo.png"));
			Image enIcono=imagen.getScaledInstance(77, 172, Image.SCALE_SMOOTH);
			LabelBZ.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelBZ.setBounds(410, 351, 77, 172);
		add(LabelBZ);

		JLabel LabelU = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Ultron.png"));
			Image enIcono=imagen.getScaledInstance(96, 180, Image.SCALE_SMOOTH);
			LabelU.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelU.setBounds(265, 343, 96, 180);
		add(LabelU);

		JLabel LabelL = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Loki.png"));
			Image enIcono=imagen.getScaledInstance(89, 180, Image.SCALE_SMOOTH);
			LabelL.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelL.setBounds(143, 343, 89, 180);
		add(LabelL);

		JRadioButton RadioButton_L = new JRadioButton("Loki");
		RadioButton_L.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Villano.cargarLoki();
			}
		});
		Villano loki = Villano.cargarLoki();
		abrirVentana(RadioButton_L, ventana, heroe, loki);
		RadioButton_L.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_L.setForeground(new Color(255, 255, 255));
		RadioButton_L.setBounds(168, 530, 49, 23);
		RadioButton_L.setContentAreaFilled(false);
		add(RadioButton_L);

		JRadioButton RadioButton_U = new JRadioButton("Ultrón");
		RadioButton_U.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Villano.cargarUltron();
			}
		});
		Villano ultron = Villano.cargarUltron();
		abrirVentana(RadioButton_U, ventana, heroe, ultron);
		RadioButton_U.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_U.setForeground(new Color(255, 255, 255));
		RadioButton_U.setBounds(278, 530, 62, 23);
		RadioButton_U.setContentAreaFilled(false);
		add(RadioButton_U);

		JRadioButton RadioButton_BZ = new JRadioButton("Barón Zemo");
		RadioButton_BZ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Villano.cargarZemo();
			}
		});
		Villano zemo = Villano.cargarZemo();
		abrirVentana(RadioButton_BZ, ventana, heroe, zemo);
		RadioButton_BZ.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_BZ.setForeground(new Color(255, 255, 255));
		RadioButton_BZ.setBounds(399, 530, 110, 23);
		RadioButton_BZ.setContentAreaFilled(false);
		add(RadioButton_BZ);

		JRadioButton RadioButton_EM = new JRadioButton("Ebony Maw");
		RadioButton_EM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Villano.cargarZemo();
			}
		});
		Villano ebony = Villano.cargarEbony();
		abrirVentana(RadioButton_EM, ventana, heroe, ebony);
		RadioButton_EM.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_EM.setForeground(new Color(255, 255, 255));
		RadioButton_EM.setBounds(566, 530, 93, 23);
		RadioButton_EM.setContentAreaFilled(false);
		add(RadioButton_EM);

		JRadioButton RadioButton_KC = new JRadioButton("Kang El Conquistador");
		RadioButton_KC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Villano.cargarKang();
			}
		});
		Villano kang = Villano.cargarKang();
		abrirVentana(RadioButton_KC, ventana, heroe, kang);
		RadioButton_KC.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_KC.setForeground(new Color(255, 255, 255));
		RadioButton_KC.setBounds(681, 530, 148, 23);
		RadioButton_KC.setContentAreaFilled(false);
		add(RadioButton_KC);

		JRadioButton RadioButton_T = new JRadioButton("Thanos");
		RadioButton_T.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Villano.cargarThanos();
			}
		});
		Villano thanos = Villano.cargarThanos();
		abrirVentana(RadioButton_T, ventana, heroe, thanos);
		RadioButton_T.setFont(new Font("Tahoma", Font.BOLD, 11));
		RadioButton_T.setForeground(new Color(255, 255, 255));
		RadioButton_T.setBounds(850, 530, 68, 23);
		RadioButton_T.setContentAreaFilled(false);
		add(RadioButton_T);

		JLabel LabelTituloHeroes = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\TituloHeroes.png"));
			Image enIcono=imagen.getScaledInstance(46, 14, Image.SCALE_SMOOTH);
			LabelTituloHeroes.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelTituloHeroes.setBounds(501, 83, 46, 14);
		add(LabelTituloHeroes);

		JLabel LabelTituloVillanos = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\TituloVillanos.png"));
			Image enIcono=imagen.getScaledInstance(46, 14, Image.SCALE_SMOOTH);
			LabelTituloVillanos.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelTituloVillanos.setBounds(499, 331, 56, 14);
		add(LabelTituloVillanos);
	}

	private static void abrirVentana(final JRadioButton radioButton, final Ventana ventana, Heroe heroe, Villano villano) {
		radioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					ImageIcon icono = new ImageIcon(
							"C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\AvengersIcon.png");
					int opcion = JOptionPane.showOptionDialog(radioButton, "¿Quieres este personaje?", "Confirmación",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, null, null);

					if (opcion == JOptionPane.YES_OPTION) {
						System.out.println("Has hecho clic en el botón 'Aceptar'");
						ventana.interfazCombate(PantallaNivel.class, null, null);
					} else if (opcion == JOptionPane.NO_OPTION) {
						System.out.println("Has hecho clic en el botón 'Cancelar'");
					}
				}
			}
		});
	}
	
}
	

