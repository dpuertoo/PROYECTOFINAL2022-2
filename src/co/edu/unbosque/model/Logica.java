package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.persistence.BinarioFile;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.model.persistence.PDFfile;

public class Logica {

	private UsuarioDAO uDAO;
	private FileHandler fh;
	private BinarioFile bf;
	private PDFfile pdf;
	private Correo correo;

	public Logica() {
		this.uDAO = new UsuarioDAO();
		this.fh = new FileHandler();
		this.bf = new BinarioFile();
		this.pdf = new PDFfile();
		this.correo = new Correo();
	}

	public String PasarDivorcioAString(boolean divorcio) {
		String respuesta = "";
		if (divorcio == true) {
			respuesta = "Si";
		} else {
			respuesta = "No";
		}
		return respuesta;
	}

	public String PasarEstadoAString(boolean estado) {
		String respuesta = "";
		if (estado == true) {
			respuesta = "Disponible";
		} else {
			respuesta = "Inactivo";
		}
		return respuesta;
	}

	public void orderarNumerosAscendente(ArrayList<Integer> a) {
		int aux = 0;
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) > a.get(j)) {
					aux = a.get(j);
					a.set(j, a.get(i));
					a.set(i, aux);
				}
			}
		}
	}

	public void orderarNumerosDescendente(ArrayList<Integer> a) {
		int aux = 0;
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) < a.get(j)) {
					aux = a.get(j);
					a.set(j, a.get(i));
					a.set(i, aux);
				}
			}
		}
	}
//	public void ordenamientoAlfabetico(ArrayList<String> array) {
//		for (int i = 0; i < array.size(); i++) {
//			for (int j = 0; j < array.size() && i!= j; j++) {
//				if (array.get(i).compareToIgnoreCase(array.get(j)) > 0) {
//					String aux = array.get(i);
//					array.get(i) = array.get(j);
//					
//					
//					String aux=stud.get(i); 
//					Double auxv=use.get(i); 
//					stud.set(i,stud.get(j)); 
//					uspe.set(i,uspe.get(j)); 
//					stud.set(j,aux); 
//					uspe.set(j,auxv);
//				}
//			}
//		}
//	}
	
	public void orderarLetrasDescendente(ArrayList<Integer> ar) {
		String a = "1";
		String b = "2";
		String c = "3";
		String d = "4";
		String e = "5";
		String f = "6";
		String g = "7";
		String h = "8";
		String i = "9";
		String j = "10";
		String k = "11";
		String l = "12";
		String m = "13";
		String n = "14";
		String o = "15";
		String p = "16";
		String q = "17";
		String r = "18";
		String s = "19";
		String t = "20";
		String u = "21";
		String v = "22";
		String w = "23";
		String x = "24";
		String y = "25";
		String z = "26";
		int aux = 0;
		for (int ii = 0; ii < ar.size() - 1; ii++) {
			for (int jj = ii + 1; jj < ar.size(); jj++) {
				if (ar.get(ii) < ar.get(jj)) {
					aux = ar.get(jj);
					ar.set(jj, ar.get(ii));
					ar.set(ii, aux);
				} // No se como se hace
			}
		}
	}

	public Correo getCorreo() {
		return correo;
	}

	public void setCorreo(Correo correo) {
		this.correo = correo;
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
