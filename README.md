Api de E-mail


Essa API tem como objetvio o envio de e-mail pelo Outlook.


Necessário adicionar no POM.XML:

dependency

groupId: br.com.enviadorEmail

artifactId: enviadorEmail

version: 0.0.1-SNAPSHOT

    

Necessário Import:

import br.com.enviadorEmail.EmailService;


E utilizar a chamada conforme abaixo:

new EmailService().enviar(nome, email); 

Nome: O nome enviado na corpo da mensagem.

email: O e-mail do destinatário.


Mensagem que está sendo enviada:

"Olá Nome. Você acaba de ser convidado pelo ListaVIP."
