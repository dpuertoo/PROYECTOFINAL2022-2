package co.edu.unbosque.model;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento;
	private int id, edad, numLikesRecibidos, numLikesEnviados, numMatches;
	private double ingresos, estatura;
	private boolean divorcios, estado;

	public UsuarioDTO() {
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.sexo = "";
		this.usuario = "";
		this.contrasena = "";
		this.correo = "";
		this.nacimiento = "";
		this.id = 0;
		this.edad = 0;
		this.numLikesRecibidos = 0;
		this.numLikesEnviados = 0;
		this.numMatches = 0;
		this.ingresos = 0;
		this.estatura = 0;
		this.divorcios = false;
		this.estado = false;
	}
	
	public UsuarioDTO(String nombre, String apellido1, String apellido2, String sexo, String usuario, String contrasena,
			String correo, String nacimiento, int id, int edad, int numLikesRecibidos, int numLikesEnviados,
			int numMatches, double ingresos, double estatura, boolean divorcios, boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sexo = sexo;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.correo = correo;
		this.nacimiento = nacimiento;
		this.id = id;
		this.edad = edad;
		this.numLikesRecibidos = numLikesRecibidos;
		this.numLikesEnviados = numLikesEnviados;
		this.numMatches = numMatches;
		this.ingresos = ingresos;
		this.estatura = estatura;
		this.divorcios = divorcios;
		this.estado = estado;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumLikesRecibidos() {
		return numLikesRecibidos;
	}

	public void setNumLikesRecibidos(int numLikesRecibidos) {
		this.numLikesRecibidos = numLikesRecibidos;
	}

	public int getNumLikesEnviados() {
		return numLikesEnviados;
	}

	public void setNumLikesEnviados(int numLikesEnviados) {
		this.numLikesEnviados = numLikesEnviados;
	}

	public int getNumMatches() {
		return numMatches;
	}

	public void setNumMatches(int numMatches) {
		this.numMatches = numMatches;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public boolean isDivorcios() {
		return divorcios;
	}

	public void setDivorcios(boolean divorcios) {
		this.divorcios = divorcios;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
