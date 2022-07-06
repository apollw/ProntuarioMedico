package com.mycompany.blockchain;
/**
 *
 * @author Leanderson e Carlos Augusto
 */
public class Medico {
    
    private String nomeCompleto;
    private String codigoMedico;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public Medico(String nomeCompleto, String codigoMedico) {
        this.nomeCompleto = nomeCompleto;
        this.codigoMedico = codigoMedico;
    }
    
}
