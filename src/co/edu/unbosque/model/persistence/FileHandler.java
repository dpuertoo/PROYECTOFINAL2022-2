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

	public static final String RUTADATOS = "./data/datos.csv";
	private File fDatos;

	public FileHandler() {
		this.fDatos = new File(RUTADATOS);
	}

}
