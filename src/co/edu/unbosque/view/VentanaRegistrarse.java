package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class VentanaRegistrarse extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final String FINALIZAR = "FINALIZAR";
	public static final String ATRAS = "ATRAS";

	private JLabel fondo;
	private JTextField txtNombre, txtApellido1, txtApellido2, txtUsuario, txtCorreo, txtEstatura, txtIngresos, txtContrasena;
	private JComboBox<String> sexo;
	private JRadioButton divorciosi, divorciono;
	private ButtonGroup grupo;
	private JButton butFinalizar, butAtras;
	private JDateChooser calendario;

	public VentanaRegistrarse() {
		setLayout(null);
		setSize(600, 450);
		setResizable(false);
		this.setUndecorated(true);
		setLocationRelativeTo(null);

		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 600, 450);
		BufferedImage bi2 = null;
		try {
			bi2 = ImageIO.read(new File("./Img/FondoVr.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado2 = bi2.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
		fondo.setIcon(new ImageIcon(redimensionado2));
		fondo.setVisible(true);

		this.txtNombre = new JTextField();
		this.txtNombre.setForeground(Color.GRAY);
		this.txtNombre.setBounds(145, 85, 130, 25);
		this.txtNombre.setBorder(null);

		this.txtApellido1 = new JTextField();
		this.txtApellido1.setForeground(Color.GRAY);
		this.txtApellido1.setBounds(410, 85, 75, 25);
		this.txtApellido1.setBorder(null);
		
		this.txtApellido2 = new JTextField();
		this.txtApellido2.setForeground(Color.GRAY);
		this.txtApellido2.setBounds(490, 85, 75, 25);
		this.txtApellido2.setBorder(null);

		this.txtUsuario = new JTextField();
		this.txtUsuario.setForeground(Color.GRAY);
		this.txtUsuario.setBounds(145, 120, 255, 25);
		this.txtUsuario.setBorder(null);

		this.txtCorreo = new JTextField();
		this.txtCorreo.setForeground(Color.GRAY);
		this.txtCorreo.setBounds(145, 155, 255, 25);
		this.txtCorreo.setBorder(null);

		this.calendario = new JDateChooser("dd/MM/yyyy", "##/##/####", '_');
		this.calendario.setBounds(290, 192, 100, 25);
		this.calendario.setBorder(null);

		this.sexo = new JComboBox<String>();
		this.sexo.setForeground(Color.GRAY);
		this.sexo.addItem("");
		this.sexo.addItem("M");
		this.sexo.addItem("H");
		this.sexo.setBackground(Color.WHITE);
		this.sexo.setBounds(110, 225, 100, 25);

		this.divorciosi = new JRadioButton("Si", false);
		this.divorciosi.setContentAreaFilled(false);
		this.divorciosi.setBounds(190, 265, 15, 15);

		this.divorciono = new JRadioButton("No", false);
		this.divorciono.setContentAreaFilled(false);
		this.divorciono.setBounds(270, 265, 15, 15);

		this.grupo = new ButtonGroup();
		this.grupo.add(this.divorciosi);
		this.grupo.add(this.divorciono);

		this.txtEstatura = new JTextField();
		this.txtEstatura.setForeground(Color.GRAY);
		this.txtEstatura.setBounds(435, 260, 125, 25);
		this.txtEstatura.setBorder(null);

		this.txtIngresos = new JTextField();
		this.txtIngresos.setForeground(Color.GRAY);
		this.txtIngresos.setBounds(275, 295, 125, 25);
		this.txtIngresos.setBorder(null);

		this.txtContrasena = new JTextField();
		this.txtContrasena.setForeground(Color.GRAY);
		this.txtContrasena.setBounds(185, 327, 215, 25);
		this.txtContrasena.setBorder(null);

		this.butFinalizar = new JButton();
		this.butFinalizar.setIcon(new ImageIcon("./Img/BotonFinalizar.png"));
		this.butFinalizar.setBounds(390, 380, 170, 50);
		this.butFinalizar.setActionCommand(FINALIZAR);
		this.butFinalizar.setBorder(null);

		this.butAtras = new JButton();
		this.butAtras.setIcon(new ImageIcon("./Img/BotonAtras.png"));
		this.butAtras.setBounds(40, 380, 170, 50);
		this.butAtras.setActionCommand(ATRAS);
		this.butAtras.setBorder(null);

		add(this.txtNombre);
		add(this.txtApellido1);
		add(this.txtApellido2);
		add(this.txtUsuario);
		add(this.txtContrasena);
		add(this.txtCorreo);
		add(this.calendario);
		add(this.sexo);
		add(this.txtEstatura);
		add(this.txtIngresos);
		add(divorciono);
		add(divorciosi);
		add(this.butFinalizar);
		add(this.butAtras);
		add(fondo);
	}

	public JDateChooser getCalendario() {
		return calendario;
	}

	public void setCalendario(JDateChooser calendario) {
		this.calendario = calendario;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JTextField getTxtEstatura() {
		return txtEstatura;
	}

	public void setTxtEstatura(JTextField txtEstatura) {
		this.txtEstatura = txtEstatura;
	}

	public JTextField getTxtIngresos() {
		return txtIngresos;
	}

	public void setTxtIngresos(JTextField txtIngresos) {
		this.txtIngresos = txtIngresos;
	}

	public JTextField getTxtContrasena() {
		return txtContrasena;
	}

	public void setTxtContrasena(JTextField txtContrasena) {
		this.txtContrasena = txtContrasena;
	}

	public JComboBox<String> getSexo() {
		return sexo;
	}

	public void setSexo(JComboBox<String> sexo) {
		this.sexo = sexo;
	}

	public JRadioButton getDivorciosi() {
		return divorciosi;
	}

	public void setDivorciosi(JRadioButton divorciosi) {
		this.divorciosi = divorciosi;
	}

	public JRadioButton getDivorciono() {
		return divorciono;
	}

	public void setDivorciono(JRadioButton divorciono) {
		this.divorciono = divorciono;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public void setGrupo(ButtonGroup grupo) {
		this.grupo = grupo;
	}

	public JButton getButFinalizar() {
		return butFinalizar;
	}

	public void setButFinalizar(JButton butFinalizar) {
		this.butFinalizar = butFinalizar;
	}

	public JButton getButAtras() {
		return butAtras;
	}

	public void setButAtras(JButton butAtras) {
		this.butAtras = butAtras;
	}

	public static String getFinalizar() {
		return FINALIZAR;
	}

	public static String getAtras() {
		return ATRAS;
	}

	public JTextField getTxtApellido1() {
		return txtApellido1;
	}

	public void setTxtApellido1(JTextField txtApellido1) {
		this.txtApellido1 = txtApellido1;
	}

	public JTextField getTxtApellido2() {
		return txtApellido2;
	}

	public void setTxtApellido2(JTextField txtApellido2) {
		this.txtApellido2 = txtApellido2;
	}
	
	
}
