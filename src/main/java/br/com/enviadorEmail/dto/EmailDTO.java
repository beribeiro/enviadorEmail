package br.com.enviadorEmail.dto;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class EmailDTO {

    private RemetenteDTO remetente;
    private List<DestinatarioDTO> destinatarios;
    private String assunto;
    private String mensagem;


}
