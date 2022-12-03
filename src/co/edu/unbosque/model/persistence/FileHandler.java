package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import co.edu.unbosque.model.UsuarioDTO;

public class FileHandler {

	public static final String RUTABINARIO = "./data/archivo.dat";
	public static final String RUTADATOS = "./data/datos.csv";
	private File fBinario, fDatos;

	public FileHandler() {
		this.fBinario = new File(RUTABINARIO);
		this.fDatos = new File(RUTADATOS);
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

	public void generarPDF() {
		File archivopdf = new File("./data/Estadisticas.pdf");
		try {
			PdfWriter writer = new PdfWriter(archivopdf);
			PdfDocument pdfDocument = new PdfDocument(writer);
			Document doc = new Document(pdfDocument);
			Paragraph p = new Paragraph("olaxd");
			doc.add(p);
			doc.close();
			pdfDocument.close();
		} catch (FileNotFoundException e) {

		}
	}
	
//	public String[] leerCsv(ArrayList<UsuarioDTO> a) {
//		UsuarioDTO u;
//		String linea;
//		String[] datos;
//		try {
//			FileReader fr = new FileReader(this.fDatos);
//			BufferedReader br = new BufferedReader(fr);
//			while (br.readLine() != null) {
//				datos = br.readLine().split(",");
////				u = new UsuarioDTO(datos[0], datos[0], datos[0], datos[0], datos[0], datos[0], datos[0], datos[0], String.valueOf(datos[0]), 0, 0, 0, 0, 0, 0, false, false)
//				a.add(u);
//			}
//			fr.close();
//		} catch (IOException e) {
//			return null;
//		}
//		return datos;
//	}
	
	public void escribirCsv(ArrayList<UsuarioDTO> a) {
//		try {
//			FileWriter fw = new FileWriter(this.fDatos);
//			PrintWriter pw = new PrintWriter(fw);
//
//			pw.print(pDato);
//			fw.close();
//
//		} catch (IOException e) {
//			return -1;
//		}
//		return 0;
		
		try {
			FileWriter fw = new FileWriter(fDatos);
			for (UsuarioDTO u : a) {
				fw.write(u.toCsv()+"\n");
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public void hacerGrafica() {
		JFreeChart grafica;
		DefaultCategoryDataset Datos = new DefaultCategoryDataset();

	}
}
