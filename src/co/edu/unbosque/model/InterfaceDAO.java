package co.edu.unbosque.model;

public interface InterfaceDAO {
	public void agregar(int id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contrasena, String correo, String nacimiento, int edad, double estatura, double ingresos,
			String divorcios, int numLikesRecibidos, int numLikesEnviados, int numMatches, String estado);

	public String mostrarTodo();
}
