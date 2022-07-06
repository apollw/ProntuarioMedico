package com.mycompany.blockchain;
/**
 *
 * @author Leanderson e Carlos Augusto
 */
public class Prontuario {
    
    Paciente pacient; //Todos os dados do Paciente
    
    private String Anamnese;
    private String laudosDeExames;
    private String prescricaoMedica;
    private String evolucao;
    private String termos; //contém assinatura digital do paciente

    public Prontuario(Paciente pacient, String Anamnese, String laudosDeExames, String prescricaoMedica, String evolucao, String termos) {
        this.pacient = pacient;
        this.Anamnese = Anamnese;
        this.laudosDeExames = laudosDeExames;
        this.prescricaoMedica = prescricaoMedica;
        this.evolucao = evolucao;
        this.termos = termos;
    }

    public Paciente getPacient() {
        return pacient;
    }

    public void setPacient(Paciente pacient) {
        this.pacient = pacient;
    }

    public String getAnamnese() {
        return Anamnese;
    }

    public void setAnamnese(String Anamnese) {
        this.Anamnese = Anamnese;
    }

    public String getLaudosDeExames() {
        return laudosDeExames;
    }

    public void setLaudosDeExames(String laudosDeExames) {
        this.laudosDeExames = laudosDeExames;
    }

    public String getPrescricaoMedica() {
        return prescricaoMedica;
    }

    public void setPrescricaoMedica(String prescricaoMedica) {
        this.prescricaoMedica = prescricaoMedica;
    }

    public String getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public String getTermos() {
        return termos;
    }

    public void setTermos(String termos) {
        this.termos = termos;
    }
    
}
