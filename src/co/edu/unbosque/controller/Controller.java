package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Logica;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.view.GUI;

public class Controller implements ActionListener {

	private GUI g;
	private Logica l;

	public Controller() {
		this.g = new GUI(this);
<<<<<<< HEAD
		this.f = new FachadaProvisional();
		System.out.println(f.getuDAO().mostrarTodo());
=======
		this.l = new Logica();
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
		this.g.getVp().setVisible(true);

	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(this.g.getVp().SALIR)) {
			this.g.getVp().dispose();
		}
		if (e.getActionCommand().equals(this.g.getVp().REGISTRARSE)) {
			this.g.getVr().setVisible(true);
			this.g.getVp().dispose();
		}
		if (e.getActionCommand().equals(this.g.getVp().SIGUIENTE)) {
			if (comprobarEntrada() == true) {
				this.g.getVp().setVisible(false);
				this.g.getVu().setVisible(true);
			} else {
				comprobarEntrada();
			}
		}
		if (e.getActionCommand().equals(this.g.getVr().FINALIZAR)) {
<<<<<<< HEAD
			obtenerDatos();
			this.g.getVr().dispose();
			this.g.getVp().setVisible(true);
=======
			this.g.mostrarMensaje(
					this.l.getCorreo().sendEmail(this.g.getVr().getTxtUsuario().getText(),
							this.g.getVr().getTxtContrasena().getText(), this.g.getVr().getTxtCorreo().getText()),
					"Aviso", 1);
			// verificarEspaciosVr();
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
//			this.g.getVu().setVisible(true);
//			this.g.getVr().dispose();
//			this.f.getuDAO().agregarUsuario(obtenerDatos(), this.g);

		}
		if (e.getActionCommand().equals(this.g.getVr().ATRAS)) {
			this.g.getVp().setVisible(true);
			this.g.getVr().dispose();
		}
		if (e.getActionCommand().equals(this.g.getVu().EXIT)) {
			this.g.getVp().setVisible(true);
			this.g.getVu().dispose();
		}
		if (e.getActionCommand().equals(this.g.getVu().LIKE)) {
		}
		if (e.getActionCommand().equals(this.g.getVu().DISLIKE)) {
		}
		if (e.getActionCommand().equals(this.g.getVa().REGRESAR)) {
			this.g.getVp().setVisible(true);
			this.g.getVa().setVisible(false);
		}
<<<<<<< HEAD
=======
		if (e.getActionCommand().equals(this.g.getVa().getPanelMenu().BUSCAR)) {
			this.g.mostrarUsuario(
					this.l.getuDAO().buscarUsuario(this.g.getVa().getPanelMenu().getTxtbuscador().getText(), this.g),
					null, null);
		}
		if (e.getActionCommand().equals(this.g.getVa().getPanelMenu().GENERARPDF)) {
			this.l.getPdf().generarPDF();
		}
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
	}

	public void obtenerDatos() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechanacimiento = this.g.getVr().getCalendario().getDate();
		try {
<<<<<<< HEAD
			int id = numeroId();
			String nombre = g.getVr().getTxtNombre().getText();
			String apellido1 = g.getVr().getTxtApellido1().getText();
			String apellido2 = g.getVr().getTxtApellido2().getText();
=======
			int id = 0;
			String nombre = this.g.getVr().getTxtNombre().getText();
			String Apellido1 = separarApellido1();
			String Apellido2 = separarApellido2();
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
			String sexo = (String) this.g.getVr().getSexo().getSelectedItem();
<<<<<<< HEAD
			String usuario = g.getVr().getTxtUsuario().getText();
			if (comparadorUsuario(usuario) == true) {
				this.g.mostrarMensaje("Usuario repetido", "Advertencia", 2);
			} else {
				String contrasena = g.getVr().getTxtContrasena().getText();
				String correo = g.getVr().getTxtContrasena().getText();
				String nacimiento = sdf.format(fechanacimiento);
				int edad = calcularEdad(g.getVr().getCalendario().getCalendar());
				double estatura = obtenerEstatura(sexo);
				double ingreso = Double.parseDouble(g.getVr().getTxtIngresos().getText());
				String divorcios = obtenerDatoRadioButton();
				int numeroDeLikesRecibidos = 0;
				int numeroDeLikesEnviados = 0;
				int numeroDeLikesMatch = 0;
				String estado = "disponible";
				this.f.getuDAO().agregar(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo,
						nacimiento, edad, estatura, ingreso, divorcios, numeroDeLikesRecibidos, numeroDeLikesEnviados,
						numeroDeLikesMatch, estado);
				this.g.mostrarMensaje("Registrado correctamente", "Exitoso registro", 1);
			}
=======
			String user = this.g.getVr().getTxtUsuario().getText();
			String contrasena = this.g.getVr().getTxtContrasena().getText();
			String correo = this.g.getVr().getTxtCorreo().getText();
			String nacimiento = sdf.format(fechanacimiento);
			int edad = calcularEdad(g.getVr().getCalendario().getCalendar());
			double ingresos = Double.parseDouble(g.getVr().getTxtIngresos().getText());
			boolean divorcios = obtenerDatoRadioButton();
			int numLikesRecibidos = 0;
			int numLikesEnviados = 0;
			int numMatches = 0;
			double estatura = Double.parseDouble(g.getVr().getTxtEstatura().getText());
			boolean estado = true;
			usuario = new UsuarioDTO(nombre, Apellido1, Apellido2, sexo, user, contrasena, correo, nacimiento, id, edad, numLikesRecibidos, numLikesEnviados, numMatches, ingresos, estatura, divorcios, estado);
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
		} catch (NullPointerException e) {
			this.g.mostrarMensaje("Debe llenar todos los campos", "Advertencia", 2);
		} catch (NumberFormatException e) {
			this.g.mostrarMensaje(
					"Debe llenar todos los campos correctamente \n Recuerde que: \n Los decimales se escriben con punto, no con coma \n La fecha se escribe en formato numerico \n No debe poner unidades de medida \n Las mujeres es opcional colocar su estatura, por lo tanto tiene que colocar 0, en el caso de los hombres es obligatorio",
					"Advertencia", 2);
		}
	}

	public String obtenerDatoRadioButton() {
		String respuesta = "NO APLICA";
		if (this.g.getVr().getDivorciosi().isSelected() == true) {
			respuesta = "SI";
		} else if (this.g.getVr().getDivorciono().isSelected() == false) {
			respuesta = "NO";
		}
		return respuesta;

	}

	public boolean comprobarEntrada() {
		boolean encontrado = false;
		String usuario = g.getVp().getTxtUsuario().getText();
		String contrasena = g.getVp().getTxtContra().getText();
		if (comprobarUsuario(usuario) == false && comprobarContrasena(contrasena) == false) {
			encontrado = false;
			this.g.mostrarMensaje("Usuario y/o contraseña incorrecto", "No fue posible iniciar sesion", 1);
		} else if (comprobarUsuario(usuario) == true && comprobarContrasena(contrasena) == false) {
			encontrado = false;
			this.g.mostrarMensaje("Usuario y/o contraseña incorrecto", "No fue posible iniciar sesion", 1);
		} else if (comprobarUsuario(usuario) == false && comprobarContrasena(contrasena) == true) {
			encontrado = false;
			this.g.mostrarMensaje("Usuario y/o contraseña incorrecto", "No fue posible iniciar sesion", 1);
		} else if ((comprobarUsuario(usuario) == true && comprobarContrasena(contrasena) == true)) {
			encontrado = true;
			this.g.mostrarMensaje("Bienvenido: " + usuario, "Inicio de sesion exitoso", 1);
		}
		return encontrado;
	}

	public boolean comprobarContrasena(String contrasena) {
		boolean encontrado = false;
		for (int i = 0; i < f.getuDAO().getLista().size(); i++) {
			if (f.getuDAO().getLista().get(i).getContrasena().equals(contrasena)) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public boolean comprobarUsuario(String usuario) {
		boolean encontrado = false;
		for (int i = 0; i < f.getuDAO().getLista().size(); i++) {
			if (f.getuDAO().getLista().get(i).getUsuario().equals(usuario)) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public double obtenerEstatura(String sexo) {
		double respuesta = 0.0;
		double aux = Double.parseDouble(g.getVr().getTxtEstatura().getText());
		if (this.g.getVr().getSexo().equals(sexo)) {
		}
		return respuesta + aux;
	}

	public boolean comparadorUsuario(String usuario) {
		boolean encontrado = false;
		for (int i = 0; i < f.getuDAO().getLista().size(); i++) {
			if (f.getuDAO().getLista().get(i).getUsuario().equalsIgnoreCase(usuario)) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public int numeroId() {
		int finalId = 0;
		for (int i = 0; i < f.getuDAO().getLista().size(); i++) {
			if (i < f.getuDAO().getLista().get(i).getId()) {
				finalId = +i;
				finalId = finalId + 2;
			}
		}
		return finalId;
	}

	public int calcularEdad(Calendar nacimiento) {
		Calendar hoy = Calendar.getInstance();
		int difAno = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
		int difmes = hoy.get(Calendar.MONTH) - nacimiento.get(Calendar.MONTH);
		int difDia = hoy.get(Calendar.DAY_OF_MONTH) - nacimiento.get(Calendar.DAY_OF_MONTH);
		if (difmes < 0 || (difmes == 0 && difDia < 0)) {
			difAno = difAno - 1;
		}
		if (difAno < 18) {
			g.mostrarMensaje("Debe ser mayor de edad para registrarte", "Advertencia", 2);
		}
		return difAno;
	}

<<<<<<< HEAD
=======
	public String separarApellido1() {
		String apellidos = g.getVr().getTxtApellido().getText();
		String[] partes = apellidos.split(" ");
		String apellido1 = partes[0];
		return apellido1;
	}

	public String separarApellido2() {
		String apellidos = g.getVr().getTxtApellido().getText();
		String[] partes = apellidos.split(" ");
		String apellido2 = partes[1];
		return apellido2;
	}

	public void verificarEspaciosVr() {
		if (this.g.getVr().getDivorciosi().isSelected() == true) {
			System.out.println("si");
			if (this.g.getVr().getTxtEstatura() == null) {
				this.g.getVr().getTxtEstatura().setText(" ");
				this.g.getVr().getTxtIngresos().setEditable(false);
			}
		}

//		if (this.g.getVr().getSexo().equals("Femenino")) {
//			if (this.g.getVr().getTxtNombre().getText().isEmpty() || this.g.getVr().getTxtApellido().getText().isEmpty()
//					|| this.g.getVr().getTxtUsuario().getText().isEmpty()
//					|| this.g.getVr().getTxtCorreo().getText().isEmpty() || this.g.getVr().getCalendario() == null
//					|| this.g.getVr().getGrupo().isSelected(null)
//					|| this.g.getVr().getTxtContrasena().getText().isEmpty()) {
//				g.mostrarMensaje("Diligenciar todos los campos obligatorios", "Advertenia", 2);
//				this.g.getVr().repaint();
//				System.out.println("ola");
//			} else {
//				this.f.getuDAO().agregarUsuario(obtenerDatos(), this.g);
//				this.g.getVu().setVisible(true);
//				this.g.getVr().dispose();
//			}
//
//		}
//		if (this.g.getVr().getSexo().equals("Masculino")) {
//			g.getVr().getGrupo().setSelected(g.getVr().getDivorciono().getModel(), false);
//			if (this.g.getVr().getTxtNombre().getText().isEmpty() || this.g.getVr().getTxtApellido().getText().isEmpty()
//					|| this.g.getVr().getTxtUsuario().getText().isEmpty()
//					|| this.g.getVr().getTxtCorreo().getText().isEmpty() || this.g.getVr().getCalendario() == null
//					|| this.g.getVr().getTxtEstatura().getText().isEmpty()
//					|| this.g.getVr().getTxtIngresos().getText().isEmpty()
//					|| this.g.getVr().getTxtContrasena().getText().isEmpty()) {
//				g.mostrarMensaje("Diligenciar todos los campos", "Advertenia", 2);
//			} else {
//				this.f.getuDAO().agregarUsuario(obtenerDatos(), this.g);
//
//			}
//			this.g.getVr().repaint();
//			System.out.println("chao");
//
//		}
	}

	public void comprobarUsuarioVp() {
		String usuarioAdmin = g.getVp().getTxtUsuario().getText();
		String contrasenaAdmin = g.getVp().getTxtContra().getText();
		if (this.g.getVp().getTxtUsuario().getText().isEmpty() || this.g.getVp().getTxtContra().getText().isEmpty()) {
			this.g.mostrarMensaje("Diligenciar todos los campos", "Advertenia", 2);
		} else if (usuarioAdmin.equals("Admin") == true && contrasenaAdmin.equals("1234") == true) {
			this.g.getVa().setVisible(true);
			this.g.getVp().dispose();
			this.l.getBf().leerRegistro();
			this.g.mostrarRegistros(l.getuDAO().listarArrayUsuarios().size(), l.getuDAO().listarArrayUsuarios(),
					l.PasarDivorcioAString(obtenerDatoRadioButton()), l.PasarEstadoAString(true));
		} else {
			this.g.getVu().setVisible(true);
			// Aca va el metodo que busca el usuario y comprueba si ya estsa registrado,
			// tambien verifica la contraseña
		}
	}
>>>>>>> branch 'master' of https://github.com/dpuertoo/PROYECTOFINAL2022-2.git
}
