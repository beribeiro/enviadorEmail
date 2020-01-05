package br.com.enviadorEmail.service;

import br.com.enviadorEmail.dto.DestinatarioDTO;
import br.com.enviadorEmail.dto.EmailDTO;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
	
	public void enviar(EmailDTO emailDTO){
		
		try {
			SimpleEmail email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator(emailDTO.getRemetente().getEmail(), emailDTO.getRemetente().getPassword()));
			email.setSSLOnConnect(true);

			email.setFrom(emailDTO.getRemetente().getEmail());
			email.setSubject(emailDTO.getAssunto());
			email.setMsg(emailDTO.getMensagem());
			List<DestinatarioDTO> listDestinatario = emailDTO.getDestinatarios();
			for (DestinatarioDTO destinatario: listDestinatario) {
				email.addTo(destinatario.getEmail());
			}
			email.send();

		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
