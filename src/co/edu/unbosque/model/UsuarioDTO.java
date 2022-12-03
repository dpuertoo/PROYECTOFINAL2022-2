package co.edu.unbosque.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class UsuarioDTO implements Serializable {

	private String nombre, apellido1, apellido2, sexo, nacimiento, usuario, contrasena, correo, divorcios, estado;

	private int id, edad, numLikesRecibidos, numLikesEnviados, numMatches;
	private double ingresos, estatura;

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
		this.ingresos = 0.0;
		this.estatura = 0.0;
		this.divorcios = "NO aplica";
		this.estado = "No";
	}

	public UsuarioDTO(int id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contrasena, String correo, String nacimiento, int edad, double estatura, double ingresos,
			String divorcios, int numLikesRecibidos, int numLikesEnviados, int numMatches, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sexo = sexo;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.correo = correo;
		this.nacimiento = nacimiento;
		this.edad = edad;
		this.estatura = estatura;
		this.ingresos = ingresos;
		this.divorcios = divorcios;
		this.numLikesRecibidos = numLikesRecibidos;
		this.numLikesEnviados = numLikesEnviados;
		this.numMatches = numMatches;
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

	public String getDivorcios() {
		return divorcios;
	}

	public void setDivorcios(String divorcios) {
		this.divorcios = divorcios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		String res = "";
		res += this.id + ";" + this.nombre + ";" + this.apellido1 + ";" + this.apellido2 + ";" + this.sexo + ";"
				+ this.usuario + ";" + this.contrasena + ";" + this.correo + ";" + this.nacimiento + ";" + this.edad
				+ ";" + this.estatura + ";" + this.ingresos + ";" + this.divorcios + ";" + this.numLikesRecibidos + ";"
				+ this.numLikesEnviados + ";" + this.numMatches + ";" + this.estado + "\n";
		return res;
	}

}
