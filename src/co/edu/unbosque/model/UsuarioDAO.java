package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.GUI;

public class UsuarioDAO {

	private ArrayList<UsuarioDTO> usuarios;
	private FileHandler fh;

	public UsuarioDAO() {
		this.usuarios = new ArrayList<>();
		this.fh = new FileHandler();
	}

	public void agregarUsuario(UsuarioDTO pUsuario, GUI g) {
		if (buscarUsuario(pUsuario.getUsuario(), g) == null) {
			this.usuarios.add(pUsuario);
			this.fh.escribirRegistro(this.usuarios);
		} else {
			g.mostrarMensaje("Este user ya esta registrado", "Advertencia", 2);
		}
	}

	public ArrayList<UsuarioDTO> listarArrayUsuarios() {
		return this.usuarios;
	}
//	
//	public String listarArchivoUsuarios() {
//		ArrayList<UsuarioDTO> users= fh.leerRegistro()
//		return this.usuarios;
//	}

	public UsuarioDTO buscarUsuario(String usuario, GUI g) {
		UsuarioDTO persona = null;
		if (!usuarios.isEmpty()) {
			for (UsuarioDTO user : this.usuarios) {
				if (usuario.equalsIgnoreCase(user.getUsuario())) {
					persona = user;
				}
			}
		}
		return persona;
	}

	public void borrarUsuario(String nombre, GUI g) {
		UsuarioDTO user = buscarUsuario(nombre, g);
		if (user != null) {
			this.usuarios.remove(user);
		}
	}
	
	public void toCsv() {
		
	}
}
