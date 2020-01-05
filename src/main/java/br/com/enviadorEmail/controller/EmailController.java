package br.com.enviadorEmail.controller;

import br.com.enviadorEmail.dto.EmailDTO;
import br.com.enviadorEmail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/enviar")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(method = RequestMethod.POST)
    public void enviaEmail (@RequestBody EmailDTO email) {
        emailService.enviar(email);
    }


}
