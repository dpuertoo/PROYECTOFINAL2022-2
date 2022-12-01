package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinarioFile;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.model.persistence.PDFfile;

public class FachadaProvisional {

	private UsuarioDAO uDAO;
	private FileHandler fh;
	private BinarioFile bf;
	private PDFfile pdf;

	public FachadaProvisional() {
		this.uDAO = new UsuarioDAO();
		this.fh = new FileHandler();
		this.bf = new BinarioFile();
		this.pdf = new PDFfile();
	}

	public BinarioFile getBf() {
		return bf;
	}

	public void setBf(BinarioFile bf) {
		this.bf = bf;
	}

	public PDFfile getPdf() {
		return pdf;
	}

	public void setPdf(PDFfile pdf) {
		this.pdf = pdf;
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
