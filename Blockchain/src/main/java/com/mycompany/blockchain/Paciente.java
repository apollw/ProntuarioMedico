package com.mycompany.blockchain;
/**
 *
 * @author Leanderson e Carlos Augusto
 */
public class Paciente {
       
    private String nomeCompleto;
    private String dataDeNascimento; //Data de nascimento (dia, mês e ano com quatro dígitos)
    private String sexo;
    private String naturalidade; //Município e Estado de Nascimento
    private String endereco; 
    private String enderecoMunicipio;
    private String enderecoEstado;
    private String enderecoCEP;
    
    private String codigo; //Cada paciente possui seu código

    public Paciente(String nomeCompleto, String dataDeNascimento, String sexo, String naturalidade, String endereco,String enderecoMunicipio, 
            String enderecoEstado, String enderecoCEP/*, String codigoProntuario*/) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
        this.enderecoMunicipio = enderecoMunicipio;
        this.enderecoEstado = enderecoEstado;
        this.enderecoCEP = enderecoCEP;
        //this.codigo = codigoProntuario;
    }

    /*public String getCodigoProntuario() {
        return codigoProntuario;
    }

    public void setCodigoProntuario(String codigoProntuario) {
        this.codigoProntuario = codigoProntuario;
    }*/

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEnderecoMunicipio() {
        return enderecoMunicipio;
    }

    public void setEnderecoMunicipio(String enderecoMunicipio) {
        this.enderecoMunicipio = enderecoMunicipio;
    }

    public String getEnderecoEstado() {
        return enderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
    }

    public String getEnderecoCEP() {
        return enderecoCEP;
    }

    public void setEnderecoCEP(String enderecoCEP) {
        this.enderecoCEP = enderecoCEP;
    }

       //CÓDIGO DO PACIENTE
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
        
}
