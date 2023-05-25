package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.SwingConstants;

import clases.Usuario;
import excepciones.ClienteNoExisteException;
import excepciones.ContraseñaInvalidaExcepcion;

public class PantallaLogin extends JPanel {
	private JTextField txtUsuario;
	private Ventana ventana;
	private JPasswordField password;
	
	@Override //Poner fondo en esta pantalla
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\Fotos\\Avengers login.jpg"));
			g.drawImage(fondo, 0,0,this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0,0,0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PantallaLogin(Ventana v) {
		this.ventana = v;
		setBackground(new Color(211, 211, 211));
		setLayout(null);

		JButton btnLogin = new JButton("Iniciar Sesión");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre = txtUsuario.getText();
				char[] contraseña = password.getPassword();
				String contraseña1 = "";
				System.out.println(nombre + " : " + contraseña1);
				for (byte i = 0; i < contraseña.length; i++) {
					contraseña1 += contraseña[i];
				}
				try {
					ventana.clienteLogado=new Usuario(nombre,contraseña1);
					JOptionPane.showMessageDialog(ventana, "Bienvenid@, "
							+ventana.clienteLogado.getNombre(),"Inicio de sesión exitoso",
							JOptionPane.INFORMATION_MESSAGE);
					ventana.cambiarAPantalla(PantallaEleccionPJ.class);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(),
							"Login fallido", JOptionPane.ERROR_MESSAGE);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClienteNoExisteException e1) {
					JOptionPane.showMessageDialog(ventana, "El cliente no existe",
							"Login fallido",JOptionPane.ERROR_MESSAGE);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ContraseñaInvalidaExcepcion e1) {
					JOptionPane.showMessageDialog(ventana, "La contraseña no existe",
							"Login fallido",JOptionPane.ERROR_MESSAGE);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnLogin.setToolTipText("Pincha aquí para logearte");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(90, 344, 127, 30);
		add(btnLogin);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(90, 217, 127, 19);
		add(txtUsuario);
		txtUsuario.setColumns(10);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro.class);
			}
		});
		btnRegistrarse.setToolTipText("Pincha aquí para logearte");
		btnRegistrarse.setBounds(90, 411, 127, 19);
		add(btnRegistrarse);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(90, 220, 45, 13);
		add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(90, 194, 127, 13);
		add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(90, 263, 127, 13);
		add(lblContrasea);

		password = new JPasswordField();
		password.setBounds(90, 287, 127, 20);
		add(password);

		JLabel LabelTitulo = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Titulo.png"));
			Image enIcono=imagen.getScaledInstance(225, 40, Image.SCALE_SMOOTH);
			LabelTitulo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelTitulo.setBounds(52, 98, 227, 50);
		add(LabelTitulo);
	}
}
