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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.SwingConstants;

import clases.Usuario;
import excepciones.ClienteNoExisteException;
import excepciones.ContraseñaInvalidaExcepcion;

public class PantallaLogin extends JPanel {
	private JTextField txtUsuario;
	private Ventana ventana;
	private JPasswordField password;

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

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Titulo.png"));
		lblNewLabel_3.setBounds(52, 98, 227, 51);
		add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(
				new ImageIcon("C:\\Users\\naomi\\OneDrive\\Documentos\\Original_Avengers\\Avengers login.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1060, 597);
		add(lblNewLabel_2);
	}
}
