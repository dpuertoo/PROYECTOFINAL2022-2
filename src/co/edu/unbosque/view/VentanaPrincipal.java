package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public final static String REGISTRARSE = "RESGISTRARSE";
	public final static String SIGUIENTE = "SIGUIENTE";
	public final static String SALIR = "SALIR";

	private JLabel fondo;
	private JTextField txtUsuario;
	private JTextField txtContra;
	private JButton butRegistrarse, butSiguiente, butSalir;

	public VentanaPrincipal() {

		setLayout(null);
		setSize(600, 450);
		setResizable(false);
		this.setUndecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		this.txtUsuario = new JTextField();
		this.txtUsuario.setBounds(330, 190, 200, 30);
		this.txtUsuario.setBorder(null);

		this.txtContra = new JTextField();
		this.txtContra.setBounds(330, 250, 200, 30);
		this.txtContra.setBorder(null);

		this.butRegistrarse = new JButton();
		this.butRegistrarse.setIcon(new ImageIcon("./Img/BotonRegistrarse.png"));
		this.butRegistrarse.setBounds(80, 340, 170, 50);
		this.butRegistrarse.setActionCommand(REGISTRARSE);
		this.butRegistrarse.setBorder(null);

		this.butSiguiente = new JButton();
		this.butSiguiente.setIcon(new ImageIcon("./Img/BotonSiguiente.png"));
		this.butSiguiente.setBounds(350, 340, 170, 50);
		this.butSiguiente.setActionCommand(SIGUIENTE);
		this.butSiguiente.setBorder(null);
		this.butSiguiente.setContentAreaFilled(false);

		this.butSalir = new JButton();
		this.butSalir.setContentAreaFilled(false);
		this.butSalir.setBorder(null);
		this.butSalir.setBounds(558, 13, 30, 30);
		this.butSalir.setActionCommand(SALIR);

		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 600, 450);
		BufferedImage bi2 = null;
		try {
			bi2 = ImageIO.read(new File("./Img/FondoVp.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado2 = bi2.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
		fondo.setIcon(new ImageIcon(redimensionado2));
		fondo.setVisible(true);

		add(txtUsuario);
		add(txtContra);
		add(butRegistrarse);
		add(butSiguiente);
		add(butSalir);
		add(fondo);

	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtContra() {
		return txtContra;
	}

	public void setTxtContra(JTextField txtContra) {
		this.txtContra = txtContra;
	}

	public JButton getButRegistrarse() {
		return butRegistrarse;
	}

	public void setButRegistrarse(JButton butRegistrarse) {
		this.butRegistrarse = butRegistrarse;
	}

	public JButton getButSiguiente() {
		return butSiguiente;
	}

	public void setButSiguiente(JButton butSiguiente) {
		this.butSiguiente = butSiguiente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getRegistrarse() {
		return REGISTRARSE;
	}

	public static String getSiguiente() {
		return SIGUIENTE;
	}

	public JButton getButSalir() {
		return butSalir;
	}

	public void setButSalir(JButton butSalir) {
		this.butSalir = butSalir;
	}

	public static String getSalir() {
		return SALIR;
	}

}
