package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class PDFfile {

	public static final String RUTAPDF = "./data/Estadisticas.pdf";
	private File pdf;

	public PDFfile() {
		this.pdf = new File(RUTAPDF);
	}

	public void generarPDF() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy, HH:mm:ss");
        
        String fecha = dateFormat.format(new Date());
		try {
			PdfWriter writer = new PdfWriter(pdf);
			PdfDocument pdfDocument = new PdfDocument(writer);
			Document doc = new Document(pdfDocument);
			Paragraph p = new Paragraph(fecha);
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
