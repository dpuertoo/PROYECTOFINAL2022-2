package co.edu.unbosque.model;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Correo {

	private final Properties properties;

	public Correo() {
		this.properties = new Properties();
	}

	public String sendEmail(String usuario, String contrasena, String correo) {
		String msg = "";
		properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.setProperty("mail.smtp.ssl.trust", "*");
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.user", "bostinder0f@gmail.com");
		properties.setProperty("mail.smtp.clave", "bkhsxotkzeqxellk");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.port", "587");

		Session session = Session.getDefaultInstance(properties);
		MimeMessage mensaje = new MimeMessage(session);
		try {
			mensaje.setFrom(new InternetAddress("bostinder0f@gmail.com"));
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
			mensaje.setSubject("REGISTRO EXITOSO!");
			mensaje.setText("¡BIENVENIDO A BOSTINDER! \n Te has registrado exitosamente con el usuario " + usuario
					+ " y su clave de ingreso es: " + contrasena);
			Transport t = session.getTransport("smtp");
			t.connect("bostinder0f@gmail.com", "bkhsxotkzeqxellk");
			t.sendMessage(mensaje, mensaje.getAllRecipients());
			t.close();
			msg = "Revisa tu correo y verifica tus datos.";
		} catch (MessagingException me) {
			msg = "Hubo un error al mandar el correo de verificacion";
		}
		return msg;
	}
}
