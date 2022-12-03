package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.UsuarioDTO;

public class BinarioFile {
	public static final String RUTABINARIO = "./data/archivo.dat";
	private File fBinario;

	public BinarioFile() {
		this.fBinario = new File(RUTABINARIO);
	}
	

	public int escribirRegistro(ArrayList<UsuarioDTO> eDTO) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fBinario));
			out.writeObject(eDTO);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error en el metodo escribirRegistro");
			return -1;
		}
		return 1;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<UsuarioDTO> leerRegistro() {
		ArrayList<UsuarioDTO> listaregistrados = new ArrayList<UsuarioDTO>();
		if (fBinario.length() != 0) {
			ObjectInputStream in;
			try {
				in = new ObjectInputStream(new FileInputStream(fBinario));
				listaregistrados = (ArrayList<UsuarioDTO>) in.readObject();
				in.close();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("Error en el metodo LeerRegistro");
			}
		}
		return listaregistrados;
	}
}
