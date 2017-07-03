package envioEmail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	private String correo;
	private String contrasenia;
	
	public SendMail(String correo, String contrasenia){
		this.correo = correo;
		this.contrasenia = contrasenia;
	}
	
	public void sendMail(Email datos) {
		
		Properties props = System.getProperties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(correo, contrasenia);
			}
		  });

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(""));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(datos.destinatario));
			message.setSubject(datos.asunto);
			message.setText(datos.mensaje);

			Transport.send(message);
			//System.out.println("Tu mensaje fue enviado con exito");
		} catch (AddressException e) {
			//System.out.println("error adress: "+ e);
		} catch (MessagingException e) {
			//System.out.println("error en el mensaje: "+ e);
		}
	}
}
