package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

import clases.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaRegistro extends JPanel {
	private Ventana ventana;
	private JTextField textUsuario;
	private JTextField textEmail;
	private JPasswordField password;
	private JTextField textFecha;
	
	@Override //Poner fondo en esta pantalla
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File(".\\Fotos\\Thanos registro.jpg"));
			g.drawImage(fondo, 0,0,this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0,0,0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PantallaRegistro(Ventana v) {
		this.ventana = v;
		setBackground(new Color(211, 211, 211));
		setLayout(null);

		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		textUsuario.setBounds(91, 215, 127, 19);
		add(textUsuario);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(91, 278, 127, 19);
		add(textEmail);

		password = new JPasswordField();
		password.setBounds(91, 341, 127, 19);
		add(password);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String nombre = textUsuario.getText();
					String email = textEmail.getText();
					char[] contraseña = password.getPassword();
					String contraseña1 = "";
					for (byte i = 0; i < contraseña.length; i++) {
						contraseña1 += contraseña[i];
					}
					String fechaNacimiento = textFecha.getText();
					new Usuario(nombre, contraseña1, email, fechaNacimiento);
					JOptionPane.showMessageDialog(ventana, "Registrado correctamente", "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);
					ventana.cambiarAPantalla(PantallaLogin.class);
				} catch (SQLIntegrityConstraintViolationException e3) {
                    JOptionPane.showMessageDialog(ventana, "El email ya existe", "No se pudo registrar",
                            JOptionPane.ERROR_MESSAGE);
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(ventana, e1.getMessage(), "No se puede conectar a la base de datos",
                            JOptionPane.ERROR_MESSAGE);
                }
			}
		});
		btnRegistrarse.setToolTipText("Pincha aquí para logearte");
		btnRegistrarse.setBounds(91, 444, 127, 30);
		add(btnRegistrarse);

		JButton btnLogin = new JButton("Iniciar Sesión");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		btnLogin.setToolTipText("Pincha aquí para logearte");
		btnLogin.setBounds(91, 504, 127, 19);
		add(btnLogin);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(91, 191, 127, 13);
		add(lblNewLabel);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(91, 254, 127, 13);
		add(lblEmail);

		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(91, 317, 127, 13);
		add(lblContrasea);

		JLabel LabelTitulo = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\Fotos\\Titulo.png"));
			Image enIcono=imagen.getScaledInstance(225, 40, Image.SCALE_SMOOTH);
			LabelTitulo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LabelTitulo.setBounds(49, 99, 227, 51);
		add(LabelTitulo);

		JLabel lblNewLabel_1 = new JLabel("Fecha Nacimiento");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(91, 371, 127, 14);
		add(lblNewLabel_1);

		textFecha = new JTextField();
		textFecha.setBounds(91, 396, 127, 20);
		add(textFecha);
		textFecha.setColumns(10);
	}
}
