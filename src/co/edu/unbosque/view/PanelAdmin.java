package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelAdmin extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuBar barraMenu;
	private JMenu ordenar, filtrar, generarpdf, top10;
	private JMenuItem ascendente, descendente, numlikes, usuario, apellido, nombre, edad, ingresos, femenino, masculino,
			masLikes, rangoIngresos;
	private JTextArea txtId, txtNombre, txtLikes, txtUsuario, txtApellidos, txtEdad, txtIngresos, txtSexo, txtEstatura,
			txtDivorcios, txtCorreo, txtNacimiento, txtEstado;

	public PanelAdmin() {

		setBounds(50, 80, 500, 350);
		setBackground(Color.WHITE);
		setLayout(new GridLayout(1, 13));
		setPreferredSize(new Dimension(1800, 1000));

		this.txtApellidos = new JTextArea("Apellidos \n");
		this.txtApellidos.setForeground(Color.GRAY);
		this.txtApellidos.setBackground(new Color(255, 229, 229));

		this.txtCorreo = new JTextArea("Correo \n");
		this.txtCorreo.setForeground(Color.GRAY);
		this.txtCorreo.setBackground(new Color(255, 244, 229));

		this.txtDivorcios = new JTextArea("Divorcios \n");
		this.txtDivorcios.setForeground(Color.GRAY);
		this.txtDivorcios.setBackground(new Color(255, 253, 229));

		this.txtEdad = new JTextArea("Edad \n");
		this.txtEdad.setForeground(Color.GRAY);
		this.txtEdad.setBackground(new Color(240, 255, 229));

		this.txtEstado = new JTextArea("Estado \n");
		this.txtEstado.setForeground(Color.GRAY);
		this.txtEstado.setBackground(new Color(231, 255, 229));

		this.txtEstatura = new JTextArea("Estatura \n");
		this.txtEstatura.setForeground(Color.GRAY);
		this.txtEstatura.setBackground(new Color(229, 255, 244));

		this.txtId = new JTextArea("Id \n");
		this.txtId.setForeground(Color.GRAY);
		this.txtId.setBackground(new Color(229, 248, 255));

		this.txtIngresos = new JTextArea("Ingresos \n");
		this.txtIngresos.setForeground(Color.GRAY);
		this.txtIngresos.setBackground(new Color(229, 233, 255));

		this.txtLikes = new JTextArea("Likes \n");
		this.txtLikes.setForeground(Color.GRAY);
		this.txtLikes.setBackground(new Color(244, 229, 255));

		this.txtNacimiento = new JTextArea("Nacimiento \n");
		this.txtNacimiento.setForeground(Color.GRAY);
		this.txtNacimiento.setBackground(new Color(255, 229, 254));

		this.txtNombre = new JTextArea("Nombre \n");
		this.txtNombre.setForeground(Color.GRAY);
		this.txtNombre.setBackground(new Color(241, 230, 238));

		this.txtSexo = new JTextArea("Sexo \n");
		this.txtSexo.setForeground(Color.GRAY);
		this.txtSexo.setBackground(new Color(233, 233, 233));

		this.txtUsuario = new JTextArea("Usuario \n");
		this.txtUsuario.setForeground(Color.GRAY);
		this.txtUsuario.setBackground(new Color(247, 243, 246));

		add(txtId);
		add(txtNombre);
		add(txtApellidos);
		add(txtUsuario);
		add(txtCorreo);
		add(txtSexo);
		add(txtEdad);
		add(txtNacimiento);
		add(txtEstatura);
		add(txtIngresos);
		add(txtDivorcios);
		add(txtLikes);
		add(txtEstado);
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

	public JTextArea getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextArea txtId) {
		this.txtId = txtId;
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtLikes() {
		return txtLikes;
	}

	public void setTxtLikes(JTextArea txtLikes) {
		this.txtLikes = txtLikes;
	}

	public JTextArea getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextArea txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextArea getTxtApellidos() {
		return txtApellidos;
	}

	public void setTxtApellidos(JTextArea txtApellidos) {
		this.txtApellidos = txtApellidos;
	}

	public JTextArea getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextArea txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextArea getTxtIngresos() {
		return txtIngresos;
	}

	public void setTxtIngresos(JTextArea txtIngresos) {
		this.txtIngresos = txtIngresos;
	}

	public JTextArea getTxtSexo() {
		return txtSexo;
	}

	public void setTxtSexo(JTextArea txtSexo) {
		this.txtSexo = txtSexo;
	}

	public JTextArea getTxtEstatura() {
		return txtEstatura;
	}

	public void setTxtEstatura(JTextArea txtEstatura) {
		this.txtEstatura = txtEstatura;
	}

	public JTextArea getTxtDivorcios() {
		return txtDivorcios;
	}

	public void setTxtDivorcios(JTextArea txtDivorcios) {
		this.txtDivorcios = txtDivorcios;
	}

	public JTextArea getTxtCorreo() {
		return txtCorreo;
	}

	public void setTxtCorreo(JTextArea txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JTextArea getTxtNacimiento() {
		return txtNacimiento;
	}

	public void setTxtNacimiento(JTextArea txtNacimiento) {
		this.txtNacimiento = txtNacimiento;
	}

	public JTextArea getTxtEstado() {
		return txtEstado;
	}

	public void setTxtEstado(JTextArea txtEstado) {
		this.txtEstado = txtEstado;
	}

}
