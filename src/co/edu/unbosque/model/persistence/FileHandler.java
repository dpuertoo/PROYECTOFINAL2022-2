package co.edu.unbosque.model.persistence;

import java.io.File;

public class FileHandler {

	public static final String RUTADATOS = "./data/datos.csv";
	private File fDatos;

	public FileHandler() {
		this.fDatos = new File(RUTADATOS);
	}

}
