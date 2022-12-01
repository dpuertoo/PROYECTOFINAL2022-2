package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.FileHandler;

public class FachadaProvisional {

	private UsuarioDAO uDAO;
	private FileHandler fh;

	public FachadaProvisional() {
		this.uDAO = new UsuarioDAO();
		this.fh= new FileHandler();
	}

	public UsuarioDAO getuDAO() {
		return uDAO;
	}

	public void setuDAO(UsuarioDAO uDAO) {
		this.uDAO = uDAO;
	}

	public FileHandler getFh() {
		return fh;
	}

	public void setFh(FileHandler fh) {
		this.fh = fh;
	}
}
