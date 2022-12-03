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
<<<<<<< HEAD
import java.util.Properties;
import java.util.Scanner;
=======
import java.util.Iterator;
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git

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

<<<<<<< HEAD
	public static Object leerSerializable(String nombre_archivo) {
=======
	public static final String RUTADATOS = "./data/datos.csv";
	private File fDatos;

	public FileHandler() {
		this.fDatos = new File(RUTADATOS);
	}


	public int escribirRegistro(ArrayList<UsuarioDTO> eDTO) {
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
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

<<<<<<< HEAD
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
=======
//	@SuppressWarnings("unchecked")
//	public ArrayList<UsuarioDTO> leerRegistro() {
//		ArrayList<UsuarioDTO> listaregistrados = new ArrayList<UsuarioDTO>();
//		if (fBinario.length() != 0) {
//			ObjectInputStream in;
//			try {
//				in = new ObjectInputStream(new FileInputStream(fBinario));
//				listaregistrados = (ArrayList<UsuarioDTO>) in.readObject();
//				in.close();
//			} catch (IOException | ClassNotFoundException e) {
//				e.printStackTrace();
//				System.out.println("Error en el metodo LeerRegistro");
//			}
//		}
//		return listaregistrados;
//	}

	public void generarPDF() {
		File archivopdf = new File("./data/Estadisticas.pdf");
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
		try {
			lector = new Scanner(archivo);
			while (lector.hasNext()) {
				contenido += lector.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
			e.printStackTrace();
		}
<<<<<<< HEAD
		lector.close();
		return contenido;
=======
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
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git

<<<<<<< HEAD
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

=======
	}
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
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
