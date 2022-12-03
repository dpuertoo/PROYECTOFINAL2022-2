package co.edu.unbosque.model.persistence;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;

import com.orsonpdf.PDFDocument;
import com.orsonpdf.PDFGraphics2D;
import com.orsonpdf.Page;

public class PDFfile {

	public static final String RUTAPDF = "./data/Estadisticas.pdf";
	private File pdf;

	public PDFfile() {
		this.pdf = new File(RUTAPDF);
	}

//	public void generarPDF(ArrayList<UsuarioDTO> usuarios) {
	public void generarPDF() {
		JFreeChart chart = hacerGrafica();
		PDFDocument pdfDocument = new PDFDocument();
		// pdfDocument.setTitle("Estadisticas BosTinder");
		Page pag = pdfDocument.createPage(new Rectangle(600, 500));
		PDFGraphics2D g2 = pag.getGraphics2D();
		chart.draw(g2, new Rectangle(20, 20, 560, 460));
		pdfDocument.writeToFile(pdf);
		try {
			Desktop.getDesktop().open(pdf);
//			Process p = Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + RUTAPDF);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	public JFreeChart hacerGrafica(ArrayList<UsuarioDTO> usuarios) {
	public JFreeChart hacerGrafica() {
		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy, HH:mm");
		String fecha = dateFormat.format(new Date());
		JFreeChart grafica;
		DefaultCategoryDataset datos = new DefaultCategoryDataset();
		datos.addValue(1, "Estatura", "Usuario" + 1);
		datos.addValue(2, "Estatura", " dos ");
		datos.addValue(3, "Estatura", " tres ");
		datos.addValue(4, "Estatura", " cuatro ");
		datos.addValue(3, "Estatura", " cinco ");
		datos.addValue(6, "Estatura", " seis ");
		datos.addValue(7, "Edad", "Usuario" + 1);
		datos.addValue(1, "Edad", " dos ");
		datos.addValue(9, "Edad", " tres ");
		datos.addValue(3, "Edad", " cuatro ");
		datos.addValue(7, "Edad", " cinco ");
		datos.addValue(6, "Edad", " seis ");
		double mediaEstatura = 0;
		double mediaIngresos = 0;
		double mediaEdad = 0;
//		for (int i = 0; i < usuarios.size(); i++) {
//			datos.addValue(usuarios.get(i).getEstatura(), "Estatura", "Usuario" + i);
//			mediaEstatura+=usuarios.get(i).getEstatura();
//			datos.addValue(usuarios.get(i).getEdad(), "Edad", "Usuario" + i);
//			mediaEdad+=usuarios.get(i).getEdad();
//			datos.addValue(usuarios.get(i).getIngresos(), "Ingresos", "Usuario"+i);
//			mediaIngresos+=usuarios.get(i).getIngresos();
//		}
//		mediaEstatura=mediaEstatura/usuarios.size();
//		mediaEdad=mediaEdad/usuarios.size();
//		mediaIngresos=mediaIngresos/suarios.size();
//		datos.addValue(mediaEstatura, "Media Estatura", "xxx");
//		datos.addValue(mediaEdad, "Media Edad", "xd");
//		datos.addValue(mediaIngresos, "Media Ingresos", "xdxd");
		grafica = ChartFactory.createLineChart("Estadisticas BosTinder", "Usuarios", "Valores", datos,
				PlotOrientation.VERTICAL, true, true, false);
		TextTitle description = new TextTitle(fecha);
		description.setPosition(RectangleEdge.TOP);
		description.setHorizontalAlignment(HorizontalAlignment.LEFT);
		grafica.addSubtitle(description);
		return grafica;
	}
}
