package com.mycompany.blockchain;
import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    
    private List<Block> chain;
    
    public Blockchain(){
    
            chain = new ArrayList<Block>();
            chain.add(gerarGenesis()); //Gerar bloco Genesis, adicionando
            //o bloco Genesis à cadeia/corrente
    }
    
    private Block gerarGenesis(){
    
        Block genesis = new Block("0x200", new java.util.Date(),new Prontuario(new Paciente("null","null",
        "null","null","null","null","null","null"),"null","null","null","null","null"));
        /*Gerando um prontuário Genesis sem nenhum dado ainda, apenas para gerar
        a Blockchain*/        
        
        genesis.setHashAnterior(null);
        genesis.calcularHash();
        return genesis;    
    }
    
    public void adicionarBloco(Block bloco){
        Block novoBloco = bloco;
        novoBloco.setHashAnterior(chain.get(chain.size()-1).getHash());
        novoBloco.calcularHash();
        this.chain.add(novoBloco);
    }
    
    public void exibirChain(){
    
       for(int i=0;i<chain.size();i++){
           System.out.println("Bloco: "+i);
           System.out.println("Versao: "+chain.get(i).getVersao());
           System.out.println("Timestamp: "+chain.get(i).getTimestamp());
           
           System.out.println("");
           /*Exibição de Dados do Paciente Aqui*/
           System.out.println("DADOS DO PACIENTE");
           
           System.out.println("Nome: "+chain.get(i).getDados().getPacient().getNomeCompleto());
           System.out.println("Data de Nascimento: "+chain.get(i).getDados().getPacient().getDataDeNascimento());
           System.out.println("Sexo: "+chain.get(i).getDados().getPacient().getSexo());
           System.out.println("Naturalidade: "+chain.get(i).getDados().getPacient().getNaturalidade());
           System.out.println("Endereco: "+chain.get(i).getDados().getPacient().getEndereco());
           System.out.println("Municipio: "+chain.get(i).getDados().getPacient().getEnderecoMunicipio());
           System.out.println("Estado: "+chain.get(i).getDados().getPacient().getEnderecoEstado());
           System.out.println("CEP: "+chain.get(i).getDados().getPacient().getEnderecoCEP());
           
           System.out.println("");           
           /**************************************/
           
           /*Exibição de Dados do Prontuário Aqui*/
           System.out.println("DADOS DO PRONTUARIO");
           
           System.out.println("Anamnese: "+chain.get(i).getDados().getAnamnese());
           System.out.println("LaudosDeExames: "+chain.get(i).getDados().getLaudosDeExames());
           System.out.println("Prescricao Medica: "+chain.get(i).getDados().getPrescricaoMedica());
           System.out.println("Evolucao: "+chain.get(i).getDados().getEvolucao());
           System.out.println("Termos: "+chain.get(i).getDados().getTermos());
           
           System.out.println("");           
           /**************************************/
           
           System.out.println("Hash Anterior: "+chain.get(i).getHashAnterior());
           System.out.println("Hash: "+chain.get(i).getHash());
           System.out.println("");       
       }   
    }
    
    public Block retornarUltimoBloco(){
        return this.chain.get(chain.size()-1);    
    }
    
    public void ehValido(){
        
        for(int i=chain.size()-1;i>0;i--){
            if(  !(chain.get(i)).getHash().equals(chain.get(i).calcularHash())  ){
                System.out.println("A cadeia eh invalida");
                return;
            }
            if(  !(chain.get(i).getHashAnterior().equals(chain.get(i-1).calcularHash())) ){
                System.out.println("A cadeia eh invalida");
                return;
            }
            System.out.println("A cadeia eh valida");                
        }
    }
    
}
