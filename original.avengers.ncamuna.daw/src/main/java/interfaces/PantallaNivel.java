package interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import clases.CartaDefensiva;
import clases.CartaOfensiva;
import clases.Heroe;
import clases.Villano;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaNivel extends JPanel {
	private Heroe heroe;
	private Villano villano;
	private Ventana ventana;
	private byte daño;
	private byte defensa;
	private byte dañoMaquina;
	private byte defensaMaquina;
	private byte azarMaquina;
	private Random cartasMaquina;
	private byte numeroTocado4;
	private byte numeroTocado3;
	private byte numeroTocado2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	@Override // Poner fondo en esta pantalla
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo = ImageIO.read(new File(".\\Fotos\\fondo6.jpg"));
			g.drawImage(fondo, 0, 0, this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0, 0, 0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PantallaNivel(Ventana v) {
		this.ventana = v;
		setLayout(null);
		this.cartasMaquina = new Random();
		this.azarMaquina = 0;
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 500, 1058, 98);
		add(scrollPane);

		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);

		Random r = new Random();
		byte azar = (byte) r.nextInt(0, 5);
		byte numeroTocado = azar;
		JLabel Carta2 = new JLabel("");
		Image escala = ventana.personaje.getMazo().get(azar).getImagen().getScaledInstance(140, 150, 0);
		Carta2.setIcon(new ImageIcon(escala));
		Carta2.setBounds(380, 343, 140, 150);
		add(Carta2);

		azar = (byte) r.nextInt(0, 5);
		while (numeroTocado == azar) {
			azar = (byte) r.nextInt(0, 5);
		}
		final byte numeroTocado1 = azar;
		JLabel Carta1 = new JLabel("");
		escala = ventana.personaje.getMazo().get(azar).getImagen().getScaledInstance(140, 150, 0);
		Carta1.setIcon(new ImageIcon(escala));
		Carta1.setBounds(222, 343, 140, 150);
		add(Carta1);

		azar = (byte) r.nextInt(0, 5);
		while (numeroTocado1 == azar) {
			azar = (byte) r.nextInt(0, 5);
		}
		JLabel Carta3 = new JLabel("");
		escala = ventana.personaje.getMazo().get(azar).getImagen().getScaledInstance(140, 150, 0);
		Carta3.setIcon(new ImageIcon(escala));
		Carta3.setBounds(540, 343, 140, 150);
		add(Carta3);

		azar = (byte) r.nextInt(0, 5);
		this.numeroTocado2 = azar;
		JLabel CartaIA3 = new JLabel("");
		escala = ventana.personaje2.getMazo().get(azar).getImagen().getScaledInstance(140, 150, 0);
		CartaIA3.setIcon(new ImageIcon(escala));
		CartaIA3.setBounds(662, 26, 140, 150);
		add(CartaIA3);

		azar = (byte) r.nextInt(0, 5);
		while (numeroTocado2 == azar) {
			azar = (byte) r.nextInt(0, 5);
		}
		this.numeroTocado3 = azar;
		JLabel CartaIA2 = new JLabel("");
		escala = ventana.personaje2.getMazo().get(azar).getImagen().getScaledInstance(140, 150, 0);
		CartaIA2.setIcon(new ImageIcon(escala));
		CartaIA2.setBounds(506, 26, 140, 150);
		add(CartaIA2);

		azar = (byte) r.nextInt(0, 5);
		while (numeroTocado3 == azar) {
			azar = (byte) r.nextInt(0, 5);
		}
		this.numeroTocado4 = azar;
		JLabel CartaIA1 = new JLabel("");
		escala = ventana.personaje2.getMazo().get(azar).getImagen().getScaledInstance(140, 150, 0);
		CartaIA1.setIcon(new ImageIcon(escala));
		CartaIA1.setBounds(346, 26, 140, 150);
		add(CartaIA1);

		final JRadioButton btnCarta1 = new JRadioButton("Ataque/Defensa");
		buttonGroup.add(btnCarta1);
		btnCarta1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnCarta1.isSelected()) {

					if (ventana.personaje.getMazo().get(numeroTocado1).getClass() == CartaOfensiva.class) {
						daño = ((CartaOfensiva) ventana.personaje.getMazo().get(numeroTocado1)).getDaño();
						textArea.append("\nHas atacado con: " + ventana.personaje.getMazo().get(numeroTocado1)
								+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa()) + "\nTe queda de vida: "
								+ (ventana.personaje.getVida()));
						azarMaquina = (byte) cartasMaquina.nextInt(0, 3);
						switch (azarMaquina) {
						case 0:
							if (ventana.personaje2.getMazo().get(numeroTocado4).getClass() == CartaOfensiva.class) {
								textArea.append("\nEl enemigo ha atacado con: "
										+ ventana.personaje2.getMazo().get(numeroTocado4) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado4))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}

								} else {
									ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
								}
							} else if (ventana.personaje2.getMazo().get(numeroTocado4)
									.getClass() == CartaDefensiva.class) {
								textArea.append("\nEl enemigo ha defendido con: "
										+ ventana.personaje2.getMazo().get(numeroTocado4) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
										.getDefensa() != 0) {
									if (daño <= ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
											.getDefensa()) {
										((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
												.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
														.get(numeroTocado4)).getDefensa() - daño));
									} else if (daño > ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
											.getDefensa()) {
										byte dañoRestante = (byte) (daño
												- ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
														.getDefensa());
										((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
												.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
														.get(numeroTocado4)).getDefensa() - daño));
										if (ventana.personaje2.getDefensa() != 0) {
											ventana.personaje2.setDefensa(
													(byte) (ventana.personaje2.getDefensa() - dañoRestante));
										} else {
											ventana.personaje2
													.setVida((byte) (ventana.personaje2.getVida() - dañoRestante));
										}
									}

								} else {
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								}
							}
							break;
						case 1:
							if (ventana.personaje2.getMazo().get(numeroTocado3).getClass() == CartaOfensiva.class) {
								textArea.append("\nEl enemigo ha atacado con: "
										+ ventana.personaje2.getMazo().get(numeroTocado3) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado3))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								} else {
									ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
								}
							} else if (ventana.personaje2.getMazo().get(numeroTocado3)
									.getClass() == CartaDefensiva.class) {
								textArea.append("\nEl enemigo ha defendido con: "
										+ ventana.personaje2.getMazo().get(numeroTocado3) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
										.getDefensa() != 0) {
									if (daño <= ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
											.getDefensa()) {
										((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
												.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
														.get(numeroTocado3)).getDefensa() - daño));
									} else if (daño > ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
											.getDefensa()) {
										byte dañoRestante = (byte) (daño
												- ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
														.getDefensa());
										((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
												.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
														.get(numeroTocado3)).getDefensa() - daño));
										if (ventana.personaje2.getDefensa() != 0) {
											ventana.personaje2.setDefensa(
													(byte) (ventana.personaje2.getDefensa() - dañoRestante));
										} else {
											ventana.personaje2
													.setVida((byte) (ventana.personaje2.getVida() - dañoRestante));
										}
									}
								}
							}
							break;
						case 2:

							if (ventana.personaje2.getMazo().get(numeroTocado2).getClass() == CartaOfensiva.class) {
								textArea.append("\nEl enemigo ha atacado con: "
										+ ventana.personaje2.getMazo().get(numeroTocado2) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado2))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
										if (ventana.personaje.getDefensa() != 0) {
											ventana.personaje
													.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
										} else {
											ventana.personaje
													.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
										}
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								} else if (ventana.personaje2.getMazo().get(numeroTocado2)
										.getClass() == CartaDefensiva.class) {
									textArea.append("\nEl enemigo ha defendido con: "
											+ ventana.personaje2.getMazo().get(numeroTocado2)
											+ "\nLe queda de defensa: " + (ventana.personaje2.getDefensa())
											+ "\nLe queda de vida: " + (ventana.personaje2.getVida()));
									if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
											.getDefensa() != 0) {
										if (daño <= ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
												.getDefensa()) {
											((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
													.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
															.get(numeroTocado2)).getDefensa() - daño));
										} else if (daño > ((CartaDefensiva) ventana.personaje2.getMazo()
												.get(numeroTocado2)).getDefensa()) {
											byte dañoRestante = (byte) (daño
													- ((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
															.getDefensa());
											((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
													.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
															.get(numeroTocado2)).getDefensa() - daño));
											if (ventana.personaje2.getDefensa() != 0) {
												ventana.personaje2.setDefensa(
														(byte) (ventana.personaje2.getDefensa() - dañoRestante));
											} else {
												ventana.personaje2
														.setVida((byte) (ventana.personaje2.getVida() - dañoRestante));
											}
										}
									}
								}
								break;
							}

						}

					} else if (ventana.personaje.getMazo().get(numeroTocado1).getClass() == CartaDefensiva.class) {
						defensa = ((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1)).getDefensa();
						azarMaquina = (byte) cartasMaquina.nextInt(0, 3);
						textArea.append("\nHas defendido con: " + ventana.personaje.getMazo().get(numeroTocado1)
								+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa()) + "\nTe queda de vida: "
								+ (ventana.personaje.getVida()));
						switch (azarMaquina) {
						case 0:
							if (ventana.personaje2.getMazo().get(numeroTocado4).getClass() == CartaOfensiva.class) {
								textArea.append("\nEl enemigo ha atacado con: "
										+ ventana.personaje2.getMazo().get(numeroTocado4) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado4)).getDaño();
								if (defensa != 0 && dañoMaquina <= defensa) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));

								} else if (defensa != 0 && dañoMaquina > defensa) {
									byte dañoRestante = (byte) (dañoMaquina - defensa);
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
									.setDefensa((byte) (defensa - dañoMaquina));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoRestante));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoRestante));
									}
								}else if(defensa==0&&ventana.personaje.getDefensa()!=0) {
									if(dañoMaquina>ventana.personaje.getDefensa()) {
										byte dañoRestante=(byte)(dañoMaquina-ventana.personaje.getDefensa());
										ventana.personaje.setVida((byte)(ventana.personaje.getVida()-dañoRestante));
									}
									ventana.personaje.setDefensa((byte)(ventana.personaje.getDefensa()-dañoMaquina));
								}else if(defensa==0&&ventana.personaje.getDefensa()==0) {
									ventana.personaje.setVida((byte)(ventana.personaje.getVida()-dañoMaquina));
								}
							}
							break;
						case 1:
							if (ventana.personaje2.getMazo().get(numeroTocado3).getClass() == CartaOfensiva.class) {
								textArea.append("\nEl enemigo ha atacado con: "
										+ ventana.personaje2.getMazo().get(numeroTocado3) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado3)).getDaño();
								if (defensa != 0 && dañoMaquina <= defensa) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								} else if (defensa != 0 && dañoMaquina > defensa) {
									byte dañoRestante = (byte) (dañoMaquina - defensa);
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
									.setDefensa((byte) (defensa - dañoMaquina));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoRestante));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoRestante));
									}
								}else if(defensa==0&&ventana.personaje.getDefensa()!=0) {
									if(dañoMaquina>ventana.personaje.getDefensa()) {
										byte dañoRestante=(byte)(dañoMaquina-ventana.personaje.getDefensa());
										ventana.personaje.setVida((byte)(ventana.personaje.getVida()-dañoRestante));
									}
									ventana.personaje.setDefensa((byte)(ventana.personaje.getDefensa()-dañoMaquina));
								}else if(defensa==0&&ventana.personaje.getDefensa()==0) {
									ventana.personaje.setVida((byte)(ventana.personaje.getVida()-dañoMaquina));
								}
							}
							break;
						case 2:

							if (ventana.personaje2.getMazo().get(numeroTocado2).getClass() == CartaOfensiva.class) {
								textArea.append("\nEl enemigo ha atacado con: "
										+ ventana.personaje2.getMazo().get(numeroTocado2) + "\nLe queda de defensa: "
										+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
										+ (ventana.personaje2.getVida()));
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado2)).getDaño();
								if (defensa != 0 && dañoMaquina <= defensa) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								}else if (defensa != 0 && dañoMaquina > defensa) {
									byte dañoRestante = (byte) (dañoMaquina - defensa);
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
									.setDefensa((byte) (defensa - dañoMaquina));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoRestante));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoRestante));
									}
								}else if(defensa==0&&ventana.personaje.getDefensa()!=0) {
									if(dañoMaquina>ventana.personaje.getDefensa()) {
										byte dañoRestante=(byte)(dañoMaquina-ventana.personaje.getDefensa());
										ventana.personaje.setVida((byte)(ventana.personaje.getVida()-dañoRestante));
									}
									ventana.personaje.setDefensa((byte)(ventana.personaje.getDefensa()-dañoMaquina));
								}else if(defensa==0&&ventana.personaje.getDefensa()==0) {
									ventana.personaje.setVida((byte)(ventana.personaje.getVida()-dañoMaquina));
								}
							}

						}
					}
					System.out.println(ventana.personaje);
					System.out.println(ventana.personaje2);
				}
			}
		});
		btnCarta1.setBounds(233, 313, 109, 23);
		add(btnCarta1);

		final JButton btnCarta2 = new JButton("Ataque/Defensa");
		buttonGroup.add(btnCarta2);
		btnCarta2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnCarta1.isSelected()) {

					if (ventana.personaje.getMazo().get(numeroTocado1).getClass() == CartaOfensiva.class) {
						daño = ((CartaOfensiva) ventana.personaje.getMazo().get(numeroTocado1)).getDaño();

						azarMaquina = (byte) cartasMaquina.nextInt(0, 3);
						switch (azarMaquina) {
						case 0:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado4)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado4) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado4).getClass() == CartaOfensiva.class) {
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado4))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}

								} else {
									ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
								}
							} else if (ventana.personaje2.getMazo().get(numeroTocado4)
									.getClass() == CartaDefensiva.class) {
								if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
										.getDefensa() != 0) {
									((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4)).setDefensa(
											(byte) (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
													.getDefensa() - daño));
								} else {
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								}
							}
							break;
						case 1:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado3)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado3) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado3).getClass() == CartaOfensiva.class) {
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado3))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								} else {
									ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
								}
							} else if (ventana.personaje2.getMazo().get(numeroTocado3)
									.getClass() == CartaDefensiva.class) {
								if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
										.getDefensa() != 0) {
									((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3)).setDefensa(
											(byte) (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
													.getDefensa() - daño));
								} else {
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								}
							}
							break;
						case 2:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado2)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado2) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado2).getClass() == CartaOfensiva.class) {
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado2))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
										if (ventana.personaje.getDefensa() != 0) {
											ventana.personaje
													.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
										} else {
											ventana.personaje
													.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
										}
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								} else if (ventana.personaje2.getMazo().get(numeroTocado2)
										.getClass() == CartaDefensiva.class) {
									if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
											.getDefensa() != 0) {
										((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
												.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
														.get(numeroTocado2)).getDefensa() - daño));
									} else {
										if (ventana.personaje2.getDefensa() != 0) {
											ventana.personaje2
													.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
										} else {
											ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
										}
									}
								}
								break;
							}

						}

					} else if (ventana.personaje.getMazo().get(numeroTocado1).getClass() == CartaDefensiva.class) {
						defensa = ((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1)).getDefensa();
						azarMaquina = (byte) cartasMaquina.nextInt(0, 3);
						switch (azarMaquina) {
						case 0:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado4)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado4) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado4).getClass() == CartaOfensiva.class) {
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado4)).getDaño();
								if (defensa != 0) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								} else {
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								}
							}
							break;
						case 1:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado3)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado3) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado3).getClass() == CartaOfensiva.class) {
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado3)).getDaño();
								if (defensa != 0) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								} else {
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								}
							}
							break;
						case 2:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado2)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado2) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado2).getClass() == CartaOfensiva.class) {
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado2)).getDaño();
								if (defensa != 0) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								} else {
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								}
							}

						}
					}
					System.out.println(ventana.personaje);
					System.out.println(ventana.personaje2);
				}
			}
		});
		btnCarta2.setBounds(380, 313, 140, 23);
		add(btnCarta2);

		final JButton btnCarta3 = new JButton("Ataque/Defensa");
		buttonGroup.add(btnCarta3);
		btnCarta3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnCarta1.isSelected()) {

					if (ventana.personaje.getMazo().get(numeroTocado1).getClass() == CartaOfensiva.class) {
						daño = ((CartaOfensiva) ventana.personaje.getMazo().get(numeroTocado1)).getDaño();

						azarMaquina = (byte) cartasMaquina.nextInt(0, 3);
						switch (azarMaquina) {
						case 0:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado4)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado4) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado4).getClass() == CartaOfensiva.class) {
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado4))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}

								} else {
									ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
								}
							} else if (ventana.personaje2.getMazo().get(numeroTocado4)
									.getClass() == CartaDefensiva.class) {
								if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
										.getDefensa() != 0) {
									((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4)).setDefensa(
											(byte) (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado4))
													.getDefensa() - daño));
								} else {
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								}
							}
							break;
						case 1:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado3)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado3) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado3).getClass() == CartaOfensiva.class) {
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado3))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								} else {
									ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
								}
							} else if (ventana.personaje2.getMazo().get(numeroTocado3)
									.getClass() == CartaDefensiva.class) {
								if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
										.getDefensa() != 0) {
									((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3)).setDefensa(
											(byte) (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado3))
													.getDefensa() - daño));
								} else {
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								}
							}
							break;
						case 2:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado2)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado2) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado2).getClass() == CartaOfensiva.class) {
								dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo().get(numeroTocado2))
										.getDaño();
								if (ventana.personaje2.getDefensa() != 0) {
									ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
									if (ventana.personaje2.getDefensa() != 0) {
										ventana.personaje2.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
										if (ventana.personaje.getDefensa() != 0) {
											ventana.personaje
													.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
										} else {
											ventana.personaje
													.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
										}
									} else {
										ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
									}
								} else if (ventana.personaje2.getMazo().get(numeroTocado2)
										.getClass() == CartaDefensiva.class) {
									if (((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
											.getDefensa() != 0) {
										((CartaDefensiva) ventana.personaje2.getMazo().get(numeroTocado2))
												.setDefensa((byte) (((CartaDefensiva) ventana.personaje2.getMazo()
														.get(numeroTocado2)).getDefensa() - daño));
									} else {
										if (ventana.personaje2.getDefensa() != 0) {
											ventana.personaje2
													.setDefensa((byte) (ventana.personaje2.getDefensa() - daño));
										} else {
											ventana.personaje2.setVida((byte) (ventana.personaje2.getVida() - daño));
										}
									}
								}
								break;
							}

						}

					} else if (ventana.personaje.getMazo().get(numeroTocado1).getClass() == CartaDefensiva.class) {
						defensa = ((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1)).getDefensa();
						azarMaquina = (byte) cartasMaquina.nextInt(0, 3);
						switch (azarMaquina) {
						case 0:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado4)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado4) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado4).getClass() == CartaOfensiva.class) {
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado4)).getDaño();
								if (defensa != 0) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								} else {
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								}
							}
							break;
						case 1:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado3)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado3) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado3).getClass() == CartaOfensiva.class) {
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado3)).getDaño();
								if (defensa != 0) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								} else {
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								}
							}
							break;
						case 2:
							textArea.append(
									"\nHas atacado/defendido con: " + ventana.personaje.getMazo().get(numeroTocado2)
											+ "\nTe queda de defensa: " + (ventana.personaje.getDefensa())
											+ "\nTe queda de vida: " + (ventana.personaje.getVida()));
							textArea.append("\nEl enemigo ha atacado/defendido con: "
									+ ventana.personaje2.getMazo().get(numeroTocado2) + "\nLe queda de defensa: "
									+ (ventana.personaje2.getDefensa()) + "\nLe queda de vida: "
									+ (ventana.personaje2.getVida()));
							if (ventana.personaje2.getMazo().get(numeroTocado2).getClass() == CartaOfensiva.class) {
								dañoMaquina = dañoMaquina = ((CartaOfensiva) ventana.personaje2.getMazo()
										.get(numeroTocado2)).getDaño();
								if (defensa != 0) {
									((CartaDefensiva) ventana.personaje.getMazo().get(numeroTocado1))
											.setDefensa((byte) (defensa - dañoMaquina));
								} else {
									if (ventana.personaje.getDefensa() != 0) {
										ventana.personaje
												.setDefensa((byte) (ventana.personaje.getDefensa() - dañoMaquina));
									} else {
										ventana.personaje.setVida((byte) (ventana.personaje.getVida() - dañoMaquina));
									}
								}
							}

						}
					}
					System.out.println(ventana.personaje);
					System.out.println(ventana.personaje2);
				}
			}
		});
		btnCarta3.setBounds(540, 313, 140, 23);
		add(btnCarta3);

//		System.out.println(ventana.personaje);
//		System.out.println(ventana.personaje2);

//		while(heroe.getVida()!=0&&villano.getVida()!=0) {
//			
//		}
	}
}
