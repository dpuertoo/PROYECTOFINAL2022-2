package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import co.edu.unbosque.model.Logica;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.view.GUI;

public class Controller implements ActionListener {

	private GUI g;
	private Logica l;

	public Controller() {
		this.g = new GUI(this);
		this.l = new Logica();
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
			comprobarUsuarioVp();
		}
		if (e.getActionCommand().equals(this.g.getVr().FINALIZAR)) {
			this.g.mostrarMensaje(
					this.l.getCorreo().sendEmail(this.g.getVr().getTxtUsuario().getText(),
							this.g.getVr().getTxtContrasena().getText(), this.g.getVr().getTxtCorreo().getText()),
					"Aviso", 1);
			// verificarEspaciosVr();
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
		if (e.getActionCommand().equals(this.g.getVa().getPanelMenu().BUSCAR)) {
			this.g.mostrarUsuario(
					this.l.getuDAO().buscarUsuario(this.g.getVa().getPanelMenu().getTxtbuscador().getText(), this.g),
					null, null);
		}
		if (e.getActionCommand().equals(this.g.getVa().getPanelMenu().GENERARPDF)) {
			this.l.getPdf().generarPDF();
		}
	}

	public UsuarioDTO obtenerDatos() {
		UsuarioDTO usuario = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechanacimiento = this.g.getVr().getCalendario().getDate();
		try {
			int id = 0;
			String nombre = this.g.getVr().getTxtNombre().getText();
			String Apellido1 = separarApellido1();
			String Apellido2 = separarApellido2();
			String sexo = (String) this.g.getVr().getSexo().getSelectedItem();
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
		} catch (NullPointerException e) {
			this.g.mostrarMensaje("Debe llenar todos los campos", "Advertencia", 2);
		} catch (NumberFormatException e) {
			this.g.mostrarMensaje(
					"Debe llenar todos los campos correctamente \n Recuerde que: \n Los decimales se escriben con punto, no con coma \n La fecha se escribe en formato numerico \n No debe poner unidades de medida",
					"Advertencia", 2);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.g.mostrarMensaje("Debe diligenciar dos apellidos", "Advertencia", 2);
		}
		return usuario;
	}

	public boolean obtenerDatoRadioButton() {
		boolean respuesta = false;
		if (this.g.getVr().getDivorciosi().isSelected() == true) {
			respuesta = true;
		} else if (this.g.getVr().getDivorciono().isSelected() == false) {
			respuesta = false;
		}
		return respuesta;
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
}
