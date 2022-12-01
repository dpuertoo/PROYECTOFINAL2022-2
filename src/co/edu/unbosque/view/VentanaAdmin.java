package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class VentanaAdmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String REGRESAR = "REGRESAR";

	private JLabel fondo;
	private JButton butRegresar;
	private PanelAdmin paneladmin;
	private PanelBarraMenu panelMenu;
	private ScrollPane scroll;

	public VentanaAdmin() {
		setSize(600, 450);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);

		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 600, 450);
		BufferedImage bi2 = null;
		try {
			bi2 = ImageIO.read(new File("./Img/FondoVa.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado2 = bi2.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
		fondo.setIcon(new ImageIcon(redimensionado2));
		fondo.setVisible(true);

		this.paneladmin = new PanelAdmin();
		this.panelMenu = new PanelBarraMenu();

		this.scroll = new ScrollPane();
		this.scroll.setBounds(paneladmin.getX(), paneladmin.getY(), paneladmin.getWidth(), paneladmin.getHeight());
		this.scroll.add(paneladmin);

		this.butRegresar = new JButton();
		this.butRegresar.setContentAreaFilled(false);
		this.butRegresar.setBorder(null);
		this.butRegresar.setBounds(10, 10, 60, 30);
		this.butRegresar.setActionCommand(REGRESAR);

		add(butRegresar);
		add(scroll);
		add(panelMenu);
		add(fondo);
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getButRegresar() {
		return butRegresar;
	}

	public void setButRegresar(JButton butRegresar) {
		this.butRegresar = butRegresar;
	}

	public static String getRegresar() {
		return REGRESAR;
	}

	public PanelAdmin getPaneladmin() {
		return paneladmin;
	}

	public void setPaneladmin(PanelAdmin paneladmin) {
		this.paneladmin = paneladmin;
	}

	public PanelBarraMenu getPanelMenu() {
		return panelMenu;
	}

	public void setPanelMenu(PanelBarraMenu panelMenu) {
		this.panelMenu = panelMenu;
	}

}
