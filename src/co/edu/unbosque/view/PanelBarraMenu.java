package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelBarraMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String ASCENDENTE = "ASCENDENTE";
	public static final String DESCENDENTE = "DESCENDENTE";
	public static final String NUMLIKES = "NUMLIKES";
	public static final String USUARIO = "USUARIO";
	public static final String APELLIDO = "APELLIDO";
	public static final String NOMBRE = "NOMBRE";
	public static final String EDAD = "EDAD";
	public static final String INGRESOS = "INGRESOS";
	public static final String FEMENINO = "FEMENINO";
	public static final String MASCULINO = "MASCULINO";
	public static final String MASLIKES = "MASLIKES";
	public static final String RANGOINGRESOS = "RANGOINGRESOS";
	public static final String BUSCAR = "BUSCAR";
	public static final String GENERARPDF = "GENERARPDF";

	private JMenuBar barraMenu;
	private JMenu ordenar, filtrar, generarpdf, top10;
	private JMenuItem ascendente, descendente, numlikes, usuario, apellido, nombre, edad, ingresos, femenino, masculino,
			masLikes, rangoIngresos, pdf;
	private JTextField txtbuscador;
	private JButton butBuscar;

	public PanelBarraMenu() {

		setBounds(50, 50, 500, 30);
		setBackground(Color.LIGHT_GRAY);

		this.butBuscar = new JButton("Buscar");
		this.butBuscar.setBorder(null);
		this.butBuscar.setContentAreaFilled(false);
		this.butBuscar.setActionCommand(BUSCAR);

		this.txtbuscador = new JTextField(" Ingresar usuario ");
		this.txtbuscador.setSize(70, 20);
		this.txtbuscador.setBorder(null);

		this.ascendente = new JMenuItem("Ascendente");
		this.ascendente.setActionCommand(ASCENDENTE);
		this.descendente = new JMenuItem("Descendente");
		this.descendente.setActionCommand(DESCENDENTE);
		
		this.ordenar = new JMenu("Ordenar");
		this.ordenar.add(ascendente);
		this.ordenar.add(descendente);

		this.numlikes = new JMenuItem("Numero de likes");
		this.numlikes.setActionCommand(NUMLIKES);
		this.usuario = new JMenuItem("Usuario");
		this.usuario.setActionCommand(USUARIO);
		this.apellido = new JMenuItem("Apellido");
		this.apellido.setActionCommand(APELLIDO);
		this.nombre = new JMenuItem("Nombre");
		this.nombre.setActionCommand(NOMBRE);
		this.edad = new JMenuItem("Edad");
		this.edad.setActionCommand(EDAD);
		this.ingresos = new JMenuItem("Ingresos mensuales");
		this.ingresos.setActionCommand(INGRESOS);
		this.femenino = new JMenuItem("Sexo femenino");
		this.femenino.setActionCommand(FEMENINO);
		this.masculino = new JMenuItem("Sexo masculino");
		this.masculino.setActionCommand(MASCULINO);

		this.filtrar = new JMenu("Filtrar");
		this.filtrar.add(numlikes);
		this.filtrar.add(usuario);
		this.filtrar.add(apellido);
		this.filtrar.add(nombre);
		this.filtrar.add(edad);
		this.filtrar.add(ingresos);
		this.filtrar.add(femenino);
		this.filtrar.add(masculino);

		this.masLikes = new JMenuItem("Usuarios con mas likes");
		this.filtrar.setActionCommand(MASLIKES);
		this.rangoIngresos = new JMenuItem("Usuarios con ingresos mayores o iguales a 244.85 USD");
		this.rangoIngresos.setActionCommand(RANGOINGRESOS);

		this.top10 = new JMenu("Top 10");
		this.top10.add(masLikes);
		this.top10.add(rangoIngresos);
		
		this.pdf= new JMenuItem("Generar archivo pdf");
		this.pdf.setActionCommand(GENERARPDF);

		this.generarpdf = new JMenu("PDF");
		this.generarpdf.add(pdf);

		this.barraMenu = new JMenuBar();
		this.barraMenu.setBackground(Color.LIGHT_GRAY);
		this.barraMenu.setForeground(Color.DARK_GRAY);
		this.barraMenu.setBorderPainted(false);
		this.barraMenu.add(filtrar);
		this.barraMenu.add(ordenar);
		this.barraMenu.add(top10);
		this.barraMenu.add(generarpdf);
		this.barraMenu.add(new JLabel("        "));
		this.barraMenu.add(txtbuscador);
		this.barraMenu.add(butBuscar);

		add(barraMenu);

	}

	public JMenuItem getPdf() {
		return pdf;
	}

	public void setPdf(JMenuItem pdf) {
		this.pdf = pdf;
	}

	public static String getMaslikes() {
		return MASLIKES;
	}

	public static String getRangoingresos() {
		return RANGOINGRESOS;
	}

	public static String getBuscar() {
		return BUSCAR;
	}

	public JTextField getTxtbuscador() {
		return txtbuscador;
	}

	public void setTxtbuscador(JTextField txtbuscador) {
		this.txtbuscador = txtbuscador;
	}

	public JButton getButBuscar() {
		return butBuscar;
	}

	public void setButBuscar(JButton butBuscar) {
		this.butBuscar = butBuscar;
	}

	public JMenuBar getBarraMenu() {
		return barraMenu;
	}

	public void setBarraMenu(JMenuBar barraMenu) {
		this.barraMenu = barraMenu;
	}

	public JMenu getOrdenar() {
		return ordenar;
	}

	public void setOrdenar(JMenu ordenar) {
		this.ordenar = ordenar;
	}

	public JMenu getFiltrar() {
		return filtrar;
	}

	public void setFiltrar(JMenu filtrar) {
		this.filtrar = filtrar;
	}

	public JMenu getGenerarpdf() {
		return generarpdf;
	}

	public void setGenerarpdf(JMenu generarpdf) {
		this.generarpdf = generarpdf;
	}

	public JMenu getTop10() {
		return top10;
	}

	public void setTop10(JMenu top10) {
		this.top10 = top10;
	}

	public JMenuItem getAscendente() {
		return ascendente;
	}

	public void setAscendente(JMenuItem ascendente) {
		this.ascendente = ascendente;
	}

	public JMenuItem getDescendente() {
		return descendente;
	}

	public void setDescendente(JMenuItem descendente) {
		this.descendente = descendente;
	}

	public JMenuItem getNumlikes() {
		return numlikes;
	}

	public void setNumlikes(JMenuItem numlikes) {
		this.numlikes = numlikes;
	}

	public JMenuItem getUsuario() {
		return usuario;
	}

	public void setUsuario(JMenuItem usuario) {
		this.usuario = usuario;
	}

	public JMenuItem getApellido() {
		return apellido;
	}

	public void setApellido(JMenuItem apellido) {
		this.apellido = apellido;
	}

	public JMenuItem getNombre() {
		return nombre;
	}

	public void setNombre(JMenuItem nombre) {
		this.nombre = nombre;
	}

	public JMenuItem getEdad() {
		return edad;
	}

	public void setEdad(JMenuItem edad) {
		this.edad = edad;
	}

	public JMenuItem getIngresos() {
		return ingresos;
	}

	public void setIngresos(JMenuItem ingresos) {
		this.ingresos = ingresos;
	}

	public JMenuItem getFemenino() {
		return femenino;
	}

	public void setFemenino(JMenuItem femenino) {
		this.femenino = femenino;
	}

	public JMenuItem getMasculino() {
		return masculino;
	}

	public void setMasculino(JMenuItem masculino) {
		this.masculino = masculino;
	}

	public JMenuItem getMasLikes() {
		return masLikes;
	}

	public void setMasLikes(JMenuItem masLikes) {
		this.masLikes = masLikes;
	}

	public JMenuItem getRangoIngresos() {
		return rangoIngresos;
	}

	public void setRangoIngresos(JMenuItem rangoIngresos) {
		this.rangoIngresos = rangoIngresos;
	}

}
