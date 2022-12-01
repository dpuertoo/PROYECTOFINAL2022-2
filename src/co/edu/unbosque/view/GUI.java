package co.edu.unbosque.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.UsuarioDTO;

public class GUI {
	private VentanaPrincipal vp;
	private VentanaRegistrarse vr;
	private VentanaUsuarios vu;
	private VentanaAdmin Va;

	public GUI(Controller c) {
		this.vp = new VentanaPrincipal();
		vp.getButSalir().addActionListener(c);
		vp.getButRegistrarse().addActionListener(c);
		vp.getButSiguiente().addActionListener(c);

		this.vr = new VentanaRegistrarse();
		this.vr.getButFinalizar().addActionListener(c);
		this.vr.getButAtras().addActionListener(c);

		this.vu = new VentanaUsuarios();
		this.vu.getButSalir().addActionListener(c);
		this.vu.getButDislike().addActionListener(c);
		this.vu.getButLike().addActionListener(c);

		this.Va = new VentanaAdmin();
		this.Va.getButRegresar().addActionListener(c);
		this.Va.getPanelMenu().getAscendente().addActionListener(c);
		this.Va.getPanelMenu().getDescendente().addActionListener(c);
		this.Va.getPanelMenu().getNumlikes().addActionListener(c);
		this.Va.getPanelMenu().getUsuario().addActionListener(c);
		this.Va.getPanelMenu().getApellido().addActionListener(c);
		this.Va.getPanelMenu().getNombre().addActionListener(c);
		this.Va.getPanelMenu().getEdad().addActionListener(c);
		this.Va.getPanelMenu().getIngresos().addActionListener(c);
		this.Va.getPanelMenu().getFemenino().addActionListener(c);
		this.Va.getPanelMenu().getMasculino().addActionListener(c);
		this.Va.getPanelMenu().getMasLikes().addActionListener(c);
		this.Va.getPanelMenu().getRangoIngresos().addActionListener(c);
		this.Va.getPanelMenu().getPdf().addActionListener(c);
		this.Va.getPanelMenu().getButBuscar().addActionListener(c);
	}

	public void mostrarMensaje(String pMensaje, String pTitulo, int pIcono) {
		JOptionPane.showMessageDialog(null, pMensaje, pTitulo, pIcono);
	}

	public void mostrarUsuario(UsuarioDTO usuario, String divorcios, String estado) {
		getVa().getPaneladmin().getTxtId().append(String.valueOf(usuario.getId()) + "\n");
		getVa().getPaneladmin().getTxtNombre().append(String.valueOf(usuario.getNombre()) + "\n");
		getVa().getPaneladmin().getTxtApellidos()
				.append(String.valueOf(usuario.getApellido1() + " " + usuario.getApellido2()) + "\n");
		getVa().getPaneladmin().getTxtUsuario().append(String.valueOf(usuario.getUsuario()) + "\n");
		getVa().getPaneladmin().getTxtCorreo().append(String.valueOf(usuario.getCorreo()) + "\n");
		getVa().getPaneladmin().getTxtSexo().append(String.valueOf(usuario.getSexo()) + "\n");
		getVa().getPaneladmin().getTxtEdad().append(String.valueOf(usuario.getEdad()) + "\n");
		getVa().getPaneladmin().getTxtNacimiento().append(String.valueOf(usuario.getNacimiento()) + "\n");
		getVa().getPaneladmin().getTxtEstatura().append(String.valueOf(usuario.getEstatura()) + "\n");
		getVa().getPaneladmin().getTxtIngresos().append(String.valueOf(usuario.getIngresos()) + "\n");
		getVa().getPaneladmin().getTxtDivorcios().append(divorcios + "\n");
		getVa().getPaneladmin().getTxtLikes().append(String.valueOf(usuario.getNumLikesRecibidos()) + "\n");
		getVa().getPaneladmin().getTxtEstado().append(estado + "\n");

	}

	public void mostrarRegistros(int numRegistros, ArrayList<UsuarioDTO> datos, String divorcios, String estado) {

		try {
			for (int i = 0; i < numRegistros; i++) {
				getVa().getPaneladmin().getTxtId().append(String.valueOf(datos.get(i).getId()) + "\n");
				getVa().getPaneladmin().getTxtNombre().append(String.valueOf(datos.get(i).getNombre()) + "\n");
				getVa().getPaneladmin().getTxtApellidos()
						.append(String.valueOf(datos.get(i).getApellido1() + " " + datos.get(i).getApellido2()) + "\n");
				getVa().getPaneladmin().getTxtUsuario().append(String.valueOf(datos.get(i).getUsuario()) + "\n");
				getVa().getPaneladmin().getTxtCorreo().append(String.valueOf(datos.get(i).getCorreo()) + "\n");
				getVa().getPaneladmin().getTxtSexo().append(String.valueOf(datos.get(i).getSexo()) + "\n");
				getVa().getPaneladmin().getTxtEdad().append(String.valueOf(datos.get(i).getEdad()) + "\n");
				getVa().getPaneladmin().getTxtNacimiento().append(String.valueOf(datos.get(i).getNacimiento()) + "\n");
				getVa().getPaneladmin().getTxtEstatura().append(String.valueOf(datos.get(i).getEstatura()) + "\n");
				getVa().getPaneladmin().getTxtIngresos().append(String.valueOf(datos.get(i).getIngresos()) + "\n");
				getVa().getPaneladmin().getTxtDivorcios().append(divorcios + "\n");
				getVa().getPaneladmin().getTxtLikes()
						.append(String.valueOf(datos.get(i).getNumLikesRecibidos()) + "\n");
				getVa().getPaneladmin().getTxtEstado().append(estado + "\n");
			}
		} catch (NullPointerException e) {
			mostrarMensaje("Hubo un error al mostrar los datos", "Advertencia", 2);
		}
	}

	public VentanaAdmin getVa() {
		return Va;
	}

	public void setVa(VentanaAdmin va) {
		Va = va;
	}

	public VentanaUsuarios getVu() {
		return vu;
	}

	public void setVu(VentanaUsuarios vu) {
		this.vu = vu;
	}

	public VentanaRegistrarse getVr() {
		return vr;
	}

	public void setVr(VentanaRegistrarse vr) {
		this.vr = vr;
	}

	public VentanaPrincipal getVp() {
		return vp;
	}

	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}

}
