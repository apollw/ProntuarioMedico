package com.mycompany.blockchain;
/**
 *
 * @author Leanderson Silva e Carlos Augusto
 */

public class ProgramaPrincipal {

    public static void main(String[] args) {
    
    //Gera a Blockchain para o Paciente
    //Aqui o Bloco Genesis já é gerado
    Blockchain ProntA = new Blockchain();
    
    //Paciente auxiliar para gerar prontuário
    Paciente auxPac = new Paciente("NULL","NULL","NULL","NULL","NULL",
    "NULL","NULL","NULL");    
    //Prontuario auxiliar apenas para gerar bloco Genesis
    Prontuario auxPront = new Prontuario(auxPac,"NULL","NULL","NULL","NULL","NULL");
    
    /*Criados o Paciente e o Prontuario generico, posso incluir novos blocos*/
    
    //Adicionando Paciente e Dados
    auxPac.setNomeCompleto("Carlos Augusto");
    auxPac.setDataDeNascimento("05/08/1999");
    auxPac.setSexo("Masculino");
    auxPac.setNaturalidade("Sao Luis");
    auxPac.setEndereco("Rua Antonio Falcao, 488, Monte Castelo");
    auxPac.setEnderecoMunicipio("Sao Luís");
    auxPac.setEnderecoEstado("Maranhao");
    auxPac.setCodigo("8756387"); 
    
    //Adição de Novos Blocos
    Block a = new Block("0x200", new java.util.Date(),auxPront);
    ProntA.adicionarBloco(a);  
    
    
    //Block b = new Block("0x200", new java.util.Date(),"<transacao>");
    //Block c = new Block("0x200", new java.util.Date(),"<transacao>");
    
   
    //tcpCoin.adicionarBloco(b);
    //tcpCoin.adicionarBloco(c);
    
    //Aqui alteramos propositalmente um hash para testar se a cadeia eh valida ou nao
    
    //tcpCoin.retornarUltimoBloco().setHashAnterior("ABCDEFG");
    
    ProntA.exibirChain();    
    ProntA.ehValido();
        
    }
    
}

//Firstly, lets take a look at what a block actually looks like.
/*
A Block cna be split into 2 sections:

Header Information and Data Information
The Header information contains specific information about the block and previous
blocks and the Data sections contains information about transactions, but this 
is not always the case.

Header Section: 
    Version
    Timestamp (when the block was created)
    Hash
    PreviousHash
    HashOfMerkelTree
    Nonce

    Go to blockchain.info  for greater detail



*/