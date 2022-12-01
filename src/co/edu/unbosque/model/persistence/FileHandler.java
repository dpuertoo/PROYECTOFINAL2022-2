package co.edu.unbosque.model.persistence;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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

	public void hacerGrafica() {
		JFreeChart grafica;
		DefaultCategoryDataset Datos = new DefaultCategoryDataset();

	}
}
