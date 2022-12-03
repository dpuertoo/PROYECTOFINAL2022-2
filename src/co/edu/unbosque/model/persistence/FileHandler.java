package co.edu.unbosque.model.persistence;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import co.edu.unbosque.model.UsuarioDTO;

public class FileHandler {
	private static File archivo;
	private static Scanner lector;
	private static PrintWriter escritor;
//	private static Properties prop;
	private static FileInputStream fis;
	private static ObjectInputStream ois;
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;

	public static Object leerSerializable(String nombre_archivo) {
		try {
			fis = new FileInputStream("./data/" + nombre_archivo);
		} catch (FileNotFoundException e) {
			System.out.println("Error reading (SERIALIZABLE)- read ");

		}
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			System.out.println("Error reading (SERIALIZABLE)- read " + e.getMessage());
		}
		Object aux = null;
		try {// lee
			aux = ois.readObject();
		} catch (ClassNotFoundException e) {// no HACE PARTE DEL pr verifique integridad
			System.out.println("Error on Integrity (serializable read )" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error on Permisos (serializable read )" + e.getMessage());

		}
		return aux;
	}

	public static void escribirSerializable(Object o, String nobre_archivo) {
		try {// buscar
			fos = new FileOutputStream("./data/" + nobre_archivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found serializable ");
			System.out.println(e.getMessage());
		}
		try {// coge e archivo y selecciona para escribir
			oos = new ObjectOutputStream(fos);
			// Escribe el objeto
			oos.writeObject(o);

		} catch (IOException e) {
			System.out.println("ERROR on writing serializable "); // el error se localiza en que hay error en el archivo
																	// puede que este corrupto o tenga clave
			System.out.println(e.getMessage());
		}
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("No se pudo cerrar (serializable)");
			System.out.println(e.getMessage());

		}
	}

	public static String cargarArchivo(String nombre_archivo) {
		archivo = new File("./data/" + nombre_archivo);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				System.out.println("No se pudo crear el archivo");
				System.out.println(e.getMessage());
			}
		}
		String contenido = "";
		try {
			lector = new Scanner(archivo);
			while (lector.hasNext()) {
				contenido += lector.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
			e.printStackTrace();
		}
		lector.close();
		return contenido;

	}

	public static void escribirArchivo(String nombre_archivo, String contenido) {
		archivo = new File("./data/" + nombre_archivo);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				System.out.println("No se pudo crear el archivo");
				System.out.println(e.getMessage());
			}
		}
		try {
			escritor = new PrintWriter(archivo);
			escritor.print(contenido);
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
			e.printStackTrace();
		}
		escritor.close();
	}

}

//	public void generarPDF() {
//		File archivopdf = new File("./data/Estadisticas.pdf");
//		try {
//			PdfWriter writer = new PdfWriter(archivopdf);
//			PdfDocument pdfDocument = new PdfDocument(writer);
//			Document doc = new Document(pdfDocument);
//			Paragraph p = new Paragraph("olaxd");
//			doc.add(p);
//			doc.close();
//			pdfDocument.close();
//		} catch (FileNotFoundException e) {
//
//		}
//	}
//
//	public void hacerGrafica() {
//		JFreeChart grafica;
//		DefaultCategoryDataset Datos = new DefaultCategoryDataset();
//
//	}
//}
