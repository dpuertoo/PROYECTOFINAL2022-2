package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.FileHandler;

public class UsuarioDAO implements InterfaceDAO {

	private ArrayList<UsuarioDTO> lista;

	public UsuarioDAO() {
		lista = new ArrayList<UsuarioDTO>();
		cargarArchivo();
	}

	public void escribirArchivo() {
		String contenido = mostrarTodo();
		FileHandler.escribirArchivo("datoss.csv", contenido);
	}
	public void loadSerializable() {
		Object aux = FileHandler.leerSerializable("datos.seri");
		lista = (ArrayList<UsuarioDTO>)aux;
	}


	public void cargarArchivo() {
		String contenido = FileHandler.cargarArchivo("datoss.csv");
		String[] linea = contenido.split("\n");
		for (String s : linea) {
			if (s.equals(""))
				continue;
			String[] columna = s.split(";");

			lista.add(new UsuarioDTO(Integer.parseInt(columna[0]), columna[1], columna[2], columna[3], columna[4],
					columna[5], columna[6], columna[7], columna[8], Integer.parseInt(columna[9]),
					Double.parseDouble(columna[10]), Double.parseDouble(columna[11]), columna[12],
					Integer.parseInt(columna[13]), Integer.parseInt(columna[14]), Integer.parseInt(columna[15]),
					columna[16]));

		}
	}

	public void agregar(int id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contrasena, String correo, String nacimiento, int edad, double estatura, double ingresos,
			String divorcios, int numLikesRecibidos, int numLikesEnviados, int numMatches, String estado) {
		lista.add(new UsuarioDTO(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento, edad,
				estatura, ingresos, divorcios, numLikesRecibidos, numLikesEnviados, numMatches, estado));
		escribirArchivo();
		FileHandler.escribirSerializable(lista, "datos.seri");
	}

	public ArrayList<UsuarioDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<UsuarioDTO> lista) {
		this.lista = lista;
	}

	// @Override
	public String mostrarTodo() {
		String res = "";
		for (UsuarioDTO s : lista) {
			res += s.toString();
		}
		return res;
	}

}
